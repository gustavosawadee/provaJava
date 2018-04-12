-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: 12-Abr-2018 às 18:46
-- Versão do servidor: 5.7.19
-- PHP Version: 5.6.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ativ_gustavoamorim`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `assalariado`
--

DROP TABLE IF EXISTS `assalariado`;
CREATE TABLE IF NOT EXISTS `assalariado` (
  `id_assalariado` int(11) NOT NULL AUTO_INCREMENT,
  `salario` decimal(7,2) NOT NULL,
  `fk_empregado` int(11) NOT NULL,
  PRIMARY KEY (`id_assalariado`),
  KEY `fk_empregado` (`fk_empregado`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `comissionado`
--

DROP TABLE IF EXISTS `comissionado`;
CREATE TABLE IF NOT EXISTS `comissionado` (
  `id_comissionado` int(11) NOT NULL AUTO_INCREMENT,
  `totalVenda` float NOT NULL,
  `tavaComissao` float NOT NULL,
  `fk_empregado` int(11) NOT NULL,
  PRIMARY KEY (`id_comissionado`),
  KEY `fk_empregado` (`fk_empregado`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `emrpegado`
--

DROP TABLE IF EXISTS `emrpegado`;
CREATE TABLE IF NOT EXISTS `emrpegado` (
  `id_empregado` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL,
  `sobrenome` varchar(50) NOT NULL,
  `cpf` varchar(50) NOT NULL,
  PRIMARY KEY (`id_empregado`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `horista`
--

DROP TABLE IF EXISTS `horista`;
CREATE TABLE IF NOT EXISTS `horista` (
  `id_horista` int(11) NOT NULL AUTO_INCREMENT,
  `precoHora` float NOT NULL,
  `horasTrabalhadas` float NOT NULL,
  `fk_empregado` int(11) NOT NULL,
  PRIMARY KEY (`id_horista`),
  KEY `fk_empregado` (`fk_empregado`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
