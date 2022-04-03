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
-- Table structure for table `hop_dong_chi_tiet`
--

DROP TABLE IF EXISTS `hop_dong_chi_tiet`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hop_dong_chi_tiet` (
  `MA_HOP_DONG_CHI_TIET` int NOT NULL,
  `MA_HOP_DONG` int DEFAULT NULL,
  `MA_DICH_VU_DK` int DEFAULT NULL,
  `SO_LUONG` int DEFAULT NULL,
  PRIMARY KEY (`MA_HOP_DONG_CHI_TIET`),
  KEY `fk_hop_dong_chi_tiet_hop_dong1_idx` (`MA_HOP_DONG`),
  KEY `fk_hop_dong_chi_tiet_dich_vu_di_kem1_idx` (`MA_DICH_VU_DK`),
  CONSTRAINT `fk_hop_dong_chi_tiet_dich_vu_di_kem1` FOREIGN KEY (`MA_DICH_VU_DK`) REFERENCES `dich_vu_di_kem` (`ma_dv_dk`),
  CONSTRAINT `fk_hop_dong_chi_tiet_hop_dong1` FOREIGN KEY (`MA_HOP_DONG`) REFERENCES `hop_dong` (`MA_HD`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hop_dong_chi_tiet`
--

LOCK TABLES `hop_dong_chi_tiet` WRITE;
/*!40000 ALTER TABLE `hop_dong_chi_tiet` DISABLE KEYS */;
INSERT INTO `hop_dong_chi_tiet` VALUES (1,2,4,5),(2,2,5,8),(3,2,6,15),(4,3,1,1),(5,3,2,11),(6,1,3,1),(7,1,2,2),(8,12,2,2);
/*!40000 ALTER TABLE `hop_dong_chi_tiet` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-03-28 13:23:43
