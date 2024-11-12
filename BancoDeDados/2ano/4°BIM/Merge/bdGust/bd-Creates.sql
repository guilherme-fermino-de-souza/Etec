CREATE DATABASE bdLojaUni

-- DROP DATABASE bdLojaUni		PRIMEIRA TABELA:
  CREATE TABLE tbProduto(
  idProduto INT
  , nomeProduto VARCHAR(36)
  , valorProduto MONEY
  , qtddeProduto INT
)

-- SEGUNDA TABELA:
CREATE TABLE tbProdutoVenda(
  codProduto INT
  , descricaoProduto VARCHAR(50)
  , precoProduto MONEY
  , quantidadeProduto INT
)

-- TERCEIRA TABELA:
CREATE TABLE tbProdutos(
	idProduto INT
	, nomeProduto VARCHAR(60)
	, valorProduto MONEY
	, quantidadeProduto INT
)
