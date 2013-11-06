/*
SQLyog Ultimate v11.11 (64 bit)
MySQL - 5.5.33 : Database - sdheryframework
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`sdheryframework` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_bin */;

USE `sdheryframework`;

/*Table structure for table `inf_article` */

DROP TABLE IF EXISTS `inf_article`;

CREATE TABLE `inf_article` (
  `INFO_ARTICLE_ID` int(11) NOT NULL COMMENT '主键',
  `TITLE` varchar(256) COLLATE utf8_bin NOT NULL COMMENT '标题',
  `CONTENT` longtext COLLATE utf8_bin COMMENT '内容',
  `CREATE_TIME` datetime NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`INFO_ARTICLE_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `inf_article` */

insert  into `inf_article`(`INFO_ARTICLE_ID`,`TITLE`,`CONTENT`,`CREATE_TIME`) values (10301,'你好你好你好你好','你好你好你好你好','2013-07-17 14:49:49'),(10300,'123','123','2013-07-17 14:49:34'),(10200,'好的','好的好的','2013-07-15 14:43:29'),(10400,'test2013-08-06今天1','你好1','2013-08-06 00:00:00');

/*Table structure for table `sys_action` */

DROP TABLE IF EXISTS `sys_action`;

CREATE TABLE `sys_action` (
  `SYS_ACTION_ID` int(11) NOT NULL,
  `ACTION_NAME` varchar(256) COLLATE utf8_bin NOT NULL,
  `ACTION_URL` varchar(256) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`SYS_ACTION_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `sys_action` */

insert  into `sys_action`(`SYS_ACTION_ID`,`ACTION_NAME`,`ACTION_URL`) values (1,'列出信息','/admin/info/list');

/*Table structure for table `sys_ids` */

DROP TABLE IF EXISTS `sys_ids`;

CREATE TABLE `sys_ids` (
  `TABLE_NAME` varchar(128) COLLATE utf8_bin NOT NULL,
  `NEXT_VALUE` decimal(12,0) DEFAULT NULL,
  PRIMARY KEY (`TABLE_NAME`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `sys_ids` */

insert  into `sys_ids`(`TABLE_NAME`,`NEXT_VALUE`) values ('sys_tree',11000),('inf_article',10500),('sys_user',10400);

/*Table structure for table `sys_module` */

DROP TABLE IF EXISTS `sys_module`;

CREATE TABLE `sys_module` (
  `SYS_MODULE_ID` int(11) NOT NULL,
  `MODULE_NAME` varchar(256) COLLATE utf8_bin NOT NULL,
  `DEFAULT_ACTION_ID` int(11) DEFAULT '0',
  PRIMARY KEY (`SYS_MODULE_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `sys_module` */

insert  into `sys_module`(`SYS_MODULE_ID`,`MODULE_NAME`,`DEFAULT_ACTION_ID`) values (2,'信息管理',1);

/*Table structure for table `sys_module_action` */

DROP TABLE IF EXISTS `sys_module_action`;

CREATE TABLE `sys_module_action` (
  `SYS_MODULE_ID` int(11) NOT NULL,
  `SYS_ACTION_ID` int(11) NOT NULL,
  PRIMARY KEY (`SYS_MODULE_ID`,`SYS_ACTION_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `sys_module_action` */

insert  into `sys_module_action`(`SYS_MODULE_ID`,`SYS_ACTION_ID`) values (2,1);

/*Table structure for table `sys_object_key` */

DROP TABLE IF EXISTS `sys_object_key`;

CREATE TABLE `sys_object_key` (
  `SYS_OBJECT_KEY` varchar(256) COLLATE utf8_bin NOT NULL,
  `SYS_OBJECT_KEY_VALUE` varchar(256) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`SYS_OBJECT_KEY`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `sys_object_key` */

insert  into `sys_object_key`(`SYS_OBJECT_KEY`,`SYS_OBJECT_KEY_VALUE`) values ('sysUserLoginKey_root','1');

/*Table structure for table `sys_resource` */

DROP TABLE IF EXISTS `sys_resource`;

CREATE TABLE `sys_resource` (
  `SYS_RESOURCE_ID` int(11) NOT NULL,
  `RESOURCE_TITLE` varchar(256) COLLATE utf8_bin NOT NULL,
  `RESOURCE_URL` varchar(256) COLLATE utf8_bin NOT NULL DEFAULT '',
  `PERMISSION` varchar(256) COLLATE utf8_bin DEFAULT '',
  `POS` int(2) DEFAULT NULL,
  `PARENT_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`SYS_RESOURCE_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `sys_resource` */

insert  into `sys_resource`(`SYS_RESOURCE_ID`,`RESOURCE_TITLE`,`RESOURCE_URL`,`PERMISSION`,`POS`,`PARENT_ID`) values (1,'后台管理','','',0,0),(2,'信息管理','','',0,1),(4,'所有信息','/admin/info/list','perms[info:list]',0,2),(3,'权限管理','','',0,1),(5,'管理员管理','','',0,3);

/*Table structure for table `sys_role` */

DROP TABLE IF EXISTS `sys_role`;

CREATE TABLE `sys_role` (
  `SYS_ROLE_ID` int(20) NOT NULL COMMENT '主键ID',
  `SYS_ROLE_NAME` varchar(256) COLLATE utf8_bin NOT NULL COMMENT '角色名称',
  PRIMARY KEY (`SYS_ROLE_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `sys_role` */

/*Table structure for table `sys_tree` */

DROP TABLE IF EXISTS `sys_tree`;

CREATE TABLE `sys_tree` (
  `SYS_TREE_ID` int(11) NOT NULL COMMENT '系统树主键',
  `PARENT_ID` int(11) NOT NULL COMMENT '树的父ID',
  `POS` int(3) DEFAULT NULL COMMENT '排序',
  `SYS_TREE_NAME` varchar(256) COLLATE utf8_bin NOT NULL COMMENT '树名称',
  PRIMARY KEY (`SYS_TREE_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `sys_tree` */

insert  into `sys_tree`(`SYS_TREE_ID`,`PARENT_ID`,`POS`,`SYS_TREE_NAME`) values (1,0,0,'后台管理'),(2,1,0,'信息菜单根节点'),(3,2,0,'信息管理'),(5,3,0,'所有信息');

/*Table structure for table `sys_user` */

DROP TABLE IF EXISTS `sys_user`;

CREATE TABLE `sys_user` (
  `SYS_USER_ID` int(11) NOT NULL,
  `LOGIN_ID` varchar(256) COLLATE utf8_bin NOT NULL,
  `PASSWORD_HASH` varchar(256) COLLATE utf8_bin NOT NULL,
  `RANDOM` varchar(256) COLLATE utf8_bin NOT NULL,
  `IS_ADMIN` int(2) NOT NULL,
  `STATE` int(2) NOT NULL,
  PRIMARY KEY (`SYS_USER_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `sys_user` */

insert  into `sys_user`(`SYS_USER_ID`,`LOGIN_ID`,`PASSWORD_HASH`,`RANDOM`,`IS_ADMIN`,`STATE`) values (1,'root','9ed5lnOTnZihx7p8gaqaH2JT','0.7450066008495231',1,1),(10300,'root1','123456','111',1,1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
