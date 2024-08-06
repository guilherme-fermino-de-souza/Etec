CREATE DATABASE bdTransito
-- Executado até aqui!
--DROP DATABASE

CREATE TABLE tbMotorista(
	idMotorista INT PRIMARY KEY IDENTITY(1,1)
	,nomeMotorista VARCHAR(75) NOT NULL
	,dataNascimentoMotorista SMALLDATETIME NOT NULL
	,cpfMotorista CHAR(11) UNIQUE NOT NULL
	,cnhMotorista VARCHAR(4) UNIQUE NOT NULL
	,pontuacaoMotorista INT
)
CREATE TABLE tbVeiculo(
	idVeiculo INT PRIMARY KEY IDENTITY(1,1)
	,modeloVeiculo VARCHAR(55) NOT NULL
	,placaVeiculo CHAR(7) NOT NULL
	,renavamVeiculo VARCHAR(11) NOT NULL
	,anoVeiculo DATE NOT NULL
	,idMotorista INT FOREIGN KEY REFERENCES tbMotorista(idMotorista)
)
CREATE TABLE tbMultas(
	idMulta INT PRIMARY KEY IDENTITY(1,1)
	,dataMulta DATE NOT NULL
	,horaMulta SMALLDATETIME NOT NULL
	,pontosMulta INT NOT NULL
	,idVeiculo INT FOREIGN KEY REFERENCES tbVeiculo(idVeiculo)
)
