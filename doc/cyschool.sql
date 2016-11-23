/*
 Navicat MySQL Data Transfer

 Source Server         : localhost
 Source Server Version : 50553
 Source Host           : localhost
 Source Database       : cyschool

 Target Server Version : 50553
 File Encoding         : utf-8

 Date: 11/23/2016 23:20:30 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `admin`
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `a_id` int(10) NOT NULL AUTO_INCREMENT,
  `a_name` varchar(20) NOT NULL,
  `a_phone` varchar(20) NOT NULL,
  `a_grade` int(11) DEFAULT NULL,
  `a_pass` varchar(50) NOT NULL,
  PRIMARY KEY (`a_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `category`
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `c_id` int(10) NOT NULL AUTO_INCREMENT,
  `c_content` varchar(50) NOT NULL,
  `c_number` int(1) DEFAULT NULL,
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `category`
-- ----------------------------
BEGIN;
INSERT INTO `category` VALUES ('1', '通知公告', null), ('2', '首页轮播图', null), ('3', '学校要闻', null), ('4', '视频展示', null), ('5', '毕业风采', null), ('6', '校内图册', null), ('7', '校长致辞', null), ('8', '现任领导', null), ('9', '学校简介', null), ('10', '行政机构', null), ('11', '教辅机构', null), ('12', '直属及其他', null), ('13', '师资服务', null), ('14', '特色专业', null), ('15', '精品课程', null), ('16', '学科建设', null), ('17', '社会服务', null), ('18', '交流合作', null), ('19', '招就招聘', null);
COMMIT;

-- ----------------------------
--  Table structure for `image`
-- ----------------------------
DROP TABLE IF EXISTS `image`;
CREATE TABLE `image` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `i_link` varchar(100) NOT NULL,
  `i_des` varchar(100) NOT NULL,
  `i_head` varchar(5) DEFAULT NULL,
  `i_click` int(10) DEFAULT '0',
  `i_position` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `sort`
-- ----------------------------
DROP TABLE IF EXISTS `sort`;
CREATE TABLE `sort` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `s_grade` int(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `title`
-- ----------------------------
DROP TABLE IF EXISTS `title`;
CREATE TABLE `title` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `t_name` varchar(45) NOT NULL,
  `t_content` longtext NOT NULL,
  `t_read` int(10) DEFAULT '0',
  `t_date` date NOT NULL,
  `t_category` int(10) NOT NULL,
  `t_like` int(10) DEFAULT '0',
  `t_sort` int(10) DEFAULT NULL,
  `t_image` varchar(100) DEFAULT NULL,
  `t_short_des` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `t_category` (`t_category`),
  CONSTRAINT `tc_key` FOREIGN KEY (`t_category`) REFERENCES `category` (`c_id`)
) ENGINE=InnoDB AUTO_INCREMENT=48 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `title`
-- ----------------------------
BEGIN;
INSERT INTO `title` VALUES ('10', 'ddd', '<p>ad</p>', '0', '2016-11-20', '1', null, null, null, null), ('12', '学', '<p>要<img src=\"/upload/upload_image/20161122/1479784587281023805.jpg\" title=\"1479784587281023805.jpg\" alt=\"3.jpg\"/></p>', '0', '2016-11-21', '3', null, null, null, null), ('14', 'test', '<p>test</p>', '0', '2016-11-21', '1', null, null, null, null), ('15', '要=', '<p>特</p>', '0', '2016-11-21', '3', null, null, null, null), ('16', 'yaa', '<p>tet</p>', '0', '2016-11-21', '3', null, null, null, null), ('17', '毕业风采', '<p>毕业</p>', '0', '2016-11-21', '1', null, null, null, null), ('18', 'biye', '<p>ee</p>', '0', '2016-11-21', '1', null, null, null, null), ('20', '测试毕', '<p>测试毕业</p>', '0', '2016-11-21', '5', null, null, null, null), ('21', '学校要文', '<p>要文</p>', '0', '2016-11-21', '3', null, null, null, null), ('22', '文章', '<p>这个文章有图片</p><p><img src=\"/upload/upload_image/20161122/1479781332297017439.jpg\" title=\"1479781332297017439.jpg\" alt=\"1.jpg\"/></p><p>测试图片二</p><p><img src=\"/upload/upload_image/20161122/1479781384998083833.jpg\" title=\"1479781384998083833.jpg\" alt=\"5.jpg\"/></p><p>测试图片三</p><p><img src=\"/upload/upload_image/20161122/1479781404549010699.jpg\" title=\"1479781404549010699.jpg\" alt=\"4.jpg\"/></p>', '0', '2016-11-22', '1', null, null, null, null), ('23', '文章二', '<p>测试图片</p><p><img src=\"/upload/upload_image/20161122/1479781954002025297.jpg\" title=\"1479781954002025297.jpg\" alt=\"5.jpg\"/></p>', '0', '2016-11-22', '1', null, null, null, null), ('24', '轮播', '<p>轮播</p>', '0', '2016-11-22', '3', null, null, null, null), ('25', '轮播2', '<p>轮播2</p>', '0', '2016-11-22', '3', null, null, null, null), ('26', '校长致辞2', '<p>校长致辞2</p>', '0', '2016-11-22', '7', null, null, null, null), ('27', '轮播图', '<p>轮播图<img src=\"http://img.baidu.com/hi/jx2/j_0016.gif\"/><img src=\"http://img.baidu.com/hi/jx2/j_0064.gif\"/><img src=\"/upload/upload_image/20161122/1479821335610083864.jpg\" title=\"1479821335610083864.jpg\" alt=\"3.jpg\"/></p>', '0', '2016-11-22', '2', null, null, 'http://localhost:8080/upload/upload_image/20161122/1479821335610083864.jpg', null), ('28', '首页轮播图1', '<p>test</p>', '0', '2016-11-22', '2', null, null, null, null), ('29', '测试图片顺序', '<p>测试图片链接<img src=\"/upload/upload_image/20161122/1479821444938032382.jpg\" title=\"1479821444938032382.jpg\" alt=\"4.jpg\"/><img src=\"/upload/upload_image/20161122/1479821457857021385.jpg\" title=\"1479821457857021385.jpg\" alt=\"5.jpg\"/></p>', '0', '2016-11-22', '5', null, null, 'http://localhost:8080/upload/upload_image/20161122/1479821457857021385.jpg', null), ('32', '图片顺序没有后面的了', '<p>图片</p><p><img src=\"/upload/upload_image/20161122/1479822407737087244.jpg\" title=\"1479822407737087244.jpg\"/></p><p><img src=\"/upload/upload_image/20161122/1479822407736058096.jpg\" title=\"1479822407736058096.jpg\"/></p><p><br/></p>', '0', '2016-11-22', '5', null, null, 'http://localhost:8080/upload/upload_image/20161122/1479822407737087244.jpg', null), ('35', '学校简介', '<p>学校简介</p>', '0', '2016-11-23', '9', null, null, null, null), ('36', '轮播图测试多次', '<p>轮播图测试多次</p>', '0', '2016-11-23', '2', null, null, null, null), ('37', '测试轮播12', '<p>测试轮播12</p>', '0', '2016-11-23', '2', null, null, null, null), ('38', '测试文章那过', '<p>测试文章那过</p>', '0', '2016-11-23', '3', null, null, null, null), ('39', '测试轮播图13', '<p>测试轮播图13</p>', '0', '2016-11-23', '3', null, null, null, null), ('40', '测试师资服', '<p>测试</p>', '0', '2016-11-23', '13', null, null, null, null), ('41', '校长致辞', '<p>校长自此</p>', '0', '2016-11-23', '7', null, null, null, null), ('42', '轮播图', '<p>轮播图</p>', '0', '2016-11-23', '2', null, null, null, null), ('45', '交流合作', '<p style=\"text-align: center;\">交流合作测试</p><p style=\"text-align: center;\"><strong><img src=\"/upload/upload_image/20161123/1479905245071098757.jpg\" title=\"1479905245071098757.jpg\" alt=\"5.jpg\"/></strong></p><p><b>这是测试格式数据</b></p>', '0', '2016-11-23', '18', null, null, null, null), ('47', '测试招就招聘', '<p>测试招就招聘</p>', '0', '2016-11-23', '19', null, null, null, null);
COMMIT;

-- ----------------------------
--  Table structure for `video`
-- ----------------------------
DROP TABLE IF EXISTS `video`;
CREATE TABLE `video` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `v_link` varchar(100) NOT NULL,
  `v_type` varchar(50) DEFAULT NULL,
  `v_des` varchar(100) NOT NULL,
  `v_date` date NOT NULL,
  `v_read` int(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `video`
-- ----------------------------
BEGIN;
INSERT INTO `video` VALUES ('10', 'http://localhost:8080/background/school_video_add.jsp', null, '好视频', '2016-11-22', '0');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
