/*
 Navicat Premium Data Transfer

 Source Server         : 03112022demo
 Source Server Type    : MySQL
 Source Server Version : 50737
 Source Host           : 192.144.213.195:3310
 Source Schema         : bxxt

 Target Server Type    : MySQL
 Target Server Version : 50737
 File Encoding         : 65001

 Date: 22/03/2022 11:13:57
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for books
-- ----------------------------
DROP TABLE IF EXISTS `books`;
CREATE TABLE `books`  (
  `id` int(11) NOT NULL,
  `bookName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `bookCounts` int(11) NULL DEFAULT NULL,
  `detail` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of books
-- ----------------------------
INSERT INTO `books` VALUES (1, '1', 1, '1');

-- ----------------------------
-- Table structure for feature
-- ----------------------------
DROP TABLE IF EXISTS `feature`;
CREATE TABLE `feature`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '特征id',
  `value` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '特征值',
  `holder_id` int(11) NOT NULL COMMENT '被投保人特征id',
  `holder_name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '被投保人特征name',
  `image_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '图像地址',
  `create_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_time` timestamp(0) NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of feature
-- ----------------------------
INSERT INTO `feature` VALUES (1, '9090', 2, '2', '2', '2022-03-17 09:10:55', '2022-03-17 09:10:53');
INSERT INTO `feature` VALUES (4, '223123123', 123, '22', '22222', '2022-03-17 09:37:11', '2022-03-17 09:37:10');
INSERT INTO `feature` VALUES (6, '3123123', 12, '12', '123123123', '2022-03-17 11:17:29', '2022-03-17 11:17:28');

-- ----------------------------
-- Table structure for insure
-- ----------------------------
DROP TABLE IF EXISTS `insure`;
CREATE TABLE `insure`  (
  `insure_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '保单id',
  `id_card` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户身份证',
  `insure_name` int(11) NOT NULL COMMENT '投保姓名',
  `price` int(11) NOT NULL COMMENT '投保价格',
  `pay_price` int(11) NOT NULL COMMENT '理赔价格',
  `reason` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '理赔原因',
  `is_insure` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '属否社保',
  `CREATED_TIME` datetime(0) NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`insure_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of insure
-- ----------------------------

-- ----------------------------
-- Table structure for insuretable
-- ----------------------------
DROP TABLE IF EXISTS `insuretable`;
CREATE TABLE `insuretable`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `demo` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `idcard` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '身份证号',
  `phoneNumber` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '手机号',
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '投保人邮箱',
  `city` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '投保人常驻城市',
  `phoneofnumber` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '被投保人手机号',
  `idcardoftheinsunred` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '被投保人身份证',
  `nameoftheinsured` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '被投保人姓名',
  `benameoftheinsured` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '为谁投保',
  `socialsecurity` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否拥有社保',
  `times` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `money` double(10, 2) NULL DEFAULT NULL,
  `state` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 52 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of insuretable
-- ----------------------------
INSERT INTO `insuretable` VALUES (48, 'A', '123', '1231231', '231231', '23123', '231231', '1231231', '3123', '1231231', '123', '1231', '2023-03-21', 'root', 555.00, '待审核');
INSERT INTO `insuretable` VALUES (49, 'A', 'qqq', 'qqw', 'eqw', 'w', 'ewq', 'qwe', 'q', 'wqe', 'ewq', 'ewqe', '2023-04-06', 'root', 555.00, '审核通过待支付');
INSERT INTO `insuretable` VALUES (50, 'A', 'wq', 'qwe', 'eqw', 'qwe', 'wqe', 'eq', 'eqw', 'eqw', 'eqw', 'eqw', '2023-03-14', 'root', 555.00, '客户取消');
INSERT INTO `insuretable` VALUES (51, 'A', '111', '111', '111', '111', '11', '111', '11', '111', '111', '11', '2023-03-29', '111111', 555.00, '待审核');

-- ----------------------------
-- Table structure for reasontext
-- ----------------------------
DROP TABLE IF EXISTS `reasontext`;
CREATE TABLE `reasontext`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `resontext` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '反馈问题',
  `insuredID` int(9) NULL DEFAULT NULL COMMENT '投保单子的id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 49 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of reasontext
-- ----------------------------
INSERT INTO `reasontext` VALUES (1, '1', 1);
INSERT INTO `reasontext` VALUES (2, 'zhaosi', 3);
INSERT INTO `reasontext` VALUES (7, 'Anthony', 2);
INSERT INTO `reasontext` VALUES (13, NULL, NULL);
INSERT INTO `reasontext` VALUES (14, NULL, NULL);
INSERT INTO `reasontext` VALUES (15, NULL, NULL);
INSERT INTO `reasontext` VALUES (16, '123', 20);
INSERT INTO `reasontext` VALUES (17, '123', 20);
INSERT INTO `reasontext` VALUES (18, '', 20);
INSERT INTO `reasontext` VALUES (19, '', 20);
INSERT INTO `reasontext` VALUES (20, '3122312412', 20);
INSERT INTO `reasontext` VALUES (21, '3122312412', 20);
INSERT INTO `reasontext` VALUES (22, '3122312412', 20);
INSERT INTO `reasontext` VALUES (23, '3122312412', 20);
INSERT INTO `reasontext` VALUES (24, '3122312412', 20);
INSERT INTO `reasontext` VALUES (25, '3122312412', 20);
INSERT INTO `reasontext` VALUES (26, '2113', 20);
INSERT INTO `reasontext` VALUES (27, '123', 25);
INSERT INTO `reasontext` VALUES (28, '', 22);
INSERT INTO `reasontext` VALUES (29, '123', 22);
INSERT INTO `reasontext` VALUES (30, '', 22);
INSERT INTO `reasontext` VALUES (31, '123', 30);
INSERT INTO `reasontext` VALUES (32, '123', 30);
INSERT INTO `reasontext` VALUES (33, '123', 30);
INSERT INTO `reasontext` VALUES (34, '123', 30);
INSERT INTO `reasontext` VALUES (35, '131231231', 32);
INSERT INTO `reasontext` VALUES (36, '123', 39);
INSERT INTO `reasontext` VALUES (37, '123', 39);
INSERT INTO `reasontext` VALUES (38, '123', 40);
INSERT INTO `reasontext` VALUES (39, '123', 42);
INSERT INTO `reasontext` VALUES (40, '123456789', 43);
INSERT INTO `reasontext` VALUES (41, '1234567890-87654231', 45);
INSERT INTO `reasontext` VALUES (42, '12345678977563', 47);
INSERT INTO `reasontext` VALUES (43, '12345678', 48);
INSERT INTO `reasontext` VALUES (44, '123', 48);
INSERT INTO `reasontext` VALUES (45, '', 48);
INSERT INTO `reasontext` VALUES (46, '123', 48);
INSERT INTO `reasontext` VALUES (47, '', 48);
INSERT INTO `reasontext` VALUES (48, '123', 48);

-- ----------------------------
-- Table structure for reso
-- ----------------------------
DROP TABLE IF EXISTS `reso`;
CREATE TABLE `reso`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `insuredId` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `imageurl` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 17 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of reso
-- ----------------------------
INSERT INTO `reso` VALUES (4, '32', '32lp/340bd11d-d673-4080-b070-a1c3ecf44027files.png');
INSERT INTO `reso` VALUES (5, '39', '39lp/21103549-9071-4053-b494-76811b480a37files.png');
INSERT INTO `reso` VALUES (6, '40', '40lp/6172aeff-d378-48dd-8b18-fa213f93f894files.png');
INSERT INTO `reso` VALUES (7, '42', '42lp/75e29d0e-622b-4a03-8102-3447ff5e7dcdfiles.png');
INSERT INTO `reso` VALUES (8, '43', '43lp/feda9015-0551-486e-bd94-5d497f7230e8files.png');
INSERT INTO `reso` VALUES (9, '45', '45lp/ab5340dc-4c6a-445b-8e3e-21b6dd3eb3f5files.png');
INSERT INTO `reso` VALUES (10, '47', '47lp/a1f94190-54cb-4ca9-bd54-c2029e16868ffiles.png');
INSERT INTO `reso` VALUES (11, '48', '48lp/33982f75-1590-42bd-a8ca-b561c0a1535dfiles.png');
INSERT INTO `reso` VALUES (12, '48', '48lp/3c4dcfbc-ae05-47d8-9f2b-b0b3be866cc9files.png');
INSERT INTO `reso` VALUES (13, '48', '48lp/d398e364-3864-46ed-811d-6c662b743b7ffiles.png');
INSERT INTO `reso` VALUES (14, '48', '48lp/ba7c8e8e-5c18-4280-a67a-ba9f7ca5e5d9files.png');
INSERT INTO `reso` VALUES (15, '48', '48lp/00d07347-cdf1-4874-aa5e-53782ae0477cfiles.png');
INSERT INTO `reso` VALUES (16, '48', '48lp/91ddae1c-a17d-4263-9709-dc5ad5d3fa09files.png');

-- ----------------------------
-- Table structure for resofuser
-- ----------------------------
DROP TABLE IF EXISTS `resofuser`;
CREATE TABLE `resofuser`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `insuredId` int(11) NULL DEFAULT NULL COMMENT ' 保险单子',
  `imageurl` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图片url',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 145 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of resofuser
-- ----------------------------
INSERT INTO `resofuser` VALUES (65, 3, '3/4072b4c6-a4cd-44ef-bfa7-00d4b5fd9e3dfile.png');
INSERT INTO `resofuser` VALUES (69, 35, '123123');
INSERT INTO `resofuser` VALUES (118, 23, '24/b9f23739-9672-4c22-8f6e-73ff9cbaf5a0files.png');
INSERT INTO `resofuser` VALUES (119, 25, '25/dda496a6-43d1-4afe-9253-042bb55c329ffiles.png');
INSERT INTO `resofuser` VALUES (120, 27, '27/6afb2e01-4098-4ec3-9738-253260921028files.png');
INSERT INTO `resofuser` VALUES (121, 27, '27/6a972ecc-939c-4d4e-89ee-2cee8982b1e0files.png');
INSERT INTO `resofuser` VALUES (122, 30, '30/963f31e9-d474-4bc7-8e70-26d405e37112files.png');
INSERT INTO `resofuser` VALUES (123, 0, '0lp/1c0c6c3a-7a27-4a99-9fce-888a5c8ace3bfiles.png');
INSERT INTO `resofuser` VALUES (124, 31, '31/a94cd0ea-f6e2-4b56-bc38-3e4520400bfafiles.png');
INSERT INTO `resofuser` VALUES (125, 33, '33/297f951e-17bc-4c93-b4e1-dc76555f047bfiles.png');
INSERT INTO `resofuser` VALUES (126, 34, '34/94574b4f-4607-4a97-90fc-e0c42c7252f8files.png');
INSERT INTO `resofuser` VALUES (127, 35, '35/3299f672-26a8-4fee-be91-d7afec053316files.png');
INSERT INTO `resofuser` VALUES (128, 36, '36/44fbac61-5b92-4d8f-9418-a0cf3c885595files.png');
INSERT INTO `resofuser` VALUES (129, 39, '39/d1a54f51-076c-4f84-859c-0b3daef65276files.png');
INSERT INTO `resofuser` VALUES (130, 40, '40/5a4e8dbd-6cc6-4301-913c-e0e3a364ff27files.png');
INSERT INTO `resofuser` VALUES (131, 41, '41/af50f751-1baa-4517-a45d-2e0ece28ea29files.png');
INSERT INTO `resofuser` VALUES (132, 42, '42/7a01b975-9976-41bc-8481-0d5af32f284efiles.png');
INSERT INTO `resofuser` VALUES (133, 42, '42/04fadbd2-7b23-4c1b-b6d7-2e5aa64f7191files.png');
INSERT INTO `resofuser` VALUES (134, 43, '43/ac235bee-6882-4d08-ba2f-656b12a8e7dffiles.png');
INSERT INTO `resofuser` VALUES (135, 44, '44/1d1a9558-410e-4d78-8c2a-96f34b7b7f86files.png');
INSERT INTO `resofuser` VALUES (136, 45, '45/bff3dfb2-5919-412a-93f2-f79802e1c4a6files.png');
INSERT INTO `resofuser` VALUES (137, 47, '47/6de66391-a978-4b71-bce9-12b5926d5e72files.png');
INSERT INTO `resofuser` VALUES (138, 48, '48/0e6c33b5-1034-4fff-8403-db7e2abfdb0bfiles.png');
INSERT INTO `resofuser` VALUES (139, 51, '51/93fca31d-9df0-4d66-b771-3e5c81296061files.png');
INSERT INTO `resofuser` VALUES (140, 51, '51/568096ab-c4d4-4967-b2d4-988589655deafiles.png');
INSERT INTO `resofuser` VALUES (141, 51, '51/00de5e36-af62-4410-b83a-6c79a3e88e89files.png');
INSERT INTO `resofuser` VALUES (142, 51, '51/130af8e1-6633-4d3e-aa1f-0835aa548eadfiles.png');
INSERT INTO `resofuser` VALUES (143, 51, '51/e99aa668-29c7-4d0e-a39a-4a11d1697182files.png');
INSERT INTO `resofuser` VALUES (144, 51, '51/d07e18b8-f422-40a7-a750-a6d06fd5e861files.png');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `username` varchar(90) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, '2');

-- ----------------------------
-- Table structure for userS
-- ----------------------------
DROP TABLE IF EXISTS `userS`;
CREATE TABLE `userS`  (
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `role` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`username`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of userS
-- ----------------------------
INSERT INTO `userS` VALUES ('111111', '111111', 'user', '11@11.com', '111');
INSERT INTO `userS` VALUES ('123456', '10086', 'user', '928563217@qq.com', 'weixintest');
INSERT INTO `userS` VALUES ('root', 'admin', 'admin', '20506@qq.com', 'admin');
INSERT INTO `userS` VALUES ('y512880333', '123456', 'admin', 'y123456@qq.com', 'demo');

SET FOREIGN_KEY_CHECKS = 1;
