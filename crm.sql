-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: crm2008
-- ------------------------------------------------------
-- Server version	8.0.28

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tbl_activity`
--

DROP TABLE IF EXISTS `tbl_activity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_activity` (
  `id` char(32) NOT NULL,
  `owner` char(32) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `start_date` char(10) DEFAULT NULL,
  `end_date` char(10) DEFAULT NULL,
  `cost` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `create_time` char(19) DEFAULT NULL,
  `create_by` varchar(255) DEFAULT NULL,
  `edit_time` char(19) DEFAULT NULL,
  `edit_by` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_activity`
--

LOCK TABLES `tbl_activity` WRITE;
/*!40000 ALTER TABLE `tbl_activity` DISABLE KEYS */;
INSERT INTO `tbl_activity` VALUES ('19441919085346b98cd8981ebf04d849','40f6cdea0bd34aceb77492a1656d9fb3','重置02','2022-09-08','2022-09-20','105','02','2022-09-04 12:09:43','c2dc9c884f444496996c60cde82566a8','2022-09-04 12:10:07','c2dc9c884f444496996c60cde82566a8'),('2b52047db57e45a584ed90bacd03b35f','c2dc9c884f444496996c60cde82566a8','重置01','2022-09-01','2022-09-15','100','01','2022-09-04 12:09:22','c2dc9c884f444496996c60cde82566a8',NULL,NULL),('99f1992c3ba546fea2e6730e2b6c6698','06f5fc056eac41558a964f96daa7f27c','测试01','2022-09-07','2022-09-14','200','test01','2022-09-04 12:16:09','c2dc9c884f444496996c60cde82566a8',NULL,NULL),('a44bf56b408a410c91dc69c81c844887','c2dc9c884f444496996c60cde82566a8','联系人01','2022-09-08','2022-09-27','6666666','c01','2022-09-04 12:37:24','c2dc9c884f444496996c60cde82566a8',NULL,NULL),('cb8d54d8b4e046da886d5117a14cf633','40f6cdea0bd34aceb77492a1656d9fb3','交易01','2022-09-09','2022-09-27','6666666666','t01','2022-09-04 12:34:39','c2dc9c884f444496996c60cde82566a8',NULL,NULL);
/*!40000 ALTER TABLE `tbl_activity` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_activity_remark`
--

DROP TABLE IF EXISTS `tbl_activity_remark`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_activity_remark` (
  `id` char(32) NOT NULL,
  `note_content` varchar(255) DEFAULT NULL,
  `create_time` char(19) DEFAULT NULL,
  `create_by` varchar(255) DEFAULT NULL,
  `edit_time` char(19) DEFAULT NULL,
  `edit_by` varchar(255) DEFAULT NULL,
  `edit_flag` char(1) DEFAULT NULL COMMENT '0表示未修改，1表示已修改',
  `activity_id` char(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_activity_remark`
--

LOCK TABLES `tbl_activity_remark` WRITE;
/*!40000 ALTER TABLE `tbl_activity_remark` DISABLE KEYS */;
INSERT INTO `tbl_activity_remark` VALUES ('ad1a8493a30a48d69962eb5901848f87','666','2022-09-04 12:09:48','c2dc9c884f444496996c60cde82566a8',NULL,NULL,'0','19441919085346b98cd8981ebf04d849');
/*!40000 ALTER TABLE `tbl_activity_remark` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_clue`
--

DROP TABLE IF EXISTS `tbl_clue`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_clue` (
  `id` char(32) NOT NULL,
  `fullname` varchar(255) DEFAULT NULL,
  `appellation` varchar(255) DEFAULT NULL,
  `owner` char(32) DEFAULT NULL,
  `company` varchar(255) DEFAULT NULL,
  `job` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `website` varchar(255) DEFAULT NULL,
  `mphone` varchar(255) DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `source` varchar(255) DEFAULT NULL,
  `create_by` varchar(255) DEFAULT NULL,
  `create_time` char(19) DEFAULT NULL,
  `edit_by` varchar(255) DEFAULT NULL,
  `edit_time` char(19) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `contact_summary` varchar(255) DEFAULT NULL,
  `next_contact_time` char(10) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_clue`
--

LOCK TABLES `tbl_clue` WRITE;
/*!40000 ALTER TABLE `tbl_clue` DISABLE KEYS */;
INSERT INTO `tbl_clue` VALUES ('ad1c23c866124295a4ccf064fdbd3a7c','强东','59795c49896947e1ab61b7312bd0597c','40f6cdea0bd34aceb77492a1656d9fb3','京东有限公司','CEO','lqd@jd.com','0436-3333333','www.jd.com','13364423333','06e3cbdf10a44eca8511dddfc6896c55','72f13af8f5d34134b5b3f42c5d477510','c2dc9c884f444496996c60cde82566a8','2022-09-04 12:20:09',NULL,NULL,'02','02','2022-09-08','002'),('d95048b1b89c43b681e5afd3e37aab33','ZS基本法','31539e7ed8c848fc913e1c2c93d76fd1','40f6cdea0bd34aceb77492a1656d9fb3','北京张三有限公司','副局长','zs@qq.com','0436-2222222','www.zs.com','13364422222','1e0bd307e6ee425599327447f8387285','4d03a42898684135809d380597ed3268','c2dc9c884f444496996c60cde82566a8','2022-09-04 12:15:39',NULL,NULL,'02','02','2022-09-16','02');
/*!40000 ALTER TABLE `tbl_clue` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_clue_activity_relation`
--

DROP TABLE IF EXISTS `tbl_clue_activity_relation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_clue_activity_relation` (
  `id` char(32) NOT NULL,
  `clue_id` char(32) DEFAULT NULL,
  `activity_id` char(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_clue_activity_relation`
--

LOCK TABLES `tbl_clue_activity_relation` WRITE;
/*!40000 ALTER TABLE `tbl_clue_activity_relation` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_clue_activity_relation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_clue_remark`
--

DROP TABLE IF EXISTS `tbl_clue_remark`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_clue_remark` (
  `id` char(32) NOT NULL,
  `note_content` varchar(255) DEFAULT NULL,
  `create_by` varchar(255) DEFAULT NULL,
  `create_time` char(19) DEFAULT NULL,
  `edit_by` varchar(255) DEFAULT NULL,
  `edit_time` char(19) DEFAULT NULL,
  `edit_flag` char(1) DEFAULT NULL,
  `clue_id` char(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_clue_remark`
--

LOCK TABLES `tbl_clue_remark` WRITE;
/*!40000 ALTER TABLE `tbl_clue_remark` DISABLE KEYS */;
INSERT INTO `tbl_clue_remark` VALUES ('d994f5cefc5b4626bcd20fcc200f05ca','5555','c2dc9c884f444496996c60cde82566a8','2022-09-04 12:24:12',NULL,NULL,'0','ad1c23c866124295a4ccf064fdbd3a7c');
/*!40000 ALTER TABLE `tbl_clue_remark` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_contacts`
--

DROP TABLE IF EXISTS `tbl_contacts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_contacts` (
  `id` char(32) NOT NULL,
  `owner` char(32) DEFAULT NULL,
  `source` varchar(255) DEFAULT NULL,
  `customer_id` char(32) DEFAULT NULL,
  `fullname` varchar(255) DEFAULT NULL,
  `appellation` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `mphone` varchar(255) DEFAULT NULL,
  `job` varchar(255) DEFAULT NULL,
  `create_by` varchar(255) DEFAULT NULL,
  `create_time` char(19) DEFAULT NULL,
  `edit_by` varchar(255) DEFAULT NULL,
  `edit_time` char(19) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `contact_summary` varchar(255) DEFAULT NULL,
  `next_contact_time` char(10) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_contacts`
--

LOCK TABLES `tbl_contacts` WRITE;
/*!40000 ALTER TABLE `tbl_contacts` DISABLE KEYS */;
INSERT INTO `tbl_contacts` VALUES ('6dba108c826d4b61aeec41a9af546b67','c2dc9c884f444496996c60cde82566a8','fd677cc3b5d047d994e16f6ece4d3d45','26442dd28f1a4d2b8e2fd5dfd184aaac','泉泉手环','59795c49896947e1ab61b7312bd0597c','lq@qq.com','13364421111','CEO','c2dc9c884f444496996c60cde82566a8','2022-09-04 12:12:45',NULL,NULL,'01','01','2022-09-17','001'),('d14316d5edaf4f25af7a24c291c55168','40f6cdea0bd34aceb77492a1656d9fb3','ff802a03ccea4ded8731427055681d48','05649b50ed434e4fba8a879adf04dda9','好先生','59795c49896947e1ab61b7312bd0597c','hh@qq.com','13364423333','处长','c2dc9c884f444496996c60cde82566a8','2022-09-04 12:33:13','c2dc9c884f444496996c60cde82566a8','2022-09-04 12:33:29','002','02','2022-09-24','002'),('f944ac038fa745bca48b36f46fbd47da','06f5fc056eac41558a964f96daa7f27c','b924d911426f4bc5ae3876038bc7e0ad','b8ce142976694f0eaf1ead6883d22fdc','关关','176039d2a90e4b1a81c5ab8707268636','gg@qq.com','13364427777','教授','c2dc9c884f444496996c60cde82566a8','2022-09-04 12:30:25',NULL,NULL,'test01','01','2022-09-07','001');
/*!40000 ALTER TABLE `tbl_contacts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_contacts_activity_relation`
--

DROP TABLE IF EXISTS `tbl_contacts_activity_relation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_contacts_activity_relation` (
  `id` char(32) NOT NULL,
  `contacts_id` char(32) DEFAULT NULL,
  `activity_id` char(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_contacts_activity_relation`
--

LOCK TABLES `tbl_contacts_activity_relation` WRITE;
/*!40000 ALTER TABLE `tbl_contacts_activity_relation` DISABLE KEYS */;
INSERT INTO `tbl_contacts_activity_relation` VALUES ('0cfb4b4574a947ae972dcf1428e7b4a8','6dba108c826d4b61aeec41a9af546b67','2b52047db57e45a584ed90bacd03b35f');
/*!40000 ALTER TABLE `tbl_contacts_activity_relation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_contacts_remark`
--

DROP TABLE IF EXISTS `tbl_contacts_remark`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_contacts_remark` (
  `id` char(32) NOT NULL,
  `note_content` varchar(255) DEFAULT NULL,
  `create_by` varchar(255) DEFAULT NULL,
  `create_time` char(19) DEFAULT NULL,
  `edit_by` varchar(255) DEFAULT NULL,
  `edit_time` char(19) DEFAULT NULL,
  `edit_flag` char(1) DEFAULT NULL,
  `contacts_id` char(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_contacts_remark`
--

LOCK TABLES `tbl_contacts_remark` WRITE;
/*!40000 ALTER TABLE `tbl_contacts_remark` DISABLE KEYS */;
INSERT INTO `tbl_contacts_remark` VALUES ('5fa969066fff4c8eb40ea60276a5ebac','333','c2dc9c884f444496996c60cde82566a8','2022-09-04 12:33:21',NULL,NULL,'0','d14316d5edaf4f25af7a24c291c55168'),('70531d43402a4ef9ac4888ddb824edf7','555','c2dc9c884f444496996c60cde82566a8','2022-09-04 12:12:01',NULL,NULL,'0','6dba108c826d4b61aeec41a9af546b67');
/*!40000 ALTER TABLE `tbl_contacts_remark` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_customer`
--

DROP TABLE IF EXISTS `tbl_customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_customer` (
  `id` char(32) NOT NULL,
  `owner` char(32) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `website` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `create_by` varchar(255) DEFAULT NULL,
  `create_time` char(19) DEFAULT NULL,
  `edit_by` varchar(255) DEFAULT NULL,
  `edit_time` char(19) DEFAULT NULL,
  `contact_summary` varchar(255) DEFAULT NULL,
  `next_contact_time` char(10) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_customer`
--

LOCK TABLES `tbl_customer` WRITE;
/*!40000 ALTER TABLE `tbl_customer` DISABLE KEYS */;
INSERT INTO `tbl_customer` VALUES ('05649b50ed434e4fba8a879adf04dda9','c2dc9c884f444496996c60cde82566a8','华仔',NULL,NULL,'c2dc9c884f444496996c60cde82566a8','2022-09-04 12:33:13',NULL,NULL,NULL,NULL,NULL,NULL),('26442dd28f1a4d2b8e2fd5dfd184aaac','c2dc9c884f444496996c60cde82566a8','上海林泉有限公司','www.lq.com','0436-1111111','c2dc9c884f444496996c60cde82566a8','2022-09-04 12:12:45',NULL,NULL,'01','2022-09-17','01','001'),('9f41d0696fb64944bc275708eb2e8abb','06f5fc056eac41558a964f96daa7f27c','test02','www.ls.com','0436-6666667','c2dc9c884f444496996c60cde82566a8','2022-09-04 12:22:38',NULL,NULL,'02','2022-09-16','02','002'),('b8ce142976694f0eaf1ead6883d22fdc','c2dc9c884f444496996c60cde82566a8','刘华强',NULL,NULL,'c2dc9c884f444496996c60cde82566a8','2022-09-04 12:30:25',NULL,NULL,NULL,NULL,NULL,NULL),('c336c600301f494983cd4de86aaf3ee7','40f6cdea0bd34aceb77492a1656d9fb3','测试01','www.zs.com','0436-6666666','c2dc9c884f444496996c60cde82566a8','2022-09-04 12:22:10',NULL,NULL,'01','2022-09-16','test01','001'),('c5094c68dfd145e492355aba44a5f7a6','c2dc9c884f444496996c60cde82566a8','小马哥','www.tencent.com','0436-6666668','c2dc9c884f444496996c60cde82566a8','2022-09-04 12:23:21',NULL,NULL,'003','2022-09-16','003','003');
/*!40000 ALTER TABLE `tbl_customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_customer_remark`
--

DROP TABLE IF EXISTS `tbl_customer_remark`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_customer_remark` (
  `id` char(32) NOT NULL,
  `note_content` varchar(255) DEFAULT NULL,
  `create_by` varchar(255) DEFAULT NULL,
  `create_time` char(19) DEFAULT NULL,
  `edit_by` varchar(255) DEFAULT NULL,
  `edit_time` char(19) DEFAULT NULL,
  `edit_flag` char(1) DEFAULT NULL,
  `customer_id` char(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_customer_remark`
--

LOCK TABLES `tbl_customer_remark` WRITE;
/*!40000 ALTER TABLE `tbl_customer_remark` DISABLE KEYS */;
INSERT INTO `tbl_customer_remark` VALUES ('7c4d5eb24c244ea9afd869ed0a1fe290','222333','c2dc9c884f444496996c60cde82566a8','2022-09-04 12:24:07',NULL,NULL,'0','c5094c68dfd145e492355aba44a5f7a6'),('93951275bf8643c8a383b3525e61f7aa','555','c2dc9c884f444496996c60cde82566a8','2022-09-04 12:12:01',NULL,NULL,'0','26442dd28f1a4d2b8e2fd5dfd184aaac');
/*!40000 ALTER TABLE `tbl_customer_remark` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_dic_type`
--

DROP TABLE IF EXISTS `tbl_dic_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_dic_type` (
  `code` varchar(255) NOT NULL COMMENT '编码是主键，不能为空，不能含有中文。',
  `name` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_dic_type`
--

LOCK TABLES `tbl_dic_type` WRITE;
/*!40000 ALTER TABLE `tbl_dic_type` DISABLE KEYS */;
INSERT INTO `tbl_dic_type` VALUES ('appellation','称呼',''),('clueState','线索状态',''),('returnPriority','回访优先级',''),('returnState','回访状态',''),('source','来源',''),('stage','阶段',''),('transactionType','交易类型','');
/*!40000 ALTER TABLE `tbl_dic_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_dic_value`
--

DROP TABLE IF EXISTS `tbl_dic_value`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_dic_value` (
  `id` char(32) NOT NULL COMMENT '主键，采用UUID',
  `value` varchar(255) DEFAULT NULL COMMENT '不能为空，并且要求同一个字典类型下字典值不能重复，具有唯一性。',
  `text` varchar(255) DEFAULT NULL COMMENT '可以为空',
  `order_no` varchar(255) DEFAULT NULL COMMENT '可以为空，但不为空的时候，要求必须是正整数',
  `type_code` varchar(255) DEFAULT NULL COMMENT '外键',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_dic_value`
--

LOCK TABLES `tbl_dic_value` WRITE;
/*!40000 ALTER TABLE `tbl_dic_value` DISABLE KEYS */;
INSERT INTO `tbl_dic_value` VALUES ('06e3cbdf10a44eca8511dddfc6896c55','虚假线索','虚假线索','4','clueState'),('0fe33840c6d84bf78df55d49b169a894','销售邮件','销售邮件','8','source'),('12302fd42bd349c1bb768b19600e6b20','交易会','交易会','11','source'),('1615f0bb3e604552a86cde9a2ad45bea','最高','最高','2','returnPriority'),('176039d2a90e4b1a81c5ab8707268636','教授','教授','5','appellation'),('1e0bd307e6ee425599327447f8387285','将来联系','将来联系','2','clueState'),('2173663b40b949ce928db92607b5fe57','丢失线索','丢失线索','5','clueState'),('2876690b7e744333b7f1867102f91153','未启动','未启动','1','returnState'),('29805c804dd94974b568cfc9017b2e4c','成交','成交','7','stage'),('310e6a49bd8a4962b3f95a1d92eb76f4','试图联系','试图联系','1','clueState'),('31539e7ed8c848fc913e1c2c93d76fd1','博士','博士','4','appellation'),('37ef211719134b009e10b7108194cf46','资质审查','资质审查','1','stage'),('391807b5324d4f16bd58c882750ee632','丢失的线索','丢失的线索','8','stage'),('3a39605d67da48f2a3ef52e19d243953','聊天','聊天','14','source'),('474ab93e2e114816abf3ffc596b19131','低','低','3','returnPriority'),('48512bfed26145d4a38d3616e2d2cf79','广告','广告','1','source'),('4d03a42898684135809d380597ed3268','合作伙伴研讨会','合作伙伴研讨会','9','source'),('59795c49896947e1ab61b7312bd0597c','先生','先生','1','appellation'),('5c6e9e10ca414bd499c07b886f86202a','高','高','1','returnPriority'),('67165c27076e4c8599f42de57850e39c','夫人','夫人','2','appellation'),('68a1b1e814d5497a999b8f1298ace62b','因竞争丢失关闭','因竞争丢失关闭','9','stage'),('6b86f215e69f4dbd8a2daa22efccf0cf','web调研','web调研','13','source'),('72f13af8f5d34134b5b3f42c5d477510','合作伙伴','合作伙伴','6','source'),('7c07db3146794c60bf975749952176df','未联系','未联系','6','clueState'),('86c56aca9eef49058145ec20d5466c17','内部研讨会','内部研讨会','10','source'),('9095bda1f9c34f098d5b92fb870eba17','进行中','进行中','3','returnState'),('954b410341e7433faa468d3c4f7cf0d2','已有业务','已有业务','1','transactionType'),('966170ead6fa481284b7d21f90364984','已联系','已联系','3','clueState'),('96b03f65dec748caa3f0b6284b19ef2f','推迟','推迟','2','returnState'),('97d1128f70294f0aac49e996ced28c8a','新业务','新业务','2','transactionType'),('9ca96290352c40688de6596596565c12','完成','完成','4','returnState'),('9e6d6e15232549af853e22e703f3e015','需要条件','需要条件','7','clueState'),('9ff57750fac04f15b10ce1bbb5bb8bab','需求分析','需求分析','2','stage'),('a70dc4b4523040c696f4421462be8b2f','等待某人','等待某人','5','returnState'),('a83e75ced129421dbf11fab1f05cf8b4','推销电话','推销电话','2','source'),('ab8472aab5de4ae9b388b2f1409441c1','常规','常规','5','returnPriority'),('ab8c2a3dc05f4e3dbc7a0405f721b040','提案/报价','提案/报价','5','stage'),('b924d911426f4bc5ae3876038bc7e0ad','web下载','web下载','12','source'),('c13ad8f9e2f74d5aa84697bb243be3bb','价值建议','价值建议','3','stage'),('c83c0be184bc40708fd7b361b6f36345','最低','最低','4','returnPriority'),('db867ea866bc44678ac20c8a4a8bfefb','员工介绍','员工介绍','3','source'),('e44be1d99158476e8e44778ed36f4355','确定决策者','确定决策者','4','stage'),('e5f383d2622b4fc0959f4fe131dafc80','女士','女士','3','appellation'),('e81577d9458f4e4192a44650a3a3692b','谈判/复审','谈判/复审','6','stage'),('fb65d7fdb9c6483db02713e6bc05dd19','在线商场','在线商场','5','source'),('fd677cc3b5d047d994e16f6ece4d3d45','公开媒介','公开媒介','7','source'),('ff802a03ccea4ded8731427055681d48','外部介绍','外部介绍','4','source');
/*!40000 ALTER TABLE `tbl_dic_value` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_tran`
--

DROP TABLE IF EXISTS `tbl_tran`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_tran` (
  `id` char(32) NOT NULL,
  `owner` char(32) DEFAULT NULL,
  `money` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `expected_date` char(10) DEFAULT NULL,
  `customer_id` char(32) DEFAULT NULL,
  `stage` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `source` varchar(255) DEFAULT NULL,
  `activity_id` char(32) DEFAULT NULL,
  `contacts_id` char(32) DEFAULT NULL,
  `create_by` varchar(255) DEFAULT NULL,
  `create_time` char(19) DEFAULT NULL,
  `edit_by` varchar(255) DEFAULT NULL,
  `edit_time` char(19) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `contact_summary` varchar(255) DEFAULT NULL,
  `next_contact_time` char(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_tran`
--

LOCK TABLES `tbl_tran` WRITE;
/*!40000 ALTER TABLE `tbl_tran` DISABLE KEYS */;
INSERT INTO `tbl_tran` VALUES ('6ee06822da424fc38c60e8e59df8c852','c2dc9c884f444496996c60cde82566a8','9999999','上海林泉有限公司-','2022-09-30','26442dd28f1a4d2b8e2fd5dfd184aaac','29805c804dd94974b568cfc9017b2e4c',NULL,NULL,'2b52047db57e45a584ed90bacd03b35f','6dba108c826d4b61aeec41a9af546b67','c2dc9c884f444496996c60cde82566a8','2022-09-04 12:12:45',NULL,NULL,NULL,NULL,NULL),('876c00e0862e428f9a87c58e99072f97','40f6cdea0bd34aceb77492a1656d9fb3','88888888','auto4090ti','2022-10-28','c5094c68dfd145e492355aba44a5f7a6','e81577d9458f4e4192a44650a3a3692b','97d1128f70294f0aac49e996ced28c8a','a83e75ced129421dbf11fab1f05cf8b4','cb8d54d8b4e046da886d5117a14cf633','d14316d5edaf4f25af7a24c291c55168','c2dc9c884f444496996c60cde82566a8','2022-09-04 12:35:43',NULL,NULL,'0001','2222','2022-09-30');
/*!40000 ALTER TABLE `tbl_tran` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_tran_history`
--

DROP TABLE IF EXISTS `tbl_tran_history`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_tran_history` (
  `id` char(32) NOT NULL,
  `stage` varchar(255) DEFAULT NULL,
  `money` varchar(255) DEFAULT NULL,
  `expected_date` char(10) DEFAULT NULL,
  `create_time` char(19) DEFAULT NULL,
  `create_by` varchar(255) DEFAULT NULL,
  `tran_id` char(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_tran_history`
--

LOCK TABLES `tbl_tran_history` WRITE;
/*!40000 ALTER TABLE `tbl_tran_history` DISABLE KEYS */;
INSERT INTO `tbl_tran_history` VALUES ('33dcc156925e48f1a03a870da8fa7936','e81577d9458f4e4192a44650a3a3692b','88888888','2022-10-28','2022-09-04 12:35:43','c2dc9c884f444496996c60cde82566a8','876c00e0862e428f9a87c58e99072f97');
/*!40000 ALTER TABLE `tbl_tran_history` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_tran_remark`
--

DROP TABLE IF EXISTS `tbl_tran_remark`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_tran_remark` (
  `id` char(32) NOT NULL,
  `note_content` varchar(255) DEFAULT NULL,
  `create_by` varchar(255) DEFAULT NULL,
  `create_time` char(19) DEFAULT NULL,
  `edit_by` varchar(255) DEFAULT NULL,
  `edit_time` char(19) DEFAULT NULL,
  `edit_flag` char(1) DEFAULT NULL,
  `tran_id` char(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_tran_remark`
--

LOCK TABLES `tbl_tran_remark` WRITE;
/*!40000 ALTER TABLE `tbl_tran_remark` DISABLE KEYS */;
INSERT INTO `tbl_tran_remark` VALUES ('d731e71306864c3aa26bcf8595a59337','555','c2dc9c884f444496996c60cde82566a8','2022-09-04 12:12:01',NULL,NULL,'0','6ee06822da424fc38c60e8e59df8c852');
/*!40000 ALTER TABLE `tbl_tran_remark` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_user`
--

DROP TABLE IF EXISTS `tbl_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_user` (
  `id` char(32) NOT NULL COMMENT 'uuid\r\n            ',
  `login_act` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `login_pwd` varchar(255) DEFAULT NULL COMMENT '密码不能采用明文存储，采用密文，MD5加密之后的数据',
  `email` varchar(255) DEFAULT NULL,
  `expire_time` char(19) DEFAULT NULL COMMENT '失效时间为空的时候表示永不失效，失效时间为2018-10-10 10:10:10，则表示在该时间之前该账户可用。',
  `lock_state` char(1) DEFAULT NULL COMMENT '锁定状态为空时表示启用，为0时表示锁定，为1时表示启用。',
  `deptno` char(4) DEFAULT NULL,
  `allow_ips` varchar(255) DEFAULT NULL COMMENT '允许访问的IP为空时表示IP地址永不受限，允许访问的IP可以是一个，也可以是多个，当多个IP地址的时候，采用半角逗号分隔。允许IP是192.168.100.2，表示该用户只能在IP地址为192.168.100.2的机器上使用。',
  `createTime` char(19) DEFAULT NULL,
  `create_by` varchar(255) DEFAULT NULL,
  `edit_time` char(19) DEFAULT NULL,
  `edit_by` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_user`
--

LOCK TABLES `tbl_user` WRITE;
/*!40000 ALTER TABLE `tbl_user` DISABLE KEYS */;
INSERT INTO `tbl_user` VALUES ('06f5fc056eac41558a964f96daa7f27c','ls','李四','yf123','ls@163.com','2040-11-27 21:50:05','1','A001','192.168.1.1,0:0:0:0:0:0:0:1','2022-11-22 12:11:40','李四',NULL,NULL),('40f6cdea0bd34aceb77492a1656d9fb3','zs','张三','yf123','zs@qq.com','2040-11-30 23:50:55','1','A001','192.168.1.1,192.168.1.2,127.0.0.1,0:0:0:0:0:0:0:1','2022-11-22 11:37:34','张三',NULL,NULL),('c2dc9c884f444496996c60cde82566a8','LQ','林泉','666','lq@qq.com','2024-09-02 21:46:50','1','A001','127.0.0.1','2022-09-02 21:46:50','林泉',NULL,NULL);
/*!40000 ALTER TABLE `tbl_user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-09-05 10:50:17
