/*
 Navicat MySQL Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80029
 Source Host           : localhost:3306
 Source Schema         : web2.0

 Target Server Type    : MySQL
 Target Server Version : 80029
 File Encoding         : 65001

 Date: 15/12/2023 15:42:22
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for address
-- ----------------------------
DROP TABLE IF EXISTS `address`;
CREATE TABLE `address`  (
  `addressId` int NOT NULL AUTO_INCREMENT,
  `customerId` int NULL DEFAULT NULL,
  `address` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `addressDelete` int NULL DEFAULT 0,
  PRIMARY KEY (`addressId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 40 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of address
-- ----------------------------
INSERT INTO `address` VALUES (1, 1, '青海省海东市', 0);
INSERT INTO `address` VALUES (2, 2, '上海市浦东新区', 0);
INSERT INTO `address` VALUES (3, 3, '广州市天河区', 0);
INSERT INTO `address` VALUES (4, 4, '深圳市南山区', 0);
INSERT INTO `address` VALUES (5, 5, '成都市武侯区', 0);
INSERT INTO `address` VALUES (6, 6, '杭州市西湖区', 0);
INSERT INTO `address` VALUES (7, 7, '重庆市渝中区', 0);
INSERT INTO `address` VALUES (8, 8, '南京市鼓楼区', 0);
INSERT INTO `address` VALUES (9, 9, '武汉市洪山区', 0);
INSERT INTO `address` VALUES (10, 10, '西安市雁塔区', 0);
INSERT INTO `address` VALUES (11, 11, '甘肃省平凉市', 0);
INSERT INTO `address` VALUES (12, 16, '宁夏回族自治区', 0);
INSERT INTO `address` VALUES (13, 17, '甘肃省平凉市', 0);
INSERT INTO `address` VALUES (14, 18, '青海省海东市', 0);
INSERT INTO `address` VALUES (15, 19, '北京市朝阳区', 0);
INSERT INTO `address` VALUES (16, 16, '北京市丰台区中央民族大学', 1);
INSERT INTO `address` VALUES (17, 16, '江苏省福州市上城区中山大学', 1);
INSERT INTO `address` VALUES (18, 20, '北京市朝阳区桥头下', 0);
INSERT INTO `address` VALUES (19, 21, '湖南大学', 0);
INSERT INTO `address` VALUES (20, 22, '北京大学', 0);
INSERT INTO `address` VALUES (21, 16, '江苏省福州市玄武区', 1);
INSERT INTO `address` VALUES (22, 1, '浙江省南京市玄武区', 0);
INSERT INTO `address` VALUES (23, 1, '江苏省南京市秦淮区九公324', 0);
INSERT INTO `address` VALUES (25, 1, '江苏省南京市玄武区九公324', 0);
INSERT INTO `address` VALUES (26, 1, '广东省南京市拱墅区九公324', 1);
INSERT INTO `address` VALUES (27, 16, '福建省南京市福州市中区九公222', 0);
INSERT INTO `address` VALUES (28, 22, '九公324', 0);
INSERT INTO `address` VALUES (29, 13, '银川市西夏区文昌北街204号', 0);
INSERT INTO `address` VALUES (30, 24, '测试', 0);
INSERT INTO `address` VALUES (31, 25, '九公3242', 1);
INSERT INTO `address` VALUES (32, 25, '福建省南京市秦淮区九公324', 1);
INSERT INTO `address` VALUES (33, 25, '福建省南京市秦淮区九公324', 1);
INSERT INTO `address` VALUES (34, 25, '九公324', 0);
INSERT INTO `address` VALUES (35, 25, '江苏省南京市玄武区11', 1);
INSERT INTO `address` VALUES (36, 27, '测试', 0);
INSERT INTO `address` VALUES (37, 16, '江苏省南京市福州市中区东海龙宫', 0);
INSERT INTO `address` VALUES (38, 16, '浙江省福州市福清市222宿舍', 0);
INSERT INTO `address` VALUES (39, 30, '测试324', 0);
INSERT INTO `address` VALUES (40, 30, '江苏省南京市秦淮区九公324', 0);

-- ----------------------------
-- Table structure for cart
-- ----------------------------
DROP TABLE IF EXISTS `cart`;
CREATE TABLE `cart`  (
  `cartId` int NOT NULL AUTO_INCREMENT,
  `customerId` int NULL DEFAULT NULL,
  `goodId` int NULL DEFAULT NULL,
  `cartDelete` int NULL DEFAULT 0,
  PRIMARY KEY (`cartId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 40 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of cart
-- ----------------------------
INSERT INTO `cart` VALUES (1, 1, 1, 1);
INSERT INTO `cart` VALUES (2, 1, 1, 0);
INSERT INTO `cart` VALUES (3, 3, 3, 0);
INSERT INTO `cart` VALUES (4, 4, 4, 0);
INSERT INTO `cart` VALUES (5, 5, 5, 0);
INSERT INTO `cart` VALUES (6, 6, 6, 0);
INSERT INTO `cart` VALUES (7, 7, 7, 0);
INSERT INTO `cart` VALUES (8, 8, 8, 0);
INSERT INTO `cart` VALUES (9, 9, 9, 0);
INSERT INTO `cart` VALUES (10, 10, 10, 0);
INSERT INTO `cart` VALUES (11, 20, 1, 0);
INSERT INTO `cart` VALUES (12, 2, 2, 0);
INSERT INTO `cart` VALUES (13, 16, 1, 1);
INSERT INTO `cart` VALUES (14, 16, 2, 1);
INSERT INTO `cart` VALUES (15, 21, 2, 1);
INSERT INTO `cart` VALUES (16, 16, 2, 1);
INSERT INTO `cart` VALUES (17, 16, 4, 1);
INSERT INTO `cart` VALUES (18, 16, 9, 1);
INSERT INTO `cart` VALUES (19, 16, 1, 1);
INSERT INTO `cart` VALUES (20, 22, 1, 0);
INSERT INTO `cart` VALUES (21, 16, 7, 1);
INSERT INTO `cart` VALUES (22, 16, 11, 1);
INSERT INTO `cart` VALUES (23, 16, 13, 1);
INSERT INTO `cart` VALUES (24, 16, 5, 1);
INSERT INTO `cart` VALUES (25, 16, 1, 1);
INSERT INTO `cart` VALUES (26, 16, 2, 1);
INSERT INTO `cart` VALUES (27, 16, 3, 1);
INSERT INTO `cart` VALUES (28, 16, 4, 1);
INSERT INTO `cart` VALUES (29, 16, 5, 1);
INSERT INTO `cart` VALUES (30, 16, 14, 1);
INSERT INTO `cart` VALUES (31, 16, 10, 1);
INSERT INTO `cart` VALUES (32, 21, 1, 0);
INSERT INTO `cart` VALUES (33, 16, 14, 1);
INSERT INTO `cart` VALUES (34, 16, 14, 1);
INSERT INTO `cart` VALUES (35, 16, 15, 1);
INSERT INTO `cart` VALUES (36, 16, 15, 1);
INSERT INTO `cart` VALUES (37, 16, 15, 1);
INSERT INTO `cart` VALUES (38, 16, 8, 1);
INSERT INTO `cart` VALUES (39, 16, 16, 1);
INSERT INTO `cart` VALUES (40, 30, 1, 1);
INSERT INTO `cart` VALUES (41, 30, 16, 0);

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category`  (
  `categoryId` int NOT NULL AUTO_INCREMENT,
  `categoryName` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `upId` int NULL DEFAULT NULL,
  PRIMARY KEY (`categoryId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 22 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of category
-- ----------------------------
INSERT INTO `category` VALUES (1, '衣服', NULL);
INSERT INTO `category` VALUES (2, '日用品', NULL);
INSERT INTO `category` VALUES (3, '数码产品', NULL);
INSERT INTO `category` VALUES (4, '图书', NULL);
INSERT INTO `category` VALUES (5, '上装', 1);
INSERT INTO `category` VALUES (6, '手机', 3);
INSERT INTO `category` VALUES (7, '玩具', NULL);
INSERT INTO `category` VALUES (8, '手办', 7);
INSERT INTO `category` VALUES (9, '平板', 3);
INSERT INTO `category` VALUES (10, '体育用品', NULL);
INSERT INTO `category` VALUES (11, '家居用品', NULL);
INSERT INTO `category` VALUES (12, '内衣', 1);
INSERT INTO `category` VALUES (13, '女性用品', NULL);
INSERT INTO `category` VALUES (14, '化妆品', 13);
INSERT INTO `category` VALUES (15, '裤子', 1);
INSERT INTO `category` VALUES (17, '食品', NULL);
INSERT INTO `category` VALUES (18, '黑子玩具', 7);
INSERT INTO `category` VALUES (19, '速食食品', 17);
INSERT INTO `category` VALUES (20, '电脑', 3);
INSERT INTO `category` VALUES (23, '手表', 3);

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer`  (
  `customerId` int NOT NULL AUTO_INCREMENT,
  `customerName` varchar(22) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(22) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `customerPhone` varchar(22) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `customerDelete` int NULL DEFAULT 0,
  PRIMARY KEY (`customerId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 31 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of customer
-- ----------------------------
INSERT INTO `customer` VALUES (1, '张三', '123456', '13978264619', 0);
INSERT INTO `customer` VALUES (2, '李四', '123', '13958850989', 0);
INSERT INTO `customer` VALUES (3, '王五', '123', '13910834843', 2);
INSERT INTO `customer` VALUES (4, '赵六', '123', '13938490747', 1);
INSERT INTO `customer` VALUES (5, '刘七', '123', '13955459587', 0);
INSERT INTO `customer` VALUES (6, '陈八', '123', '13797223717', 0);
INSERT INTO `customer` VALUES (7, '周九', '123', '13995688657', 0);
INSERT INTO `customer` VALUES (8, '孙十', '123', '13943554872', 0);
INSERT INTO `customer` VALUES (9, '钱十一', '123', '13956075708', 0);
INSERT INTO `customer` VALUES (10, '吴十二', '123', '15263073947', 0);
INSERT INTO `customer` VALUES (11, '锁正', '123', '13764253173', 0);
INSERT INTO `customer` VALUES (12, '范长', '123', '13792879561', 1);
INSERT INTO `customer` VALUES (14, '玟聿', '111', '15264204252', 0);
INSERT INTO `customer` VALUES (15, '蔡徐坤', '123', '13942072253', 0);
INSERT INTO `customer` VALUES (16, '张飞', '123', '13944622223', 0);
INSERT INTO `customer` VALUES (17, '关羽', '123', '15239652008', 0);
INSERT INTO `customer` VALUES (18, '刘备', '985478', '13725540019', 0);
INSERT INTO `customer` VALUES (19, '李逵', '123', '13714964188', 0);
INSERT INTO `customer` VALUES (20, 'SUO', '123', '13939883617', 0);
INSERT INTO `customer` VALUES (21, '曹操', '123', '13598462532', 0);
INSERT INTO `customer` VALUES (22, '摆摆羊', '123', '12589655896', 0);
INSERT INTO `customer` VALUES (23, '王洋', '123', '13513249149', 0);
INSERT INTO `customer` VALUES (24, '王小海', '345', '987654321', 0);
INSERT INTO `customer` VALUES (25, 'why', '123', '12345678901', 0);
INSERT INTO `customer` VALUES (26, '玟聿', '111', '15809690961', 1);
INSERT INTO `customer` VALUES (27, '测试', '123654', '18134543812', 1);
INSERT INTO `customer` VALUES (28, '测试自增', '111', '12332145677', 1);
INSERT INTO `customer` VALUES (29, '文档', '123456', '15809690961', 0);
INSERT INTO `customer` VALUES (30, 'wenyu', '968', '18134543812', 0);

-- ----------------------------
-- Table structure for detail
-- ----------------------------
DROP TABLE IF EXISTS `detail`;
CREATE TABLE `detail`  (
  `detailId` int NOT NULL AUTO_INCREMENT,
  `orderId` int NULL DEFAULT NULL,
  `amount` int NULL DEFAULT NULL,
  `total` varchar(22) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `detailDelete` int NULL DEFAULT 0,
  `goodId` int NULL DEFAULT NULL,
  PRIMARY KEY (`detailId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 48 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of detail
-- ----------------------------
INSERT INTO `detail` VALUES (1, 1, 1, '100.00', 1, 1);
INSERT INTO `detail` VALUES (2, 2, 2, '400.00', 0, 2);
INSERT INTO `detail` VALUES (3, 3, 3, '900.00', 0, 3);
INSERT INTO `detail` VALUES (4, 4, 4, '1600.00', 0, 4);
INSERT INTO `detail` VALUES (5, 5, 5, '2500.00', 0, 5);
INSERT INTO `detail` VALUES (6, 6, 1, '600.00', 1, 6);
INSERT INTO `detail` VALUES (7, 7, 2, '1400.00', 0, 7);
INSERT INTO `detail` VALUES (8, 8, 3, '2400.00', 0, 8);
INSERT INTO `detail` VALUES (9, 9, 4, '3600.00', 0, 9);
INSERT INTO `detail` VALUES (10, 10, 5, '5000.00', 0, 10);
INSERT INTO `detail` VALUES (11, 1, 4, '52', 1, 1);
INSERT INTO `detail` VALUES (12, 22, 9, '900.00', 1, 1);
INSERT INTO `detail` VALUES (13, 24, 1, '100', 0, 1);
INSERT INTO `detail` VALUES (14, 24, 1, '100', 0, 1);
INSERT INTO `detail` VALUES (15, 24, 1, '100', 0, 1);
INSERT INTO `detail` VALUES (16, 24, 1, '100', 0, 1);
INSERT INTO `detail` VALUES (17, 24, 1, '100', 0, 1);
INSERT INTO `detail` VALUES (18, 24, 1, '100', 0, 1);
INSERT INTO `detail` VALUES (19, 24, 1, '100', 0, 1);
INSERT INTO `detail` VALUES (20, 24, 1, '100', 0, 1);
INSERT INTO `detail` VALUES (21, 24, 1, '100', 0, 1);
INSERT INTO `detail` VALUES (22, 24, 1, '100', 0, 1);
INSERT INTO `detail` VALUES (23, 34, 2, '999.99', 0, 1);
INSERT INTO `detail` VALUES (24, 34, 2, '999.99', 0, 1);
INSERT INTO `detail` VALUES (25, 34, 2, '999.99', 0, 1);
INSERT INTO `detail` VALUES (26, 34, 2, '999.99', 0, 1);
INSERT INTO `detail` VALUES (27, 38, 7, '700.00', 1, 1);
INSERT INTO `detail` VALUES (28, 24, 1, '100', 0, 1);
INSERT INTO `detail` VALUES (29, 19, 11, '20', 0, 1);
INSERT INTO `detail` VALUES (30, 19, 11, '20', 0, 1);
INSERT INTO `detail` VALUES (31, 42, 5, '600.00', 0, 1);
INSERT INTO `detail` VALUES (32, 42, 5, '600.00', 0, 1);
INSERT INTO `detail` VALUES (33, 42, 5, '600.00', 0, 1);
INSERT INTO `detail` VALUES (34, 24, 1, '100', 0, 1);
INSERT INTO `detail` VALUES (35, 19, 14, '999', 0, 1);
INSERT INTO `detail` VALUES (36, 47, 1, '100', 1, 1);
INSERT INTO `detail` VALUES (37, 20, 4, '52', 1, 1);
INSERT INTO `detail` VALUES (38, 49, 10, '1000.00', 0, 1);
INSERT INTO `detail` VALUES (39, 42, 5, '600.00', 1, 1);
INSERT INTO `detail` VALUES (40, 51, 2, '999.99', 0, 1);
INSERT INTO `detail` VALUES (41, 19, 1, '999', 0, 14);
INSERT INTO `detail` VALUES (42, 19, 1, '99.99', 0, 15);
INSERT INTO `detail` VALUES (43, 19, 1, '99.99', 0, 15);
INSERT INTO `detail` VALUES (44, 19, 1, '99.99', 0, 15);
INSERT INTO `detail` VALUES (45, 40, 1, '99.99', 1, 15);
INSERT INTO `detail` VALUES (46, 41, 1, '99.99', 0, 15);
INSERT INTO `detail` VALUES (47, 41, 1, '458', 0, 16);
INSERT INTO `detail` VALUES (48, 60, 1, '100', 1, 1);
INSERT INTO `detail` VALUES (49, 46, 1, '999', 0, 14);

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee`  (
  `empId` int NOT NULL AUTO_INCREMENT,
  `empName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `empGender` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `empPassword` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `empDelete` int NULL DEFAULT 0,
  PRIMARY KEY (`empId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES (1, '刘季', '男', '123456', 1);
INSERT INTO `employee` VALUES (2, '李二', '男', '234567', 0);
INSERT INTO `employee` VALUES (3, '郑十', '女', '234567', 0);
INSERT INTO `employee` VALUES (5, '王二麻子', '男', '123123123', 0);
INSERT INTO `employee` VALUES (6, '喜之郎', '女', '111222', 0);
INSERT INTO `employee` VALUES (7, '王洋', '男', '123', 0);
INSERT INTO `employee` VALUES (8, '哇哈哈', '男', '123', 0);
INSERT INTO `employee` VALUES (9, '刘莉莉', '女', '123', 0);
INSERT INTO `employee` VALUES (10, '刘刘', '男', '456', 1);
INSERT INTO `employee` VALUES (11, '絮语', '女', '123456', 0);
INSERT INTO `employee` VALUES (12, '蔡徐坤', '男', '12345', 0);

-- ----------------------------
-- Table structure for er
-- ----------------------------
DROP TABLE IF EXISTS `er`;
CREATE TABLE `er`  (
  `empId` int NOT NULL,
  `roleId` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`empId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of er
-- ----------------------------
INSERT INTO `er` VALUES (1, 'r1');
INSERT INTO `er` VALUES (2, 'r2');
INSERT INTO `er` VALUES (3, 'r2');
INSERT INTO `er` VALUES (5, 'r1');
INSERT INTO `er` VALUES (6, 'r2');
INSERT INTO `er` VALUES (8, 'r2');
INSERT INTO `er` VALUES (9, 'r2');
INSERT INTO `er` VALUES (10, 'r1');
INSERT INTO `er` VALUES (12, 'r1');

-- ----------------------------
-- Table structure for good
-- ----------------------------
DROP TABLE IF EXISTS `good`;
CREATE TABLE `good`  (
  `goodId` int NOT NULL AUTO_INCREMENT,
  `customerId` int NULL DEFAULT NULL,
  `goodName` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `price` varchar(24) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `category` int NULL DEFAULT NULL,
  `goodDelete` int NULL DEFAULT 0,
  PRIMARY KEY (`goodId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 17 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of good
-- ----------------------------
INSERT INTO `good` VALUES (1, 1, '红小豆手办', '全世界绝无仅有', '100', 2, 0);
INSERT INTO `good` VALUES (2, 2, '爱坤背带裤', '第二个鸡哥就是你了吧', '999.99', 5, 0);
INSERT INTO `good` VALUES (3, 3, '爱坤玩偶', '你是真爱粉吗？', '666.66', 8, 0);
INSERT INTO `good` VALUES (4, 4, '内裤', '满足某些人奇怪的癖好', '52', 12, 0);
INSERT INTO `good` VALUES (5, 5, '商品5', '描述5', '600.00', 4, 0);
INSERT INTO `good` VALUES (6, 6, '商品6', '描述6', '600.00', 14, 0);
INSERT INTO `good` VALUES (7, 7, '商品7', '描述7', '700.00', 3, 1);
INSERT INTO `good` VALUES (8, 8, '商品8', '商品8的描述', '800.00', 2, 0);
INSERT INTO `good` VALUES (9, 9, '商品9', '描述9', '900.00', 10, 0);
INSERT INTO `good` VALUES (10, 10, '商品10', '描述10', '1000.00', 7, 0);
INSERT INTO `good` VALUES (11, 16, '宿舍小锅', '解决你晚上想吃饭的需求', '20', 11, 0);
INSERT INTO `good` VALUES (12, 16, '平板', '95新平板，女生自用', '998', 9, 0);
INSERT INTO `good` VALUES (13, 16, '水壶', '大四学长专用四年', '9.99', 2, 0);
INSERT INTO `good` VALUES (14, 16, '书', '海洋的知识', '999', 4, 0);
INSERT INTO `good` VALUES (15, 16, '头发', '资深程序员必备的假发', '99.99', 2, 2);
INSERT INTO `good` VALUES (16, 16, '键盘', '机械键盘108建', '458', 3, 0);
INSERT INTO `good` VALUES (17, 30, '华为手表', '无', '400', 3, 2);

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order`  (
  `orderId` int NOT NULL AUTO_INCREMENT,
  `addressId` int NULL DEFAULT NULL,
  `buyerId` int NULL DEFAULT NULL,
  `sellerId` int NULL DEFAULT NULL,
  `orderDelete` int NULL DEFAULT 0,
  PRIMARY KEY (`orderId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 60 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of order
-- ----------------------------
INSERT INTO `order` VALUES (1, 16, 16, 2, 1);
INSERT INTO `order` VALUES (2, 2, 3, 4, 0);
INSERT INTO `order` VALUES (3, 3, 5, 6, 0);
INSERT INTO `order` VALUES (4, 4, 7, 8, 0);
INSERT INTO `order` VALUES (5, 5, 9, 10, 0);
INSERT INTO `order` VALUES (6, 16, 16, 3, 0);
INSERT INTO `order` VALUES (7, 7, 2, 4, 0);
INSERT INTO `order` VALUES (8, 8, 3, 5, 0);
INSERT INTO `order` VALUES (9, 9, 4, 6, 0);
INSERT INTO `order` VALUES (10, 10, 5, 7, 0);
INSERT INTO `order` VALUES (11, 11, 11, 10, 0);
INSERT INTO `order` VALUES (12, 12, 16, 16, 1);
INSERT INTO `order` VALUES (13, 12, 16, 16, 1);
INSERT INTO `order` VALUES (14, 12, 16, 16, 1);
INSERT INTO `order` VALUES (15, 12, 16, 16, 1);
INSERT INTO `order` VALUES (16, 12, 16, 16, 1);
INSERT INTO `order` VALUES (17, 12, 16, 16, 1);
INSERT INTO `order` VALUES (18, 12, 16, 16, 1);
INSERT INTO `order` VALUES (19, 12, 16, 16, 1);
INSERT INTO `order` VALUES (20, 37, 16, 4, 1);
INSERT INTO `order` VALUES (21, 12, 16, 16, 1);
INSERT INTO `order` VALUES (22, 12, 16, 9, 1);
INSERT INTO `order` VALUES (23, 1, 16, 2, 1);
INSERT INTO `order` VALUES (24, 12, 16, 1, 1);
INSERT INTO `order` VALUES (25, 12, 16, 1, 0);
INSERT INTO `order` VALUES (26, 12, 16, 1, 0);
INSERT INTO `order` VALUES (27, 12, 16, 1, 0);
INSERT INTO `order` VALUES (28, 12, 16, 1, 0);
INSERT INTO `order` VALUES (29, 12, 16, 1, 0);
INSERT INTO `order` VALUES (30, 12, 16, 1, 0);
INSERT INTO `order` VALUES (31, 12, 16, 1, 0);
INSERT INTO `order` VALUES (32, 12, 16, 1, 0);
INSERT INTO `order` VALUES (33, 12, 16, 1, 0);
INSERT INTO `order` VALUES (34, 12, 16, 2, 1);
INSERT INTO `order` VALUES (35, 12, 16, 2, 0);
INSERT INTO `order` VALUES (36, 12, 16, 2, 1);
INSERT INTO `order` VALUES (37, 12, 16, 2, 1);
INSERT INTO `order` VALUES (38, 37, 16, 7, 1);
INSERT INTO `order` VALUES (39, 12, 16, 1, 1);
INSERT INTO `order` VALUES (40, 12, 16, 16, 1);
INSERT INTO `order` VALUES (41, 12, 16, 16, 1);
INSERT INTO `order` VALUES (42, 27, 16, 5, 1);
INSERT INTO `order` VALUES (43, 12, 16, 5, 0);
INSERT INTO `order` VALUES (44, 12, 16, 5, 0);
INSERT INTO `order` VALUES (45, 12, 16, 1, 1);
INSERT INTO `order` VALUES (46, 12, 16, 16, 0);
INSERT INTO `order` VALUES (47, 1, 1, 1, 0);
INSERT INTO `order` VALUES (48, 12, 16, 4, 0);
INSERT INTO `order` VALUES (49, 12, 16, 10, 1);
INSERT INTO `order` VALUES (50, 12, 16, 5, 0);
INSERT INTO `order` VALUES (51, 19, 21, 2, 0);
INSERT INTO `order` VALUES (53, 12, 16, 16, 0);
INSERT INTO `order` VALUES (54, 12, 16, 16, 0);
INSERT INTO `order` VALUES (55, 12, 16, 16, 0);
INSERT INTO `order` VALUES (56, 12, 16, 16, 0);
INSERT INTO `order` VALUES (57, 12, 16, 16, 0);
INSERT INTO `order` VALUES (58, 12, 16, 16, 0);
INSERT INTO `order` VALUES (59, 12, 16, 16, 0);
INSERT INTO `order` VALUES (60, 39, 30, 1, 1);
INSERT INTO `order` VALUES (61, 12, 16, 16, 0);

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role`  (
  `roleId` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `roleName` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `roleDescription` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`roleId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('r1', 'admin', '系统管理员');
INSERT INTO `role` VALUES ('r2', 'service', '平台客服');

-- ----------------------------
-- View structure for category_self_join
-- ----------------------------
DROP VIEW IF EXISTS `category_self_join`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `category_self_join` AS select `c1`.`categoryId` AS `categoryId`,`c1`.`categoryName` AS `categoryName`,`c1`.`upId` AS `upId`,coalesce(`c2`.`categoryName`,NULL) AS `upName` from (`category` `c1` left join `category` `c2` on((`c1`.`upId` = `c2`.`categoryId`)));

-- ----------------------------
-- View structure for detail_good_order
-- ----------------------------
DROP VIEW IF EXISTS `detail_good_order`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `detail_good_order` AS select `d`.`detailId` AS `detailId`,`d`.`amount` AS `amount`,`d`.`total` AS `total`,`g`.`goodName` AS `goodName`,`g`.`goodId` AS `goodId`,`g`.`description` AS `description`,`g`.`price` AS `price`,`od`.`orderId` AS `orderId` from ((`detail` `d` join `good` `g` on((`d`.`goodId` = `g`.`goodId`))) join `order` `od` on((`d`.`orderId` = `od`.`orderId`)));

-- ----------------------------
-- View structure for employee_role_er
-- ----------------------------
DROP VIEW IF EXISTS `employee_role_er`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `employee_role_er` AS select `e`.`empId` AS `empId`,`e`.`empName` AS `empName`,`e`.`empGender` AS `empGender`,`e`.`empPassword` AS `empPassword`,`e`.`empDelete` AS `empDelete`,`r`.`roleId` AS `roleId`,`r`.`roleName` AS `roleName`,`r`.`roleDescription` AS `roleDescription` from ((`er` join `employee` `e` on((`e`.`empId` = `er`.`empId`))) join `role` `r` on((`er`.`roleId` = `r`.`roleId`)));

-- ----------------------------
-- View structure for good_category
-- ----------------------------
DROP VIEW IF EXISTS `good_category`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `good_category` AS select `g`.`goodId` AS `goodId`,`g`.`customerId` AS `customerId`,`g`.`goodName` AS `goodName`,`g`.`description` AS `description`,`g`.`price` AS `price`,`c1`.`categoryName` AS `categoryName`,(case when (`c1`.`upId` is null) then NULL else `c2`.`categoryName` end) AS `upCategoryName` from ((`category` `c1` join `good` `g` on((`g`.`category` = `c1`.`categoryId`))) left join `category` `c2` on((`c2`.`categoryId` = `c1`.`upId`)));

-- ----------------------------
-- View structure for order_address_detail_customer
-- ----------------------------
DROP VIEW IF EXISTS `order_address_detail_customer`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `order_address_detail_customer` AS select `o`.`orderId` AS `orderId`,`a`.`address` AS `address`,`c1`.`customerName` AS `buy_customer`,`c2`.`customerName` AS `sell_customer`,`d`.`total` AS `total`,`o`.`orderDelete` AS `orderDelete` from ((((`order` `o` join `address` `a` on((`o`.`addressId` = `a`.`addressId`))) join `customer` `c1` on((`o`.`buyerId` = `c1`.`customerId`))) join `customer` `c2` on((`o`.`sellerId` = `c2`.`customerId`))) join `detail` `d` on((`o`.`orderId` = `d`.`orderId`)));

SET FOREIGN_KEY_CHECKS = 1;
