-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 13-Abr-2018 às 03:38
-- Versão do servidor: 5.7.17
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bancoprova`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `assalariado`
--

CREATE TABLE `assalariado` (
  `id_assalariado` int(11) NOT NULL,
  `salario` decimal(7,2) NOT NULL,
  `fk_empregado` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `assalariado`
--

INSERT INTO `assalariado` (`id_assalariado`, `salario`, `fk_empregado`) VALUES
(1, '1000.00', 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `comissionado`
--

CREATE TABLE `comissionado` (
  `id_comissionado` int(11) NOT NULL,
  `totalVenda` float NOT NULL,
  `taxaComissao` float NOT NULL,
  `fk_empregado` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `comissionado`
--

INSERT INTO `comissionado` (`id_comissionado`, `totalVenda`, `taxaComissao`, `fk_empregado`) VALUES
(1, 500, 100, 0),
(2, 500, 100, 0);

-- --------------------------------------------------------

--
-- Estrutura da tabela `empregado`
--

CREATE TABLE `empregado` (
  `id_empregado` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `sobrenome` varchar(50) NOT NULL,
  `cpf` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `empregado`
--

INSERT INTO `empregado` (`id_empregado`, `nome`, `sobrenome`, `cpf`) VALUES
(1, 'gustavo', 'amorim', '44444444444');

-- --------------------------------------------------------

--
-- Estrutura da tabela `horista`
--

CREATE TABLE `horista` (
  `id_horista` int(11) NOT NULL,
  `precoHora` double NOT NULL,
  `horasTrabalhadas` double NOT NULL,
  `fk_empregado` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `horista`
--

INSERT INTO `horista` (`id_horista`, `precoHora`, `horasTrabalhadas`, `fk_empregado`) VALUES
(1, 8, 8, 1),
(2, 8, 3, 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `assalariado`
--
ALTER TABLE `assalariado`
  ADD PRIMARY KEY (`id_assalariado`),
  ADD KEY `fk_empregado` (`fk_empregado`);

--
-- Indexes for table `comissionado`
--
ALTER TABLE `comissionado`
  ADD PRIMARY KEY (`id_comissionado`),
  ADD KEY `fk_empregado` (`fk_empregado`);

--
-- Indexes for table `empregado`
--
ALTER TABLE `empregado`
  ADD PRIMARY KEY (`id_empregado`);

--
-- Indexes for table `horista`
--
ALTER TABLE `horista`
  ADD PRIMARY KEY (`id_horista`),
  ADD KEY `fk_empregado` (`fk_empregado`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `assalariado`
--
ALTER TABLE `assalariado`
  MODIFY `id_assalariado` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `comissionado`
--
ALTER TABLE `comissionado`
  MODIFY `id_comissionado` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `empregado`
--
ALTER TABLE `empregado`
  MODIFY `id_empregado` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `horista`
--
ALTER TABLE `horista`
  MODIFY `id_horista` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
