DROP DATABASE IF EXISTS `telediagnosis1`;
CREATE DATABASE `telediagnosis1` DEFAULT CHARACTER SET utf8;

USE `telediagnosis1`;
SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) DEFAULT NULL COMMENT '科室信息',
  `parentId` int(11) DEFAULT NULL,
  `depPath` varchar(255) DEFAULT NULL,
  `enabled` tinyint(1) DEFAULT '1',
  `isParent` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=93 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('1', '股东会', '-1', '.1', '1', '1');
INSERT INTO `department` VALUES ('2', '总院', '1', '.1.2', '1', '1');
INSERT INTO `department` VALUES ('3', '分院', '2', '.1.2.3', '1', '1');

INSERT INTO `department` VALUES ('5', '外科', '3', '.1.2.3.5', '1', '1');
INSERT INTO `department` VALUES ('6', '内科', '3', '.1.2.3.6', '1', '1');
INSERT INTO `department` VALUES ('7', '妇产科', '3', '.1.2.3.7', '1', '1');
INSERT INTO `department` VALUES ('8', '儿科', '3', '.1.2.3.8', '1', '1');

INSERT INTO `department` VALUES ('51', '普通外科', '5', '.1.2.3.5.51', '1', '0');
INSERT INTO `department` VALUES ('52', '神经外科', '5', '.1.2.3.5.52', '1', '0');
INSERT INTO `department` VALUES ('53', '泌尿外科', '5', '.1.2.3.5.53', '1', '0');
INSERT INTO `department` VALUES ('61', '消化内科', '6', '.1.2.3.6.61', '1', '0');
INSERT INTO `department` VALUES ('62', '肾脏内科', '6', '.1.2.3.6.62', '1', '0');
INSERT INTO `department` VALUES ('63', '血液内科', '6', '.1.2.3.6.63', '1', '0');

-- ----------------------------
-- Table structure for patient
-- ----------------------------
DROP TABLE IF EXISTS `patient`;
CREATE TABLE `patient` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '病人编号',
  `name` varchar(10) DEFAULT NULL COMMENT '病人姓名',
  `gender` char(4) DEFAULT NULL COMMENT '性别',
  `birthday` date DEFAULT NULL COMMENT '出生日期',
  `idCard` char(18) DEFAULT NULL COMMENT '身份证号',
  `health` enum('良好','严重','非常严重') DEFAULT NULL COMMENT '健康状况',
  `healthDetail` varchar(100) DEFAULT NULL COMMENT '详情',
  `nativePlace` varchar(20) DEFAULT NULL COMMENT '地址',
  `email` varchar(20) DEFAULT NULL COMMENT '邮箱',
  `phone` varchar(11) DEFAULT NULL COMMENT '电话号码',
  `address` varchar(64) DEFAULT NULL COMMENT '联系地址',
  `departmentId` int(11) DEFAULT NULL COMMENT '所属科室',
  `beginDate` date DEFAULT NULL COMMENT '入院日期',
  `beginDetail` varchar(100) DEFAULT NULL COMMENT '入院病情详情',
  `endDate` date DEFAULT NULL COMMENT '出院日期',
  `endDetail` varchar(100) DEFAULT NULL COMMENT '出院病情详情',
  PRIMARY KEY (`id`),
  KEY `departmentId` (`departmentId`),

  CONSTRAINT `patient_ibfk_1` FOREIGN KEY (`departmentId`) REFERENCES `department` (`id`)

) ENGINE=InnoDB AUTO_INCREMENT=1519 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of patient
-- ----------------------------
INSERT INTO `patient` VALUES ('1', '张三', '男', '1990-01-01', '610122199001011256', '良好', null,'陕西', 'laowang@qq.com', '18565558897', '深圳市南山区', '51', '2018-01-01',null,'2018-04-01',null);

-- ----------------------------
-- Table structure for patientexam
-- ----------------------------
DROP TABLE IF EXISTS `patientexam`;
CREATE TABLE `patientexam` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `patientid` int(11) DEFAULT NULL COMMENT '病人编号',
  `trainDate` date DEFAULT NULL COMMENT '检查日期',
  `trainContent` varchar(255) DEFAULT NULL COMMENT '检查内容',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`),
  KEY `pid` (`patientid`),
  CONSTRAINT `patientexam_ibfk_1` FOREIGN KEY (`patientid`) REFERENCES `patient` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'userID',
  `name` varchar(32) DEFAULT NULL COMMENT '姓名',
  `phone` char(11) DEFAULT NULL COMMENT '手机号码',
  `enabled` tinyint(1) DEFAULT '1',
  `username` varchar(255) DEFAULT NULL COMMENT '用户名',
  `password` varchar(255) DEFAULT NULL COMMENT '密码',
  `userface` varchar(255) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '系统管理员1', '18568887789', '1', 'admin', '$2a$10$ySG2lkvjFHY5O0./CPIE1OI8VJsuKYEzOYzqIa7AJR6sEgSzUFOAm', 'http://bpic.588ku.com/element_pic/01/40/00/64573ce2edc0728.jpg', null);
INSERT INTO `user` VALUES ('2', '系统管理员2', '18568123489', '1', 'admin2', '$2a$10$oE39aG10kB/rFu2vQeCJTu/V/v4n6DRR0f8WyXRiAYvBpmadoOBE.', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1514093920321&di=913e88c23f382933ef430024afd9128a&imgtype=0&src=http%3A%2F%2Fp.3761.com%2Fpic%2F9771429316733.jpg', null);
INSERT INTO `user` VALUES ('3', '系统管理员3', '18568123666', '1', 'admin3', '$2a$10$oE39aG10kB/rFu2vQeCJTu/V/v4n6DRR0f8WyXRiAYvBpmadoOBE.', 'https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=1406745149,1563524794&fm=27&gp=0.jpg', null);
INSERT INTO `user` VALUES ('4', '系统管理员4', '18568123377', '1', 'admin4', '$2a$10$oE39aG10kB/rFu2vQeCJTu/V/v4n6DRR0f8WyXRiAYvBpmadoOBE.', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1515233756&di=0856d923a0a37a87fd26604a2c871370&imgtype=jpg&er=1&src=http%3A%2F%2Fwww.qqzhi.com%2Fuploadpic%2F2014-09-27%2F041716704.jpg', null);
INSERT INTO `user` VALUES ('5', '系统管理员5', '18568128888', '1', 'admin5', '$2a$10$oE39aG10kB/rFu2vQeCJTu/V/v4n6DRR0f8WyXRiAYvBpmadoOBE.', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1517070040185&di=be0375e0c3db6c311b837b28c208f318&imgtype=0&src=http%3A%2F%2Fimg2.soyoung.com%2Fpost%2F20150213%2F6%2F20150213141918532.jpg', null);

-- ----------------------------
-- Table structure for menu
-- ----------------------------
DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `url` varchar(64) DEFAULT NULL,
  `path` varchar(64) DEFAULT NULL,
  `component` varchar(64) DEFAULT NULL,
  `name` varchar(64) DEFAULT NULL,
  `iconCls` varchar(64) DEFAULT NULL,
  `keepAlive` tinyint(1) DEFAULT NULL,
  `requireAuth` tinyint(1) DEFAULT NULL,
  `parentId` int(11) DEFAULT NULL,
  `enabled` tinyint(1) DEFAULT '1',
  PRIMARY KEY (`id`),
  KEY `parentId` (`parentId`),
  CONSTRAINT `menu_ibfk_1` FOREIGN KEY (`parentId`) REFERENCES `menu` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of menu
-- ----------------------------
INSERT INTO `menu` VALUES ('1', '/', null, null, '所有', null, null, null, null, '1');
INSERT INTO `menu` VALUES ('2', '/', '/home', 'Home', '病人信息', 'fa fa-user-circle-o', null, '1', '1', '1');
INSERT INTO `menu` VALUES ('3', '/', '/home', 'Home', '用户管理', 'fa fa-address-card-o', null, '1', '1', '1');
INSERT INTO `menu` VALUES ('4', '/', '/home', 'Home', '远程诊断', 'fa fa-money', null, '1', '1', '1');
INSERT INTO `menu` VALUES ('5', '/', '/home', 'Home', '个人管理', 'fa fa-bar-chart', null, '1', '1', '1');
INSERT INTO `menu` VALUES ('6', '/', '/home', 'Home', '系统管理', 'fa fa-windows', null, '1', '1', '1');
INSERT INTO `menu` VALUES ('21', '/patient/basic/**', '/patient/basic', 'PatientBasic', '所有病人', null, null, '1', '2', '1');
INSERT INTO `menu` VALUES ('31', '/user/expert/**', '/user/expert', 'UserExpert', '专家管理', null, null, '1', '3', '1');
INSERT INTO `menu` VALUES ('32', '/user/doctor/**', '/user/doctor', 'UserDoctor', '医生管理', null, null, '1', '3', '1');
INSERT INTO `menu` VALUES ('41', '/tele/diagnosis/**', '/tele/diagnosis', 'TeleDiagnosis', '远程会诊', null, null, '1', '4', '1');
INSERT INTO `menu` VALUES ('51', '/my/info/**', '/my/info', 'MyInfo', '个人信息', null, null, '1', '5', '1');
INSERT INTO `menu` VALUES ('61', '/system/basic/**', '/sys/basic', 'SysBasic', '基础设置', null, null, '1', '6', '1');

-- ----------------------------
-- Table structure for menu_role
-- ----------------------------
DROP TABLE IF EXISTS `menu_role`;
CREATE TABLE `menu_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mid` int(11) DEFAULT NULL,
  `rid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `mid` (`mid`),
  KEY `rid` (`rid`),
  CONSTRAINT `menu_role_ibfk_1` FOREIGN KEY (`mid`) REFERENCES `menu` (`id`),
  CONSTRAINT `menu_role_ibfk_2` FOREIGN KEY (`rid`) REFERENCES `role` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=278 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of menu_role
-- ----------------------------
INSERT INTO `menu_role` VALUES ('1', '2', '1');
INSERT INTO `menu_role` VALUES ('2', '3', '1');
INSERT INTO `menu_role` VALUES ('3', '4', '1');
INSERT INTO `menu_role` VALUES ('4', '5', '1');
INSERT INTO `menu_role` VALUES ('5', '6', '1');
INSERT INTO `menu_role` VALUES ('6', '21', '1');
INSERT INTO `menu_role` VALUES ('7', '31', '1');
INSERT INTO `menu_role` VALUES ('8', '32', '1');
INSERT INTO `menu_role` VALUES ('9', '41', '1');
INSERT INTO `menu_role` VALUES ('10', '51', '1');
INSERT INTO `menu_role` VALUES ('11', '61', '1');


-- ----------------------------
-- Table structure for msgcontent
-- ----------------------------
DROP TABLE IF EXISTS `msgcontent`;
CREATE TABLE `msgcontent` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(64) DEFAULT NULL,
  `message` varchar(255) DEFAULT NULL,
  `createDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of msgcontent
-- ----------------------------
INSERT INTO `msgcontent` VALUES ('14', '2222222222', '11111111111111111', '2018-02-02 20:46:19');
INSERT INTO `msgcontent` VALUES ('15', '22222222', '3333333333333333333333', '2018-02-02 21:45:57');
INSERT INTO `msgcontent` VALUES ('16', '通知标题1', '通知内容1', '2018-02-03 11:41:39');
INSERT INTO `msgcontent` VALUES ('17', '通知标题2', '通知内容2', '2018-02-03 11:52:37');
INSERT INTO `msgcontent` VALUES ('18', '通知标题3', '通知内容3', '2018-02-03 12:19:41');

-- ----------------------------
-- Table structure for position
-- ----------------------------
DROP TABLE IF EXISTS `position`;
CREATE TABLE `position` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) DEFAULT NULL COMMENT '职位',
  `createDate` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `enabled` tinyint(1) DEFAULT '1',
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of position
-- ----------------------------
INSERT INTO `position` VALUES ('11', '管理员', '2018-01-11 21:13:42', '1');
INSERT INTO `position` VALUES ('12', '专家医师', '2018-01-11 21:13:48', '1');
INSERT INTO `position` VALUES ('13', '门诊医生', '2018-01-11 21:13:56', '1');
INSERT INTO `position` VALUES ('14', '助理医生', '2018-01-11 21:35:07', '1');

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(64) DEFAULT NULL,
  `nameZh` varchar(64) DEFAULT NULL COMMENT '角色名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', 'ROLE_admin', '管理员');
INSERT INTO `role` VALUES ('2', 'ROLE_expert', '专家医生');
INSERT INTO `role` VALUES ('3', 'ROLE_doctor', '门诊医生');
INSERT INTO `role` VALUES ('4', 'ROLE_nurse', '助理护士');
INSERT INTO `role` VALUES ('5', 'ROLE_test2', '测试角色2');
INSERT INTO `role` VALUES ('6', 'ROLE_test1', '测试角色1');
-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userid` int(11) DEFAULT NULL,
  `rid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `rid` (`rid`),
  KEY `user_role_ibfk_1` (`userid`),
  CONSTRAINT `user_role_ibfk_1` FOREIGN KEY (`userid`) REFERENCES `user` (`id`) ON DELETE CASCADE,
  CONSTRAINT `user_role_ibfk_2` FOREIGN KEY (`rid`) REFERENCES `role` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=50 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_role
-- ----------------------------
INSERT INTO `user_role` VALUES ('1', '3', '6');
INSERT INTO `user_role` VALUES ('9', '5', '1');
INSERT INTO `user_role` VALUES ('10', '5', '4');
INSERT INTO `user_role` VALUES ('35', '12', '4');
INSERT INTO `user_role` VALUES ('36', '12', '3');
INSERT INTO `user_role` VALUES ('37', '12', '2');
INSERT INTO `user_role` VALUES ('43', '11', '3');
INSERT INTO `user_role` VALUES ('44', '11', '2');
INSERT INTO `user_role` VALUES ('45', '11', '4');
INSERT INTO `user_role` VALUES ('46', '11', '5');
INSERT INTO `user_role` VALUES ('48', '10', '3');
INSERT INTO `user_role` VALUES ('49', '10', '4');

-- ----------------------------
-- Table structure for sysmsg
-- ----------------------------
DROP TABLE IF EXISTS `sysmsg`;
CREATE TABLE `sysmsg` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mid` int(11) DEFAULT NULL COMMENT '消息id',
  `type` int(11) DEFAULT '0' COMMENT '0表示群发消息',
  `userid` int(11) DEFAULT NULL COMMENT '这条消息是给谁的',
  `state` int(11) DEFAULT '0' COMMENT '0 未读 1 已读',
  PRIMARY KEY (`id`),
  KEY `userid` (`userid`),
  KEY `sysmsg_ibfk_1` (`mid`),
  CONSTRAINT `sysmsg_ibfk_1` FOREIGN KEY (`mid`) REFERENCES `msgcontent` (`id`),
  CONSTRAINT `sysmsg_ibfk_2` FOREIGN KEY (`userid`) REFERENCES `userid` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=82 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sysmsg
-- ----------------------------
INSERT INTO `sysmsg` VALUES ('57', '14', '0', '3', '1');
INSERT INTO `sysmsg` VALUES ('58', '14', '0', '5', '1');
INSERT INTO `sysmsg` VALUES ('59', '14', '0', '10', '1');
INSERT INTO `sysmsg` VALUES ('60', '14', '0', '11', '0');
INSERT INTO `sysmsg` VALUES ('61', '14', '0', '12', '0');
INSERT INTO `sysmsg` VALUES ('62', '15', '0', '3', '1');
INSERT INTO `sysmsg` VALUES ('63', '15', '0', '5', '1');
INSERT INTO `sysmsg` VALUES ('64', '15', '0', '10', '1');
INSERT INTO `sysmsg` VALUES ('65', '15', '0', '11', '0');
INSERT INTO `sysmsg` VALUES ('66', '15', '0', '12', '0');
INSERT INTO `sysmsg` VALUES ('67', '16', '0', '3', '1');
INSERT INTO `sysmsg` VALUES ('68', '16', '0', '5', '1');
INSERT INTO `sysmsg` VALUES ('69', '16', '0', '10', '1');
INSERT INTO `sysmsg` VALUES ('70', '16', '0', '11', '0');
INSERT INTO `sysmsg` VALUES ('71', '16', '0', '12', '0');
INSERT INTO `sysmsg` VALUES ('72', '17', '0', '3', '1');
INSERT INTO `sysmsg` VALUES ('73', '17', '0', '5', '1');
INSERT INTO `sysmsg` VALUES ('74', '17', '0', '10', '1');
INSERT INTO `sysmsg` VALUES ('75', '17', '0', '11', '0');
INSERT INTO `sysmsg` VALUES ('76', '17', '0', '12', '0');
INSERT INTO `sysmsg` VALUES ('77', '18', '0', '3', '1');
INSERT INTO `sysmsg` VALUES ('78', '18', '0', '5', '0');
INSERT INTO `sysmsg` VALUES ('79', '18', '0', '10', '0');
INSERT INTO `sysmsg` VALUES ('80', '18', '0', '11', '0');
INSERT INTO `sysmsg` VALUES ('81', '18', '0', '12', '0');