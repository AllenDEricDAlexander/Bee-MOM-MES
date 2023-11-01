/*
 Navicat Premium Data Transfer

 Source Server         : local
 Source Server Type    : MySQL
 Source Server Version : 80023
 Source Host           : localhost:3306
 Source Schema         : manufacture_machine_model

 Target Server Type    : MySQL
 Target Server Version : 80023
 File Encoding         : 65001

 Date: 01/11/2023 21:30:23
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for equipment_failure_info
-- ----------------------------
DROP TABLE IF EXISTS `equipment_failure_info`;
CREATE TABLE `equipment_failure_info`  (
  `id` bigint(0) NOT NULL COMMENT 'pk_id,非自增，业务填写',
  `equipment_failure_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'manufacture_dispatche_no 格式0000-0000-0000-0000',
  `equipment_failure_type_no` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'process_name',
  `manufacture_machine_no` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `header_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'workshop_no 格式0000-0000-0000-0000',
  `repair_type_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'production_line_no 格式0000-0000-0000-0000',
  `start_time` datetime(0) NULL DEFAULT NULL,
  `end_time` datetime(0) NULL DEFAULT NULL,
  `enable_state` tinyint(1) NULL DEFAULT NULL COMMENT 'enable status',
  `remark_info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `deleted` tinyint(1) NOT NULL COMMENT 'deleted status',
  `create_time` datetime(0) NULL DEFAULT NULL,
  `update_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for equipment_guarantee_info
-- ----------------------------
DROP TABLE IF EXISTS `equipment_guarantee_info`;
CREATE TABLE `equipment_guarantee_info`  (
  `id` bigint(0) NOT NULL COMMENT 'pk_id,非自增，业务填写',
  `equipment_guarantee_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'manufacture_dispatche_no 格式0000-0000-0000-0000',
  `manufacture_machine_no` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `header_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'workshop_no 格式0000-0000-0000-0000',
  `start_time` datetime(0) NULL DEFAULT NULL,
  `end_time` datetime(0) NULL DEFAULT NULL,
  `enable_state` tinyint(1) NULL DEFAULT NULL COMMENT 'enable status',
  `remark_info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `deleted` tinyint(1) NOT NULL COMMENT 'deleted status',
  `create_time` datetime(0) NULL DEFAULT NULL,
  `update_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for equipment_inspection_info
-- ----------------------------
DROP TABLE IF EXISTS `equipment_inspection_info`;
CREATE TABLE `equipment_inspection_info`  (
  `id` bigint(0) NOT NULL COMMENT 'pk_id,非自增，业务填写',
  `equipment_inspection_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'manufacture_dispatche_no 格式0000-0000-0000-0000',
  `manufacture_machine_no` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `header_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'workshop_no 格式0000-0000-0000-0000',
  `manage_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'workshop_no 格式0000-0000-0000-0000',
  `start_time` datetime(0) NULL DEFAULT NULL,
  `end_time` datetime(0) NULL DEFAULT NULL,
  `enable_state` tinyint(1) NULL DEFAULT NULL COMMENT 'enable status',
  `remark_info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `deleted` tinyint(1) NOT NULL COMMENT 'deleted status',
  `create_time` datetime(0) NULL DEFAULT NULL,
  `update_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for equipment_maintenance_info
-- ----------------------------
DROP TABLE IF EXISTS `equipment_maintenance_info`;
CREATE TABLE `equipment_maintenance_info`  (
  `id` bigint(0) NOT NULL COMMENT 'pk_id,非自增，业务填写',
  `equipment_maintenance_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'manufacture_dispatche_no 格式0000-0000-0000-0000',
  `manufacture_machine_no` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `header_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'workshop_no 格式0000-0000-0000-0000',
  `manage_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'workshop_no 格式0000-0000-0000-0000',
  `start_time` datetime(0) NULL DEFAULT NULL,
  `end_time` datetime(0) NULL DEFAULT NULL,
  `enable_state` tinyint(1) NULL DEFAULT NULL COMMENT 'enable status',
  `remark_info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `deleted` tinyint(1) NOT NULL COMMENT 'deleted status',
  `create_time` datetime(0) NULL DEFAULT NULL,
  `update_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for manufacture_machine_info
-- ----------------------------
DROP TABLE IF EXISTS `manufacture_machine_info`;
CREATE TABLE `manufacture_machine_info`  (
  `id` bigint(0) NOT NULL COMMENT 'pk_id,非自增，业务填写',
  `machine_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '工序编号格式0000-0000-0000-0000',
  `manufacture_machine_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'process_name',
  `manufacture_machine_type_no` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `hazard_level` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '123',
  `Importance_level` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '123',
  `store_amount` int(0) NOT NULL COMMENT 'pk_id,非自增，业务填写',
  `remark_info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `deleted` tinyint(1) NOT NULL COMMENT 'deleted status',
  `create_time` datetime(0) NULL DEFAULT NULL,
  `update_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for manufacture_machine_type
-- ----------------------------
DROP TABLE IF EXISTS `manufacture_machine_type`;
CREATE TABLE `manufacture_machine_type`  (
  `id` bigint(0) NOT NULL COMMENT 'PK_id,非自增,业务填写',
  `manufacture_machine_type_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '格式0000-0000-0000-0000',
  `manufacture_machine_type_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'material_type name',
  `father_type_no` int(0) NULL DEFAULT NULL COMMENT '逻辑外键，上级物料类型id',
  `remark_info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `deleted` tinyint(1) NULL DEFAULT NULL COMMENT 'deleted',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT 'create time',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT 'update_time',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for repair_type
-- ----------------------------
DROP TABLE IF EXISTS `repair_type`;
CREATE TABLE `repair_type`  (
  `id` bigint(0) NOT NULL COMMENT 'PK_id,非自增,业务填写',
  `repair_type_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '格式0000-0000-0000-0000',
  `repair_type_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'material_type name',
  `father_type_no` int(0) NULL DEFAULT NULL COMMENT '逻辑外键，上级物料类型id',
  `remark_info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `deleted` tinyint(1) NULL DEFAULT NULL COMMENT 'deleted',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT 'create time',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT 'update_time',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
