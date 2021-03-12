cmake_minimum_required(VERSION 3.5)
project(metacontrol_tooling)

set(CMAKE_CXX_STANDARD 17)
set(CMAKE_BUILD_TYPE DEBUG)

find_package(ament_cmake REQUIRED)
find_package(rclcpp REQUIRED)
find_package(sensor_msgs REQUIRED)

include_directories(
  include
)

set(dependencies
    rclcpp
    sensor_msgs
)

add_executable(reconfig_time_meter_node src/reconfig_time_meter.cpp)
ament_target_dependencies(reconfig_time_meter_node ${dependencies})

if(BUILD_TESTING)
  find_package(ament_lint_auto REQUIRED)
  find_package(ament_lint_common REQUIRED)
  ament_lint_auto_find_test_dependencies()
endif()

install(TARGETS
  reconfig_time_meter_node
  ARCHIVE DESTINATION lib
  LIBRARY DESTINATION lib
  RUNTIME DESTINATION lib/${PROJECT_NAME}
)

ament_export_dependencies(${dependencies})

ament_package()
