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

#include "lifecycle_msgs/msg/state.hpp"

#include "rclcpp/rclcpp.hpp"
#include "sensor_msgs/msg/laser_scan.hpp"

using rcl_interfaces::msg::ParameterType;
using std::placeholders::_1;
using namespace std::placeholders;

class ReconfigTimeMeter : public rclcpp::Node
{
public:
  ReconfigTimeMeter()
  : Node("reconfig_time_meter_node")
  {
    declare_parameter("node_name");
    sub_ = create_subscription<sensor_msgs::msg::LaserScan>(
      "/mros_scan",
      rclcpp::SensorDataQoS(), std::bind(&ReconfigTimeMeter::scan_cb, this, _1));
    error_time_ = now();
    all_zero_error_ = false;
    timer_started_ = false;
  }

  void scan_cb(sensor_msgs::msg::LaserScan::ConstSharedPtr laser_scan)
  { 
    auto t = (now() - error_time_).nanoseconds() * 1e-6;
    if (t > 300.0)
      RCLCPP_INFO(get_logger(), "reconfig time %.6f", t);
    error_time_ = now();
  }

private:
  rclcpp::Subscription<sensor_msgs::msg::LaserScan>::SharedPtr sub_;
  bool all_zero_error_, timer_started_;
  rclcpp::Time error_time_;
};

int main(int argc, char * argv[])
{
  rclcpp::init(argc, argv);

  auto node = std::make_shared<ReconfigTimeMeter>();
  rclcpp::spin(node->get_node_base_interface());
  rclcpp::shutdown();

  return 0;
}
