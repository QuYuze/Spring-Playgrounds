CREATE DATABASE  IF NOT EXISTS `microTransaction_directory`;
USE `microTransaction_directory`;

DROP TABLE IF EXISTS `microTransactions`;


CREATE TABLE `microTransactions` (
  `id` int NOT NULL AUTO_INCREMENT,
  `merchandise` varchar(45) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `amount` int DEFAULT 0,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1