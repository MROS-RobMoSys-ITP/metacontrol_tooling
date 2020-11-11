cmake_minimum_required(VERSION 3.5)
project(metacontrol_tooling)

set(CMAKE_CXX_STANDARD 17)
set(CMAKE_BUILD_TYPE DEBUG)

find_package(ament_cmake REQUIRED)
find_package(rclcpp REQUIRED)
find_package(rclcpp_action REQUIRED)
find_package(nav2_msgs REQUIRED)

include_directories(
  include
)

set(dependencies
    rclcpp
    rclcpp_action
    nav2_msgs
)

add_executable(nav_action_proxy_node src/nav_action_proxy_node.cpp)
ament_target_dependencies(nav_action_proxy_node ${dependencies})


install(TARGETS
  nav_action_proxy_node
  ARCHIVE DESTINATION lib
  LIBRARY DESTINATION lib
  RUNTIME DESTINATION lib/${PROJECT_NAME}
)

ament_export_dependencies(${dependencies})

ament_package()
