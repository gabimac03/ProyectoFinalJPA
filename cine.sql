-- MySQL dump 10.13  Distrib 8.0.40, for Win64 (x86_64)
--
-- Host: localhost    Database: cine
-- ------------------------------------------------------
-- Server version	8.0.40

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
-- Table structure for table `cine`
--

DROP TABLE IF EXISTS `cine`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cine` (
  `ID` int NOT NULL,
  `DIRECCION` varchar(255) DEFAULT NULL,
  `NOMBRE` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cine`
--

LOCK TABLES `cine` WRITE;
/*!40000 ALTER TABLE `cine` DISABLE KEYS */;
INSERT INTO `cine` VALUES (1,'Shopping','Cinepolis'),(2,'Palmares','Cinemark');
/*!40000 ALTER TABLE `cine` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cine_compra`
--

DROP TABLE IF EXISTS `cine_compra`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cine_compra` (
  `Cine_ID` int NOT NULL,
  `compras_ID` int NOT NULL,
  PRIMARY KEY (`Cine_ID`,`compras_ID`),
  KEY `FK_CINE_COMPRA_compras_ID` (`compras_ID`),
  CONSTRAINT `FK_CINE_COMPRA_Cine_ID` FOREIGN KEY (`Cine_ID`) REFERENCES `cine` (`ID`),
  CONSTRAINT `FK_CINE_COMPRA_compras_ID` FOREIGN KEY (`compras_ID`) REFERENCES `compra` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cine_compra`
--

LOCK TABLES `cine_compra` WRITE;
/*!40000 ALTER TABLE `cine_compra` DISABLE KEYS */;
/*!40000 ALTER TABLE `cine_compra` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cine_empleado`
--

DROP TABLE IF EXISTS `cine_empleado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cine_empleado` (
  `Cine_ID` int NOT NULL,
  `empleados_ID` int NOT NULL,
  PRIMARY KEY (`Cine_ID`,`empleados_ID`),
  KEY `FK_CINE_EMPLEADO_empleados_ID` (`empleados_ID`),
  CONSTRAINT `FK_CINE_EMPLEADO_Cine_ID` FOREIGN KEY (`Cine_ID`) REFERENCES `cine` (`ID`),
  CONSTRAINT `FK_CINE_EMPLEADO_empleados_ID` FOREIGN KEY (`empleados_ID`) REFERENCES `empleado` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cine_empleado`
--

LOCK TABLES `cine_empleado` WRITE;
/*!40000 ALTER TABLE `cine_empleado` DISABLE KEYS */;
/*!40000 ALTER TABLE `cine_empleado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cine_pelicula`
--

DROP TABLE IF EXISTS `cine_pelicula`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cine_pelicula` (
  `Cine_ID` int NOT NULL,
  `peliculas_ID` int NOT NULL,
  PRIMARY KEY (`Cine_ID`,`peliculas_ID`),
  KEY `FK_CINE_PELICULA_peliculas_ID` (`peliculas_ID`),
  CONSTRAINT `FK_CINE_PELICULA_Cine_ID` FOREIGN KEY (`Cine_ID`) REFERENCES `cine` (`ID`),
  CONSTRAINT `FK_CINE_PELICULA_peliculas_ID` FOREIGN KEY (`peliculas_ID`) REFERENCES `pelicula` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cine_pelicula`
--

LOCK TABLES `cine_pelicula` WRITE;
/*!40000 ALTER TABLE `cine_pelicula` DISABLE KEYS */;
/*!40000 ALTER TABLE `cine_pelicula` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cine_sala`
--

DROP TABLE IF EXISTS `cine_sala`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cine_sala` (
  `Cine_ID` int NOT NULL,
  `salaVip_IDSALAVIP` int NOT NULL,
  `salas_ID` int NOT NULL,
  PRIMARY KEY (`Cine_ID`,`salaVip_IDSALAVIP`,`salas_ID`),
  KEY `FK_CINE_SALA_salas_ID` (`salas_ID`),
  CONSTRAINT `FK_CINE_SALA_Cine_ID` FOREIGN KEY (`Cine_ID`) REFERENCES `cine` (`ID`),
  CONSTRAINT `FK_CINE_SALA_salas_ID` FOREIGN KEY (`salas_ID`) REFERENCES `sala` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cine_sala`
--

LOCK TABLES `cine_sala` WRITE;
/*!40000 ALTER TABLE `cine_sala` DISABLE KEYS */;
/*!40000 ALTER TABLE `cine_sala` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cine_salavip`
--

DROP TABLE IF EXISTS `cine_salavip`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cine_salavip` (
  `Cine_ID` int NOT NULL,
  `salaVip_ID` int NOT NULL,
  PRIMARY KEY (`Cine_ID`,`salaVip_ID`),
  KEY `FK_CINE_SALAVIP_salaVip_ID` (`salaVip_ID`),
  CONSTRAINT `FK_CINE_SALAVIP_Cine_ID` FOREIGN KEY (`Cine_ID`) REFERENCES `cine` (`ID`),
  CONSTRAINT `FK_CINE_SALAVIP_salaVip_ID` FOREIGN KEY (`salaVip_ID`) REFERENCES `sala` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cine_salavip`
--

LOCK TABLES `cine_salavip` WRITE;
/*!40000 ALTER TABLE `cine_salavip` DISABLE KEYS */;
/*!40000 ALTER TABLE `cine_salavip` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cine_venta`
--

DROP TABLE IF EXISTS `cine_venta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cine_venta` (
  `Cine_ID` int NOT NULL,
  `ventas_ID` int NOT NULL,
  PRIMARY KEY (`Cine_ID`,`ventas_ID`),
  KEY `FK_CINE_VENTA_ventas_ID` (`ventas_ID`),
  CONSTRAINT `FK_CINE_VENTA_Cine_ID` FOREIGN KEY (`Cine_ID`) REFERENCES `cine` (`ID`),
  CONSTRAINT `FK_CINE_VENTA_ventas_ID` FOREIGN KEY (`ventas_ID`) REFERENCES `venta` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cine_venta`
--

LOCK TABLES `cine_venta` WRITE;
/*!40000 ALTER TABLE `cine_venta` DISABLE KEYS */;
/*!40000 ALTER TABLE `cine_venta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `ID` int NOT NULL,
  `DTYPE` varchar(31) DEFAULT NULL,
  `EMAIL` varchar(255) DEFAULT NULL,
  `NOMBRE` varchar(255) DEFAULT NULL,
  `DESCUENTO` float DEFAULT NULL,
  `IDCLIENTEVIP` int DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (2201,'Cliente','ASFASF@GMAIL.COM','ASF',NULL,NULL),(2251,'Cliente','asfas@gmail.com','asfasf',NULL,NULL),(2301,'Cliente','asfasf@gamil.com','asfasf',NULL,NULL),(2351,'Cliente','ASFA@GAMIL.COM','ASDSAF',NULL,NULL),(2401,'Cliente','ASFASF@GMAIL.COM','SAFSAF',NULL,NULL),(2451,'Cliente','ASFASF@GMAIL.COM','ASFASF',NULL,NULL),(2501,'Cliente','ASF@GMAIL.COM','ASFASF',NULL,NULL),(2551,'Cliente','asfasf@gmail.com','asfasf',NULL,NULL),(2601,'Cliente','asfasf@gmail.com','asfasf',NULL,NULL),(2651,'Cliente','asfasf@gmail.com','asfasf',NULL,NULL),(2701,'Cliente','asfas@ga.com','asf',NULL,NULL),(2751,'Cliente','asfasf@gmail.com','asfasf',NULL,NULL),(2801,'Cliente','asfsaf@gmail.com','asf',NULL,NULL),(2851,'Cliente','asfasf@gamil.com','asf',NULL,NULL),(2901,'Cliente','asfasf@gmail.com','fsaasf',NULL,NULL),(2951,'Cliente','asfasf@gma.com','asf',NULL,NULL),(3001,'Cliente','asfasf@gmail.com','asfasf',NULL,NULL),(3051,'Cliente','asfasf@gmail.com','asfasf',NULL,NULL),(3101,'Cliente','gabrielmacocco@gmail.com','Gabriel',NULL,NULL),(3151,'Cliente','asfasf@gmail.com','asfasf',NULL,NULL),(3201,'Cliente','asfasfa@gmail.com','safasf',NULL,NULL),(3251,'Cliente','asfasf@gmail.com','asfas',NULL,NULL),(3301,'Cliente','SAFASF@GMAIL.COM','SDADAS',NULL,NULL),(3351,'Cliente','ASFASF@GASF.COM','ASFASF',NULL,NULL),(3401,'Cliente','ASFASF@GMAIL.COM','SAFFSAASFA',NULL,NULL),(3451,'Cliente','gabimacocco@gmail.com','Gabriel',NULL,NULL),(3501,'Cliente','afasf@gmail.com','asfas',NULL,NULL),(3551,'Cliente','asfasf@sfasf.com','asfasf',NULL,NULL),(3601,'Cliente','JASFJASF@FASFA.COM','GASASFGSAF',NULL,NULL),(3651,'Cliente','Gabi@gmail.com','Gabriel',NULL,NULL),(3701,'Cliente','asfasf@afasf.con','afsaf',NULL,NULL),(3751,'Cliente','asfasf@adgfsa.com','asfasf',NULL,NULL),(3801,'Cliente','ASF@SAFASF.COM','ASF',NULL,NULL),(3851,'Cliente','asfasf@gaasf.com','asfasf',NULL,NULL),(3901,'Cliente','asfasf@asffas.com','afsasf',NULL,NULL),(3951,'Cliente','fasfasf@asfasf.com','fasfas',NULL,NULL),(4001,'Cliente','asfasf@asf.com','asfasf',NULL,NULL),(4051,'Cliente','asfasf@asfas.conm','asfasf',NULL,NULL),(4101,'Cliente','asfasf@asfasf.com','afasf',NULL,NULL),(4151,'Cliente','asfasf@asfasf.com','asfasf',NULL,NULL),(4201,'Cliente','sadasfasf@safas.com','asfasfa',NULL,NULL),(4251,'Cliente','asfasf@assfasfa.com','asfasf',NULL,NULL),(4301,'Cliente','asfasf@asfasf.com','sdasf',NULL,NULL),(4351,'Cliente','afsasfas@assfas.com','fsasafasfas',NULL,NULL),(4401,'Cliente','asfas@fafsa.com','asfsaf',NULL,NULL),(4451,'Cliente','asfasf@gmail.com','asfsafsa',NULL,NULL),(4501,'Cliente','gghh@gmail.com','ggghg',NULL,NULL),(4551,'Cliente','ougg@gm.com','6tygyigi',NULL,NULL),(4601,'Cliente','ffycfy@ftgftg.com','ftft',NULL,NULL);
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `compra`
--

DROP TABLE IF EXISTS `compra`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `compra` (
  `ID` int NOT NULL,
  `FECHA` date DEFAULT NULL,
  `INSUMOS` longblob,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `compra`
--

LOCK TABLES `compra` WRITE;
/*!40000 ALTER TABLE `compra` DISABLE KEYS */;
INSERT INTO `compra` VALUES (1,'2024-11-11',_binary '¨\Ì\0sr\0java.util.ArrayListxÅ\“ô\«aù\0I\0sizexp\0\0\0w\0\0\0sr\0\rModelo.Insumo#\r\‰º\⁄H\0I\0idD\0precioL\0nombret\0Ljava/lang/String;xp\0\0\0@ü@\0\0\0\0\0t\0Papasq\0~\0\0\0\0@´X\0\0\0\0\0t\0Doritosx');
/*!40000 ALTER TABLE `compra` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `compra_proovedor`
--

DROP TABLE IF EXISTS `compra_proovedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `compra_proovedor` (
  `Compra_ID` int NOT NULL,
  `proovedores_ID` int NOT NULL,
  PRIMARY KEY (`Compra_ID`,`proovedores_ID`),
  KEY `FK_COMPRA_PROOVEDOR_proovedores_ID` (`proovedores_ID`),
  CONSTRAINT `FK_COMPRA_PROOVEDOR_Compra_ID` FOREIGN KEY (`Compra_ID`) REFERENCES `compra` (`ID`),
  CONSTRAINT `FK_COMPRA_PROOVEDOR_proovedores_ID` FOREIGN KEY (`proovedores_ID`) REFERENCES `proovedor` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `compra_proovedor`
--

LOCK TABLES `compra_proovedor` WRITE;
/*!40000 ALTER TABLE `compra_proovedor` DISABLE KEYS */;
INSERT INTO `compra_proovedor` VALUES (1,1),(1,2);
/*!40000 ALTER TABLE `compra_proovedor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empleado`
--

DROP TABLE IF EXISTS `empleado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `empleado` (
  `ID` int NOT NULL,
  `DNI` int DEFAULT NULL,
  `NOMBRE` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleado`
--

LOCK TABLES `empleado` WRITE;
/*!40000 ALTER TABLE `empleado` DISABLE KEYS */;
INSERT INTO `empleado` VALUES (1,2333333,'Mario'),(2,32222,'Rodrigo');
/*!40000 ALTER TABLE `empleado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empleado_cine`
--

DROP TABLE IF EXISTS `empleado_cine`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `empleado_cine` (
  `Empleado_ID` int NOT NULL,
  `cines_ID` int NOT NULL,
  PRIMARY KEY (`Empleado_ID`,`cines_ID`),
  KEY `FK_EMPLEADO_CINE_cines_ID` (`cines_ID`),
  CONSTRAINT `FK_EMPLEADO_CINE_cines_ID` FOREIGN KEY (`cines_ID`) REFERENCES `cine` (`ID`),
  CONSTRAINT `FK_EMPLEADO_CINE_Empleado_ID` FOREIGN KEY (`Empleado_ID`) REFERENCES `empleado` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleado_cine`
--

LOCK TABLES `empleado_cine` WRITE;
/*!40000 ALTER TABLE `empleado_cine` DISABLE KEYS */;
INSERT INTO `empleado_cine` VALUES (1,1),(2,1),(1,2),(2,2);
/*!40000 ALTER TABLE `empleado_cine` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `entrada`
--

DROP TABLE IF EXISTS `entrada`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `entrada` (
  `ID` int NOT NULL,
  `ASIENTO` varchar(255) DEFAULT NULL,
  `PRECIO` double DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `entrada`
--

LOCK TABLES `entrada` WRITE;
/*!40000 ALTER TABLE `entrada` DISABLE KEYS */;
INSERT INTO `entrada` VALUES (1,'1',15000),(2,'2',15000);
/*!40000 ALTER TABLE `entrada` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `funcion`
--

DROP TABLE IF EXISTS `funcion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `funcion` (
  `ID` int NOT NULL,
  `HORARIO` varchar(255) DEFAULT NULL,
  `PELICULA_ID` int DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_FUNCION_PELICULA_ID` (`PELICULA_ID`),
  CONSTRAINT `FK_FUNCION_PELICULA_ID` FOREIGN KEY (`PELICULA_ID`) REFERENCES `pelicula` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funcion`
--

LOCK TABLES `funcion` WRITE;
/*!40000 ALTER TABLE `funcion` DISABLE KEYS */;
INSERT INTO `funcion` VALUES (1,'20:45',1),(2,'22:00',2);
/*!40000 ALTER TABLE `funcion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `funcion_entrada`
--

DROP TABLE IF EXISTS `funcion_entrada`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `funcion_entrada` (
  `Funcion_ID` int NOT NULL,
  `entradas_ID` int NOT NULL,
  PRIMARY KEY (`Funcion_ID`,`entradas_ID`),
  KEY `FK_FUNCION_ENTRADA_entradas_ID` (`entradas_ID`),
  CONSTRAINT `FK_FUNCION_ENTRADA_entradas_ID` FOREIGN KEY (`entradas_ID`) REFERENCES `entrada` (`ID`),
  CONSTRAINT `FK_FUNCION_ENTRADA_Funcion_ID` FOREIGN KEY (`Funcion_ID`) REFERENCES `funcion` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funcion_entrada`
--

LOCK TABLES `funcion_entrada` WRITE;
/*!40000 ALTER TABLE `funcion_entrada` DISABLE KEYS */;
INSERT INTO `funcion_entrada` VALUES (1,1),(2,1),(1,2),(2,2);
/*!40000 ALTER TABLE `funcion_entrada` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `insumo`
--

DROP TABLE IF EXISTS `insumo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `insumo` (
  `ID` int NOT NULL,
  `NOMBRE` varchar(255) DEFAULT NULL,
  `PRECIO` double DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `insumo`
--

LOCK TABLES `insumo` WRITE;
/*!40000 ALTER TABLE `insumo` DISABLE KEYS */;
INSERT INTO `insumo` VALUES (1,'Papa',2000),(2,'Doritos',3500);
/*!40000 ALTER TABLE `insumo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pago`
--

DROP TABLE IF EXISTS `pago`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pago` (
  `ID` int NOT NULL,
  `MONTO` double DEFAULT NULL,
  `PAGO` int DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pago`
--

LOCK TABLES `pago` WRITE;
/*!40000 ALTER TABLE `pago` DISABLE KEYS */;
INSERT INTO `pago` VALUES (1853,15000,1),(1903,15000,1),(2153,15000,NULL),(2155,15000,1),(3053,15000,1),(3103,15000,0),(3203,15000,1),(3253,15000,1),(3303,15000,1),(3353,15000,1),(3453,15000,1),(4253,15000,1),(4303,15000,0),(4353,15000,1),(4453,15000,1),(4455,15000,1),(4503,15000,0),(4553,15000,1);
/*!40000 ALTER TABLE `pago` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pelicula`
--

DROP TABLE IF EXISTS `pelicula`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pelicula` (
  `ID` int NOT NULL,
  `GENERO` varchar(255) DEFAULT NULL,
  `TITULO` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pelicula`
--

LOCK TABLES `pelicula` WRITE;
/*!40000 ALTER TABLE `pelicula` DISABLE KEYS */;
INSERT INTO `pelicula` VALUES (1,'Terror','No hables con extra√±os'),(2,'Suspenso','Fragmentado');
/*!40000 ALTER TABLE `pelicula` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proovedor`
--

DROP TABLE IF EXISTS `proovedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `proovedor` (
  `ID` int NOT NULL,
  `DIRECCION` varchar(255) DEFAULT NULL,
  `NOMBRE` varchar(255) DEFAULT NULL,
  `TELEFONO` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proovedor`
--

LOCK TABLES `proovedor` WRITE;
/*!40000 ALTER TABLE `proovedor` DISABLE KEYS */;
INSERT INTO `proovedor` VALUES (1,'Buenos Aires','Lucas','26125626262'),(2,'Catamarca','Mario','2612561222');
/*!40000 ALTER TABLE `proovedor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sala`
--

DROP TABLE IF EXISTS `sala`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sala` (
  `ID` int NOT NULL,
  `DTYPE` varchar(31) DEFAULT NULL,
  `CAPACIDAD` int DEFAULT NULL,
  `NUMERO` int DEFAULT NULL,
  `BENEFICIOS` varchar(255) DEFAULT NULL,
  `IDSALAVIP` int DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sala`
--

LOCK TABLES `sala` WRITE;
/*!40000 ALTER TABLE `sala` DISABLE KEYS */;
INSERT INTO `sala` VALUES (1,'Sala',200,1,NULL,NULL),(2,'Sala',200,2,NULL,NULL),(3,'SalaVip',300,1,NULL,NULL),(4,'SalaVip',300,2,NULL,NULL);
/*!40000 ALTER TABLE `sala` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sala_funcion`
--

DROP TABLE IF EXISTS `sala_funcion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sala_funcion` (
  `Sala_ID` int NOT NULL,
  `funciones_ID` int NOT NULL,
  PRIMARY KEY (`Sala_ID`,`funciones_ID`),
  KEY `FK_SALA_FUNCION_funciones_ID` (`funciones_ID`),
  CONSTRAINT `FK_SALA_FUNCION_funciones_ID` FOREIGN KEY (`funciones_ID`) REFERENCES `funcion` (`ID`),
  CONSTRAINT `FK_SALA_FUNCION_Sala_ID` FOREIGN KEY (`Sala_ID`) REFERENCES `sala` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sala_funcion`
--

LOCK TABLES `sala_funcion` WRITE;
/*!40000 ALTER TABLE `sala_funcion` DISABLE KEYS */;
/*!40000 ALTER TABLE `sala_funcion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `salavip`
--

DROP TABLE IF EXISTS `salavip`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `salavip` (
  `ID` int NOT NULL,
  `BENEFICIOS` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  CONSTRAINT `FK_SALAVIP_ID` FOREIGN KEY (`ID`) REFERENCES `sala` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `salavip`
--

LOCK TABLES `salavip` WRITE;
/*!40000 ALTER TABLE `salavip` DISABLE KEYS */;
INSERT INTO `salavip` VALUES (3,'Pantalla 8k'),(4,'3D');
/*!40000 ALTER TABLE `salavip` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sequence`
--

DROP TABLE IF EXISTS `sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sequence` (
  `SEQ_NAME` varchar(50) NOT NULL,
  `SEQ_COUNT` decimal(38,0) DEFAULT NULL,
  PRIMARY KEY (`SEQ_NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sequence`
--

LOCK TABLES `sequence` WRITE;
/*!40000 ALTER TABLE `sequence` DISABLE KEYS */;
INSERT INTO `sequence` VALUES ('SEQ_GEN',4650);
/*!40000 ALTER TABLE `sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `venta`
--

DROP TABLE IF EXISTS `venta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `venta` (
  `ID` int NOT NULL,
  `FECHA` date DEFAULT NULL,
  `PAGO_ID` int DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_VENTA_PAGO_ID` (`PAGO_ID`),
  CONSTRAINT `FK_VENTA_PAGO_ID` FOREIGN KEY (`PAGO_ID`) REFERENCES `pago` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `venta`
--

LOCK TABLES `venta` WRITE;
/*!40000 ALTER TABLE `venta` DISABLE KEYS */;
INSERT INTO `venta` VALUES (3052,'2024-11-26',3053),(3102,'2024-11-26',3103),(3202,'2024-11-26',3203),(3252,'2024-11-26',3253),(3302,'2024-11-26',3303),(3352,'2024-11-26',3353),(3452,'2024-11-26',3453),(4252,'2024-11-26',4253),(4302,'2024-11-26',4303),(4352,'2024-11-26',4353),(4452,'2024-11-26',4453),(4454,'2024-11-26',4455),(4502,'2024-11-27',4503),(4552,'2024-11-27',4553);
/*!40000 ALTER TABLE `venta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `venta_cliente`
--

DROP TABLE IF EXISTS `venta_cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `venta_cliente` (
  `Venta_ID` int NOT NULL,
  `clientes_ID` int NOT NULL,
  PRIMARY KEY (`Venta_ID`,`clientes_ID`),
  KEY `FK_VENTA_CLIENTE_clientes_ID` (`clientes_ID`),
  CONSTRAINT `FK_VENTA_CLIENTE_clientes_ID` FOREIGN KEY (`clientes_ID`) REFERENCES `cliente` (`ID`),
  CONSTRAINT `FK_VENTA_CLIENTE_Venta_ID` FOREIGN KEY (`Venta_ID`) REFERENCES `venta` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `venta_cliente`
--

LOCK TABLES `venta_cliente` WRITE;
/*!40000 ALTER TABLE `venta_cliente` DISABLE KEYS */;
/*!40000 ALTER TABLE `venta_cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `venta_funcion`
--

DROP TABLE IF EXISTS `venta_funcion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `venta_funcion` (
  `Venta_ID` int NOT NULL,
  `funciones_ID` int NOT NULL,
  PRIMARY KEY (`Venta_ID`,`funciones_ID`),
  KEY `FK_VENTA_FUNCION_funciones_ID` (`funciones_ID`),
  CONSTRAINT `FK_VENTA_FUNCION_funciones_ID` FOREIGN KEY (`funciones_ID`) REFERENCES `funcion` (`ID`),
  CONSTRAINT `FK_VENTA_FUNCION_Venta_ID` FOREIGN KEY (`Venta_ID`) REFERENCES `venta` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `venta_funcion`
--

LOCK TABLES `venta_funcion` WRITE;
/*!40000 ALTER TABLE `venta_funcion` DISABLE KEYS */;
/*!40000 ALTER TABLE `venta_funcion` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-11-27 11:23:50
