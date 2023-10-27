/*
 Navicat Premium Data Transfer

 Source Server         : local
 Source Server Type    : MySQL
 Source Server Version : 80023
 Source Host           : localhost:3306
 Source Schema         : enterprise_master_data

 Target Server Type    : MySQL
 Target Server Version : 80023
 File Encoding         : 65001

 Date: 26/10/2023 20:02:59
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for company_staff
-- ----------------------------
DROP TABLE IF EXISTS `company_staff`;
CREATE TABLE `company_staff`  (
  `id` int(0) NOT NULL COMMENT 'PK_id,非自增,业务填写',
  `pcompany_staff_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '格式0000-0000-0000-0000',
  `company_staff_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'company_staff_name',
  `company_staff_phone` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'company_staff_phone',
  `short_name` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'short name',
  `role_id` int(0) NULL DEFAULT NULL COMMENT '逻辑外键，role_id',
  `department_id` int(0) NULL DEFAULT NULL COMMENT 'department_id',
  `enable_status` tinyint(1) NOT NULL COMMENT 'enable status',
  `remark_info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `deleted` tinyint(1) NULL DEFAULT NULL COMMENT 'deleted',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT 'create time',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT 'update_time',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for consumer
-- ----------------------------
DROP TABLE IF EXISTS `consumer`;
CREATE TABLE `consumer`  (
  `id` int(0) NOT NULL COMMENT 'pk_id,非自增，业务填写',
  `consumer_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '格式0000-0000-0000-0000',
  `consumer_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'consumer_name',
  `short_name` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'short_name',
  `consumer_type` int(0) NULL DEFAULT NULL COMMENT 'consumer type',
  `consumer_phone` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'consumer_phone',
  `consumer_contact` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'consumer contact name',
  `concumer_contact_phone` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'consumer contact phone',
  `enable_status` tinyint(1) NULL DEFAULT NULL COMMENT 'enable status',
  `remark_info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `deleted` tinyint(1) NOT NULL COMMENT 'deleted status',
  `create_time` datetime(0) NULL DEFAULT NULL,
  `update_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department`  (
  `id` int(0) NOT NULL COMMENT 'PK_id，非自增，业务填写',
  `father_id` int(0) NULL DEFAULT NULL COMMENT '上级部门id',
  `department_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '部门名称',
  `sort` int(0) NULL DEFAULT NULL COMMENT '排序',
  `enable_status` tinyint(1) NOT NULL COMMENT 'enable status',
  `deleted` tinyint(1) NULL DEFAULT NULL,
  `create_time` datetime(0) NULL DEFAULT NULL,
  `update_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for job
-- ----------------------------
DROP TABLE IF EXISTS `job`;
CREATE TABLE `job`  (
  `id` int(0) NOT NULL COMMENT 'PK_id，非自增，业务填写',
  `job_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '格式0000-0000-0000-0000',
  `job_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'job name',
  `job_code` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'job code',
  `job_status` tinyint(0) NULL DEFAULT NULL COMMENT 'job status 0 正常 1 缺人 2 禁用',
  `require_number` int(0) NULL DEFAULT NULL COMMENT '需要人数',
  `current_number` int(0) NULL DEFAULT NULL COMMENT '当前人数',
  `remark` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `deleted` tinyint(1) NULL DEFAULT NULL,
  `create_time` datetime(0) NULL DEFAULT NULL,
  `deleted_time` datetime(0) NULL DEFAULT NULL,
  `department_id` int(0) NULL DEFAULT NULL COMMENT '逻辑外键，部门id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for material
-- ----------------------------
DROP TABLE IF EXISTS `material`;
CREATE TABLE `material`  (
  `id` int(0) NOT NULL COMMENT 'PK_id,非自增,业务填写',
  `material_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '格式0000-0000-0000-0000',
  `material_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'material name',
  `unit` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'unit',
  `material_type_no` int(0) NULL DEFAULT NULL COMMENT '逻辑外键，物料类型id',
  `safety_stock` int(0) NULL DEFAULT NULL COMMENT 'safety_stock',
  `enable_status` tinyint(1) NOT NULL COMMENT 'enable status',
  `remark_info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `deleted` tinyint(1) NULL DEFAULT NULL COMMENT 'deleted',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT 'create time',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT 'update_time',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for material_type
-- ----------------------------
DROP TABLE IF EXISTS `material_type`;
CREATE TABLE `material_type`  (
  `id` int(0) NOT NULL COMMENT 'PK_id,非自增,业务填写',
  `material_type_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '格式0000-0000-0000-0000',
  `material_type_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'material_type name',
  `father_type_no` int(0) NULL DEFAULT NULL COMMENT '逻辑外键，上级物料类型id',
  `remark_info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `deleted` tinyint(1) NULL DEFAULT NULL COMMENT 'deleted',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT 'create time',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT 'update_time',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product`  (
  `id` int(0) NOT NULL COMMENT 'PK_id,非自增,业务填写',
  `product_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '格式0000-0000-0000-0000',
  `product_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'product name',
  `unit` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'unit',
  `product_type_no` int(0) NULL DEFAULT NULL COMMENT '逻辑外键，物料类型id',
  `enable_status` tinyint(1) NOT NULL COMMENT 'enable status',
  `remark_info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `deleted` tinyint(1) NULL DEFAULT NULL COMMENT 'deleted',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT 'create time',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT 'update_time',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for product_type
-- ----------------------------
DROP TABLE IF EXISTS `product_type`;
CREATE TABLE `product_type`  (
  `id` int(0) NOT NULL COMMENT 'PK_id,非自增,业务填写',
  `product_type_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '格式0000-0000-0000-0000',
  `product_type_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'product_type name',
  `father_type_no` int(0) NULL DEFAULT NULL COMMENT '逻辑外键，上级物料类型id',
  `remark_info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `deleted` tinyint(1) NULL DEFAULT NULL COMMENT 'deleted',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT 'create time',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT 'update_time',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for production_equipment
-- ----------------------------
DROP TABLE IF EXISTS `production_equipment`;
CREATE TABLE `production_equipment`  (
  `id` int(0) NOT NULL COMMENT 'PK_id,非自增,业务填写',
  `production_equipment_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '格式0000-0000-0000-0000',
  `production_equipment_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'production_equipment name',
  `production_equipment_type_no` int(0) NULL DEFAULT NULL COMMENT '逻辑外键，production_equipment类型id',
  `production_equipment_number` int(0) NULL DEFAULT NULL COMMENT 'production_equipment_number',
  `hazard_level` tinyint(0) NULL DEFAULT NULL COMMENT 'hazard_level',
  `importance_level` tinyint(0) NULL DEFAULT NULL COMMENT 'importance level',
  `remark_info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `deleted` tinyint(1) NULL DEFAULT NULL COMMENT 'deleted',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT 'create time',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT 'update_time',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for production_line
-- ----------------------------
DROP TABLE IF EXISTS `production_line`;
CREATE TABLE `production_line`  (
  `id` int(0) NOT NULL COMMENT 'PK_id,非自增,业务填写',
  `production_line_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '格式0000-0000-0000-0000',
  `production_line_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'production_line name',
  `workshop_id` int(0) NULL DEFAULT NULL COMMENT '逻辑外键，车间id',
  `head_id` int(0) NULL DEFAULT NULL COMMENT '逻辑外键，负责人id',
  `production_line_location` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'production_line location',
  `enable_status` tinyint(1) NOT NULL COMMENT 'enable status',
  `remark_info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `deleted` tinyint(1) NULL DEFAULT NULL COMMENT 'deleted',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT 'create time',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT 'update_time',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for production_tooling
-- ----------------------------
DROP TABLE IF EXISTS `production_tooling`;
CREATE TABLE `production_tooling`  (
  `id` int(0) NOT NULL COMMENT 'PK_id,非自增,业务填写',
  `production_tooling_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '格式0000-0000-0000-0000',
  `production_tooling_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'production_tooling name',
  `production_tooling_type_no` int(0) NULL DEFAULT NULL COMMENT '逻辑外键，production_tooling type',
  `production_equipment_number` int(0) NULL DEFAULT NULL COMMENT 'production_equipment_number',
  `hazard_level` tinyint(0) NULL DEFAULT NULL COMMENT 'hazard_level',
  `importance_level` tinyint(0) NULL DEFAULT NULL COMMENT 'importance level',
  `remark_info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `deleted` tinyint(1) NULL DEFAULT NULL COMMENT 'deleted',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT 'create time',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT 'update_time',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role`  (
  `id` int(0) NOT NULL COMMENT 'PK_id,非自增,业务填写',
  `role_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '格式0000-0000-0000-0000',
  `role_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'company_staff_name',
  `enable_status` tinyint(1) NOT NULL COMMENT 'enable status',
  `remark_info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `deleted` tinyint(1) NULL DEFAULT NULL COMMENT 'deleted',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT 'create time',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT 'update_time',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for supplier
-- ----------------------------
DROP TABLE IF EXISTS `supplier`;
CREATE TABLE `supplier`  (
  `id` int(0) NOT NULL COMMENT 'PK_id,非自增,业务填写',
  `supplier_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '格式0000-0000-0000-0000',
  `supplier_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'supplier name',
  `short_name` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'short name',
  `supplier_grade` int(0) NULL DEFAULT NULL COMMENT 'grade',
  `supplier_score` int(0) NULL DEFAULT NULL COMMENT 'score',
  `supplier_phone` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'supplier_phone',
  `enable_status` tinyint(1) NOT NULL COMMENT 'enable status',
  `remark_info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `deleted` tinyint(1) NULL DEFAULT NULL COMMENT 'deleted',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT 'create time',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT 'update_time',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for work_center
-- ----------------------------
DROP TABLE IF EXISTS `work_center`;
CREATE TABLE `work_center`  (
  `id` int(0) NOT NULL COMMENT 'PK_id,非自增,业务填写',
  `work_center_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '格式0000-0000-0000-0000',
  `work_center_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'work_center name',
  `work_center_location` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'work_center location',
  `production_line_id` int(0) NULL DEFAULT NULL COMMENT '逻辑外键，产线id',
  `workshop_no` int(0) NULL DEFAULT NULL COMMENT '逻辑外键，车间id',
  `head_id` int(0) NULL DEFAULT NULL COMMENT '逻辑外键，负责人id',
  `production_processes_id` int(0) NULL DEFAULT NULL COMMENT '逻辑外键，工序id',
  `enable_status` tinyint(1) NOT NULL COMMENT 'enable status',
  `remark_info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `deleted` tinyint(1) NULL DEFAULT NULL COMMENT 'deleted',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT 'create time',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT 'update_time',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for workshop
-- ----------------------------
DROP TABLE IF EXISTS `workshop`;
CREATE TABLE `workshop`  (
  `id` int(0) NOT NULL COMMENT 'PK_id,非自增,业务填写',
  `workshop_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '格式0000-0000-0000-0000',
  `workshop_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'workshop name',
  `department_id` int(0) NULL DEFAULT NULL COMMENT '逻辑外键，部门或公司 id',
  `head_id` int(0) NULL DEFAULT NULL COMMENT '逻辑外键，负责人id',
  `workshop_area` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'workshop area',
  `enable_status` tinyint(1) NOT NULL COMMENT 'enable status',
  `remark_info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `deleted` tinyint(1) NULL DEFAULT NULL COMMENT 'deleted',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT 'create time',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT 'update_time',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
