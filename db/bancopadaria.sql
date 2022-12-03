-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 02-Dez-2022 às 21:29
-- Versão do servidor: 10.4.25-MariaDB
-- versão do PHP: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `bancopadaria`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbl_compra`
--

CREATE TABLE `tbl_compra` (
  `id_compra` int(11) NOT NULL,
  `compra_data` datetime DEFAULT NULL,
  `fk_fornecedor` int(11) DEFAULT NULL,
  `compra_total` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbl_compra_itens`
--

CREATE TABLE `tbl_compra_itens` (
  `id_compra_itens` int(11) NOT NULL,
  `fk_compra` int(11) DEFAULT NULL,
  `fk_produto` int(11) DEFAULT NULL,
  `compra_qnt` int(11) DEFAULT NULL,
  `compra_preco` int(11) DEFAULT NULL,
  `compra_subtotal` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `tbl_compra_itens`
--

INSERT INTO `tbl_compra_itens` (`id_compra_itens`, `fk_compra`, `fk_produto`, `compra_qnt`, `compra_preco`, `compra_subtotal`) VALUES
(4, 21, 5, 10, 6, 60),
(5, 24, 2, 20, 5, 100),
(15, 73, 87, 10, 6, 60);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbl_fornecedor`
--

CREATE TABLE `tbl_fornecedor` (
  `id_fornecedor` int(11) NOT NULL,
  `forn_nome` varchar(100) NOT NULL,
  `forn_cnpj` varchar(18) NOT NULL,
  `forn_celular` varchar(100) NOT NULL,
  `forn_cep` varchar(100) DEFAULT NULL,
  `forn_rua` varchar(350) DEFAULT NULL,
  `forn_numero` int(100) DEFAULT NULL,
  `forn_bairro` varchar(100) DEFAULT NULL,
  `forn_cidade` varchar(100) DEFAULT NULL,
  `forn_estado` enum('AC','AL','AP','AM','BA','CA','DF','ES','GO','MA','MT','MS','MG','PA','PB','PR','PE','PI','RJ','RN','RS','RO','RR','SC','SP','SE','TO') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `tbl_fornecedor`
--

INSERT INTO `tbl_fornecedor` (`id_fornecedor`, `forn_nome`, `forn_cnpj`, `forn_celular`, `forn_cep`, `forn_rua`, `forn_numero`, `forn_bairro`, `forn_cidade`, `forn_estado`) VALUES
(21, 'COCA', '111.111.111-11', '(11) 11111-1111', '11.111-111', 'RUA3', 1, 'BAIRRO', 'CIDADE', 'ES'),
(23, 'PANCO', '333.333.333-33', '(11) 11111-1333', '11.111-111', 'RUA', 1, 'BAIRRO', 'CIDADE', 'MT'),
(24, 'PULLMAN', '444.444.444-44', '(11) 11111-1444', '11.111-122', 'RUA2', 1, 'BAIRRO2', 'CIDADE2', 'PE'),
(25, 'PEPSI', '392.092.302-32', '(12) 91928-1921', '12.121-212', 'RUA', 55, 'BAIRRO', 'CIDADE', 'RO'),
(26, 'ELMA CHIPS', '99.111.200/0001-12', '(12)98765-1234', '12340-000', 'RUA1', 1, 'BAIRRO1', 'CIDADE1', 'SP'),
(43, 'PEPSICO', '659.865.656-23', '(12) 13245-6441', '75.420-154', 'RU', 2, 'BAIRRO', 'CIDADE', 'SP'),
(47, 'VIGOR', '99.111.301/0001-12', '(12)98765-1234', '12340-000', 'RUA1', 1, 'BAIRRO1', 'CIDADE1', 'SP'),
(69, 'DANONE', '99.211.601/0001-12', '(12)98765-1234', '12340-000', 'RUA1', 1, 'BAIRRO1', 'CIDADE1', 'SP'),
(73, 'CATUPIRY', '99.266.601/0001-12', '(12)98765-1234', '12340-000', 'RUA1', 1, 'BAIRRO1', 'CIDADE1', 'SP');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbl_funcionario`
--

CREATE TABLE `tbl_funcionario` (
  `id_funcionario` int(11) NOT NULL,
  `fun_nome` varchar(150) NOT NULL,
  `fun_cpf` varchar(14) NOT NULL,
  `fun_rg` varchar(20) NOT NULL,
  `fun_nascimento` varchar(10) NOT NULL,
  `fun_celular` varchar(15) NOT NULL,
  `fun_cargo` varchar(200) NOT NULL,
  `fun_data_entrada` varchar(10) NOT NULL,
  `fun_cep` varchar(100) NOT NULL,
  `fun_rua` varchar(350) NOT NULL,
  `fun_numero` int(11) NOT NULL,
  `fun_bairro` varchar(300) NOT NULL,
  `fun_cidade` varchar(100) NOT NULL,
  `fun_estado` set('AC','AL','AP','AM','BA','CA','DF','ES','GO','MA','MT','MS','MG','PA','PB','PR','PE','PI','RJ','RN','RS','RO','RR','SC','SP','SE','TO') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `tbl_funcionario`
--

INSERT INTO `tbl_funcionario` (`id_funcionario`, `fun_nome`, `fun_cpf`, `fun_rg`, `fun_nascimento`, `fun_celular`, `fun_cargo`, `fun_data_entrada`, `fun_cep`, `fun_rua`, `fun_numero`, `fun_bairro`, `fun_cidade`, `fun_estado`) VALUES
(2, 'Carolina de Lima', '222.222.222-22', '22.222.222-2', '11/11/1111', '(11) 11111-1111', 'Gerente', '02/02/2022', '22.222-222', 'rua', 2, 'cidade', 'bairro', 'RR'),
(3, 'Complexa Javal da Silva', '333.333.333-33', '33.333.333-3', '11/11/1111', '(11) 11111-1111', 'Gerente', '02/02/2022', '22.222-222', 'rua', 2, 'bairro', 'cidade', 'RR'),
(7, 'Flavio Santos', '555.555.555-55', '55.555.555-5', '11/11/1111', '(11) 11111-1111', 'Gerente', '02/02/2022', '22.222-222', 'rua', 2, 'bairro', 'cidade', 'RS');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbl_produto`
--

CREATE TABLE `tbl_produto` (
  `id_produto` int(11) NOT NULL,
  `pro_cod_barra` int(50) NOT NULL,
  `pro_nome` varchar(100) NOT NULL,
  `pro_estoque` int(11) DEFAULT NULL,
  `pro_preco_venda` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `tbl_produto`
--

INSERT INTO `tbl_produto` (`id_produto`, `pro_cod_barra`, `pro_nome`, `pro_estoque`, `pro_preco_venda`) VALUES
(2, 2, 'PAO DOCE', 20, 3),
(3, 11, 'LEITE DESNATADO 1L', 3, 4),
(4, 12, 'LEITE INTEGRAL', 0, 0),
(5, 35, 'COCA COLA 2L', 10, 6),
(6, 36, 'FANTA LARANJA 2L', 0, 0),
(7, 37, 'FANTA UVA 1L', 0, 0),
(57, 38, 'COCA COLA 600ML', 0, 0),
(87, 22, 'BOLO CHOCOLATE', 0, 0);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbl_usuario`
--

CREATE TABLE `tbl_usuario` (
  `id_usuario` int(11) NOT NULL,
  `usu_login` varchar(100) NOT NULL,
  `usu_senha` varchar(20) NOT NULL,
  `usu_perfil` enum('"Adm"','"Caixa"','"Escritorio"') NOT NULL,
  `fk_funcionario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `tbl_usuario`
--

INSERT INTO `tbl_usuario` (`id_usuario`, `usu_login`, `usu_senha`, `usu_perfil`, `fk_funcionario`) VALUES
(1, 'adm', 'adm', '\"Adm\"', 7),
(2, 'caixa', 'caixa', '\"Caixa\"', 2),
(3, 'escritorio', 'escritorio', '\"Escritorio\"', 3);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbl_venda`
--

CREATE TABLE `tbl_venda` (
  `id_venda` int(11) NOT NULL,
  `data_venda` datetime DEFAULT NULL,
  `total_venda` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbl_venda_itens`
--

CREATE TABLE `tbl_venda_itens` (
  `id_venda_itens` int(11) NOT NULL,
  `fk_venda` int(11) DEFAULT NULL,
  `fk_compra` int(11) DEFAULT NULL,
  `fk_produto` int(11) DEFAULT NULL,
  `venda_qnt` int(11) DEFAULT NULL,
  `venda_subtotal` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `tbl_compra`
--
ALTER TABLE `tbl_compra`
  ADD PRIMARY KEY (`id_compra`),
  ADD KEY `fk_fornecedor` (`fk_fornecedor`);

--
-- Índices para tabela `tbl_compra_itens`
--
ALTER TABLE `tbl_compra_itens`
  ADD PRIMARY KEY (`id_compra_itens`),
  ADD KEY `fk_produto` (`fk_produto`),
  ADD KEY `fk_compra` (`fk_compra`);

--
-- Índices para tabela `tbl_fornecedor`
--
ALTER TABLE `tbl_fornecedor`
  ADD PRIMARY KEY (`id_fornecedor`),
  ADD UNIQUE KEY `fk_forn_cnpj` (`forn_cnpj`) USING BTREE;

--
-- Índices para tabela `tbl_funcionario`
--
ALTER TABLE `tbl_funcionario`
  ADD PRIMARY KEY (`id_funcionario`),
  ADD UNIQUE KEY `fk_fun_cpf` (`fun_cpf`),
  ADD UNIQUE KEY `fk_fun_rg` (`fun_rg`),
  ADD KEY `id_funcionario` (`id_funcionario`),
  ADD KEY `fun_cpf` (`fun_cpf`),
  ADD KEY `fun_nome` (`fun_nome`) USING BTREE;

--
-- Índices para tabela `tbl_produto`
--
ALTER TABLE `tbl_produto`
  ADD PRIMARY KEY (`id_produto`),
  ADD UNIQUE KEY `pro_cod_barra` (`pro_cod_barra`),
  ADD KEY `id_produto` (`id_produto`);

--
-- Índices para tabela `tbl_usuario`
--
ALTER TABLE `tbl_usuario`
  ADD PRIMARY KEY (`id_usuario`),
  ADD KEY `fk_funcionario` (`fk_funcionario`);

--
-- Índices para tabela `tbl_venda`
--
ALTER TABLE `tbl_venda`
  ADD PRIMARY KEY (`id_venda`);

--
-- Índices para tabela `tbl_venda_itens`
--
ALTER TABLE `tbl_venda_itens`
  ADD PRIMARY KEY (`id_venda_itens`),
  ADD UNIQUE KEY `id_venda_itens` (`id_venda_itens`),
  ADD KEY `id_vendas` (`id_venda_itens`),
  ADD KEY `fk_vendas_compra` (`fk_compra`),
  ADD KEY `fk_venda` (`fk_venda`),
  ADD KEY `fk_produto` (`fk_produto`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `tbl_compra_itens`
--
ALTER TABLE `tbl_compra_itens`
  MODIFY `id_compra_itens` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT de tabela `tbl_fornecedor`
--
ALTER TABLE `tbl_fornecedor`
  MODIFY `id_fornecedor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=75;

--
-- AUTO_INCREMENT de tabela `tbl_funcionario`
--
ALTER TABLE `tbl_funcionario`
  MODIFY `id_funcionario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de tabela `tbl_produto`
--
ALTER TABLE `tbl_produto`
  MODIFY `id_produto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=88;

--
-- AUTO_INCREMENT de tabela `tbl_usuario`
--
ALTER TABLE `tbl_usuario`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de tabela `tbl_venda`
--
ALTER TABLE `tbl_venda`
  MODIFY `id_venda` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `tbl_venda_itens`
--
ALTER TABLE `tbl_venda_itens`
  MODIFY `id_venda_itens` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `tbl_compra`
--
ALTER TABLE `tbl_compra`
  ADD CONSTRAINT `tbl_compra_ibfk_1` FOREIGN KEY (`fk_fornecedor`) REFERENCES `tbl_fornecedor` (`id_fornecedor`);

--
-- Limitadores para a tabela `tbl_compra_itens`
--
ALTER TABLE `tbl_compra_itens`
  ADD CONSTRAINT `tbl_compra_itens_ibfk_1` FOREIGN KEY (`fk_compra`) REFERENCES `tbl_fornecedor` (`id_fornecedor`),
  ADD CONSTRAINT `tbl_compra_itens_ibfk_2` FOREIGN KEY (`fk_produto`) REFERENCES `tbl_produto` (`id_produto`);

--
-- Limitadores para a tabela `tbl_usuario`
--
ALTER TABLE `tbl_usuario`
  ADD CONSTRAINT `tbl_usuario_ibfk_1` FOREIGN KEY (`fk_funcionario`) REFERENCES `tbl_funcionario` (`id_funcionario`);

--
-- Limitadores para a tabela `tbl_venda_itens`
--
ALTER TABLE `tbl_venda_itens`
  ADD CONSTRAINT `fk_vendas_compra` FOREIGN KEY (`fk_compra`) REFERENCES `tbl_compra_itens` (`id_compra_itens`),
  ADD CONSTRAINT `tbl_venda_itens_ibfk_1` FOREIGN KEY (`fk_produto`) REFERENCES `tbl_produto` (`id_produto`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
