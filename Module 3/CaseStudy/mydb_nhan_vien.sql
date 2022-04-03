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
-- Table structure for table `nhan_vien`
--

DROP TABLE IF EXISTS `nhan_vien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nhan_vien` (
  `MA_NV` int NOT NULL,
  `HO_TEN` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `NGAY_SINH` datetime DEFAULT NULL,
  `SO_CMND` varchar(20) DEFAULT NULL,
  `LUONG` double DEFAULT NULL,
  `SDT` varchar(15) DEFAULT NULL,
  `EMAIL` varchar(50) DEFAULT NULL,
  `DIA_CHI` varchar(50) DEFAULT NULL,
  `MA_VI_TRI` int DEFAULT NULL,
  `MA_BO_PHAN` int DEFAULT NULL,
  `MA_TRINH_DO` int DEFAULT NULL,
  PRIMARY KEY (`MA_NV`),
  KEY `frk_VT` (`MA_VI_TRI`),
  KEY `frk_BP` (`MA_BO_PHAN`),
  KEY `frk_TD` (`MA_TRINH_DO`),
  CONSTRAINT `frk_BP` FOREIGN KEY (`MA_BO_PHAN`) REFERENCES `bo_phan` (`MA_BP`),
  CONSTRAINT `frk_TD` FOREIGN KEY (`MA_TRINH_DO`) REFERENCES `trinh_do` (`MA_TD`),
  CONSTRAINT `frk_VT` FOREIGN KEY (`MA_VI_TRI`) REFERENCES `vi_tri` (`MA_VT`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nhan_vien`
--

LOCK TABLES `nhan_vien` WRITE;
/*!40000 ALTER TABLE `nhan_vien` DISABLE KEYS */;
INSERT INTO `nhan_vien` VALUES (1,'Nguyễn Văn An','1970-11-07 00:00:00','456231786',10000000,'0945423362','annguyen@gmail.com','295 Nguyễn Tất Thành, Đà Nẵng',1,3,1),(2,'Lê Văn Bình','1997-04-09 00:00:00','654231234',7000000,'0954333333','binhlv@gmail.com','22 Yên Bái, Đà Nẵng',1,2,2),(3,'Hồ Thị Yến','1995-12-12 00:00:00','999231723',14000000,'0373213122','thiyen@gmail.com','K234/11 Điện Biên Phủ, Gia Lai',1,3,2),(4,'Võ Công Toản','1980-04-04 00:00:00','123231365',17000000,'0490039241','toan0404@gmail.com','77 Hoàng Diệu, Quảng Trị',1,4,4),(5,'Nguyễn Bỉnh Phát','1999-12-09 00:00:00','454363232',6000000,'0312345678','phatphat@gmail.com','43 Yên Bái, Đà Nẵng',2,1,1),(6,'Khúc Nguyễn An Nghi','2000-11-08 00:00:00','964542311',7000000,'0988888844','annghi20@gmail.com','294 Nguyễn Tất Thành, Đà Nẵng',2,2,3),(7,'Nguyễn Hữu Hà','1993-01-01 00:00:00','534323231',8000000,'0912345698','nhh0101@gmail.com','4 Nguyễn Chí Thanh, Huế',2,3,2),(8,'Nguyễn Hà Đông','1989-09-03 00:00:00','234414123',9000000,'0763212345','donghanguyen@gmail.com','111 Hùng Vương, Hà Nội',2,4,4),(9,'Tòng Hoang','1982-09-03 00:00:00','256781231',6000000,'0643343433','hoangtong@gmail.com','213 Hàm Nghi, Đà Nẵng',2,4,4),(10,'Nguyễn Công Đạo','1994-01-08 00:00:00','755434343',8000000,'0987654321','nguyencongdao12@gmail.com','6 Hoà Khánh, Đồng Nai',2,3,2);
/*!40000 ALTER TABLE `nhan_vien` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-03-28 13:23:41
