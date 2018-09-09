/*
 Navicat Premium Data Transfer

 Source Server         : mac-localhost-mysql
 Source Server Type    : MySQL
 Source Server Version : 80012
 Source Host           : localhost:3306
 Source Schema         : springbootdb_cluster

 Target Server Type    : MySQL
 Target Server Version : 80012
 File Encoding         : 65001

 Date: 09/09/2018 23:03:35
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for city
-- ----------------------------
DROP TABLE IF EXISTS `city`;
CREATE TABLE `city` (
  `id` bigint(20) NOT NULL,
  `province_id` bigint(20) NOT NULL,
  `city_name` varchar(10) NOT NULL,
  `description` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of city
-- ----------------------------
BEGIN;
INSERT INTO `city` VALUES (1, 1, 'chengdu', 'sichuan cd');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
