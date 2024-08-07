CREATE DATABASE bdTransito
-- Executado até aqui!
--DROP DATABASE

CREATE TABLE tbMotoristas(
	idMotorista INT PRIMARY KEY IDENTITY(1,1)
	,nomeMotorista VARCHAR(75) NOT NULL
	,dataNascimentoMotorista DATE NOT NULL
	,cpfMotorista CHAR(11) UNIQUE NOT NULL
	,cnhMotorista VARCHAR(4) NOT NULL
	,pontuacaoMotorista INT
)
CREATE TABLE tbVeiculos(
	idVeiculo INT PRIMARY KEY IDENTITY(1,1)
	,modeloVeiculo VARCHAR(55) NOT NULL
	,placaVeiculo CHAR(7) NOT NULL
	,renavamVeiculo VARCHAR(11) NOT NULL
	,anoVeiculo DATE NOT NULL
	,idMotorista INT FOREIGN KEY REFERENCES tbMotoristas(idMotorista)
)
CREATE TABLE tbMulta(
	idMulta INT PRIMARY KEY IDENTITY(1,1)
	,dataMulta DATE NOT NULL
	,horaMulta SMALLDATETIME NOT NULL
	,pontosMulta INT NOT NULL
	,idVeiculo INT FOREIGN KEY REFERENCES tbVeiculos(idVeiculo)
)

INSERT INTO tbMotoristas
	(nomeMotorista, dataNascimentoMotorista, cpfMotorista, cnhMotorista, pontuacaoMotorista)
		VALUES
		('Adriana Noqueira Silva', '11-04-1991', '12345678901', 'A', 2301)	--1
		,('Diego Moreira Castro', '11-04-1991', '12345678902', 'C', 196)		--2
		,('Plínio Salgado Marconde', '05-10-2001', '12345678903', 'C', 747)	--3

INSERT INTO tbVeiculos
	(modeloVeiculo, placaVeiculo, renavamVeiculo, anoVeiculo, idMotorista)
		VALUES
		('Coupe Mercedes-Benz Classe C', '123ABCD', '12345678901', '07-10-2014', '1')	--1
		,('SUV Porshe Macan', '321ABCD', '12345678911', '25-07-2014', '1')		--2
		,('Muscle Ford Mustang', '321HJCI', '12345620911', '13-06-2022', '1')	--3
		,('Compacto Fiat Uno', '426AXYN', '12345678933', '19-01-1983', '2')		--4
		,('Sedan Chevrolet Onix Plus', '753SDFG', '12345678977', '15-08-2006', '2')	--5
		,('Hatchback Chevrolet Chevette', '428QZLP', '18345658933', '04-09-1987', '2')	--6
		,('Desportivo Mazda RX-7', '089TJKC', '12345678909', '30-05-2002', '3')		--7
		,('Sedan Citroen C4 Lounge', '476EQUV', '21346578910', '01-03-2018', '3')		--8
		,('SUV Ford Explorer', '049TJSP', '12605678909', '25-11-2006', '3')		--9

INSERT INTO tbMulta
	(dataMulta, horaMulta, pontosMulta, idVeiculo)
		VALUES
		('08-02-2016', '08-02-2016 23:21:00', '7', '1')			--1
		,('30-04-2023', '30-04-2023 18:11:00', '7', '1')		--2
		,('03-12-2021', '03-12-2021 04:08:00', '3', '2')		--3
		,('05-05-2015', '05-05-2015 02:19:00', '4', '2')		--4
		,('19-04-2023', '19-04-2023 19:51:00', '4', '3')		--5
		,('14-05-2024', '14-05-2024 21:19:00', '3', '3')		--6
		,('11-09-2001', '11-09-2001 11:47:00', '3', '4')		--7
		,('18-08-1988', '18-08-1988 08:28:00', '7', '4')		--8
		,('01-07-2011', '01-07-2011 15:30:00', '4', '5')		--9
		,('16-06-2014', '16-06-2014 13:26:00', '3', '5')		--10
		,('22-05-1993', '22-05-1993 01:31:00', '4', '6')		--11
		,('11-09-1999', '11-09-1999 00:16:00', '4', '6')		--12
		,('20-11-2003', '20-11-2003 05:28:00', '7', '7')		--13
		,('26-10-2004', '26-10-2004 16:40:00', '7', '7')		--14
		,('04-08-2019', '04-08-2019 18:05:00', '3', '8')		--15
		,('08-12-2021', '08-12-2021 09:50:00', '3', '8')		--16
		,('31-01-2018', '31-01-2018 22:06:00', '4', '9')		--17
		,('09-12-2019', '09-12-2019 03:01:00', '7', '9')		--18

--Executado até aqui

--A)
