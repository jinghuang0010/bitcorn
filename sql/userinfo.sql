/*
 Navicat Premium Data Transfer

 Source Server         : huangjing
 Source Server Type    : MySQL
 Source Server Version : 50153
 Source Host           : localhost:3306
 Source Schema         : huangjing

 Target Server Type    : MySQL
 Target Server Version : 50153
 File Encoding         : 65001

 Date: 08/02/2021 11:05:13
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for userinfo
-- ----------------------------
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo`  (
  `userid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(16) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `pwd` varchar(16) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  PRIMARY KEY (`userid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of userinfo
-- ----------------------------
INSERT INTO `userinfo` VALUES (1, 'huangjing', '123');
INSERT INTO `userinfo` VALUES (2, 'wanglei', '000');

SET FOREIGN_KEY_CHECKS = 1;
