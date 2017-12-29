/*
Navicat MySQL Data Transfer

Source Server         : l
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2017-12-29 16:20:35
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `contact` varchar(255) DEFAULT NULL,
  `telephone` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of customer
-- ----------------------------
INSERT INTO `customer` VALUES ('1', 'customer1', 'Jack', '13101019191', 'jack@gmail.com', null);
INSERT INTO `customer` VALUES ('2', 'customer2', 'Rose', '118181818181', 'rose@gmail.com', null);
INSERT INTO `customer` VALUES ('3', null, null, null, null, null);
