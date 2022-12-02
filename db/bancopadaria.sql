-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 22-Nov-2022 às 14:38
-- Versão do servidor: 10.4.22-MariaDB
-- versão do PHP: 8.0.13

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
-- Estrutura da tabela `tbl_cliente`
--

CREATE TABLE `tbl_cliente` (
  `id_cliente` int(11) NOT NULL,
  `cli_nome` varchar(300) NOT NULL,
  `cli_cpf` varchar(14) NOT NULL,
  `cli_nasc` varchar(10) NOT NULL,
  `cli_celular` varchar(15) NOT NULL,
  `cli_cep` varchar(100) DEFAULT NULL,
  `cli_rua` varchar(350) DEFAULT NULL,
  `cli_numero` int(100) DEFAULT NULL,
  `cli_bairro` varchar(300) DEFAULT NULL,
  `cli_cidade` varchar(200) DEFAULT NULL,
  `cli_estado` set('AC','AL','AP','AM','BA','CA','DF','ES','GO','MA','MT','MS','MG','PA','PB','PR','PE','PI','RJ','RN','RS','RO','RR','SC','SP','SE','TO') DEFAULT NULL,
  `cli_debito` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `tbl_cliente`
--

INSERT INTO `tbl_cliente` (`id_cliente`, `cli_nome`, `cli_cpf`, `cli_nasc`, `cli_celular`, `cli_cep`, `cli_rua`, `cli_numero`, `cli_bairro`, `cli_cidade`, `cli_estado`, `cli_debito`) VALUES
(2, 'Nicolas  da Silva', '999.999.999-99', '99/99/9999', '(99) 99999-9999', '99.999-999', 'rua', 12, 'bairro', 'cidade', 'TO', 0),
(3, 'Ana Vitoria Souza', '111.111.111-11', '22/22/2222', '(21) 11111-1111', '22.222-222', 'Rua3', 3, 'Bairro 3', 'Cidade 3', 'RO', 0),
(19, 'Werner', '333.333.333-33', '33/33/3333', '(33) 33333-3333', '33.333-333', 'Rua19', 3, 'rr', 'rr', 'RJ', 0),
(20, 'Vitoria Maria', '545.457.879-79', '11/11/1991', '(79) 73544-7779', '54.689-835', 'Rua2', 45, 'Bairro2', 'Cidade3', 'MS', 0),
(23, 'Joao da Silva', '222.222.222-22', '22/22/2222', '(22) 22222-2222', '22.222-222', 'Rua 2', 2, 'Bairro2', 'Cidade2', 'AL', 0),
(25, 'Paulo da Silva', '555.555.555-55', '99/99/9999', '(99) 99999-9999', '99.999-999', 'Rua9', 9, 'Bairro9', 'Cidade9', 'AP', 0);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbl_compra`
--

CREATE TABLE `tbl_compra` (
  `id_compra` int(11) NOT NULL,
  `compra_data` date NOT NULL,
  `fk_fornecedor` int(11) NOT NULL,
  `fk_produto` int(11) NOT NULL,
  `compra_preco` double NOT NULL,
  `compra_preco_venda` double NOT NULL,
  `compra_valor_total` double NOT NULL,
  `compra_validade` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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
  `forn_estado` set('AC','AL','AP','AM','BA','CA','DF','ES','GO','MA','MT','MS','MG','PA','PB','PR','PE','PI','RJ','RN','RS','RO','RR','SC','SP','SE','TO') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `tbl_fornecedor`
--

INSERT INTO `tbl_fornecedor` (`id_fornecedor`, `forn_nome`, `forn_cnpj`, `forn_celular`, `forn_cep`, `forn_rua`, `forn_numero`, `forn_bairro`, `forn_cidade`, `forn_estado`) VALUES
(21, 'coca', '111.111.111-11', '(11) 11111-1111', '11.111-111', '2ee', 1, 'e', 'e', 'ES');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbl_funcionario`
--

CREATE TABLE `tbl_funcionario` (
  `id_funcionario` int(11) NOT NULL,
  `fun_nome` varchar(150) NOT NULL,
  `fun_cpf` varchar(14) NOT NULL,
  `fun_rg` varchar(20) NOT NULL,
  `fun_nascimento` varchar(10) DEFAULT NULL,
  `fun_celular` varchar(15) NOT NULL,
  `fun_cargo` varchar(200) NOT NULL,
  `fun_data_entrada` varchar(10) NOT NULL,
  `fun_data_saida` varchar(10) DEFAULT NULL,
  `fun_cep` varchar(100) NOT NULL,
  `fun_rua` varchar(350) NOT NULL,
  `fun_numero` int(11) NOT NULL,
  `fun_bairro` varchar(300) NOT NULL,
  `fun_cidade` varchar(100) NOT NULL,
  `fun_estado` set('AC','AL','AP','AM','BA','CA','DF','ES','GO','MA','MT','MS','MG','PA','PB','PR','PE','PI','RJ','RN','RS','RO','RR','SC','SP','SE','TO') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `tbl_funcionario`
--

INSERT INTO `tbl_funcionario` (`id_funcionario`, `fun_nome`, `fun_cpf`, `fun_rg`, `fun_nascimento`, `fun_celular`, `fun_cargo`, `fun_data_entrada`, `fun_data_saida`, `fun_cep`, `fun_rua`, `fun_numero`, `fun_bairro`, `fun_cidade`, `fun_estado`) VALUES
(1, 'Flavio dos Santos', '111.111.111-11', '11.111.111-1', '11/11/1111', '(11)11111-1111', 'Gerente', '02/02/2022', NULL, '1111-111', 'Rua 1', 1, 'Bairro 1', 'Cidade 1', ''),
(2, 'Carolina de Lima', '222.222.222-22', '22.222.222-2', '11/11/1111', '(11) 11111-1111', 'Gerente', '02/02/2022', '  /  /    ', '22.222-222', 'rua', 2, 'cidade', 'bairro', 'RR'),
(3, 'Complexa Javal da Silva', '333.333.333-33', '33.333.333-3', '11/11/1111', '(11) 11111-1111', 'Gerente', '02/02/2022', '  /  /    ', '22.222-222', 'rua', 2, 'bairro', 'cidade', 'RR');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbl_produto`
--

CREATE TABLE `tbl_produto` (
  `id_produto` int(11) NOT NULL,
  `pro_cod_barra` int(50) NOT NULL,
  `pro_nome` varchar(100) NOT NULL,
  `pro_estoque` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `tbl_produto`
--

INSERT INTO `tbl_produto` (`id_produto`, `pro_cod_barra`, `pro_nome`, `pro_estoque`) VALUES
(2, 2, 'PAO DOCE', 30),
(3, 11, 'LEITE DESNATADO', 5),
(4, 12, 'LEITE INTEGRAL', 10),
(5, 35, 'COCA COLA 2L', 3),
(6, 36, 'FANTA LARANJA 2L', 0),
(7, 37, 'FANTA UVA 1L', 1),
(57, 38, 'COCA COLA 600ML', 6),
(85, 123, 'Cafe', NULL);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbl_usuario`
--

CREATE TABLE `tbl_usuario` (
  `id_usuario` int(11) NOT NULL,
  `fk_funcionario` int(11) NOT NULL,
  `usu_login` varchar(100) NOT NULL,
  `usu_senha` varchar(20) NOT NULL,
  `usu_perfil` set('"Adm"','"Caixa"','"Escritório"') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `tbl_usuario`
--

INSERT INTO `tbl_usuario` (`id_usuario`, `fk_funcionario`, `usu_login`, `usu_senha`, `usu_perfil`) VALUES
(1, 1, 'admin', 'admin', '');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbl_vendas`
--

CREATE TABLE `tbl_vendas` (
  `id_vendas` int(11) NOT NULL,
  `venda_data` date NOT NULL,
  `fk_cliente` int(11) NOT NULL,
  `fk_produto` int(11) NOT NULL,
  `fk_compra` int(11) NOT NULL,
  `venda_qnt` int(11) NOT NULL,
  `venda_valor` double NOT NULL,
  `venda_desconto` double NOT NULL,
  `venda_total` double NOT NULL,
  `fk_funcionario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `tbl_cliente`
--
ALTER TABLE `tbl_cliente`
  ADD PRIMARY KEY (`id_cliente`),
  ADD UNIQUE KEY `fk_cli_cpf` (`cli_cpf`),
  ADD KEY `id_cliente` (`id_cliente`);

--
-- Índices para tabela `tbl_compra`
--
ALTER TABLE `tbl_compra`
  ADD PRIMARY KEY (`id_compra`),
  ADD KEY `id_compra` (`id_compra`),
  ADD KEY `fk_fornecedor` (`fk_fornecedor`),
  ADD KEY `fk_produto` (`fk_produto`);

--
-- Índices para tabela `tbl_fornecedor`
--
ALTER TABLE `tbl_fornecedor`
  ADD PRIMARY KEY (`id_fornecedor`),
  ADD UNIQUE KEY `fk_forn_cnpj` (`forn_cnpj`) USING BTREE,
  ADD KEY `id_fornecedor` (`id_fornecedor`);

--
-- Índices para tabela `tbl_funcionario`
--
ALTER TABLE `tbl_funcionario`
  ADD PRIMARY KEY (`id_funcionario`),
  ADD UNIQUE KEY `fk_fun_cpf` (`fun_cpf`),
  ADD UNIQUE KEY `fk_fun_rg` (`fun_rg`),
  ADD KEY `id_funcionario` (`id_funcionario`);

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
  ADD KEY `id_usuario` (`id_usuario`),
  ADD KEY `fk_funcionario` (`fk_funcionario`);

--
-- Índices para tabela `tbl_vendas`
--
ALTER TABLE `tbl_vendas`
  ADD PRIMARY KEY (`id_vendas`),
  ADD KEY `id_vendas` (`id_vendas`),
  ADD KEY `fk_vendas_cliente` (`fk_cliente`),
  ADD KEY `fk_vendas_compra` (`fk_compra`),
  ADD KEY `fk_venda_produto` (`fk_produto`),
  ADD KEY `fk_funcionario` (`fk_funcionario`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `tbl_cliente`
--
ALTER TABLE `tbl_cliente`
  MODIFY `id_cliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT de tabela `tbl_compra`
--
ALTER TABLE `tbl_compra`
  MODIFY `id_compra` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de tabela `tbl_fornecedor`
--
ALTER TABLE `tbl_fornecedor`
  MODIFY `id_fornecedor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT de tabela `tbl_funcionario`
--
ALTER TABLE `tbl_funcionario`
  MODIFY `id_funcionario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de tabela `tbl_produto`
--
ALTER TABLE `tbl_produto`
  MODIFY `id_produto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=86;

--
-- AUTO_INCREMENT de tabela `tbl_usuario`
--
ALTER TABLE `tbl_usuario`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de tabela `tbl_vendas`
--
ALTER TABLE `tbl_vendas`
  MODIFY `id_vendas` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `tbl_compra`
--
ALTER TABLE `tbl_compra`
  ADD CONSTRAINT `fk_fornecedor` FOREIGN KEY (`fk_fornecedor`) REFERENCES `tbl_fornecedor` (`id_fornecedor`),
  ADD CONSTRAINT `fk_produto` FOREIGN KEY (`fk_produto`) REFERENCES `tbl_produto` (`id_produto`);

--
-- Limitadores para a tabela `tbl_usuario`
--
ALTER TABLE `tbl_usuario`
  ADD CONSTRAINT `fk_funcionario` FOREIGN KEY (`fk_funcionario`) REFERENCES `tbl_funcionario` (`id_funcionario`);

--
-- Limitadores para a tabela `tbl_vendas`
--
ALTER TABLE `tbl_vendas`
  ADD CONSTRAINT `fk_venda_produto` FOREIGN KEY (`fk_produto`) REFERENCES `tbl_produto` (`id_produto`),
  ADD CONSTRAINT `fk_vendas_cliente` FOREIGN KEY (`fk_cliente`) REFERENCES `tbl_cliente` (`id_cliente`),
  ADD CONSTRAINT `fk_vendas_compra` FOREIGN KEY (`fk_compra`) REFERENCES `tbl_compra` (`id_compra`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
