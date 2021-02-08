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

 Date: 08/02/2021 11:05:53
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for historicalrecords
-- ----------------------------
DROP TABLE IF EXISTS `historicalrecords`;
CREATE TABLE `historicalrecords`  (
  `tbaleid` int(11) UNSIGNED ZEROFILL NOT NULL AUTO_INCREMENT,
  `shoppingday` varchar(16) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `investmentmoney` int(11) NOT NULL,
  `cong` int(11) NOT NULL,
  `sumcong` int(11) NOT NULL,
  `suminvestmentmoney` int(11) NOT NULL,
  `marketvalue` int(11) NOT NULL,
  `increase` double(11, 0) NOT NULL,
  `holdingcost` int(11) NOT NULL,
  `value` int(11) NOT NULL,
  `remark` varchar(16) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  PRIMARY KEY (`tbaleid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of historicalrecords
-- ----------------------------
INSERT INTO `historicalrecords` VALUES (00000000010, '2021-02-03', 20000, 200000000, 200000000, 20000, 20000, 0, 10000, 10000, 'NOTHING');
INSERT INTO `historicalrecords` VALUES (00000000011, '2021-02-02', 20, -199999998, 2, 20020, 0, 100, 2147483647, -10, 'ggg');
INSERT INTO `historicalrecords` VALUES (00000000012, '2021-02-02', 20, 0, 2, 20040, 42, 0, 2147483647, 2147483647, 'ggg');
INSERT INTO `historicalrecords` VALUES (00000000013, '2021-01-12', 30, -1, 1, 20070, -21, 0, 2147483647, -2147483648, 'ffffff');

SET FOREIGN_KEY_CHECKS = 1;
