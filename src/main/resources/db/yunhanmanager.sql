/*
Navicat MySQL Data Transfer

Source Server         : heyang
Source Server Version : 80012
Source Host           : 127.0.0.1:3306
Source Database       : yunhanmanager

Target Server Type    : MYSQL
Target Server Version : 80012
File Encoding         : 65001

Date: 2019-11-06 08:18:01
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for bank
-- ----------------------------
DROP TABLE IF EXISTS `bank`;
CREATE TABLE `bank` (
  `bankId` int(4) NOT NULL AUTO_INCREMENT,
  `openBank` varchar(20) DEFAULT NULL,
  `banknumber` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`bankId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of bank
-- ----------------------------
INSERT INTO `bank` VALUES ('1', '中国银行', '7895236458216');
INSERT INTO `bank` VALUES ('2', '建设银行', '7895236458216');
INSERT INTO `bank` VALUES ('3', '邮政银行', '7895236458216');
INSERT INTO `bank` VALUES ('4', '农业银行', '7895236458216');

-- ----------------------------
-- Table structure for building
-- ----------------------------
DROP TABLE IF EXISTS `building`;
CREATE TABLE `building` (
  `buildingID` int(11) NOT NULL AUTO_INCREMENT,
  `buildingName` varchar(50) DEFAULT NULL,
  `itemsid` int(11) DEFAULT NULL,
  `loucengCount` int(11) DEFAULT NULL,
  `buildingStatus` int(11) DEFAULT NULL,
  `payitemsId` int(11) DEFAULT NULL,
  PRIMARY KEY (`buildingID`),
  KEY `itemsid` (`itemsid`),
  CONSTRAINT `building_ibfk_1` FOREIGN KEY (`itemsid`) REFERENCES `items` (`itemsid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of building
-- ----------------------------
INSERT INTO `building` VALUES ('1', '一单元', '1', '32', '0', '1');
INSERT INTO `building` VALUES ('2', '二单元', '1', '30', '0', '2');
INSERT INTO `building` VALUES ('3', '三单元', '1', '32', '0', '3');
INSERT INTO `building` VALUES ('4', '四单元', '1', '30', '0', '4');
INSERT INTO `building` VALUES ('5', '五单元', '1', '32', '0', '5');
INSERT INTO `building` VALUES ('6', '六单元', '1', '30', '0', '6');

-- ----------------------------
-- Table structure for carport
-- ----------------------------
DROP TABLE IF EXISTS `carport`;
CREATE TABLE `carport` (
  `carportID` int(4) NOT NULL AUTO_INCREMENT,
  `carportNo` int(20) DEFAULT NULL,
  `carportTid` int(4) DEFAULT NULL,
  `cartportStatus` int(11) DEFAULT NULL,
  `cbeginTime` date DEFAULT NULL,
  `cendTime` date DEFAULT NULL,
  PRIMARY KEY (`carportID`),
  KEY `carportTid` (`carportTid`),
  CONSTRAINT `carport_ibfk_1` FOREIGN KEY (`carportTid`) REFERENCES `carportt` (`carporttid`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of carport
-- ----------------------------
INSERT INTO `carport` VALUES ('1', '1001', '1', '1', '2017-03-25', '2017-03-25');
INSERT INTO `carport` VALUES ('2', '1002', '1', '1', '2017-03-25', '2017-03-25');
INSERT INTO `carport` VALUES ('3', '1003', '1', '1', '2017-03-25', '2017-03-25');
INSERT INTO `carport` VALUES ('4', '1004', '2', '0', null, null);
INSERT INTO `carport` VALUES ('5', '1005', '2', '0', null, null);
INSERT INTO `carport` VALUES ('6', '1006', '2', '0', null, null);
INSERT INTO `carport` VALUES ('7', '1007', '1', '0', null, null);
INSERT INTO `carport` VALUES ('8', '1008', '1', '0', null, null);
INSERT INTO `carport` VALUES ('9', '1009', '1', '0', null, null);

-- ----------------------------
-- Table structure for carportt
-- ----------------------------
DROP TABLE IF EXISTS `carportt`;
CREATE TABLE `carportt` (
  `carportTid` int(4) NOT NULL AUTO_INCREMENT,
  `carportTname` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`carportTid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of carportt
-- ----------------------------
INSERT INTO `carportt` VALUES ('1', '出租车位');
INSERT INTO `carportt` VALUES ('2', '购买车位');

-- ----------------------------
-- Table structure for clientmessage
-- ----------------------------
DROP TABLE IF EXISTS `clientmessage`;
CREATE TABLE `clientmessage` (
  `clientMessageId` int(4) NOT NULL AUTO_INCREMENT,
  `clientname` varchar(20) DEFAULT NULL,
  `clientType` varchar(50) DEFAULT NULL,
  `phone` char(11) DEFAULT NULL,
  `certificateType` varchar(50) DEFAULT NULL,
  `certificateNo` varchar(50) DEFAULT NULL,
  `gender` char(2) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `nation` varchar(50) DEFAULT NULL,
  `educationID` int(4) DEFAULT NULL,
  `natives` varchar(50) DEFAULT NULL,
  `addTime` date DEFAULT NULL,
  `bankId` int(4) DEFAULT NULL,
  `clientStatus` int(11) DEFAULT NULL,
  `carportID` int(4) DEFAULT NULL,
  PRIMARY KEY (`clientMessageId`),
  KEY `educationID` (`educationID`),
  KEY `bankId` (`bankId`),
  KEY `carportID` (`carportID`),
  CONSTRAINT `clientmessage_ibfk_1` FOREIGN KEY (`educationID`) REFERENCES `educations` (`educationid`),
  CONSTRAINT `clientmessage_ibfk_2` FOREIGN KEY (`bankId`) REFERENCES `bank` (`bankid`),
  CONSTRAINT `clientmessage_ibfk_3` FOREIGN KEY (`carportID`) REFERENCES `carport` (`carportid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of clientmessage
-- ----------------------------
INSERT INTO `clientmessage` VALUES ('1', '张勇', '业主', '12345678998', '身份证', '411421199705151645', '男', '1997-03-25', '汉', '1', '河南省商丘市', '2017-03-25', '1', '0', '1');
INSERT INTO `clientmessage` VALUES ('2', '李月', '业主', '12345678998', '身份证', '411421199705151645', '女', '1997-03-25', '汉', '1', '河南省商丘市民权西N', '2017-03-25', '2', '0', '2');
INSERT INTO `clientmessage` VALUES ('3', '周青', '业主', '12345678998', '身份证', '411421199705151645', '女', '1997-03-25', '汉', '1', '河南省商丘市龙塘镇', '2017-03-25', '3', '0', '3');
INSERT INTO `clientmessage` VALUES ('4', '李强', '业主', '12345678998', '身份证', '411421199705151615', '男', '1997-03-25', '汉', '1', '河南省商丘市', '2017-03-25', '1', '0', '1');
INSERT INTO `clientmessage` VALUES ('5', '张美', '业主', '12345678998', '身份证', '411421199705151645', '女', '1997-03-25', '汉', '1', '河南省商丘市民权西N', '2017-03-25', '2', '0', '2');
INSERT INTO `clientmessage` VALUES ('6', '周瑜', '业主', '12345678998', '身份证', '411421199705151645', '女', '1997-03-25', '汉', '1', '河南省商丘市龙塘镇', '2017-03-25', '3', '0', '3');

-- ----------------------------
-- Table structure for educations
-- ----------------------------
DROP TABLE IF EXISTS `educations`;
CREATE TABLE `educations` (
  `educationID` int(4) NOT NULL AUTO_INCREMENT,
  `education` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`educationID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of educations
-- ----------------------------
INSERT INTO `educations` VALUES ('1', '初中');
INSERT INTO `educations` VALUES ('2', '高中');
INSERT INTO `educations` VALUES ('3', '专科');
INSERT INTO `educations` VALUES ('4', '本科');
INSERT INTO `educations` VALUES ('5', '硕士');
INSERT INTO `educations` VALUES ('6', '博士');

-- ----------------------------
-- Table structure for feecontent
-- ----------------------------
DROP TABLE IF EXISTS `feecontent`;
CREATE TABLE `feecontent` (
  `feeID` int(11) NOT NULL AUTO_INCREMENT,
  `clientMessageId` int(11) DEFAULT NULL,
  `balance` decimal(6,2) DEFAULT NULL,
  `assessment` decimal(6,2) DEFAULT NULL,
  `collectDate` date DEFAULT NULL,
  `tollgatherer` varchar(20) DEFAULT NULL,
  `paymentType` varchar(10) DEFAULT NULL,
  `fremark` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`feeID`),
  KEY `clientMessageId` (`clientMessageId`),
  CONSTRAINT `feecontent_ibfk_1` FOREIGN KEY (`clientMessageId`) REFERENCES `clientmessage` (`clientmessageid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of feecontent
-- ----------------------------
INSERT INTO `feecontent` VALUES ('1', '1', '23.00', '52.00', '2017-09-30', '系统123', '现金', '好贵啊！');
INSERT INTO `feecontent` VALUES ('2', '2', '23.00', '52.00', '2017-09-30', '系统123', '现金', '');

-- ----------------------------
-- Table structure for items
-- ----------------------------
DROP TABLE IF EXISTS `items`;
CREATE TABLE `items` (
  `itemsid` int(11) NOT NULL AUTO_INCREMENT,
  `itemsname` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`itemsid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of items
-- ----------------------------
INSERT INTO `items` VALUES ('1', '标准方案');

-- ----------------------------
-- Table structure for louceng
-- ----------------------------
DROP TABLE IF EXISTS `louceng`;
CREATE TABLE `louceng` (
  `loucengID` int(4) NOT NULL AUTO_INCREMENT,
  `loucengNO` varchar(50) DEFAULT NULL,
  `buildingID` int(11) DEFAULT NULL,
  PRIMARY KEY (`loucengID`),
  KEY `buildingID` (`buildingID`),
  CONSTRAINT `louceng_ibfk_1` FOREIGN KEY (`buildingID`) REFERENCES `building` (`buildingid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of louceng
-- ----------------------------
INSERT INTO `louceng` VALUES ('1', '1一层', '1');
INSERT INTO `louceng` VALUES ('2', '1二层', '2');
INSERT INTO `louceng` VALUES ('3', '2一层', '3');
INSERT INTO `louceng` VALUES ('4', '2二层', '4');
INSERT INTO `louceng` VALUES ('5', '5三层', '5');
INSERT INTO `louceng` VALUES ('6', '6三层', '6');

-- ----------------------------
-- Table structure for meter
-- ----------------------------
DROP TABLE IF EXISTS `meter`;
CREATE TABLE `meter` (
  `meterID` int(11) NOT NULL AUTO_INCREMENT,
  `precinct` varchar(50) DEFAULT NULL,
  `homeNO` varchar(50) DEFAULT NULL,
  `meterNO` varchar(50) DEFAULT NULL,
  `clientName` varchar(50) DEFAULT NULL,
  `payitemsId` int(11) DEFAULT NULL,
  `meterReadTime` date DEFAULT NULL,
  `meterReadEndTime` date DEFAULT NULL,
  `lastIndex` int(11) DEFAULT NULL,
  `atIndex` int(11) DEFAULT NULL,
  `additional` int(11) DEFAULT NULL,
  `utility` int(11) DEFAULT NULL,
  `meterReadType` varchar(50) DEFAULT NULL,
  `meterReadStatus` varchar(20) DEFAULT NULL,
  `auditStatus` int(11) DEFAULT NULL,
  `meterReadDate` date DEFAULT NULL,
  `meterReader` varchar(20) DEFAULT NULL,
  `remark` varchar(100) DEFAULT NULL,
  `payitemstId` int(11) DEFAULT NULL,
  PRIMARY KEY (`meterID`),
  KEY `m_fk` (`payitemsId`),
  KEY `p_fk` (`payitemstId`),
  CONSTRAINT `m_fk` FOREIGN KEY (`payitemsId`) REFERENCES `metertypes` (`metertype`),
  CONSTRAINT `p_fk` FOREIGN KEY (`payitemstId`) REFERENCES `payitemst` (`payitemstid`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of meter
-- ----------------------------
INSERT INTO `meter` VALUES ('1', '公园道天苑', '1-101-1', '1-101-1', '张勇', '1', '2019-11-01', '2019-11-30', '90', '100', '20', '30', '正常', 'true', '1', '2019-11-30', '李忠', '', '1');
INSERT INTO `meter` VALUES ('2', '公园道天苑', '1-1-101', '1-1-101', '张望', '1', '2019-10-01', '2019-10-31', '130', '120', '100', '150', '正常', 'true', '1', '2019-11-01', '吴迪', '', '1');
INSERT INTO `meter` VALUES ('3', '公园道天苑', '1-1-102', '1-1-102', '李强', '3', '2019-10-01', '2019-10-31', '110', '100', '120', '130', '正常', 'true', '0', '2019-11-01', '周立', '', '1');
INSERT INTO `meter` VALUES ('4', '公园道天苑', '1-1-103', '1-1-103', '洪辰', '4', '2019-10-01', '2019-10-31', '130', '150', '120', '150', '正常', 'true', '0', '2019-11-01', '王辉', '', '1');
INSERT INTO `meter` VALUES ('5', '公园道天苑', '1-1-104', '1-1-101-水表', '孙磊', '1', '2019-10-01', '2019-10-31', '130', '120', '130', '150', '正常', 'true', '1', '2019-11-01', '吴迪', '', '1');
INSERT INTO `meter` VALUES ('6', '公园道天苑', '1-1-106', '1-1-101-水表', '周信', '5', '2019-10-01', '2019-10-31', '130', '220', '100', '150', '正常', 'true', '1', '2019-11-01', '吴迪', '', '1');
INSERT INTO `meter` VALUES ('7', '公园道天苑', '1-1-107', '1-1-101-水表', '张三', '6', '2019-10-01', '2019-10-31', '130', '120', '100', '150', '正常', 'true', '1', '2019-11-01', '吴迪', '', '2');
INSERT INTO `meter` VALUES ('8', '公园道天苑', '1-1-108', '1-1-101-电表', '李四', '1', '2019-10-01', '2019-10-31', '110', '100', '120', '130', '正常', 'true', '1', '2019-11-01', '周立', '', '3');
INSERT INTO `meter` VALUES ('9', '公园道天苑', '1-1-109', '1-1-101-燃气表', '洪辰', '1', '2019-10-01', '2019-10-31', '130', '150', '120', '150', '正常', 'true', '1', '2019-11-01', '王辉', '', '2');
INSERT INTO `meter` VALUES ('10', '公园道天苑', '1-1-110', '1-1-101-水表', '孙磊', '3', '2019-10-01', '2019-10-31', '130', '120', '130', '150', '正常', 'true', '1', '2019-11-01', '吴迪', '', '1');
INSERT INTO `meter` VALUES ('11', '公园道天苑', '1-1-111', '1-1-101-水表', '荔枝', '4', '2019-10-01', '2019-10-31', '130', '220', '100', '150', '正常', 'true', '0', '2019-11-01', '吴迪', '', '2');
INSERT INTO `meter` VALUES ('12', '公园道天苑', '1-1-112', '1-1-101-水表', '马玉', '5', '2019-10-01', '2019-10-31', '130', '220', '100', '150', '正常', 'true', '1', '2019-11-01', '吴迪', '', '3');
INSERT INTO `meter` VALUES ('13', '公园道天苑', '1-1-113', '1-1-101-水表', '张思德', '6', '2019-10-01', '2019-10-31', '130', '220', '100', '150', '正常', 'true', '1', '2019-11-01', '吴迪', '', '4');
INSERT INTO `meter` VALUES ('14', '公园道天苑', '1-1-114', '1-1-101-水表', '刘志', '1', '2019-10-01', '2019-10-31', '130', '220', '100', '150', '正常', 'true', '1', '2019-11-01', '吴迪', '', '1');
INSERT INTO `meter` VALUES ('15', '新乡职业技术学院', '4-4-019', '4-4-019', '小明', '1', '2019-10-01', '2019-10-31', '90', '100', '20', '30', '正常', 'true', '1', '2019-11-01', '何杨', '', '2');
INSERT INTO `meter` VALUES ('16', '新乡职业技术学院', '4-4-019', '4-4-019', '张', '1', '2019-11-01', '2019-11-30', '90', '100', '20', '30', '正常', 'true', '1', '2019-11-30', '何杨', '', '4');

-- ----------------------------
-- Table structure for metert
-- ----------------------------
DROP TABLE IF EXISTS `metert`;
CREATE TABLE `metert` (
  `metertID` int(4) NOT NULL AUTO_INCREMENT,
  `metertType` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`metertID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of metert
-- ----------------------------
INSERT INTO `metert` VALUES ('1', '水表');
INSERT INTO `metert` VALUES ('2', '电表');
INSERT INTO `metert` VALUES ('3', '燃气表');
INSERT INTO `metert` VALUES ('4', 'null');

-- ----------------------------
-- Table structure for metertypes
-- ----------------------------
DROP TABLE IF EXISTS `metertypes`;
CREATE TABLE `metertypes` (
  `meterType` int(11) NOT NULL AUTO_INCREMENT,
  `mname` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`meterType`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of metertypes
-- ----------------------------
INSERT INTO `metertypes` VALUES ('1', '水费');
INSERT INTO `metertypes` VALUES ('2', '电费');
INSERT INTO `metertypes` VALUES ('3', '燃气费');
INSERT INTO `metertypes` VALUES ('4', '污水费');
INSERT INTO `metertypes` VALUES ('5', '物业管理费');
INSERT INTO `metertypes` VALUES ('6', '停车费');

-- ----------------------------
-- Table structure for payitems
-- ----------------------------
DROP TABLE IF EXISTS `payitems`;
CREATE TABLE `payitems` (
  `payitemsId` int(11) NOT NULL AUTO_INCREMENT,
  `patitemsName` varchar(50) DEFAULT NULL,
  `metertID` int(4) DEFAULT NULL,
  `payitemstId` int(4) DEFAULT NULL,
  `payitemsmoney` decimal(10,0) DEFAULT NULL,
  `begintime` date DEFAULT NULL,
  `itemsid` int(11) DEFAULT NULL,
  `payitemsstatus` int(11) DEFAULT NULL,
  PRIMARY KEY (`payitemsId`),
  KEY `metertID` (`metertID`),
  KEY `payitemstId` (`payitemstId`),
  KEY `itemsid` (`itemsid`),
  CONSTRAINT `payitems_ibfk_1` FOREIGN KEY (`metertID`) REFERENCES `metert` (`metertid`),
  CONSTRAINT `payitems_ibfk_2` FOREIGN KEY (`payitemstId`) REFERENCES `payitemst` (`payitemstid`),
  CONSTRAINT `payitems_ibfk_3` FOREIGN KEY (`itemsid`) REFERENCES `items` (`itemsid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of payitems
-- ----------------------------
INSERT INTO `payitems` VALUES ('1', '物业费', null, '1', '500', '2017-03-25', '1', '0');
INSERT INTO `payitems` VALUES ('2', '水费', '1', '2', '400', '2015-03-26', '1', '0');
INSERT INTO `payitems` VALUES ('3', '维修服务费', null, '3', '500', '2017-03-25', '1', '0');
INSERT INTO `payitems` VALUES ('4', '车位管理费', null, '4', '400', '2015-03-26', '1', '0');
INSERT INTO `payitems` VALUES ('5', '污水费', null, '5', '300', '2019-05-03', '1', '0');
INSERT INTO `payitems` VALUES ('6', '电费', '2', '6', '300', '2019-05-03', '1', '0');

-- ----------------------------
-- Table structure for payitemst
-- ----------------------------
DROP TABLE IF EXISTS `payitemst`;
CREATE TABLE `payitemst` (
  `payitemstId` int(11) NOT NULL AUTO_INCREMENT,
  `patitemstName` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`payitemstId`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of payitemst
-- ----------------------------
INSERT INTO `payitemst` VALUES ('1', '常规收费项');
INSERT INTO `payitemst` VALUES ('2', '抄表收费项');
INSERT INTO `payitemst` VALUES ('3', '临时收费项');
INSERT INTO `payitemst` VALUES ('4', '押金项');
INSERT INTO `payitemst` VALUES ('5', '车位收费项');
INSERT INTO `payitemst` VALUES ('6', '租赁收费项');

-- ----------------------------
-- Table structure for relationmessages
-- ----------------------------
DROP TABLE IF EXISTS `relationmessages`;
CREATE TABLE `relationmessages` (
  `rmId` int(4) NOT NULL AUTO_INCREMENT,
  `company` varchar(50) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `relationname` varchar(50) DEFAULT NULL,
  `emergencyPhone` char(11) DEFAULT NULL,
  `clientMessageId` int(4) DEFAULT NULL,
  PRIMARY KEY (`rmId`),
  KEY `clientMessageId` (`clientMessageId`),
  CONSTRAINT `relationmessages_ibfk_1` FOREIGN KEY (`clientMessageId`) REFERENCES `clientmessage` (`clientmessageid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of relationmessages
-- ----------------------------
INSERT INTO `relationmessages` VALUES ('1', '工作单位', '地址', '姓名', '电话', '1');
INSERT INTO `relationmessages` VALUES ('2', '超市上班', '万家乐', '郭梦迪', '17398979398', '2');
INSERT INTO `relationmessages` VALUES ('3', '务农', '小英子', '李小小', '15523653216', '3');

-- ----------------------------
-- Table structure for room
-- ----------------------------
DROP TABLE IF EXISTS `room`;
CREATE TABLE `room` (
  `roomID` int(4) NOT NULL AUTO_INCREMENT,
  `roomNo` varchar(50) DEFAULT NULL,
  `roomArea` varchar(50) DEFAULT NULL,
  `houseType` varchar(50) DEFAULT NULL,
  `finish` varchar(50) DEFAULT NULL,
  `houseState` int(2) DEFAULT NULL,
  `metertID` int(4) DEFAULT NULL,
  `clientMessageId` int(4) DEFAULT NULL,
  `loucengID` int(4) DEFAULT NULL,
  PRIMARY KEY (`roomID`),
  KEY `metertID` (`metertID`),
  KEY `clientMessageId` (`clientMessageId`),
  KEY `loucengID` (`loucengID`),
  CONSTRAINT `room_ibfk_1` FOREIGN KEY (`metertID`) REFERENCES `metert` (`metertid`),
  CONSTRAINT `room_ibfk_2` FOREIGN KEY (`clientMessageId`) REFERENCES `clientmessage` (`clientmessageid`),
  CONSTRAINT `room_ibfk_3` FOREIGN KEY (`loucengID`) REFERENCES `louceng` (`loucengid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of room
-- ----------------------------
INSERT INTO `room` VALUES ('1', '房间号101', '80平方', '一室一厅', '毛胚', '1', '1', '1', '3');
INSERT INTO `room` VALUES ('2', '房间号102', '80平方', '一室一厅', '毛胚', '1', '1', '2', '2');
INSERT INTO `room` VALUES ('3', '房间号103', '80平方', '一室一厅', '毛胚', '1', '1', '3', '6');
INSERT INTO `room` VALUES ('4', '房间号104', '80平方', '一室一厅', '毛胚', '0', null, '4', '5');
INSERT INTO `room` VALUES ('5', '房间号105', '80平方', '一室一厅', '毛胚', '0', null, '5', '4');
INSERT INTO `room` VALUES ('6', '房间号107', '80平方', '一室一厅', '毛胚', '0', null, '6', '1');

-- ----------------------------
-- Table structure for sys_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu` (
  `id` varchar(36) NOT NULL,
  `name` varchar(40) DEFAULT NULL COMMENT '菜单名称',
  `parent_id` varchar(36) DEFAULT NULL COMMENT '父菜单',
  `level` bigint(2) DEFAULT NULL COMMENT '菜单层级',
  `parent_ids` varchar(2000) DEFAULT NULL COMMENT '父菜单联集',
  `sort` smallint(6) DEFAULT NULL COMMENT '排序',
  `href` varchar(2000) DEFAULT NULL COMMENT '链接地址',
  `target` varchar(20) DEFAULT NULL COMMENT '打开方式',
  `icon` varchar(100) DEFAULT NULL COMMENT '菜单图标',
  `bg_color` varchar(255) DEFAULT NULL COMMENT '显示背景色',
  `is_show` tinyint(2) DEFAULT NULL COMMENT '是否显示',
  `permission` varchar(200) DEFAULT NULL COMMENT '权限标识',
  `create_by` varchar(36) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `update_by` varchar(36) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  `remarks` varchar(255) DEFAULT NULL,
  `del_flag` tinyint(2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_menu
-- ----------------------------
INSERT INTO `sys_menu` VALUES ('08192f2feb144ae281bbbf27eba255c6', '收费报表', 'fcdba3e1540f4e35a362498f6dc2023d', '2', 'fcdba3e1540f4e35a362498f6dc2023d,08192f2feb144ae281bbbf27eba255c6,', '1', '/feereports', null, '', '', '1', 'hnm.d', '68c97015c2b44b60b5e18181d30d3b1e', '2019-11-05 13:13:43', '68c97015c2b44b60b5e18181d30d3b1e', '2019-11-05 13:13:43', null, '0');
INSERT INTO `sys_menu` VALUES ('2f58c8e30c914a069e4b5879dc8e8e8d', '客户档案', '68dfcde1a77f41c0b4c1ff143081c93f', '2', '68dfcde1a77f41c0b4c1ff143081c93f,2f58c8e30c914a069e4b5879dc8e8e8d,', '4', '/gclient', null, '', '', '1', 'gmd.d', '18b8b543-9ad7-11e8-aebe-1368d4ec24eb', '2019-11-05 11:05:26', '18b8b543-9ad7-11e8-aebe-1368d4ec24eb', '2019-11-05 12:18:07', null, '0');
INSERT INTO `sys_menu` VALUES ('39df2dc0f5914d19ac17240cae888a0a', '收费项目', 'aac7d72aaade416baf6adec66edb06a4', '2', 'aac7d72aaade416baf6adec66edb06a4,39df2dc0f5914d19ac17240cae888a0a,', '1', '/gpay', null, '', '', '1', 'gmd.w', '18b8b543-9ad7-11e8-aebe-1368d4ec24eb', '2019-11-05 12:21:52', '18b8b543-9ad7-11e8-aebe-1368d4ec24eb', '2019-11-05 12:21:52', null, '0');
INSERT INTO `sys_menu` VALUES ('3b54e2a2-9adb-11e8-aebe-1368d4ec24eb', '用户管理', '7d1020ee-9ad9-11e8-aebe-1368d4ec24eb', '2', '7d1020ee-9ad9-11e8-aebe-1368d4ec24eb,3b54e2a2-9adb-11e8-aebe-1368d4ec24eb,', '9', '/admin/system/user/list', null, '', '#47e69c', '1', 'sys:user:list', '18b8b543-9ad7-11e8-aebe-1368d4ec24eb', '2018-01-16 11:31:18', '18b8b543-9ad7-11e8-aebe-1368d4ec24eb', '2018-01-20 05:59:20', null, '0');
INSERT INTO `sys_menu` VALUES ('3b58e01e-9adb-11e8-aebe-1368d4ec24eb', '角色管理', '7d1020ee-9ad9-11e8-aebe-1368d4ec24eb', '2', '7d1020ee-9ad9-11e8-aebe-1368d4ec24eb,3b58e01e-9adb-11e8-aebe-1368d4ec24eb,', '10', '/admin/system/role/list', null, '', '#c23ab9', '1', 'sys:role:list', '18b8b543-9ad7-11e8-aebe-1368d4ec24eb', '2018-01-16 11:32:33', '18b8b543-9ad7-11e8-aebe-1368d4ec24eb', '2018-01-20 05:58:58', null, '0');
INSERT INTO `sys_menu` VALUES ('3b5cb607-9adb-11e8-aebe-1368d4ec24eb', '权限管理', '7d1020ee-9ad9-11e8-aebe-1368d4ec24eb', '2', '7d1020ee-9ad9-11e8-aebe-1368d4ec24eb,3b5cb607-9adb-11e8-aebe-1368d4ec24eb,', '20', '/admin/system/menu/list', null, '', '#d4573b', '1', 'sys:menu:list', '18b8b543-9ad7-11e8-aebe-1368d4ec24eb', '2018-01-16 11:33:19', '18b8b543-9ad7-11e8-aebe-1368d4ec24eb', '2018-02-08 09:49:28', null, '0');
INSERT INTO `sys_menu` VALUES ('3e0b86a3-9adc-11e8-aebe-1368d4ec24eb', '新增用户', '3b54e2a2-9adb-11e8-aebe-1368d4ec24eb', '3', '7d1020ee-9ad9-11e8-aebe-1368d4ec24eb,3b54e2a2-9adb-11e8-aebe-1368d4ec24eb,3e0b86a3-9adc-11e8-aebe-1368d4ec24eb,', '0', '', null, null, null, '0', 'sys:user:add', '18b8b543-9ad7-11e8-aebe-1368d4ec24eb', '2018-02-08 10:10:32', '18b8b543-9ad7-11e8-aebe-1368d4ec24eb', '2018-02-08 10:10:32', null, '0');
INSERT INTO `sys_menu` VALUES ('3e2fa8b6-9adc-11e8-aebe-1368d4ec24eb', '编辑用户', '3b54e2a2-9adb-11e8-aebe-1368d4ec24eb', '3', '7d1020ee-9ad9-11e8-aebe-1368d4ec24eb,3b54e2a2-9adb-11e8-aebe-1368d4ec24eb,3e2fa8b6-9adc-11e8-aebe-1368d4ec24eb,', '10', '', null, null, null, '0', 'sys:user:edit', '18b8b543-9ad7-11e8-aebe-1368d4ec24eb', '2018-02-08 10:11:49', '18b8b543-9ad7-11e8-aebe-1368d4ec24eb', '2018-02-08 10:11:49', null, '0');
INSERT INTO `sys_menu` VALUES ('3e36cf2f-9adc-11e8-aebe-1368d4ec24eb', '删除用户', '3b54e2a2-9adb-11e8-aebe-1368d4ec24eb', '3', '7d1020ee-9ad9-11e8-aebe-1368d4ec24eb,3b54e2a2-9adb-11e8-aebe-1368d4ec24eb,3e36cf2f-9adc-11e8-aebe-1368d4ec24eb,', '20', '', null, null, null, '0', 'sys:user:delete', '18b8b543-9ad7-11e8-aebe-1368d4ec24eb', '2018-02-08 10:12:43', '18b8b543-9ad7-11e8-aebe-1368d4ec24eb', '2018-02-08 10:12:43', null, '0');
INSERT INTO `sys_menu` VALUES ('4654939cdc204f3cb004271341b38592', '抄表费用', '81b31752c70c4133a520e653f8e99431', '2', '81b31752c70c4133a520e653f8e99431,4654939cdc204f3cb004271341b38592,', '2', '/meter_charge', null, '', '', '1', 'ysl.e', '18b8b543-9ad7-11e8-aebe-1368d4ec24eb', '2019-11-05 10:22:43', '18b8b543-9ad7-11e8-aebe-1368d4ec24eb', '2019-11-05 10:22:43', null, '0');
INSERT INTO `sys_menu` VALUES ('68dfcde1a77f41c0b4c1ff143081c93f', '档案管理', null, '1', '68dfcde1a77f41c0b4c1ff143081c93f,', '7', '', null, '', '', '1', 'gmd.a', '18b8b543-9ad7-11e8-aebe-1368d4ec24eb', '2019-11-05 11:00:01', '68c97015c2b44b60b5e18181d30d3b1e', '2019-11-05 13:18:44', null, '0');
INSERT INTO `sys_menu` VALUES ('77666362e7a246da8a183a4fe10a9a5f', '收费管理', null, '1', '77666362e7a246da8a183a4fe10a9a5f,', '3', '', null, '', '', '1', 'hnm.a', '68c97015c2b44b60b5e18181d30d3b1e', '2019-11-05 13:07:45', '18b8b543-9ad7-11e8-aebe-1368d4ec24eb', '2019-11-05 13:16:54', null, '0');
INSERT INTO `sys_menu` VALUES ('7d1020ee-9ad9-11e8-aebe-1368d4ec24eb', '系统管理', null, '1', '7d1020ee-9ad9-11e8-aebe-1368d4ec24eb,', '1', '', null, '', null, '1', '', '18b8b543-9ad7-11e8-aebe-1368d4ec24eb', '2018-01-16 11:29:46', '18b8b543-9ad7-11e8-aebe-1368d4ec24eb', '2018-01-20 03:09:26', null, '0');
INSERT INTO `sys_menu` VALUES ('7f216b79e3d24780903416ce9953a526', '应收账单', 'f69bafb899674c4a88e7babf8bb177b1', '2', 'f69bafb899674c4a88e7babf8bb177b1,7f216b79e3d24780903416ce9953a526,', '1', '/receivables', null, '', '', '1', 'ysl.b', '18b8b543-9ad7-11e8-aebe-1368d4ec24eb', '2019-11-05 10:21:08', '18b8b543-9ad7-11e8-aebe-1368d4ec24eb', '2019-11-05 10:21:08', null, '0');
INSERT INTO `sys_menu` VALUES ('81b31752c70c4133a520e653f8e99431', '抄表管理', null, '1', '81b31752c70c4133a520e653f8e99431,', '5', '', null, '', '', '1', 'ysl.c', '18b8b543-9ad7-11e8-aebe-1368d4ec24eb', '2019-11-05 10:21:49', '68c97015c2b44b60b5e18181d30d3b1e', '2019-11-05 13:20:34', null, '0');
INSERT INTO `sys_menu` VALUES ('9052491c3eb746adbd5d37de27653bfb', '仪表抄表', '81b31752c70c4133a520e653f8e99431', '2', '81b31752c70c4133a520e653f8e99431,9052491c3eb746adbd5d37de27653bfb,', '1', '/meter_reading', null, '', '', '1', 'ysl.d', '18b8b543-9ad7-11e8-aebe-1368d4ec24eb', '2019-11-05 10:22:07', '18b8b543-9ad7-11e8-aebe-1368d4ec24eb', '2019-11-05 10:23:16', null, '0');
INSERT INTO `sys_menu` VALUES ('96fd6a5a-9adb-11e8-aebe-1368d4ec24eb', '新增权限', '3b5cb607-9adb-11e8-aebe-1368d4ec24eb', '3', '7d1020ee-9ad9-11e8-aebe-1368d4ec24eb,3b5cb607-9adb-11e8-aebe-1368d4ec24eb,96fd6a5a-9adb-11e8-aebe-1368d4ec24eb,', '0', '', null, null, null, '0', 'sys:menu:add', '18b8b543-9ad7-11e8-aebe-1368d4ec24eb', '2018-02-08 09:49:15', '18b8b543-9ad7-11e8-aebe-1368d4ec24eb', '2018-02-08 09:49:38', null, '0');
INSERT INTO `sys_menu` VALUES ('9703ccf2-9adb-11e8-aebe-1368d4ec24eb', '编辑权限', '3b5cb607-9adb-11e8-aebe-1368d4ec24eb', '3', '7d1020ee-9ad9-11e8-aebe-1368d4ec24eb,3b5cb607-9adb-11e8-aebe-1368d4ec24eb,9703ccf2-9adb-11e8-aebe-1368d4ec24eb,', '10', '', null, null, null, '0', 'sys:menu:edit', '18b8b543-9ad7-11e8-aebe-1368d4ec24eb', '2018-02-08 09:50:16', '18b8b543-9ad7-11e8-aebe-1368d4ec24eb', '2018-02-08 09:50:25', null, '0');
INSERT INTO `sys_menu` VALUES ('9707cf58-9adb-11e8-aebe-1368d4ec24eb', '删除权限', '3b5cb607-9adb-11e8-aebe-1368d4ec24eb', '3', '7d1020ee-9ad9-11e8-aebe-1368d4ec24eb,3b5cb607-9adb-11e8-aebe-1368d4ec24eb,9707cf58-9adb-11e8-aebe-1368d4ec24eb,', '20', '', null, null, null, '0', 'sys:menu:delete', '18b8b543-9ad7-11e8-aebe-1368d4ec24eb', '2018-02-08 09:51:53', '18b8b543-9ad7-11e8-aebe-1368d4ec24eb', '2018-02-08 09:53:42', null, '0');
INSERT INTO `sys_menu` VALUES ('a877d78d8acd4eaf8e8f365a804a4fde', '缴费结账', '77666362e7a246da8a183a4fe10a9a5f', '2', '77666362e7a246da8a183a4fe10a9a5f,a877d78d8acd4eaf8e8f365a804a4fde,', '1', '/jiaofei', null, '', '', '1', 'hnm.b', '68c97015c2b44b60b5e18181d30d3b1e', '2019-11-05 13:08:50', '68c97015c2b44b60b5e18181d30d3b1e', '2019-11-05 13:09:35', null, '0');
INSERT INTO `sys_menu` VALUES ('aac7d72aaade416baf6adec66edb06a4', '计费管理', null, '1', 'aac7d72aaade416baf6adec66edb06a4,', '6', '', null, '', '', '1', 'gmd.q', '18b8b543-9ad7-11e8-aebe-1368d4ec24eb', '2019-11-05 12:20:37', '68c97015c2b44b60b5e18181d30d3b1e', '2019-11-05 13:18:56', null, '0');
INSERT INTO `sys_menu` VALUES ('adfd852dabca4eeaa3f1784323a81ce8', '管理区', '68dfcde1a77f41c0b4c1ff143081c93f', '2', '68dfcde1a77f41c0b4c1ff143081c93f,adfd852dabca4eeaa3f1784323a81ce8,', '1', '/glou', null, '', '', '1', '', '18b8b543-9ad7-11e8-aebe-1368d4ec24eb', '2019-11-05 11:02:48', '18b8b543-9ad7-11e8-aebe-1368d4ec24eb', '2019-11-05 12:15:40', null, '0');
INSERT INTO `sys_menu` VALUES ('b953cc3e63004ffc846e98189f8e005a', '车位档案', '68dfcde1a77f41c0b4c1ff143081c93f', '2', '68dfcde1a77f41c0b4c1ff143081c93f,b953cc3e63004ffc846e98189f8e005a,', '3', '/gcar', null, '', '', '1', 'gmd.c', '18b8b543-9ad7-11e8-aebe-1368d4ec24eb', '2019-11-05 11:04:54', '18b8b543-9ad7-11e8-aebe-1368d4ec24eb', '2019-11-05 12:17:47', null, '0');
INSERT INTO `sys_menu` VALUES ('bdf6d3bb78b044ba82dec391c82829a7', '房间档案', '68dfcde1a77f41c0b4c1ff143081c93f', '2', '68dfcde1a77f41c0b4c1ff143081c93f,bdf6d3bb78b044ba82dec391c82829a7,', '2', '/groom', null, '', '', '1', 'gmd.b', '18b8b543-9ad7-11e8-aebe-1368d4ec24eb', '2019-11-05 11:04:16', '18b8b543-9ad7-11e8-aebe-1368d4ec24eb', '2019-11-05 12:17:28', null, '0');
INSERT INTO `sys_menu` VALUES ('ed63866b30cf46bfb6797a1d31ae930c', '锁定用户', '3b54e2a2-9adb-11e8-aebe-1368d4ec24eb', '3', '7d1020ee-9ad9-11e8-aebe-1368d4ec24eb,3b54e2a2-9adb-11e8-aebe-1368d4ec24eb,ed63866b30cf46bfb6797a1d31ae930c,', '21', '', null, null, '', '0', 'sys:user:lock', '18b8b543-9ad7-11e8-aebe-1368d4ec24eb', '2018-08-21 17:44:05', '18b8b543-9ad7-11e8-aebe-1368d4ec24eb', '2018-08-21 17:44:05', null, '0');
INSERT INTO `sys_menu` VALUES ('f4ddd718219f4145b0b7cfeea0671ee8', '欠费报表', 'fcdba3e1540f4e35a362498f6dc2023d', '2', 'fcdba3e1540f4e35a362498f6dc2023d,f4ddd718219f4145b0b7cfeea0671ee8,', '2', '/arrearages', null, '', '', '1', 'hnm.e', '68c97015c2b44b60b5e18181d30d3b1e', '2019-11-05 13:15:10', '68c97015c2b44b60b5e18181d30d3b1e', '2019-11-05 13:15:25', null, '0');
INSERT INTO `sys_menu` VALUES ('f69bafb899674c4a88e7babf8bb177b1', '应收管理', null, '1', 'f69bafb899674c4a88e7babf8bb177b1,', '4', '', null, '', '', '1', 'ysl.a', '18b8b543-9ad7-11e8-aebe-1368d4ec24eb', '2019-11-05 10:20:24', '68c97015c2b44b60b5e18181d30d3b1e', '2019-11-05 13:20:43', null, '0');
INSERT INTO `sys_menu` VALUES ('fcdba3e1540f4e35a362498f6dc2023d', '报表中心', null, '1', 'fcdba3e1540f4e35a362498f6dc2023d,', '2', '', null, '', '', '1', 'hnm.c', '68c97015c2b44b60b5e18181d30d3b1e', '2019-11-05 13:11:32', '18b8b543-9ad7-11e8-aebe-1368d4ec24eb', '2019-11-05 13:17:05', null, '0');
INSERT INTO `sys_menu` VALUES ('ff619e04-9adb-11e8-aebe-1368d4ec24eb', '新增角色', '3b58e01e-9adb-11e8-aebe-1368d4ec24eb', '3', '7d1020ee-9ad9-11e8-aebe-1368d4ec24eb,3b58e01e-9adb-11e8-aebe-1368d4ec24eb,ff619e04-9adb-11e8-aebe-1368d4ec24eb,', '0', '', null, null, null, '0', 'sys:role:add', '18b8b543-9ad7-11e8-aebe-1368d4ec24eb', '2018-02-08 09:58:11', '18b8b543-9ad7-11e8-aebe-1368d4ec24eb', '2018-02-08 09:58:11', null, '0');
INSERT INTO `sys_menu` VALUES ('ff9477c9-9adb-11e8-aebe-1368d4ec24eb', '编辑权限', '3b58e01e-9adb-11e8-aebe-1368d4ec24eb', '3', '7d1020ee-9ad9-11e8-aebe-1368d4ec24eb,3b58e01e-9adb-11e8-aebe-1368d4ec24eb,ff9477c9-9adb-11e8-aebe-1368d4ec24eb,', '10', '', null, null, null, '0', 'sys:role:edit', '18b8b543-9ad7-11e8-aebe-1368d4ec24eb', '2018-02-08 09:59:01', '18b8b543-9ad7-11e8-aebe-1368d4ec24eb', '2018-02-08 09:59:01', null, '0');
INSERT INTO `sys_menu` VALUES ('ff9ad846-9adb-11e8-aebe-1368d4ec24eb', '删除角色', '3b58e01e-9adb-11e8-aebe-1368d4ec24eb', '3', '7d1020ee-9ad9-11e8-aebe-1368d4ec24eb,3b58e01e-9adb-11e8-aebe-1368d4ec24eb,ff9ad846-9adb-11e8-aebe-1368d4ec24eb,', '20', '', null, null, null, '0', 'sys:role:delete', '18b8b543-9ad7-11e8-aebe-1368d4ec24eb', '2018-02-08 09:59:56', '18b8b543-9ad7-11e8-aebe-1368d4ec24eb', '2018-02-08 09:59:56', null, '0');

-- ----------------------------
-- Table structure for sys_rescource
-- ----------------------------
DROP TABLE IF EXISTS `sys_rescource`;
CREATE TABLE `sys_rescource` (
  `id` varchar(36) NOT NULL COMMENT '主键',
  `file_name` varchar(255) DEFAULT NULL COMMENT '文件名称',
  `source` varchar(255) DEFAULT NULL COMMENT '来源',
  `web_url` varchar(500) DEFAULT NULL COMMENT '资源网络地址',
  `hash` varchar(255) DEFAULT NULL COMMENT '文件标识',
  `file_size` varchar(50) DEFAULT NULL COMMENT '文件大小',
  `file_type` varchar(255) DEFAULT NULL COMMENT '文件类型',
  `original_net_url` text,
  `create_date` datetime DEFAULT NULL COMMENT '创建时间',
  `create_by` varchar(36) DEFAULT NULL COMMENT '创建人',
  `update_date` datetime DEFAULT NULL COMMENT '修改时间',
  `update_by` varchar(36) DEFAULT NULL COMMENT '修改人',
  `remarks` varchar(255) DEFAULT NULL COMMENT '备注',
  `del_flag` tinyint(4) DEFAULT NULL COMMENT '删除标记',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统资源';

-- ----------------------------
-- Records of sys_rescource
-- ----------------------------

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `id` varchar(36) NOT NULL,
  `name` varchar(40) DEFAULT NULL COMMENT '角色名称',
  `create_date` datetime DEFAULT NULL,
  `create_by` varchar(36) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  `update_by` varchar(36) DEFAULT NULL,
  `remarks` varchar(255) DEFAULT NULL,
  `del_flag` tinyint(2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES ('70689483-9ad7-11e8-aebe-1368d4ec24eb', '前台用户', '2017-11-02 14:19:07', '18b8b543-9ad7-11e8-aebe-1368d4ec24eb', '2018-08-21 20:04:02', '18b8b543-9ad7-11e8-aebe-1368d4ec24eb', '', '0');
INSERT INTO `sys_role` VALUES ('706e0195-9ad7-11e8-aebe-1368d4ec24eb', '系统管理员', '2017-11-29 19:36:37', '18b8b543-9ad7-11e8-aebe-1368d4ec24eb', '2019-11-05 13:15:59', '68c97015c2b44b60b5e18181d30d3b1e', '', '0');

-- ----------------------------
-- Table structure for sys_role_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_menu`;
CREATE TABLE `sys_role_menu` (
  `role_id` varchar(36) NOT NULL,
  `menu_id` varchar(36) NOT NULL,
  PRIMARY KEY (`role_id`,`menu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role_menu
-- ----------------------------
INSERT INTO `sys_role_menu` VALUES ('706e0195-9ad7-11e8-aebe-1368d4ec24eb', '08192f2feb144ae281bbbf27eba255c6');
INSERT INTO `sys_role_menu` VALUES ('706e0195-9ad7-11e8-aebe-1368d4ec24eb', '2f58c8e30c914a069e4b5879dc8e8e8d');
INSERT INTO `sys_role_menu` VALUES ('706e0195-9ad7-11e8-aebe-1368d4ec24eb', '39df2dc0f5914d19ac17240cae888a0a');
INSERT INTO `sys_role_menu` VALUES ('706e0195-9ad7-11e8-aebe-1368d4ec24eb', '3b54e2a2-9adb-11e8-aebe-1368d4ec24eb');
INSERT INTO `sys_role_menu` VALUES ('706e0195-9ad7-11e8-aebe-1368d4ec24eb', '3b58e01e-9adb-11e8-aebe-1368d4ec24eb');
INSERT INTO `sys_role_menu` VALUES ('706e0195-9ad7-11e8-aebe-1368d4ec24eb', '3b5cb607-9adb-11e8-aebe-1368d4ec24eb');
INSERT INTO `sys_role_menu` VALUES ('706e0195-9ad7-11e8-aebe-1368d4ec24eb', '3e0b86a3-9adc-11e8-aebe-1368d4ec24eb');
INSERT INTO `sys_role_menu` VALUES ('706e0195-9ad7-11e8-aebe-1368d4ec24eb', '3e2fa8b6-9adc-11e8-aebe-1368d4ec24eb');
INSERT INTO `sys_role_menu` VALUES ('706e0195-9ad7-11e8-aebe-1368d4ec24eb', '3e36cf2f-9adc-11e8-aebe-1368d4ec24eb');
INSERT INTO `sys_role_menu` VALUES ('706e0195-9ad7-11e8-aebe-1368d4ec24eb', '4654939cdc204f3cb004271341b38592');
INSERT INTO `sys_role_menu` VALUES ('706e0195-9ad7-11e8-aebe-1368d4ec24eb', '68dfcde1a77f41c0b4c1ff143081c93f');
INSERT INTO `sys_role_menu` VALUES ('706e0195-9ad7-11e8-aebe-1368d4ec24eb', '77666362e7a246da8a183a4fe10a9a5f');
INSERT INTO `sys_role_menu` VALUES ('706e0195-9ad7-11e8-aebe-1368d4ec24eb', '7d1020ee-9ad9-11e8-aebe-1368d4ec24eb');
INSERT INTO `sys_role_menu` VALUES ('706e0195-9ad7-11e8-aebe-1368d4ec24eb', '7f216b79e3d24780903416ce9953a526');
INSERT INTO `sys_role_menu` VALUES ('706e0195-9ad7-11e8-aebe-1368d4ec24eb', '81b31752c70c4133a520e653f8e99431');
INSERT INTO `sys_role_menu` VALUES ('706e0195-9ad7-11e8-aebe-1368d4ec24eb', '9052491c3eb746adbd5d37de27653bfb');
INSERT INTO `sys_role_menu` VALUES ('706e0195-9ad7-11e8-aebe-1368d4ec24eb', '96fd6a5a-9adb-11e8-aebe-1368d4ec24eb');
INSERT INTO `sys_role_menu` VALUES ('706e0195-9ad7-11e8-aebe-1368d4ec24eb', '9703ccf2-9adb-11e8-aebe-1368d4ec24eb');
INSERT INTO `sys_role_menu` VALUES ('706e0195-9ad7-11e8-aebe-1368d4ec24eb', '9707cf58-9adb-11e8-aebe-1368d4ec24eb');
INSERT INTO `sys_role_menu` VALUES ('706e0195-9ad7-11e8-aebe-1368d4ec24eb', 'a877d78d8acd4eaf8e8f365a804a4fde');
INSERT INTO `sys_role_menu` VALUES ('706e0195-9ad7-11e8-aebe-1368d4ec24eb', 'aac7d72aaade416baf6adec66edb06a4');
INSERT INTO `sys_role_menu` VALUES ('706e0195-9ad7-11e8-aebe-1368d4ec24eb', 'adfd852dabca4eeaa3f1784323a81ce8');
INSERT INTO `sys_role_menu` VALUES ('706e0195-9ad7-11e8-aebe-1368d4ec24eb', 'b953cc3e63004ffc846e98189f8e005a');
INSERT INTO `sys_role_menu` VALUES ('706e0195-9ad7-11e8-aebe-1368d4ec24eb', 'bdf6d3bb78b044ba82dec391c82829a7');
INSERT INTO `sys_role_menu` VALUES ('706e0195-9ad7-11e8-aebe-1368d4ec24eb', 'ed63866b30cf46bfb6797a1d31ae930c');
INSERT INTO `sys_role_menu` VALUES ('706e0195-9ad7-11e8-aebe-1368d4ec24eb', 'f4ddd718219f4145b0b7cfeea0671ee8');
INSERT INTO `sys_role_menu` VALUES ('706e0195-9ad7-11e8-aebe-1368d4ec24eb', 'f69bafb899674c4a88e7babf8bb177b1');
INSERT INTO `sys_role_menu` VALUES ('706e0195-9ad7-11e8-aebe-1368d4ec24eb', 'fcdba3e1540f4e35a362498f6dc2023d');
INSERT INTO `sys_role_menu` VALUES ('706e0195-9ad7-11e8-aebe-1368d4ec24eb', 'ff619e04-9adb-11e8-aebe-1368d4ec24eb');
INSERT INTO `sys_role_menu` VALUES ('706e0195-9ad7-11e8-aebe-1368d4ec24eb', 'ff9477c9-9adb-11e8-aebe-1368d4ec24eb');
INSERT INTO `sys_role_menu` VALUES ('706e0195-9ad7-11e8-aebe-1368d4ec24eb', 'ff9ad846-9adb-11e8-aebe-1368d4ec24eb');

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` varchar(36) NOT NULL COMMENT '用户ID',
  `login_name` varchar(36) DEFAULT NULL COMMENT '登录名',
  `nick_name` varchar(40) DEFAULT NULL COMMENT '昵称',
  `icon` varchar(2000) DEFAULT NULL,
  `password` varchar(40) DEFAULT NULL COMMENT '密码',
  `salt` varchar(40) DEFAULT NULL COMMENT 'shiro加密盐',
  `tel` varchar(11) DEFAULT NULL COMMENT '手机号码',
  `email` varchar(200) DEFAULT NULL COMMENT '邮箱地址',
  `locked` tinyint(2) DEFAULT NULL COMMENT '是否锁定',
  `create_date` datetime DEFAULT NULL,
  `create_by` varchar(36) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  `update_by` varchar(36) DEFAULT NULL,
  `remarks` varchar(255) DEFAULT NULL,
  `del_flag` tinyint(4) NOT NULL,
  `is_admin` tinyint(2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('18b8b543-9ad7-11e8-aebe-1368d4ec24eb', 'java', '燕世亮', null, '9c5feb7aba88c7c87bc047c7cec7c6e3b63e1894', '08c5900125b80cd2', '13776055179', 'b@qq.com', '0', '2017-11-27 22:19:39', '18b8b543-9ad7-11e8-aebe-1368d4ec24eb', '2019-11-05 12:16:12', '18b8b543-9ad7-11e8-aebe-1368d4ec24eb', null, '0', '1');
INSERT INTO `sys_user` VALUES ('68c97015c2b44b60b5e18181d30d3b1e', 'admin', '燕世亮', null, '4029face4da0f9d70ebb92de1319bb7536d6e235', '3b9dbaa2a317f522', '15560236336', '646060619@qq.com', '0', '2019-11-05 12:22:40', '18b8b543-9ad7-11e8-aebe-1368d4ec24eb', '2019-11-05 12:22:40', '18b8b543-9ad7-11e8-aebe-1368d4ec24eb', null, '0', '1');

-- ----------------------------
-- Table structure for sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role` (
  `user_id` varchar(36) NOT NULL,
  `role_id` varchar(36) NOT NULL,
  PRIMARY KEY (`user_id`,`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user_role
-- ----------------------------
INSERT INTO `sys_user_role` VALUES ('18b8b543-9ad7-11e8-aebe-1368d4ec24eb', '706e0195-9ad7-11e8-aebe-1368d4ec24eb');
INSERT INTO `sys_user_role` VALUES ('68c97015c2b44b60b5e18181d30d3b1e', '706e0195-9ad7-11e8-aebe-1368d4ec24eb');
