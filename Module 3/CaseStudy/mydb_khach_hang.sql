-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: casestudy
-- ------------------------------------------------------
-- Server version	8.0.28

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `khach_hang`
--

DROP TABLE IF EXISTS `khach_hang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `khach_hang` (
  `MA_KH` int NOT NULL,
  `MA_LOAI_KHACH` int DEFAULT NULL,
  `HO_TEN` varchar(45) DEFAULT NULL,
  `NGAY_SINH` datetime DEFAULT NULL,
  `GIOI_TINH` bit(1) DEFAULT NULL,
  `SO_CMND` varchar(45) DEFAULT NULL,
  `SO_DIEN_THOAI` varchar(45) DEFAULT NULL,
  `EMAIL` varchar(45) DEFAULT NULL,
  `DIA_CHI` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`MA_KH`),
  KEY `fk_khach_hang_Loai_khach1_idx` (`MA_LOAI_KHACH`),
  CONSTRAINT `fk_khach_hang_Loai_khach1` FOREIGN KEY (`MA_LOAI_KHACH`) REFERENCES `loai_khach` (`MA_LK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `khach_hang`
--

LOCK TABLES `khach_hang` WRITE;
/*!40000 ALTER TABLE `khach_hang` DISABLE KEYS */;
INSERT INTO `khach_hang` VALUES (1,5,'Nguyễn Thị Hào','1970-11-07 00:00:00',_binary '\0','643431213','0945423362','thihao07@gmail.com','23 Nguyễn Hoàng, Đà Nẵng'),(2,3,'Phạm Xuân Diệu','1992-08-08 00:00:00',_binary '','865342123','0954333333','xuandieu92@gmail.com','K77/22 Thái Phiên, Quảng Trị'),(3,1,'Trương Đình Nghệ','1990-02-27 00:00:00',_binary '','488645199','0373213122','nghenhan2702@gmail.com','K323/12 Ông Ích Khiêm, Vinh'),(4,1,'Dương Văn Quan','1981-07-08 00:00:00',_binary '','543432111','0490039241','duongquan@gmail.com','K453/12 Lê Lợi, Đà Nẵng'),(5,4,'Hoàng Trần Nhi Nhi','1995-12-09 00:00:00',_binary '\0','795453345','0312345678','nhinhi123@gmail.com','224 Lý Thái Tổ, Gia Lai'),(6,4,'Tôn Nữ Mộc Châu','2005-12-06 00:00:00',_binary '\0','732434215','0988888844','tonnuchau@gmail.com','37 Yên Thế, Đà Nẵng'),(7,1,'Nguyễn Mỹ Kim','1984-04-08 00:00:00',_binary '\0','856453123','0912345698','kimcuong84@gmail.com','K123/45 Lê Lợi, Hồ Chí Minh'),(8,3,'Nguyễn Thị Hào','1999-04-08 00:00:00',_binary '\0','965656433','0763212345','haohao99@gmail.com','55 Nguyễn Văn Linh, Kon Tum'),(9,1,'Trần Đại Danh','1994-07-01 00:00:00',_binary '','432341235','0643343433','danhhai99@gmail.com','24 Lý Thường Kiệt, Quảng Ngãi'),(10,2,'Nguyễn Tâm Đắc','1989-07-01 00:00:00',_binary '','344343432','0987654321','dactam@gmail.com','22 Ngô Quyền, Đà Nẵng');
/*!40000 ALTER TABLE `khach_hang` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-03-28 13:23:42
