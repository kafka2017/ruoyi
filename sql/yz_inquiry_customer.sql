/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50562
Source Host           : localhost:3306
Source Database       : ry

Target Server Type    : MYSQL
Target Server Version : 50562
File Encoding         : 65001

Date: 2020-01-16 15:53:03
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for yz_inquiry_customer
-- ----------------------------
DROP TABLE IF EXISTS `yz_inquiry_customer`;
CREATE TABLE `yz_inquiry_customer` (
  `customer_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `cus_name` varchar(50) NOT NULL COMMENT '客户名称',
  `phone` varchar(20) NOT NULL COMMENT '联系电话',
  `company` varchar(255) NOT NULL COMMENT '公司（单位）',
  `remark` varchar(500) NOT NULL COMMENT '简介',
  `reg_time` datetime NOT NULL COMMENT '注册时间',
  `reg_visit` tinyint(4) NOT NULL DEFAULT '0' COMMENT '回访状态 (0 未回访 1 已回访)',
  PRIMARY KEY (`customer_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='客户询价表';
