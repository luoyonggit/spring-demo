/*
Navicat MySQL Data Transfer

Source Host           : localhost:3306
Source Database       : spring_test

Target Server Type    : MYSQL
Target Server Version : 50623
File Encoding         : 65001

Date: 2016-04-13 20:52:24
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for table1
-- ----------------------------
DROP TABLE IF EXISTS `table1`;
CREATE TABLE `table1` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `column1` varchar(30) DEFAULT NULL,
  `column2` varchar(30) DEFAULT NULL,
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for table2
-- ----------------------------
DROP TABLE IF EXISTS `table2`;
CREATE TABLE `table2` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `column3` varchar(30) DEFAULT NULL,
  `column4` varchar(30) DEFAULT NULL,
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
