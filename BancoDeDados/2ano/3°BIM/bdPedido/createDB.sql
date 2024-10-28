CREATE DATABASE bdPedido


CREATE TABLE	tbCliente(
	idCliente INT PRIMARY KEY IDENTITY(1,1)
   ,nomeCliente VARCHAR (40)
   ,cpfCliente CHAR (11) NOT NULL
   ,ruaCliente VARCHAR(55)
   ,numCasaCliente VARCHAR(5)
   ,bairroCliente VARCHAR(20)
   ,cidadeCliente VARCHAR(25)
   ,estadoCliente VARCHAR(20)
   ,cepCliente CHAR(8)
   ,sexoCliente CHAR (1)
   ,dataNasCliente SMALLDATETIME 
)

CREATE TABLE	tbEncomenda(
	idEncomenda INT PRIMARY KEY IDENTITY(1,1)
   ,dataEncomenda SMALLDATETIME 
   ,valorTotalEncomenda MONEY NOT NULL
   ,dataEntregaEncomenda SMALLDATETIME 
   ,idCliente INT FOREIGN KEY REFERENCES tbCliente(idCliente)
)

CREATE TABLE	tbCategoriaProduto(
	idCategoriaProduto INT PRIMARY KEY IDENTITY(1,1)
	,nomeCategoriaProduto VARCHAR(25)
)

CREATE TABLE	tbProduto(
	idProduto INT PRIMARY KEY IDENTITY(1,1)
	,nomeProduto VARCHAR (35)
	,precoQuiloProduto MONEY
	,idCategoriaProduto INT FOREIGN KEY REFERENCES tbCategoriaProduto(idCategoriaProduto)
)

CREATE TABLE	tbItensEncomenda(
	idItensEncomenda INT PRIMARY KEY IDENTITY(1,1)
	,quantidadeQuilos FLOAT
	,subTotal MONEY
	,idEncomenda INT FOREIGN KEY REFERENCES tbEncomenda(idEncomenda)
	,idProduto INT FOREIGN KEY REFERENCES tbProduto(idProduto)

)
