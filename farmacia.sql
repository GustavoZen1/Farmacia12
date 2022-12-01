-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Tempo de geração: 10-Out-2022 às 20:04
-- Versão do servidor: 5.5.21
-- versão do PHP: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `farmacia`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cadastro`
--

DROP TABLE IF EXISTS `cadastro`;
CREATE TABLE IF NOT EXISTS `cadastro` (
  `idCadastro` int(11) NOT NULL AUTO_INCREMENT,
  `idCliente` int(11) NOT NULL,
  `nomeCliente` varchar(45) NOT NULL,
  `cpf` varchar(45) NOT NULL,
  `cep` varchar(45) NOT NULL,
  `edereco` varchar(45) NOT NULL,
  `telefone` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idCadastro`),
  KEY `fk_Cadastro_Cliente_idx` (`idCliente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `caixas`
--

DROP TABLE IF EXISTS `caixas`;
CREATE TABLE IF NOT EXISTS `caixas` (
  `idCaixas` int(11) NOT NULL AUTO_INCREMENT,
  `idCliente` int(11) NOT NULL,
  `idProduto` int(11) NOT NULL,
  `nomeProduto` varchar(45) NOT NULL,
  `quantidade` int(11) NOT NULL,
  `dataVenda` date NOT NULL,
  `valorSub` double NOT NULL,
  `valorTotal` double NOT NULL,
  PRIMARY KEY (`idCaixas`),
  KEY `fk_Produto_Cliente_idx` (`idCliente`),
  KEY `fk_Produto_Caixas_idx` (`idProduto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

DROP TABLE IF EXISTS `cliente`;
CREATE TABLE IF NOT EXISTS `cliente` (
  `idCliente` int(11) NOT NULL AUTO_INCREMENT,
  `NomeCliente` varchar(45) NOT NULL,
  `cpf` varchar(45) NOT NULL,
  `cep` varchar(45) NOT NULL,
  `edereco` varchar(45) NOT NULL,
  `telefone` varchar(45) NOT NULL,
  PRIMARY KEY (`idCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`idCliente`, `NomeCliente`, `cpf`, `cep`, `edereco`, `telefone`) VALUES
(3, 'Gustavo', '3123213', '3123', 'José Cunha 2222', '3123213'),
(4, 'Isa Pão', '98313013', '3137832', 'Avenida  ', '3123213');

-- --------------------------------------------------------

--
-- Estrutura da tabela `estoque`
--

DROP TABLE IF EXISTS `estoque`;
CREATE TABLE IF NOT EXISTS `estoque` (
  `idEstoque` int(11) NOT NULL AUTO_INCREMENT,
  `idProduto` int(11) NOT NULL,
  `nomeProduto` varchar(45) NOT NULL,
  `quantidade` int(11) NOT NULL,
  PRIMARY KEY (`idEstoque`),
  KEY `fk_Produto_Estoque_idx` (`idProduto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `produto`
--

DROP TABLE IF EXISTS `produto`;
CREATE TABLE IF NOT EXISTS `produto` (
  `idProduto` int(11) NOT NULL AUTO_INCREMENT,
  `nomeProduto` varchar(45) NOT NULL,
  `bula` varchar(250) NOT NULL,
  `valor` double NOT NULL,
  `quantidade` int(11) NOT NULL,
  PRIMARY KEY (`idProduto`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `produto`
--

INSERT INTO `produto` (`idProduto`, `nomeProduto`, `bula`, `valor`, `quantidade`) VALUES
(1, 'Alosetrona', 'LOTRONEX', 50, 100),
(2, 'Bezlotoxumabe', 'ZINPLAVA', 40, 200);

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `cadastro`
--
ALTER TABLE `cadastro`
  ADD CONSTRAINT `fk_Cadastro_Cliente` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`idCliente`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `caixas`
--
ALTER TABLE `caixas`
  ADD CONSTRAINT `fk_Cliente_Caixas` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`idCliente`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Produto_Caixas` FOREIGN KEY (`idProduto`) REFERENCES `produto` (`idProduto`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `estoque`
--
ALTER TABLE `estoque`
  ADD CONSTRAINT `fk_Produto_Estoque` FOREIGN KEY (`idProduto`) REFERENCES `produto` (`idProduto`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
