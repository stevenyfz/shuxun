/*
 Navicat MySQL Data Transfer

 Source Server         : steven
 Source Server Type    : MySQL
 Source Server Version : 50720
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 50720
 File Encoding         : 65001

 Date: 08/04/2020 16:59:12
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `StudentID` int(8) NOT NULL AUTO_INCREMENT,
  `StudentName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`StudentID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10153140 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (10153132, '刘金琳');
INSERT INTO `student` VALUES (10153135, '金鹏');
INSERT INTO `student` VALUES (10153136, '陈孜维');
INSERT INTO `student` VALUES (10153137, '吴鑫');
INSERT INTO `student` VALUES (10153138, '秦锦玉');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10153141 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES (10153135, '金鹏');
INSERT INTO `t_user` VALUES (10153136, '陈孜维');
INSERT INTO `t_user` VALUES (10153137, '吴鑫');
INSERT INTO `t_user` VALUES (10153138, '秦锦玉');
INSERT INTO `t_user` VALUES (10153139, '刘金琳');

SET FOREIGN_KEY_CHECKS = 1;
