-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Tempo de geração: 21-Mar-2023 às 19:01
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
   CREATE DATABASE farmacia;
   USE farmacia;
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `caixas`
--

DROP TABLE IF EXISTS `caixas`;
CREATE TABLE IF NOT EXISTS `caixas` (
  `idCaixas` int(11) NOT NULL AUTO_INCREMENT,
  `idCliente` int(11) NOT NULL,
  `idProduto` int(11) DEFAULT NULL,
  `dataVenda` varchar(100) NOT NULL,
  `valorTotal` double NOT NULL,
  `nomeCliente` varchar(300) NOT NULL,
  `pagamentoCaixas` varchar(30) NOT NULL,
  PRIMARY KEY (`idCaixas`),
  KEY `fk_Produto_Cliente_idx` (`idCliente`),
  KEY `fk_caixas_produto` (`idProduto`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `caixas`
--

INSERT INTO `caixas` (`idCaixas`, `idCliente`, `idProduto`, `dataVenda`, `valorTotal`, `nomeCliente`, `pagamentoCaixas`) VALUES
(1, 3, NULL, '13/02/2023', 40, 'Gustavo', 'Cartão de crédito'),
(2, 3, NULL, '13/02/2023', 240, 'Gustavo', 'Cartão de crédito');

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

DROP TABLE IF EXISTS `cliente`;
CREATE TABLE IF NOT EXISTS `cliente` (
  `idCliente` int(11) NOT NULL AUTO_INCREMENT,
  `nomeCliente` varchar(45) NOT NULL,
  `cpfCliente` varchar(45) NOT NULL,
  `cepCliente` varchar(45) NOT NULL,
  `ederecoCliente` varchar(45) NOT NULL,
  `telefoneCliente` varchar(45) NOT NULL,
  PRIMARY KEY (`idCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`idCliente`, `nomeCliente`, `cpfCliente`, `cepCliente`, `ederecoCliente`, `telefoneCliente`) VALUES
(4, 'Isa', '983.130.132_11', '3137832', 'Avenida  ', '3123213');

-- --------------------------------------------------------

--
-- Estrutura da tabela `produto`
--

DROP TABLE IF EXISTS `produto`;
CREATE TABLE IF NOT EXISTS `produto` (
  `idProduto` int(11) NOT NULL AUTO_INCREMENT,
  `nomeProduto` varchar(45) NOT NULL,
  `marcaProduto` varchar(250) NOT NULL,
  `valorProduto` double NOT NULL,
  `quantidadeProduto` int(11) NOT NULL,
  PRIMARY KEY (`idProduto`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `produto`
--

INSERT INTO `produto` (`idProduto`, `nomeProduto`, `marcaProduto`, `valorProduto`, `quantidadeProduto`) VALUES
(1, 'Alosetrona', 'LOTRONEX', 50, 100),
(2, 'Bezlotoxumabe', 'ZINPLAVA', 40, 200);

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `caixas`
--
ALTER TABLE `caixas`
  ADD CONSTRAINT `fk_caixas_produto` FOREIGN KEY (`idProduto`) REFERENCES `produto` (`idProduto`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
