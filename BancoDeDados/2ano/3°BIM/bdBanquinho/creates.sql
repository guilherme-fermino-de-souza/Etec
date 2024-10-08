CREATE DATABASE bdBanquinho


CREATE TABLE tbCliente(
	idCliente INT PRIMARY KEY IDENTITY(1, 1)
	,nomeCliente VARCHAR(40)
	,cpfCliente CHAR(11)
)	

CREATE TABLE tbContaCorrente(
	idNumConta INT PRIMARY KEY IDENTITY(1, 1)
	,numConta INT
	,saldoConta MONEY
	,idCliente INT FOREIGN KEY REFERENCES tbCliente(idCliente)
)	

CREATE TABLE tbDeposito(
	idDeposito INT PRIMARY KEY IDENTITY(1, 1)
	,valorDeposito MONEY
	,dataDeposito DATE
	,horaDeposito SMALLDATETIME
	,idNumConta INT FOREIGN KEY REFERENCES tbContaCorrente(idNumConta)

)	

CREATE TABLE tbSaque(
	idSaque INT PRIMARY KEY IDENTITY(1, 1)
	,valorSaque MONEY
	,dataSaque DATE
	,horaSaque SMALLDATETIME
	,idNumConta INT FOREIGN KEY REFERENCES tbContaCorrente(idNumConta)
)	
