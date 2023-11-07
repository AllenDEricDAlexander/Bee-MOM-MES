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
-- Table structure for Quality Inspection Item Table
-- ----------------------------
DROP TABLE IF EXISTS `quality_inspection_item`;
CREATE TABLE `quality_inspection_item`  (
  `id` bigint(0) NOT NULL COMMENT 'pk_id,非自增，业务填写',
  `quality_inspection_item_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '工序编号格式0000-0000-0000-0000',
  `quality_inspection_item_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'process_name',
  `quality_inspection_item_description` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `quality_station_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '工位_no 格式0000-0000-0000-0000',
  `workshop_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'workshop_no 格式0000-0000-0000-0000',
  `production_line_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'production_line_no 格式0000-0000-0000-0000',
  `department_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'department_no 格式0000-0000-0000-0000',
  `creator_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'creator_no 格式0000-0000-0000-0000',
  `charge_person_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'charge_person_no 格式0000-0000-0000-0000',
  `enable_state` tinyint(1) NULL DEFAULT NULL COMMENT 'enable status',
  `remark_info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `deleted` tinyint(1) NOT NULL COMMENT 'deleted status',
  `create_time` datetime(0) NULL DEFAULT NULL,
  `update_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for Quality Plan
-- ----------------------------
DROP TABLE IF EXISTS `quality_plan_info`;
CREATE TABLE `quality_plan_info`  (
  `id` bigint(0) NOT NULL COMMENT 'pk_id,非自增，业务填写',
  `quality_plan_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'manufacture_dispatche_no 格式0000-0000-0000-0000',
  `quality_plan_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'process_name',
  `quality_plan_description` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `charge_person_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'charge_person_no 格式0000-0000-0000-0000',
  `enable_state` tinyint(1) NULL DEFAULT NULL COMMENT 'enable status',
  `remark_info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `deleted` tinyint(1) NOT NULL COMMENT 'deleted status',
  `create_time` datetime(0) NULL DEFAULT NULL,
  `update_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for process_inspection_record_form
-- ----------------------------
DROP TABLE IF EXISTS `process_inspection_record_form`;
CREATE TABLE `process_inspection_record_form`  (
  `id` bigint(0) NOT NULL COMMENT 'pk_id,非自增，业务填写',
  `process_inspection_record_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '工序编号格式0000-0000-0000-0000',
  `process_inspection_record_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'process_name',
  `process_inspection_record_description` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `quality_station_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '工位_no 格式0000-0000-0000-0000',
  `workshop_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'workshop_no 格式0000-0000-0000-0000',
  `production_line_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'production_line_no 格式0000-0000-0000-0000',
  `department_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'department_no 格式0000-0000-0000-0000',
  `creator_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'creator_no 格式0000-0000-0000-0000',
  `charge_person_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'charge_person_no 格式0000-0000-0000-0000',
	`technology_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'technology_no 格式0000-0000-0000-0000',
  
  `remark_info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `deleted` tinyint(1) NOT NULL COMMENT 'deleted status',
  `create_time` datetime(0) NULL DEFAULT NULL,
  `update_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;



-- ----------------------------
-- Table structure for exit_inspection_record_form
-- ----------------------------
DROP TABLE IF EXISTS `exit_inspection_record_form`;
CREATE TABLE `exit_inspection_record_form`  (
  `id` bigint(0) NOT NULL COMMENT 'pk_id,非自增，业务填写',
  `exit_inspection_record_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '工序编号格式0000-0000-0000-0000',
  `exit_inspection_record_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'process_name',
  `exit_inspection_record_description` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `product_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '工位_no 格式0000-0000-0000-0000',
  `charge_person_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'workshop_no 格式0000-0000-0000-0000',
  `quality_inspector_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'production_line_no 格式0000-0000-0000-0000',
  
  `remark_info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `deleted` tinyint(1) NOT NULL COMMENT 'deleted status',
  `create_time` datetime(0) NULL DEFAULT NULL,
  `update_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for entrance _inspection_record_form
-- ----------------------------
DROP TABLE IF EXISTS `entrance_inspection_record_form`;
CREATE TABLE `entrance_inspection_record_form`  (
  `id` bigint(0) NOT NULL COMMENT 'pk_id,非自增，业务填写',
  `entrance_inspection_record_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '工序编号格式0000-0000-0000-0000',
  `entrance_inspection_record_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'process_name',
  `entrance_inspection_record_description` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `product_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '工位_no 格式0000-0000-0000-0000',
  `charge_person_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'workshop_no 格式0000-0000-0000-0000',
  `quality_inspector_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'production_line_no 格式0000-0000-0000-0000',
  
  `remark_info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `deleted` tinyint(1) NOT NULL COMMENT 'deleted status',
  `create_time` datetime(0) NULL DEFAULT NULL,
  `update_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for defect_management
-- ----------------------------
DROP TABLE IF EXISTS `defect_management`;
CREATE TABLE `defect_management`  (
  `id` bigint(0) NOT NULL COMMENT 'pk_id,非自增，业务填写',
  `defect_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '工序编号格式0000-0000-0000-0000',
  `defect_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'process_name',
  `defect_type` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `order_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '工位_no 格式0000-0000-0000-0000',
  `charge_person_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'workshop_no 格式0000-0000-0000-0000',
  `location` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'production_line_no 格式0000-0000-0000-0000',
  `handling_method` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'production_line_no 格式0000-0000-0000-0000',
  `enable_state` tinyint(1) NULL DEFAULT NULL COMMENT 'enable status',
  `remark_info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `deleted` tinyint(1) NOT NULL COMMENT 'deleted status',
  `create_time` datetime(0) NULL DEFAULT NULL,
  `update_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for defect_management_type
-- ----------------------------
DROP TABLE IF EXISTS `defect_management_type`;
CREATE TABLE `defect_management_type`  (
  `id` BIGINT(0) NOT NULL COMMENT 'PK_id,非自增,业务填写',
  `defect_management_type_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '格式0000-0000-0000-0000',
  `defect_management_type_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'material_type name',
  `father_type_no` int(0) NULL DEFAULT NULL COMMENT '逻辑外键，上级物料类型id',
  `remark_info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `deleted` tinyint(1) NULL DEFAULT NULL COMMENT 'deleted',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT 'create time',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT 'update_time',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for certificate_management
-- ----------------------------
DROP TABLE IF EXISTS `certificate_management`;
CREATE TABLE `certificate_management`  (
  `id` bigint(0) NOT NULL COMMENT 'pk_id,非自增，业务填写',
  `certificate_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '工序编号格式0000-0000-0000-0000',
  `certificate_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'process_name',
  `certificate_type` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `quality_inspector_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '工位_no 格式0000-0000-0000-0000',
  `charge_person_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'workshop_no 格式0000-0000-0000-0000',
  `product_info_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'workshop_no 格式0000-0000-0000-0000',
  `certificate_message` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'production_line_no 格式0000-0000-0000-0000',
  `enable_state` tinyint(1) NULL DEFAULT NULL COMMENT 'enable status',
  `remark_info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `deleted` tinyint(1) NOT NULL COMMENT 'deleted status',
  `create_time` datetime(0) NULL DEFAULT NULL,
  `update_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for certificate_management_type
-- ----------------------------
DROP TABLE IF EXISTS `certificate_management_type`;
CREATE TABLE `certificate_management_type`  (
  `id` BIGINT(0) NOT NULL COMMENT 'PK_id,非自增,业务填写',
  `certificate_management_type_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '格式0000-0000-0000-0000',
  `certificate_management_type_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'material_type name',
  `father_type_no` int(0) NULL DEFAULT NULL COMMENT '逻辑外键，上级物料类型id',
  `remark_info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `deleted` tinyint(1) NULL DEFAULT NULL COMMENT 'deleted',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT 'create time',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT 'update_time',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for outsourced_incoming_material_inspection
-- ----------------------------
DROP TABLE IF EXISTS `outsourced_incoming_material_inspection`;
CREATE TABLE `outsourced_incoming_material_inspection`  (
  `id` bigint(0) NOT NULL COMMENT 'pk_id,非自增，业务填写',
  `outsourced_incoming_material_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '工序编号格式0000-0000-0000-0000',
  `outsourced_incoming_material_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'process_name',
  `certificate_type` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `warehouse_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '工位_no 格式0000-0000-0000-0000',
  `quality_inspector_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '工位_no 格式0000-0000-0000-0000',
  `charge_person_no` varchar(27) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'workshop_no 格式0000-0000-0000-0000',
  `enable_state` tinyint(1) NULL DEFAULT NULL COMMENT 'enable status',
  `remark_info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `deleted` tinyint(1) NOT NULL COMMENT 'deleted status',
  `create_time` datetime(0) NULL DEFAULT NULL,
  `update_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;



SET FOREIGN_KEY_CHECKS = 1;
