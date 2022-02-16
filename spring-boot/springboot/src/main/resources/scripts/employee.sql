CREATE DATABASE  IF NOT EXISTS `employee_directory`;
USE `employee_directory`;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `age` int DEFAULT NULL,
  `occupation` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `employee`
--

INSERT INTO `employee` VALUES 
	(1,'Leslie','Andrews', 23, 'developer', 'leslie@luv2code.com'),
    (6,'Marcio','Mafideju', 39, 'developer', 'mafideju@outlook.com'),
	(2,'Emma','Baumgarten', 33, 'analyst', 'emma@luv2code.com'),
	(3,'Avani','Gupta', 63, 'developer', 'avani@luv2code.com'),
	(4,'Yuri','Petrov', 78, 'manager', 'yuri@luv2code.com'),
	(5,'Juan','Vega', 34, 'engineer', 'juan@luv2code.com');

