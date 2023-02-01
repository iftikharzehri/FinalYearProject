CREATE DATABASE  IF NOT EXISTS `LMS` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `LMS`;
-- MySQL dump 10.13  Distrib 8.0.29, for Linux (x86_64)
--
-- Host: localhost    Database: LMS
-- ------------------------------------------------------
-- Server version	8.0.32-0ubuntu0.22.04.2

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
-- Table structure for table `BOOK`
--

DROP TABLE IF EXISTS `BOOK`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `BOOK` (
  `BOOK_ID` int NOT NULL,
  `B_TITLE` varchar(45) NOT NULL,
  `B_AUTHOR` varchar(45) NOT NULL,
  `B_DEPT` varchar(45) NOT NULL,
  PRIMARY KEY (`BOOK_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `BOOK`
--

LOCK TABLES `BOOK` WRITE;
/*!40000 ALTER TABLE `BOOK` DISABLE KEYS */;
INSERT INTO `BOOK` VALUES (2,'Rights of labor','iftikhar ahmed','LAW'),(3,'day of justice','fazaal','LAW'),(4,'computer','zaid','CS & IT'),(5,'ecnomics','rahmdil','BBA '),(12,'desktop development','iftikhar','CS & IT'),(13,'python','nadir marri','CS & IT'),(15,'intro to psychology','muslim shafi','BBA'),(16,'dell history','shakir','CS & IT'),(18,'business math','lateef ullah khan','LAW'),(21,'mobile development','sheryar','CS & IT'),(54,'aesps fables','aesop','LAW'),(99,'history of computer','iftikhar','bba'),(100,'zehri','IFTIKHAR','CS'),(211,'bmsp','fazal','bba'),(459,'the baloch','jan mmuhammad dashti','bba'),(566,'history of computer','iftikhar','bba'),(765,'DELL HISTORY','IFTIKHAR','CS & IT'),(900,'Zar malik history','zarmalik','BBA'),(1009,'ict','jameel','CS & IT'),(3333,'my life','iftikhar','bba'),(10001,'king story','iftikhar','bba'),(12321,'fazal kareem stories','fazal karim','bba'),(112233,'laptop history','iftikhar','CS & IT'),(233121,'fzal','karim','bba');
/*!40000 ALTER TABLE `BOOK` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ISSUE_BOOK`
--

DROP TABLE IF EXISTS `ISSUE_BOOK`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ISSUE_BOOK` (
  `ISSUE_ID` int NOT NULL AUTO_INCREMENT,
  `STU_ID` int NOT NULL,
  `BOOK_ID` int NOT NULL,
  `ISSUE_DATE` datetime NOT NULL,
  `RETURN_DATE` datetime NOT NULL,
  `RETURN_STATUS` varchar(45) NOT NULL,
  PRIMARY KEY (`ISSUE_ID`),
  KEY `fk_ISSUE_BOOK_1_idx` (`STU_ID`),
  KEY `fk_ISSUE_BOOK_2_idx` (`BOOK_ID`),
  CONSTRAINT `fk_ISSUE_BOOK_1` FOREIGN KEY (`STU_ID`) REFERENCES `STUDENT` (`SID`),
  CONSTRAINT `fk_ISSUE_BOOK_2` FOREIGN KEY (`BOOK_ID`) REFERENCES `BOOK` (`BOOK_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ISSUE_BOOK`
--

LOCK TABLES `ISSUE_BOOK` WRITE;
/*!40000 ALTER TABLE `ISSUE_BOOK` DISABLE KEYS */;
INSERT INTO `ISSUE_BOOK` VALUES (1,74553581,2,'2023-01-24 12:08:17','2023-01-24 12:08:17','yes'),(2,74553581,3,'2023-01-24 12:11:45','2023-01-24 12:08:17','YES'),(3,74553581,5,'2023-01-24 21:04:45','2023-01-24 12:08:17','YES'),(4,74553581,21,'2023-01-24 21:06:33','2023-01-24 21:06:33',''),(5,74553823,1009,'2023-01-24 21:06:33','2023-01-24 21:06:33','YES'),(6,74553581,5,'2023-01-25 23:26:58','2023-02-04 23:26:58','YES'),(7,74553581,1009,'2023-01-25 23:28:28','2023-02-04 23:28:28','no'),(8,74553823,10001,'2023-01-25 23:30:28','2023-02-04 23:30:28','No'),(9,74553581,10001,'2023-01-25 23:33:02','2023-02-04 23:33:02','YES'),(10,74553421,765,'2023-01-26 00:07:45','2023-02-05 00:07:45','YES'),(11,68380829,900,'2023-01-26 19:57:44','2023-02-05 19:57:44','YES'),(12,68380829,18,'2023-01-29 20:01:49','2023-02-08 20:01:49','No'),(13,68380829,16,'2023-01-29 20:02:34','2023-02-08 20:02:34','No'),(14,68380829,15,'2023-01-29 20:03:09','2023-02-08 20:03:09','No'),(15,68380829,16,'2023-01-29 20:04:25','2023-02-08 20:04:25','No'),(16,68380829,13,'2023-01-29 20:05:23','2023-02-08 20:05:23','No'),(17,68380829,16,'2023-01-29 20:06:13','2023-02-08 20:06:13','No'),(18,74553581,15,'2023-01-30 12:31:16','2023-02-09 12:31:16','YES');
/*!40000 ALTER TABLE `ISSUE_BOOK` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `STUDENT`
--

DROP TABLE IF EXISTS `STUDENT`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `STUDENT` (
  `SID` int NOT NULL,
  `NAME` varchar(45) NOT NULL,
  `F_NAME` varchar(45) NOT NULL,
  `CONTACT` varchar(45) NOT NULL,
  `DEPT` varchar(45) NOT NULL,
  `SESSION` varchar(45) NOT NULL,
  `SEMESTER` int NOT NULL,
  PRIMARY KEY (`SID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `STUDENT`
--

LOCK TABLES `STUDENT` WRITE;
/*!40000 ALTER TABLE `STUDENT` DISABLE KEYS */;
INSERT INTO `STUDENT` VALUES (68380829,'hamid ali','barkat ali','03333267975','BBA','2020-24',4),(74337654,'peerak','imtiaz','0992234455','LAW','2021-25',5),(74550099,'ali','nawb','0334268789','CS & IT','2017/2021',8),(74553421,'KAMAL','ASHRAF','03428294160','LAW','2022-26',3),(74553581,'iftikhar','noor','098765432','CS & IT','2018-22',7),(74553823,'rehmal','haji sultan muhammad','3322295522','BBA','2020-24',4),(74556678,'ikram','abc','03418294160','LAW','2020-25',4);
/*!40000 ALTER TABLE `STUDENT` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'LMS'
--

--
-- Dumping routines for database 'LMS'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-02-01 22:28:12
