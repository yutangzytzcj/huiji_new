/*
Navicat MySQL Data Transfer

Source Server         : local_maria
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : wuye

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2020-02-24 21:53:25
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for chewei
-- ----------------------------
DROP TABLE IF EXISTS `chewei`;
CREATE TABLE `chewei` (
  `id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of chewei
-- ----------------------------

-- ----------------------------
-- Table structure for login
-- ----------------------------
DROP TABLE IF EXISTS `login`;
CREATE TABLE `login` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of login
-- ----------------------------
INSERT INTO `login` VALUES ('1', '1', '1');
INSERT INTO `login` VALUES ('2', 'admin', '123456');
INSERT INTO `login` VALUES ('3', '1', '1');
INSERT INTO `login` VALUES ('4', '1', '1');
INSERT INTO `login` VALUES ('5', '9', '9');
INSERT INTO `login` VALUES ('6', 'test', '123456');

-- ----------------------------
-- Table structure for qianru
-- ----------------------------
DROP TABLE IF EXISTS `qianru`;
CREATE TABLE `qianru` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `shiyong_time` varchar(45) NOT NULL,
  `shijian` varchar(45) NOT NULL,
  `qNo` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of qianru
-- ----------------------------
INSERT INTO `qianru` VALUES ('2', '张三', '2017-3-01', '2017-3-01', '001');
INSERT INTO `qianru` VALUES ('3', '王冬', '2017-3-01', '2017-3-01', '002');
INSERT INTO `qianru` VALUES ('4', '李东', '2017-3-01', '2017-3-01', '003');
INSERT INTO `qianru` VALUES ('5', '张东华', '2017-3-01', '2017-3-01', '004');

-- ----------------------------
-- Table structure for salary
-- ----------------------------
DROP TABLE IF EXISTS `salary`;
CREATE TABLE `salary` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `salary_all` varchar(45) NOT NULL COMMENT '缴费总额',
  `salary_type` varchar(45) NOT NULL COMMENT '缴费方式',
  `salary_per` varchar(45) NOT NULL COMMENT '收费人员',
  `salary_time` varchar(45) NOT NULL,
  `beizhu` varchar(300) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of salary
-- ----------------------------
INSERT INTO `salary` VALUES ('2', '张三', '100', '现金缴费', 'A', '2017-3-01', '无');
INSERT INTO `salary` VALUES ('3', '王冬', '200', '刷卡缴费', 'B', '2017-3-01', '无');
INSERT INTO `salary` VALUES ('4', '李东', '200', '现金缴费', 'A', '2017-3-01', '无');
INSERT INTO `salary` VALUES ('5', '张东华', '100', '现金缴费', 'A', '2017-3-01', '无');
INSERT INTO `salary` VALUES ('6', '5', '5', '现金缴费', '5', '2017-6-5', '5');
INSERT INTO `salary` VALUES ('8', '6', '6', '现金缴费', '6', '2017-6-5', '6');

-- ----------------------------
-- Table structure for tousu
-- ----------------------------
DROP TABLE IF EXISTS `tousu`;
CREATE TABLE `tousu` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(45) NOT NULL,
  `content` varchar(300) NOT NULL,
  `tou_time` varchar(45) NOT NULL,
  `answer` varchar(300) DEFAULT NULL,
  `da_time` varchar(45) DEFAULT NULL,
  `username` varchar(45) NOT NULL,
  `tel` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tousu
-- ----------------------------
INSERT INTO `tousu` VALUES ('1', '5', '5', '2017-6-5', '666', '2017-6-5', '5', '5');

-- ----------------------------
-- Table structure for yezhu
-- ----------------------------
DROP TABLE IF EXISTS `yezhu`;
CREATE TABLE `yezhu` (
  `id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of yezhu
-- ----------------------------

-- ----------------------------
-- Table structure for yonghu
-- ----------------------------
DROP TABLE IF EXISTS `yonghu`;
CREATE TABLE `yonghu` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `tel` varchar(45) NOT NULL,
  `l_name` varchar(45) NOT NULL COMMENT '楼宇名称',
  `l_ceng` varchar(45) NOT NULL COMMENT '楼层',
  `l_wu` varchar(45) NOT NULL COMMENT '房屋号',
  `l_danyuan` varchar(45) NOT NULL COMMENT '单元',
  `ru_time` varchar(45) NOT NULL COMMENT '迁入日期',
  `l_fangxing` varchar(45) NOT NULL COMMENT '房型',
  `beizhu` varchar(300) NOT NULL,
  `shijian` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of yonghu
-- ----------------------------
INSERT INTO `yonghu` VALUES ('4', '刘备', '123', '110', '刘备', '2', '2', '2', '北京海淀区', '正常', '做生意', '2020-2-21');
