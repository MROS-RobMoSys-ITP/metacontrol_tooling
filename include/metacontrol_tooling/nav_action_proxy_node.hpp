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

#ifndef METACONTROL_TOOLING__NAV_ACTION_PROXY_NODE_HPP_
#define METACONTROL_TOOLING__NAV_ACTION_PROXY_NODE_HPP_

#include <string>
#include <memory>

#include "rclcpp/rclcpp.hpp"
#include "rclcpp_action/rclcpp_action.hpp"
#include "nav2_msgs/action/navigate_to_pose.hpp"

namespace metacontrol_tooling
{

class ActionProxy : public rclcpp::Node
{
public:

  using NavigateToPose = nav2_msgs::action::NavigateToPose;
  using ServerNavGoalHandle = rclcpp_action::ServerGoalHandle<NavigateToPose>;
  using ClientNavGoalHandle = rclcpp_action::ClientGoalHandle<NavigateToPose>;

  ActionProxy();
  void start_server();

private:
  rclcpp_action::Server<NavigateToPose>::SharedPtr nav_to_pose_action_server_;
  rclcpp_action::Client<NavigateToPose>::SharedPtr nav_action_client_;
  NavigateToPose::Goal current_goal_, nav_goal_;

  std::shared_future<ClientNavGoalHandle::SharedPtr> client_future_nav_goal_handle_;
  ClientNavGoalHandle::SharedPtr client_nav_goal_handle_;
  ClientNavGoalHandle::WrappedResult nav_result_;
  float distance_;

  rclcpp_action::GoalResponse handle_goal(
    const rclcpp_action::GoalUUID & uuid,
    std::shared_ptr<const NavigateToPose::Goal> goal);
  rclcpp_action::CancelResponse handle_cancel(
    const std::shared_ptr<ServerNavGoalHandle> goal_handle);

  void feedback_callback(
    ClientNavGoalHandle::SharedPtr,
    const std::shared_ptr<const NavigateToPose::Feedback> feedback);
  void result_callback(const ClientNavGoalHandle::WrappedResult & result);

  void execute(const std::shared_ptr<ServerNavGoalHandle> goal_handle);
  void handle_accepted(const std::shared_ptr<ServerNavGoalHandle> goal_handle);

  void send_nav_action(NavigateToPose::Goal goal);

};

}  // namespace metacontrol_tooling

#endif  // METACONTROL_TOOLING__NAV_ACTION_PROXY_NODE_HPP_
