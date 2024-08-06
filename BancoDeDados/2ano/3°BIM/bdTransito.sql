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

INSERT INTO tbMotorista
	(nomeMotorista, dataNascimentoMotorista, cpfMotorista, cnhMotorista, pontuacaoMotorista)
		VALUES
		('Adriana Noqueira Silva', '11-04-1991', '12345678901', 'A', '2301')
		,('Diego Moreira Castro', '11-04-1991', '12345678902', 'C', '196')
		,('Plínio Salgado Marconde', '05-10-2001', '12345678903', 'C', '747')

INSERT INTO tbVeiculo
	(modeloVeiculo, placaVeiculo, renavamVeiculo, anoVeiculo, idMotorista)
		VALUES
		('Coupe Mercedes-Benz Classe C', '123ABCD', '12345678901', '07-10-2014', '1')
		,('SUV Porshe Macan', '321ABCD', '12345678911', '25-07-2014', '1')
		,('Compacto Fiat Uno', '426AXYN', '12345678933', '19-01-1983', '2')
		,('Sedan Chevrolet Onix Plus', '753SDFG', '12345678977', '15-08-2006', '2')
		,('Desportivo Mazda RX-7', '089TJKC', '12345678909', '30-05-2002', '3')
		,('Sedan Citroen C4 Lounge', '476EQUV', '21346578910', '01-03-2018', '3')
-- OBS: falta o da multa! Cuidado!
