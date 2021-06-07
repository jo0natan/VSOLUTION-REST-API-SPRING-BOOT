

CREATE TABLE `empresas` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `moeda` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `cotacao` double NOT NULL,
  `cnpj` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `email` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `logradouro` varchar(150) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `numero` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `complemento` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `cep` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `bairro` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `cidade` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;


--
-- Dumping data for table `empresas`
--

LOCK TABLES `empresas` WRITE;
/*!40000 ALTER TABLE `empresas` DISABLE KEYS */;
INSERT INTO `empresas` VALUES (2,'teste ind e com ltda','brl real brasileiro',60,'15584135561','teste@teste.com','rua um','60','apto 1 sala 3','37410045','centro','tres coracoes'),(3,'teste ind e com ltda','brl real brasileiro',60,'15584135561','teste@teste.com','rua um','60','apto 1 sala 3','centro',NULL,'tres coracoes'),(4,'teste ind e com ltda','brl real brasileiro',60,'15584135561','teste@teste.com','rua um','60','apto 1 sala 3','centro',NULL,'tres coracoes'),(5,'teste ind e com ltda','brl real brasileiro',60,'15584135561','teste@teste.com','rua um','60','apto 1 sala 3','37410045','centro','tres coracoes');
/*!40000 ALTER TABLE `empresas` ENABLE KEYS */;
UNLOCK TABLES;

