DROP DATABASE `sistemarevenda`;
CREATE DATABASE `sistemarevenda`;
USE `sistemarevenda`;
-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: sistemarevenda
-- ------------------------------------------------------
-- Server version	8.0.33

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS cliente;
/*!40101 SET @saved_cs_client = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE cliente (
  id_cliente int NOT NULL,
  PRIMARY KEY (id_cliente)
) 
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

INSERT INTO cliente VALUES (1);
INSERT INTO cliente VALUES (2);
INSERT INTO cliente VALUES (3);

--
-- Table structure for table `despesa`
--

DROP TABLE IF EXISTS despesa;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE despesa (
  id_despesa int NOT NULL AUTO_INCREMENT,
  data_despesa date DEFAULT NULL,
  nome_despesa varchar(50) DEFAULT NULL,
  responsavel varchar(30) DEFAULT NULL,
  valor_despesa float DEFAULT NULL,
  id_revenda int DEFAULT NULL,
  PRIMARY KEY (id_despesa),
  KEY FKejpb3rtwi6fd3nhws999vua1c (id_revenda)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `despesa`
--

INSERT INTO despesa VALUES (1,'2023-03-05','Troca de oléo','Junin ',200,1);

--
-- Table structure for table `fornecedor`
--

DROP TABLE IF EXISTS fornecedor;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE fornecedor (
  id_fornecedor int NOT NULL,
  PRIMARY KEY (id_fornecedor)
) 
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fornecedor`
--

INSERT INTO fornecedor VALUES (4);
INSERT INTO fornecedor VALUES (5);
INSERT INTO fornecedor VALUES (6);

--
-- Table structure for table `marca`
--

DROP TABLE IF EXISTS marca;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE marca (
  id_marca int NOT NULL AUTO_INCREMENT,
  nome_marca varchar(15) DEFAULT NULL,
  PRIMARY KEY (id_marca)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `marca`
--

INSERT INTO marca VALUES (1,'Fiat');
INSERT INTO marca VALUES (2,'Volkswagen');
INSERT INTO marca VALUES (3,'Ford');
INSERT INTO marca VALUES (4,'Chevrolet');
INSERT INTO marca VALUES (5,'Toyota');
INSERT INTO marca VALUES (6,'Honda');

--
-- Table structure for table `modelo`
--

DROP TABLE IF EXISTS modelo;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE modelo (
  id_modelo int NOT NULL AUTO_INCREMENT,
  nome_modelo varchar(20) DEFAULT NULL,
  id_marca int DEFAULT NULL,
  PRIMARY KEY (id_modelo),
  KEY FKjvx22k5gwe3iiwgltmjgvepab (id_marca)
) ENGINE=MyISAM AUTO_INCREMENT=31 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `modelo`
--

INSERT INTO modelo VALUES (1,'Uno',1);
INSERT INTO modelo VALUES (2,'Palio',1);
INSERT INTO modelo VALUES (3,'Punto',1);
INSERT INTO modelo VALUES (4,'Siena',1);
INSERT INTO modelo VALUES (5,'Strada',1);
INSERT INTO modelo VALUES (6,'Gol',2);
INSERT INTO modelo VALUES (7,'Fox',2);
INSERT INTO modelo VALUES (8,'Polo',2);
INSERT INTO modelo VALUES (9,'Jetta',2);
INSERT INTO modelo VALUES (10,'Tiguan',2);
INSERT INTO modelo VALUES (11,'Fiesta',3);
INSERT INTO modelo VALUES (12,'Focus',3);
INSERT INTO modelo VALUES (13,'Ka',3);
INSERT INTO modelo VALUES (14,'Ranger',3);
INSERT INTO modelo VALUES (15,'EcoSport',3);
INSERT INTO modelo VALUES (16,'Onix',4);
INSERT INTO modelo VALUES (17,'Prisma',4);
INSERT INTO modelo VALUES (18,'Cruze',4);
INSERT INTO modelo VALUES (19,'Spin',4);
INSERT INTO modelo VALUES (20,'S10',4);
INSERT INTO modelo VALUES (21,'Corolla',5);
INSERT INTO modelo VALUES (22,'Etios',5);
INSERT INTO modelo VALUES (23,'Hilux',5);
INSERT INTO modelo VALUES (24,'Camry',5);
INSERT INTO modelo VALUES (25,'RAV4',5);
INSERT INTO modelo VALUES (26,'Civic',6);
INSERT INTO modelo VALUES (27,'City',6);
INSERT INTO modelo VALUES (28,'Fit',6);
INSERT INTO modelo VALUES (29,'HR-V',6);
INSERT INTO modelo VALUES (30,'CR-V',6);

--
-- Table structure for table `relacaocomercial`
--

DROP TABLE IF EXISTS relacaocomercial;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE relacaocomercial (
  id_cli_forn int NOT NULL AUTO_INCREMENT,
  cidade_cli_forn varchar(20) DEFAULT NULL,
  nome_cli_forn varchar(50) DEFAULT NULL,
  telefone_cli_forn varchar(20) DEFAULT NULL,
  PRIMARY KEY (id_cli_forn)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `relacaocomercial`
--

INSERT INTO relacaocomercial VALUES (1,'Vitória','Lucas Silva','(27) 98765-4321');
INSERT INTO relacaocomercial VALUES (2,'Vila Velha','Maria Santos','(27) 91234-5678');
INSERT INTO relacaocomercial VALUES (3,'Cariacica','João Costa','(27) 94567-8901');
INSERT INTO relacaocomercial VALUES (4,'Serra','Ana Ferreira','(27) 92345-6789');
INSERT INTO relacaocomercial VALUES (5,'Guarapari','Pedro Almeida','(27) 95678-0123');
INSERT INTO relacaocomercial VALUES (6,'Linhares','Carolina Souza','(27) 93456-7812');

--
-- Table structure for table `revenda`
--

DROP TABLE IF EXISTS revenda;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE revenda (
  id_revenda int NOT NULL AUTO_INCREMENT,
  cor varchar(15) DEFAULT NULL,
  data_compra date DEFAULT NULL,
  data_venda date DEFAULT NULL,
  placa varchar(8) DEFAULT NULL,
  quilometragem int DEFAULT NULL,
  valor_compra float(10,2) DEFAULT NULL,
  valor_venda float(10,2) DEFAULT NULL,
  id_cliente int DEFAULT NULL,
  id_fornecedor int DEFAULT NULL,
  id_veiculo int DEFAULT NULL,
  PRIMARY KEY (id_revenda),
  KEY FKjbei19cm2xlqi5tvsj7jkmxaw (id_cliente),
  KEY FK9rqsgdf3t9y47fldbigbw99ic (id_fornecedor),
  KEY FKf7c973qmap3plvc9ypgsswo6g (id_veiculo)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `revenda`
--

INSERT INTO revenda VALUES (1,'Branco','2023-03-02','2023-03-20','ABC-1234',100000,15000.00,19000.00,1,4,8);

--
-- Table structure for table `veiculo`
--

DROP TABLE IF EXISTS veiculo;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE veiculo (
  id_veiculo int NOT NULL AUTO_INCREMENT,
  airbag bit(1) DEFAULT NULL,
  alarme bit(1) DEFAULT NULL,
  ano int DEFAULT NULL,
  ar_condicionado bit(1) DEFAULT NULL,
  cambio varchar(20) DEFAULT NULL,
  combustivel varchar(20) DEFAULT NULL,
  direcao varchar(20) DEFAULT NULL,
  freios_abs bit(1) DEFAULT NULL,
  motor float(5,2) DEFAULT NULL,
  trava_eletrica bit(1) DEFAULT NULL,
  vidro_eletrico bit(1) DEFAULT NULL,
  id_versao int DEFAULT NULL,
  PRIMARY KEY (id_veiculo),
  KEY FK87vrg2iuehhg3n4qddiv6f8td (id_versao)
) ENGINE=MyISAM AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `veiculo`
--

INSERT INTO veiculo VALUES (2,_binary '',_binary '',2008,_binary '\0','Manual','Flex','Hidráulica',_binary '\0',1.20,_binary '',_binary '\0',1);
INSERT INTO veiculo VALUES (3,_binary '',_binary '',2015,_binary '','Automático','Flex','Elétrica',_binary '',1.40,_binary '',_binary '',2);
INSERT INTO veiculo VALUES (4,_binary '',_binary '\0',2012,_binary '','Manual','Gasolina','Hidráulica',_binary '\0',1.20,_binary '\0',_binary '',2);
INSERT INTO veiculo VALUES (5,_binary '',_binary '',2018,_binary '','Automático','Flex','Elétrica',_binary '',1.60,_binary '',_binary '',3);
INSERT INTO veiculo VALUES (6,_binary '',_binary '',2016,_binary '','Manual','Flex','Elétrica',_binary '',1.40,_binary '',_binary '',3);
INSERT INTO veiculo VALUES (7,_binary '',_binary '',2016,_binary '','Manual','Álcool','Hidráulica',_binary '',1.60,_binary '\0',_binary '',16);
INSERT INTO veiculo VALUES (8,_binary '\0',_binary '\0',2010,_binary '','Manual','Gasolina','Mecânica',_binary '',1.00,_binary '\0',_binary '\0',1);
INSERT INTO veiculo VALUES (9,_binary '\0',_binary '',2011,_binary '\0','Manual','Flex','Mecânica',_binary '',1.00,_binary '\0',_binary '\0',4);

--
-- Table structure for table `versao`
--

DROP TABLE IF EXISTS versao;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE versao (
  id_versao int NOT NULL AUTO_INCREMENT,
  nome_versao varchar(30) DEFAULT NULL,
  id_modelo int DEFAULT NULL,
  PRIMARY KEY (id_versao),
  KEY FK8rxddrua8swf7llf4xc4n9an (id_modelo)
) ENGINE=MyISAM AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `versao`
--

INSERT INTO versao VALUES (1,'Mille Fire',1);
INSERT INTO versao VALUES (2,'Way',1);
INSERT INTO versao VALUES (3,'Sporting',1);
INSERT INTO versao VALUES (4,'Attractive',2);
INSERT INTO versao VALUES (5,'Essence',2);
INSERT INTO versao VALUES (6,'Adventure',2);
INSERT INTO versao VALUES (7,'Attractive',3);
INSERT INTO versao VALUES (8,'Essence',3);
INSERT INTO versao VALUES (9,'BlackMotion',3);
INSERT INTO versao VALUES (10,'EL',4);
INSERT INTO versao VALUES (11,'Attractive',4);
INSERT INTO versao VALUES (12,'Tetrafuel',4);
INSERT INTO versao VALUES (13,'Working',5);
INSERT INTO versao VALUES (14,'Adventure',5);
INSERT INTO versao VALUES (15,'Trekking',5);
INSERT INTO versao VALUES (16,'ComfortLine',6);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed
