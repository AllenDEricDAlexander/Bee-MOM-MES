/*
 Navicat Premium Data Transfer

 Source Server         : local
 Source Server Type    : MySQL
 Source Server Version : 80023
 Source Host           : localhost:3306
 Source Schema         : manufacture_technology_model

 Target Server Type    : MySQL
 Target Server Version : 80023
 File Encoding         : 65001

 Date: 30/10/2023 22:46:59
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for manufacture_process_info
-- ----------------------------
DROP TABLE IF EXISTS `manufacture_process_info`;
CREATE TABLE `manufacture_process_info`  (
  `id` bigint(0) NOT NULL COMMENT 'pk_id,非自增，业务填写',
  `process_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '工序编号格式0000-0000-0000-0000',
  `manufacture_process_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'process_name',
  `manufacture_process_message` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `material_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'workshop_no 格式0000-0000-0000-0000',
  `workshop_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'workshop_no 格式0000-0000-0000-0000',
  `production_line_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'production_line_no 格式0000-0000-0000-0000',
  `manufacture_technology_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'manufacture_dispatche_no 格式0000-0000-0000-0000',
  `enable_state` tinyint(1) NULL DEFAULT NULL COMMENT 'enable status',
  `remark_info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `deleted` tinyint(1) NOT NULL COMMENT 'deleted status',
  `create_time` datetime(0) NULL DEFAULT NULL,
  `update_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for manufacture_technology_info
-- ----------------------------
DROP TABLE IF EXISTS `manufacture_technology_info`;
CREATE TABLE `manufacture_technology_info`  (
  `id` bigint(0) NOT NULL COMMENT 'pk_id,非自增，业务填写',
  `manufacture_technology_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'manufacture_dispatche_no 格式0000-0000-0000-0000',
  `manufacture_technology_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'process_name',
  `manufacture_technology_message` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `material_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'workshop_no 格式0000-0000-0000-0000',
  `file_url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `workshop_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'workshop_no 格式0000-0000-0000-0000',
  `production_line_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'production_line_no 格式0000-0000-0000-0000',
  `enable_state` tinyint(1) NULL DEFAULT NULL COMMENT 'enable status',
  `remark_info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `deleted` tinyint(1) NOT NULL COMMENT 'deleted status',
  `create_time` datetime(0) NULL DEFAULT NULL,
  `update_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for manufacture_technology_modify_info
-- ----------------------------
DROP TABLE IF EXISTS `manufacture_technology_modify_info`;
CREATE TABLE `manufacture_technology_modify_info`  (
  `id` bigint(0) NOT NULL COMMENT 'pk_id,非自增，业务填写',
  `manufacture_technology_modify_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '工序编号格式0000-0000-0000-0000',
  `manufacture_technology_modify_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'process_name',
  `manufacture_technology_modify_message` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `company_staff_review_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '格式0000-0000-0000-0000',
  `enable_state` tinyint(1) NULL DEFAULT NULL COMMENT 'enable status',
  `remark_info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `deleted` tinyint(1) NOT NULL COMMENT 'deleted status',
  `create_time` datetime(0) NULL DEFAULT NULL,
  `update_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for nc_program_file
-- ----------------------------
DROP TABLE IF EXISTS `nc_program_file`;
CREATE TABLE `nc_program_file`  (
  `id` bigint(0) NOT NULL COMMENT 'pk_id,非自增，业务填写',
  `nc_program_file_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '工序编号格式0000-0000-0000-0000',
  `manufacture_technology_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'manufacture_dispatche_no 格式0000-0000-0000-0000',
  `process_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '工序编号格式0000-0000-0000-0000',
  `nc_program_file_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'process_name',
  `nc_program_file_url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `company_staff_review_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '格式0000-0000-0000-0000',
  `company_staff_head_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '负责人格式0000-0000-0000-0000',
  `issuance_time` datetime(0) NULL DEFAULT NULL COMMENT 'enable status',
  `enable_state` tinyint(1) NULL DEFAULT NULL COMMENT 'enable status',
  `remark_info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `deleted` tinyint(1) NOT NULL COMMENT 'deleted status',
  `create_time` datetime(0) NULL DEFAULT NULL,
  `update_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for technical_discipline_problems
-- ----------------------------
DROP TABLE IF EXISTS `technical_discipline_problems`;
CREATE TABLE `technical_discipline_problems`  (
  `id` bigint(0) NOT NULL COMMENT 'pk_id,非自增，业务填写',
  `technical_discipline_problem_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '工序编号格式0000-0000-0000-0000',
  `manufacture_technology_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'manufacture_dispatche_no 格式0000-0000-0000-0000',
  `process_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '工序编号格式0000-0000-0000-0000',
  `technical_discipline_problem_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'process_name',
  `technical_discipline_problem_message` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `company_staff_review_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '格式0000-0000-0000-0000',
  `company_staff_head_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '负责人格式0000-0000-0000-0000',
  `enable_state` tinyint(1) NULL DEFAULT NULL COMMENT 'enable status',
  `remark_info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `deleted` tinyint(1) NOT NULL COMMENT 'deleted status',
  `create_time` datetime(0) NULL DEFAULT NULL,
  `update_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for technical_order_notification
-- ----------------------------
DROP TABLE IF EXISTS `technical_order_notification`;
CREATE TABLE `technical_order_notification`  (
  `id` bigint(0) NOT NULL COMMENT 'pk_id,非自增，业务填写',
  `technical_order_notification_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '工序编号格式0000-0000-0000-0000',
  `technical_order_notification_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'process_name',
  `technical_order_notification_message` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `company_staff_review_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '格式0000-0000-0000-0000',
  `company_staff_head_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '负责人格式0000-0000-0000-0000',
  `enable_state` tinyint(1) NULL DEFAULT NULL COMMENT 'enable status',
  `remark_info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `deleted` tinyint(1) NOT NULL COMMENT 'deleted status',
  `create_time` datetime(0) NULL DEFAULT NULL,
  `update_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for technical_problems
-- ----------------------------
DROP TABLE IF EXISTS `technical_problems`;
CREATE TABLE `technical_problems`  (
  `id` bigint(0) NOT NULL COMMENT 'pk_id,非自增，业务填写',
  `technical_problems_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '工序编号格式0000-0000-0000-0000',
  `manufacture_technology_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'manufacture_dispatche_no 格式0000-0000-0000-0000',
  `process_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '工序编号格式0000-0000-0000-0000',
  `technical_problems_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'process_name',
  `technical_problems_message` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `company_staff_review_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '格式0000-0000-0000-0000',
  `company_staff_head_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '负责人格式0000-0000-0000-0000',
  `enable_state` tinyint(1) NULL DEFAULT NULL COMMENT 'enable status',
  `remark_info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `deleted` tinyint(1) NOT NULL COMMENT 'deleted status',
  `create_time` datetime(0) NULL DEFAULT NULL,
  `update_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for work_draw_file
-- ----------------------------
DROP TABLE IF EXISTS `work_draw_file`;
CREATE TABLE `work_draw_file`  (
  `id` bigint(0) NOT NULL COMMENT 'pk_id,非自增，业务填写',
  `work_draw_file_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '工序编号格式0000-0000-0000-0000',
  `manufacture_technology_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'manufacture_dispatche_no 格式0000-0000-0000-0000',
  `process_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '工序编号格式0000-0000-0000-0000',
  `work_draw_file_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'process_name',
  `work_draw_file_url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `company_staff_review_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '格式0000-0000-0000-0000',
  `company_staff_head_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '负责人格式0000-0000-0000-0000',
  `issuance_time` datetime(0) NULL DEFAULT NULL COMMENT 'enable status',
  `enable_state` tinyint(1) NULL DEFAULT NULL COMMENT 'enable status',
  `remark_info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `deleted` tinyint(1) NOT NULL COMMENT 'deleted status',
  `create_time` datetime(0) NULL DEFAULT NULL,
  `update_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
