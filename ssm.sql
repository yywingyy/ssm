/*
Navicat MySQL Data Transfer

Source Server         : mysqlLink
Source Server Version : 50157
Source Host           : localhost:3306
Source Database       : ssm

Target Server Type    : MYSQL
Target Server Version : 50157
File Encoding         : 65001

Date: 2017-02-04 17:30:56
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_account
-- ----------------------------
DROP TABLE IF EXISTS `t_account`;
CREATE TABLE `t_account` (
  `a_id` int(11) NOT NULL AUTO_INCREMENT,
  `i_id` int(11) NOT NULL,
  `u_money` int(11) NOT NULL DEFAULT '0',
  `u_point` int(11) NOT NULL DEFAULT '0',
  `u_score` int(11) NOT NULL DEFAULT '0',
  `u_game_money` int(11) NOT NULL DEFAULT '5000',
  `u_game_vip` int(2) NOT NULL DEFAULT '0',
  `a_last_modify` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`a_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_account
-- ----------------------------
INSERT INTO `t_account` VALUES ('1', '1', '0', '0', '0', '5000', '0', '2017-02-04 17:18:12');

-- ----------------------------
-- Table structure for t_games
-- ----------------------------
DROP TABLE IF EXISTS `t_games`;
CREATE TABLE `t_games` (
  `g_id` int(11) NOT NULL AUTO_INCREMENT,
  `g_game_type` int(2) NOT NULL,
  `g_game_name` varchar(50) NOT NULL,
  `g_game_partition` varchar(50) NOT NULL,
  `g_game_flag` int(1) NOT NULL DEFAULT '0',
  `g_last_modify` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`g_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_games
-- ----------------------------
INSERT INTO `t_games` VALUES ('1', '1', 'LOL', '巨神峰', '0', '2017-02-04 17:22:40');

-- ----------------------------
-- Table structure for t_information
-- ----------------------------
DROP TABLE IF EXISTS `t_information`;
CREATE TABLE `t_information` (
  `i_id` int(11) NOT NULL AUTO_INCREMENT,
  `u_id` int(11) NOT NULL,
  `u_account_no` varchar(100) NOT NULL,
  `u_qq` varchar(100) DEFAULT NULL,
  `u_tel` varchar(100) DEFAULT NULL,
  `u_phone` varchar(100) NOT NULL,
  `u_last_login_address` varchar(100) DEFAULT NULL,
  `i_last_modify` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `u_id_card` varchar(20) NOT NULL,
  PRIMARY KEY (`i_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_information
-- ----------------------------
INSERT INTO `t_information` VALUES ('1', '1', '88888888888888888', '493242915', null, '138888888888', '湖北孝感', '2017-02-04 17:18:22', '422201111111111111');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `u_id` int(11) NOT NULL AUTO_INCREMENT,
  `u_username` varchar(100) NOT NULL,
  `u_password` varchar(100) NOT NULL,
  `u_nickname` varchar(100) DEFAULT NULL,
  `u_last_modify` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `u_last_login_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `u_sex` varchar(8) DEFAULT NULL,
  `u_age` int(3) DEFAULT NULL,
  `u_flag` int(1) DEFAULT '0',
  `u_is_delete` int(1) DEFAULT '0',
  `u_register_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`u_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', 'yy111', '111111', 'haha', '0000-00-00 00:00:00', '0000-00-00 00:00:00', '男', '25', '0', '0', '2017-02-04 17:18:30');

-- ----------------------------
-- Table structure for t_user_game_info
-- ----------------------------
DROP TABLE IF EXISTS `t_user_game_info`;
CREATE TABLE `t_user_game_info` (
  `ugi_id` int(11) NOT NULL AUTO_INCREMENT,
  `g_game_type` int(2) NOT NULL,
  `ugi_win_num` varchar(50) NOT NULL DEFAULT '0',
  `ugi_lose_num` varchar(50) NOT NULL DEFAULT '0',
  `ugi_win_proportion` float(6,3) NOT NULL DEFAULT '0.000',
  `ugi_last_modify` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`ugi_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user_game_info
-- ----------------------------
INSERT INTO `t_user_game_info` VALUES ('1', '1', '0', '0', '0.000', '2017-02-04 17:30:39');
