CREATE DATABASE  IF NOT EXISTS `bvsymskw1bavdm5cftyp` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `bvsymskw1bavdm5cftyp`;
-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: bvsymskw1bavdm5cftyp-mysql.services.clever-cloud.com    Database: bvsymskw1bavdm5cftyp
-- ------------------------------------------------------
-- Server version	8.0.22-13

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
SET @MYSQLDUMP_TEMP_LOG_BIN = @@SESSION.SQL_LOG_BIN;
SET @@SESSION.SQL_LOG_BIN= 0;

--
-- GTID state at the beginning of the backup 
--

SET @@GLOBAL.GTID_PURGED=/*!80000 '+'*/ 'a05a675a-1414-11e9-9c82-cecd01b08c7e:1-491550428,
a38a16d0-767a-11eb-abe2-cecd029e558e:1-272935068';

--
-- Table structure for table `contacto`
--

DROP TABLE IF EXISTS `contacto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `contacto` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(500) DEFAULT NULL,
  `localidad` varchar(100) DEFAULT NULL,
  `new_email` varchar(100) DEFAULT NULL,
  `url_redes1` varchar(500) DEFAULT NULL,
  `url_redes2` varchar(500) DEFAULT NULL,
  `url_redes3` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contacto`
--

LOCK TABLES `contacto` WRITE;
/*!40000 ALTER TABLE `contacto` DISABLE KEYS */;
INSERT INTO `contacto` VALUES (1,'Deje su mensaje y con gusto le responderé','Mendoza, Argentina','jonibgarcia@gmail.com','https://www.linkedin.com/in/johnny-garcia-74204a262/','https://mail.google.com/mail/u/0/?pli=1#inbox','https://github.com/JohnnyGarcia8');
/*!40000 ALTER TABLE `contacto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estudios`
--

DROP TABLE IF EXISTS `estudios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estudios` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `certificados` varchar(500) DEFAULT NULL,
  `descripcion` varchar(500) DEFAULT NULL,
  `fin` varchar(50) DEFAULT NULL,
  `inicio` varchar(50) DEFAULT NULL,
  `institucion` varchar(50) DEFAULT NULL,
  `titulo_insti` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estudios`
--

LOCK TABLES `estudios` WRITE;
/*!40000 ALTER TABLE `estudios` DISABLE KEYS */;
INSERT INTO `estudios` VALUES (1,'','Escolta de la bandera del Instituto durante el ciclo lectivo 2019. Becado por mejor promedio en los ciclos lectivos 2017, 2018 y 2019.','Diciembre 2019','Enero 2015','Instituto IMEI','Bachillerato en Ciencias Naturales'),(2,NULL,'Durante la primera etapa de Argentina Programa, obtuve una introducción a la programación explorando varios lenguajes tales como: Gobstones, Ruby y JavaScript.','Junio 2022','Abril 2022','Argentina Programa','#SeProgramar'),(3,NULL,'Ultima etapa de cursado, basado en el aprendizaje de diseño de software FronEnd y BackEnd. Tecnologias y lenguajes aprendidos: Html, Css, JavaScript, Angular, Git Hub, MySql, Java, NetBeans, Spring Boot, FireBase, Render y Clever Cloud entre otras.','Mayo 2023','Octubre 2022','Argentina Programa','#YoProgramo');
/*!40000 ALTER TABLE `estudios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `experiencia`
--

DROP TABLE IF EXISTS `experiencia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `experiencia` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(500) DEFAULT NULL,
  `empresa` varchar(50) DEFAULT NULL,
  `fecha_fin` varchar(50) DEFAULT NULL,
  `fecha_inicio` varchar(50) DEFAULT NULL,
  `puesto` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `experiencia`
--

LOCK TABLES `experiencia` WRITE;
/*!40000 ALTER TABLE `experiencia` DISABLE KEYS */;
INSERT INTO `experiencia` VALUES (1,'Vendedor de productos para el hogar, sabanas, toallones, indumentaria, calzado, electrodomésticos y bazar.','Bianco','Abril 2021','Febrero 2021','Agente de ventas'),(2,'Tareas realizadas: atención al público, elaboración de bebidas y cocteles adenás de proveer cerveza tirada de barril.','Coquimbito Beer Club','Diciembre 2021','Octubre 2021','Bartender'),(3,'Tareas realizadas: administración de dinero, atención al público y manipulación de combustibles líquidos y gaseosos.','Gulf','Abril 2021','Diciembre 2021','Expendedor de combustible');
/*!40000 ALTER TABLE `experiencia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `habilidades`
--

DROP TABLE IF EXISTS `habilidades`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `habilidades` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `porcentaje` varchar(50) DEFAULT NULL,
  `tecnologia` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `habilidades`
--

LOCK TABLES `habilidades` WRITE;
/*!40000 ALTER TABLE `habilidades` DISABLE KEYS */;
INSERT INTO `habilidades` VALUES (1,'85','HMTL'),(2,'85','CSS'),(3,'85','GitHub'),(4,'30','Javascript'),(5,'65','Angular'),(6,'55','Mysql'),(7,'50','Java'),(8,'55','Spring Boot');
/*!40000 ALTER TABLE `habilidades` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `persona_perfil`
--

DROP TABLE IF EXISTS `persona_perfil`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `persona_perfil` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `cv` varchar(500) DEFAULT NULL,
  `descripcion` varchar(500) DEFAULT NULL,
  `foto_url` varchar(500) DEFAULT NULL,
  `nombre_apellido` varchar(100) DEFAULT NULL,
  `titulo_acad` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `persona_perfil`
--

LOCK TABLES `persona_perfil` WRITE;
/*!40000 ALTER TABLE `persona_perfil` DISABLE KEYS */;
INSERT INTO `persona_perfil` VALUES (1,'.assets/img/CV.pdf','Como joven programador con experiencia limitada, estoy enfocado en expandir continuamente mis conocimientos y el dominio de nuevas tecnologias. Me destaco por ser una persona dedicada y responsable en busca de un grupo de trabajo unido y dispuesto a crecer. Estoy comprometido a entregar código de alta calidad que satisfaga las necesidades de los clientes y usuarios finales por igual.','.assets/img/fototraje2.jpg','Jonathan García','Desarrolador Full Stack Jr');
/*!40000 ALTER TABLE `persona_perfil` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proyectos`
--

DROP TABLE IF EXISTS `proyectos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `proyectos` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(500) DEFAULT NULL,
  `fecha_fin` varchar(50) DEFAULT NULL,
  `fecha_inicio` varchar(50) DEFAULT NULL,
  `img_proyecto` varchar(500) DEFAULT NULL,
  `title_proyecto` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proyectos`
--

LOCK TABLES `proyectos` WRITE;
/*!40000 ALTER TABLE `proyectos` DISABLE KEYS */;
INSERT INTO `proyectos` VALUES (14,'Contiene botones funcionales que nos permiten realizar cálculos aritméticos (suma, resta, multiplicación y división) además de un botón (C) para eliminar el cálculo en curso.','Diciembre 2022','Noviembre 2022','.assets/img/Calculadora.png','Calculadora'),(17,'Este proyecto fue realizado durante la cursada de Argentina Programa como Desarrolador full stack. Creado desde cero a partir de tecnologias tales como: Html, Css, Javascript y Angular por parte de FrontEnd seguido de MySql, Java, NetBeans, Spring Boot, FireBase, Render y Clever Cloud entre otras por parte de BackEnd.','Mayo 2023','Octubre 2022','.assets/img/Img-Portfolio.png','Portfolio Web');
/*!40000 ALTER TABLE `proyectos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'bvsymskw1bavdm5cftyp'
--

--
-- Dumping routines for database 'bvsymskw1bavdm5cftyp'
--
SET @@SESSION.SQL_LOG_BIN = @MYSQLDUMP_TEMP_LOG_BIN;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-06-30 12:24:11
