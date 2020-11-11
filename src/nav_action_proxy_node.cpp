// Copyright 2020 Intelligent Robotics Lab
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

#include <memory>

#include "metacontrol_tooling/nav_action_proxy_node.hpp"

namespace metacontrol_tooling
{

using namespace std::placeholders;
using std::placeholders::_1;
using std::placeholders::_2;

ActionProxy::ActionProxy()
: Node("metacontrol_navigate_to_pose_proxy")
{}

void ActionProxy::start_server()
{
  nav_action_client_ =
    rclcpp_action::create_client<NavigateToPose>(
    shared_from_this(),
    "navigate_to_pose");

  nav_to_pose_action_server_ = rclcpp_action::create_server<NavigateToPose>(
    shared_from_this(),
    "metacontrol_navigate_to_pose",
    std::bind(&ActionProxy::handle_goal, this, _1, _2),
    std::bind(&ActionProxy::handle_cancel, this, _1),
    std::bind(&ActionProxy::handle_accepted, this, _1));

  RCLCPP_INFO(get_logger(), "Ready.");
}

rclcpp_action::GoalResponse ActionProxy::handle_goal(
  const rclcpp_action::GoalUUID & uuid,
  std::shared_ptr<const NavigateToPose::Goal> goal)
{
  current_goal_ = *goal;
  return rclcpp_action::GoalResponse::ACCEPT_AND_EXECUTE;
}

rclcpp_action::CancelResponse ActionProxy::handle_cancel(
  const std::shared_ptr<ServerNavGoalHandle> goal_handle)
{
  RCLCPP_INFO(this->get_logger(), "Received request to cancel goal");
  return rclcpp_action::CancelResponse::ACCEPT;
}

void ActionProxy::send_nav_action(NavigateToPose::Goal goal)
{
  bool is_action_server_ready = false;
  do {
    RCLCPP_INFO(get_logger(), "Waiting for navigation action server...");
    is_action_server_ready =
      nav_action_client_->wait_for_action_server(std::chrono::seconds(5));
  } while (!is_action_server_ready);

  RCLCPP_INFO(get_logger(), "Navigation action server ready");
  auto send_goal_options =
    rclcpp_action::Client<NavigateToPose>::SendGoalOptions();

  send_goal_options.result_callback =
    std::bind(&ActionProxy::result_callback, this, _1);

  send_goal_options.feedback_callback =
    std::bind(&ActionProxy::feedback_callback, this, _1, _2);

  RCLCPP_INFO(get_logger(), "Navigation action sended");

  client_future_nav_goal_handle_ =
    nav_action_client_->async_send_goal(goal, send_goal_options);
  client_nav_goal_handle_ = client_future_nav_goal_handle_.get();

  if (!client_nav_goal_handle_) {
    RCLCPP_ERROR(get_logger(), "Goal was rejected by server");
  }
}

void ActionProxy::execute(const std::shared_ptr<ServerNavGoalHandle> goal_handle)
{
  rclcpp::Rate loop_rate(2);
  send_nav_action(current_goal_);  // send the goal to nav2

  //  Check the status and return to metacontroller
  auto result = std::make_shared<NavigateToPose::Result>();
  while (rclcpp::ok()) {
    switch (nav_result_.code) {
      case rclcpp_action::ResultCode::SUCCEEDED:
        RCLCPP_INFO(this->get_logger(), "Action Succeeded");
        if (goal_handle->is_executing()) {
          goal_handle->succeed(result);
        }
        nav_result_.code = rclcpp_action::ResultCode::UNKNOWN;
        break;
      case rclcpp_action::ResultCode::ABORTED:
        RCLCPP_WARN(get_logger(), "Goal was aborted");
        /*
          What must we do if the navigation is aborted?
        */
        break;
      case rclcpp_action::ResultCode::CANCELED:
        RCLCPP_ERROR(get_logger(), "Goal was canceled");
        break;
      default:
        RCLCPP_DEBUG(get_logger(), "Unknown result code");
        break;
    }
    loop_rate.sleep();
  }
}

void ActionProxy::feedback_callback(
  ClientNavGoalHandle::SharedPtr,
  const std::shared_ptr<const NavigateToPose::Feedback> feedback)
{
  distance_ = feedback->distance_remaining;
}

void ActionProxy::result_callback(const ClientNavGoalHandle::WrappedResult & result)
{
  nav_result_ = result;
}

void ActionProxy::handle_accepted(const std::shared_ptr<ServerNavGoalHandle> goal_handle)
{
  using namespace std::placeholders;
  std::thread{std::bind(&ActionProxy::execute, this, _1), goal_handle}.detach();
}

}  // namespace metacontrol_tooling

int main(int argc, char ** argv)
{
  rclcpp::init(argc, argv);
  auto node = std::make_shared<metacontrol_tooling::ActionProxy>();
  node->start_server();
  rclcpp::spin(node);
  rclcpp::shutdown();

  return 0;
}
