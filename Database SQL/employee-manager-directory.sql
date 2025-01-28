CREATE DATABASE  IF NOT EXISTS `employee_manager_directory`;
USE `employee_manager_directory`;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `id` int NOT NULL auto_increment,
  `name` varchar(45) DEFAULT NULL,
  `jobTitle` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `imageURL` varchar(45) DEFAULT NULL,
  `employeeCode` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `employee`
--
--

--
