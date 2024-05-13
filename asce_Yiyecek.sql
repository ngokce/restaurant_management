-- MySQL dump 10.13  Distrib 8.0.34, for macos13 (arm64)
--
-- Host: localhost    Database: asce
-- ------------------------------------------------------
-- Server version	8.2.0

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
-- Table structure for table `Yiyecek`
--

DROP TABLE IF EXISTS `Yiyecek`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Yiyecek` (
  `MenuID` int DEFAULT NULL,
  `YiyecekID` int NOT NULL,
  `YiyecekAd` varchar(20) DEFAULT NULL,
  `Fiyat` int DEFAULT NULL,
  `UrunID` int DEFAULT NULL,
  PRIMARY KEY (`YiyecekID`),
  KEY `MenuID` (`MenuID`),
  CONSTRAINT `yiyecek_ibfk_1` FOREIGN KEY (`MenuID`) REFERENCES `Menuler` (`MenuID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Yiyecek`
--

LOCK TABLES `Yiyecek` WRITE;
/*!40000 ALTER TABLE `Yiyecek` DISABLE KEYS */;
INSERT INTO `Yiyecek` VALUES (1,1,'Corba',40,11),(1,2,'Tavuk Izgara',125,12),(1,3,'Kofte',160,13),(1,4,'Kumpir',150,14),(1,5,'Makarna',110,15),(1,6,'Salata',60,16),(1,7,'Borek',45,17),(1,8,'Balik Tava',95,18),(1,9,'Hamburger',120,19),(1,10,'Pizza',160,110);
/*!40000 ALTER TABLE `Yiyecek` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-12-27 23:46:20
