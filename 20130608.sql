/*
SQLyog Ultimate v10.51 
MySQL - 5.5.27 : Database - sdheryframework
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

/*Table structure for table `sys_object_key` */

DROP TABLE IF EXISTS `sys_object_key`;

CREATE TABLE `sys_object_key` (
  `SYS_OBJECT_KEY` varchar(256) COLLATE utf8_bin NOT NULL,
  `SYS_OBJECT_KEY_VALUE` varchar(256) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`SYS_OBJECT_KEY`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `sys_object_key` */

insert  into `sys_object_key`(`SYS_OBJECT_KEY`,`SYS_OBJECT_KEY_VALUE`) values ('sysUserLoginKey_root','1');

/*Table structure for table `sys_tree` */

DROP TABLE IF EXISTS `sys_tree`;

CREATE TABLE `sys_tree` (
  `SYS_TREE_ID` int(11) NOT NULL,
  PRIMARY KEY (`SYS_TREE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `sys_tree` */

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

insert  into `sys_user`(`SYS_USER_ID`,`LOGIN_ID`,`PASSWORD_HASH`,`RANDOM`,`IS_ADMIN`,`STATE`) values (1,'root','9ed5lnOTnZihx7p8gaqaH2JT','0.7450066008495231',1,1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
