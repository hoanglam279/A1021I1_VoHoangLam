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
-- Table structure for table `dich_vu`
--

DROP TABLE IF EXISTS `dich_vu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dich_vu` (
  `MA_DV` int NOT NULL,
  `TEN_DV` varchar(45) DEFAULT NULL,
  `DIEN_TICH` int DEFAULT NULL,
  `CHI_PHI_THUE` double DEFAULT NULL,
  `SO_NG_TOI_DA` int DEFAULT NULL,
  `MA_KIEU_THUE` int DEFAULT NULL,
  `MA_LOAI_DV` int DEFAULT NULL,
  `TIEU_CHUAN_PHONG` varchar(45) DEFAULT NULL,
  `MO_TA_TNK` varchar(45) DEFAULT NULL,
  `DIEN_TICH_HB` double DEFAULT NULL,
  `SO_TANG` int DEFAULT NULL,
  PRIMARY KEY (`MA_DV`),
  KEY `fk_dich_vu_kieu_thue1_idx` (`MA_KIEU_THUE`),
  KEY `fk_dich_vu_loai_dich_vu1_idx` (`MA_LOAI_DV`),
  CONSTRAINT `fk_dich_vu_kieu_thue1` FOREIGN KEY (`MA_KIEU_THUE`) REFERENCES `kieu_thue` (`MA_KT`),
  CONSTRAINT `fk_dich_vu_loai_dich_vu1` FOREIGN KEY (`MA_LOAI_DV`) REFERENCES `loai_dich_vu` (`MA_LDV`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dich_vu`
--

LOCK TABLES `dich_vu` WRITE;
/*!40000 ALTER TABLE `dich_vu` DISABLE KEYS */;
INSERT INTO `dich_vu` VALUES (1,'Villa Beach Front',25000,10000000,10,3,1,'vip','Có ho boi',500,4),(2,'House Princess 01',14000,5000000,7,2,2,'vip','Có thêm bep nuong',NULL,3),(3,'Room Twin 01',5000,1000000,2,4,3,'normal','Có tivi',NULL,NULL),(4,'Villa No Beach Front',22000,9000000,8,3,1,'normal','Có ho boi',300,3),(5,'House Princess 02',10000,4000000,5,3,2,'normal','Có thêm bep nuong',NULL,2),(6,'Room Twin 02',3000,900000,2,4,3,'normal','Có tivi',NULL,NULL);
/*!40000 ALTER TABLE `dich_vu` ENABLE KEYS */;
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
