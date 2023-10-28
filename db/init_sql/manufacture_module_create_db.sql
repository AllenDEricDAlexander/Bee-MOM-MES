/*
 Navicat Premium Data Transfer

 Source Server         : local
 Source Server Type    : MySQL
 Source Server Version : 80023
 Source Host           : localhost:3306
 Source Schema         : manufacture_module

 Target Server Type    : MySQL
 Target Server Version : 80023
 File Encoding         : 65001

 Date: 28/10/2023 13:27:41
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for manufacture_dispatche
-- ----------------------------
DROP TABLE IF EXISTS `manufacture_dispatche`;
CREATE TABLE `manufacture_dispatche`  (
  `id` bigint(0) NOT NULL COMMENT 'pk_id,非自增，业务填写',
  `manufacture_dispatche_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'manufacture_dispatche_no 格式0000-0000-0000-0000',
  `production_order_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'production_order_no 格式0000-0000-0000-0000',
  `technology_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'technology_no 格式0000-0000-0000-0000',
  `process_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'process_no 格式0000-0000-0000-0000',
  `production_line_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'production_line_no 格式0000-0000-0000-0000',
  `work_center_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'work_center_no 格式0000-0000-0000-0000',
  `execution_unit_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'execution_unit_no 格式0000-0000-0000-0000 user or machine',
  `start_time` datetime(0) NULL DEFAULT NULL,
  `closing_time` datetime(0) NULL DEFAULT NULL,
  `enable_status` tinyint(1) NULL DEFAULT NULL COMMENT 'enable status',
  `remark_info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `deleted` tinyint(1) NOT NULL COMMENT 'deleted status',
  `create_time` datetime(0) NULL DEFAULT NULL,
  `update_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for process
-- ----------------------------
DROP TABLE IF EXISTS `process`;
CREATE TABLE `process`  (
  `id` bigint(0) NOT NULL COMMENT 'PK_id，非自增，业务填写',
  `process_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '格式0000-0000-0000-0000',
  `process_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'process_name',
  `process_status` tinyint(0) NULL DEFAULT NULL COMMENT 'process_status 0 正常 1 缺人 2 禁用',
  `remark` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `deleted` tinyint(1) NULL DEFAULT NULL,
  `create_time` datetime(0) NULL DEFAULT NULL,
  `deleted_time` datetime(0) NULL DEFAULT NULL,
  `department_id` int(0) NULL DEFAULT NULL COMMENT '逻辑外键，部门id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for production_exception
-- ----------------------------
DROP TABLE IF EXISTS `production_exception`;
CREATE TABLE `production_exception`  (
  `id` bigint(0) NOT NULL COMMENT 'PK_id,非自增,业务填写',
  `production_exception_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'production_exception_no 格式0000-0000-0000-0000',
  `production_exception_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'production_exception_name name',
  `production_exception_type_no` int(0) NULL DEFAULT NULL COMMENT '生产异常类型id',
  `production_order_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'production_order_no 格式0000-0000-0000-0000',
  `work_center_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'work_center_no 格式0000-0000-0000-0000',
  `remark_info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `deleted` tinyint(1) NULL DEFAULT NULL COMMENT 'deleted',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT 'create time',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT 'update_time',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for production_order
-- ----------------------------
DROP TABLE IF EXISTS `production_order`;
CREATE TABLE `production_order`  (
  `id` bigint(0) NOT NULL COMMENT 'PK_id,非自增,业务填写',
  `production_order_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'production_order_no格式0000-0000-0000-0000',
  `production_order_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'production_order_name',
  `work_order_source` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'work_order_source name',
  `ident_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'ident_no 格式0000-0000-0000-0000',
  `product_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'product_no 格式0000-0000-0000-0000',
  `product_name` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'product_name',
  `specification` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'specification',
  `measuring_unit` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'measuring_unit',
  `production_order_quantity` int(0) NULL DEFAULT NULL COMMENT 'production_order_quantity',
  `adjust_quantity` int(0) NULL DEFAULT NULL COMMENT 'adjust_quantity',
  `produced_quantity` int(0) NULL DEFAULT NULL COMMENT 'produced_quantity',
  `batch_number` int(0) NULL DEFAULT NULL COMMENT 'batch_number',
  `consumer_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'consumer_no 格式0000-0000-0000-0000',
  `consumer_name` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'consumer_name',
  `issuing_date` datetime(0) NULL DEFAULT NULL COMMENT 'issuing_date',
  `workshop_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'workshop_no 格式0000-0000-0000-0000',
  `production_line_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'production_line_no 格式0000-0000-0000-0000',
  `document_status` tinyint(1) NOT NULL COMMENT 'document_status',
  `remark_info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `deleted` tinyint(1) NULL DEFAULT NULL COMMENT 'deleted',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT 'create time',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT 'update_time',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for report_work
-- ----------------------------
DROP TABLE IF EXISTS `report_work`;
CREATE TABLE `report_work`  (
  `id` bigint(0) NOT NULL COMMENT 'PK_id,非自增,业务填写',
  `report_work_type` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'report_work_type 格式0000-0000-0000-0000',
  `work_center_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'work_center_no 格式0000-0000-0000-0000',
  `production_line_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'production_line_no 格式0000-0000-0000-0000',
  `workshop_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'workshop_no 格式0000-0000-0000-0000',
  `department_id` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'department_id 格式0000-0000-0000-0000',
  `production_order_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'production_order_no 格式0000-0000-0000-0000',
  `consumer_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'consumer_no 格式0000-0000-0000-0000',
  `product_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'product_no 格式0000-0000-0000-0000',
  `product_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'product name',
  `specification` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'specification',
  `execution_unit_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'execution_unit_no 格式0000-0000-0000-0000 user or machine',
  `report_time` datetime(0) NULL DEFAULT NULL COMMENT 'report_time',
  `user_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '审核人user_no 格式0000-0000-0000-0000',
  `enable_status` tinyint(1) NOT NULL COMMENT 'enable status',
  `remark_info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `deleted` tinyint(1) NULL DEFAULT NULL COMMENT 'deleted',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT 'create time',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT 'update_time',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for technology
-- ----------------------------
DROP TABLE IF EXISTS `technology`;
CREATE TABLE `technology`  (
  `id` bigint(0) NOT NULL COMMENT 'PK_id，非自增，业务填写',
  `technology_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'technology_no 格式0000-0000-0000-0000',
  `technology_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'technology_name',
  `sort` int(0) NULL DEFAULT NULL COMMENT '排序',
  `enable_status` tinyint(1) NOT NULL COMMENT 'enable status',
  `deleted` tinyint(1) NULL DEFAULT NULL,
  `create_time` datetime(0) NULL DEFAULT NULL,
  `update_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
