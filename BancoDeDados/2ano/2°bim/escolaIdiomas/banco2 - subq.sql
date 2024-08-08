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

--A) Quantos motoristas existem no banco de dados?
	SELECT SUM(idMotorista) AS 'Quantidade de motoristas, somada a cada novo cadastrado', nomeMotorista AS 'Nome do motorista' FROM tbMotoristas
	GROUP BY nomeMotorista

--B) Quantos motoristas possuem Silva no sobrenome?
	SELECT COUNT(idMotorista) AS 'Quantidade de motoristas com o sobrenome Silva', nomeMotorista AS 'Nome do motorista' FROM tbMotoristas
		WHERE nomeMotorista LIKE '%Silva'
	GROUP BY nomeMotorista

--C) Quantos motoristas nasceram no ano 2000?
	SELECT COUNT(YEAR(dataNascimentoMotorista)) AS 'Quantidade de motoristas nascidos em 2000' FROM tbMotoristas
		WHERE YEAR(dataNascimentoMotorista) = '2000'
	GROUP BY idMotorista

--D) Quantos motoristas possuem mais de 10 pontos de pontuação acumulada?
	SELECT COUNT(pontuacaoMotorista) AS 'Quantidade de motoristas com mais de 10 em pontuação' FROM tbMotoristas
		WHERE pontuacaoMotorista > 10

--E) A somatória da pontuação de todos os motoristas.
	SELECT SUM(pontuacaoMotorista) AS 'Soma da pontuação dos motoristas' FROM tbMotoristas
		WHERE pontuacaoMotorista > 10

--F) A média da pontuação de todos os motoristas.
	SELECT AVG(pontuacaoMotorista) AS 'Pontuação média de todos os motoristas' FROM tbMotoristas

--G) Quantos veículos o motorista de código 1 possui.
	SELECT COUNT(idVeiculo) AS 'Quantidade de veículos do motorista de código 1' FROM tbVeiculos
		INNER JOIN tbMotoristas	ON tbVeiculos.idMotorista = tbMotoristas.idMotorista
		WHERE tbMotoristas.idMotorista = 1
	GROUP BY tbMotoristas.idMotorista

--H) Quantos veículos a placa começa em A?
	SELECT COUNT(idVeiculo) AS 'Quantidade de veículos cuja placa inicia em A', placaVeiculo AS 'Placa do veículo' FROM tbVeiculos
		WHERE placaVeiculo LIKE '%A%'
	GROUP BY placaVeiculo

--I) Quantos veículos foram fabricados antes de 2010?
	SELECT COUNT(YEAR(anoVeiculo)) AS 'Quantidade de veículos fabricados antes de 2010' FROM tbVeiculos
		WHERE YEAR(anoVeiculo) < '2010'

--J) A média do ano de fabricação de todos os veículos.
	SELECT AVG(YEAR(anoVeiculo)) AS 'Média do ano de fabricação de todos os veículos' FROM tbVeiculos
	
--K) A quantidade de veículos que tenha, a palavra Sedan em seu modelo.
	SELECT COUNT(idVeiculo) AS 'Quantidade de veículos que possuam a palavra Sedan em seu modelo', modeloVeiculo AS 'Modelo do veículo' FROM tbVeiculos
		WHERE modeloVeiculo LIKE '%Sedan%'
	GROUP BY modeloVeiculo

--L)  A somatória dos pontosMulta do veículo de id 02.
	SELECT SUM(pontosMulta) AS 'Soma dos pontos de multa do veículo de id 2' FROM tbMulta
		INNER JOIN tbVeiculos	ON tbMulta.idVeiculo = tbVeiculos.idVeiculo
		WHERE tbVeiculos.idVeiculo = 2
	GROUP BY tbVeiculos.idVeiculo

--M)  A média de pontosMulta entre todas as multas aplicadas.
	SELECT AVG(pontosMulta) AS 'Média dos pontos de multa aplicados' FROM tbMulta
	
--N)  A quantidade de multas aplicadas no mês de abril de 2018.
	SELECT COUNT(YEAR(dataMulta)) AS 'Quantidade de multas aplicadas em abil de 2018', idMulta AS 'Identificação da multa' FROM tbMulta
		WHERE MONTH(dataMulta) = '04' AND YEAR(dataMulta) = '2018'
	GROUP BY idMulta

--O)  A quantidade de veículos cuja placa termine com o número 1 ou 2.
	SELECT COUNT(idVeiculo) AS 'Quantidade de veículos cuja placa finda em 1 ou 2', placaVeiculo AS 'Placa do veículo' FROM tbVeiculos
		WHERE placaVeiculo LIKE '__1%' OR placaVeiculo LIKE '__2%'
	GROUP BY placaVeiculo

--P)  A quantidade de veículos cuja placa termine com o número 3 ou 4.
	SELECT COUNT(idVeiculo) AS 'Quantidade de veículos cuja placa finda em 3 ou 4', placaVeiculo AS 'Placa do veículo' FROM tbVeiculos
		WHERE placaVeiculo LIKE '__3%' OR placaVeiculo LIKE '__4%'
	GROUP BY placaVeiculo

--Q)  A quantidade de veículos cuja placa termine com o número 5 ou 6.
	SELECT COUNT(idVeiculo) AS 'Quantidade de veículos cuja placa finda em 5 ou 6', placaVeiculo AS 'Placa do veículo' FROM tbVeiculos
		WHERE placaVeiculo LIKE '__5%' OR placaVeiculo LIKE '__6%'
	GROUP BY placaVeiculo

--R)  A quantidade de veículos cuja placa termine em 7 ou 8.
	SELECT COUNT(idVeiculo) AS 'Quantidade de veículos cuja placa finda em 7 ou 8', placaVeiculo AS 'Placa do veículo' FROM tbVeiculos
		WHERE placaVeiculo LIKE '__7%' OR placaVeiculo LIKE '__8%'
	GROUP BY placaVeiculo

--S)  A quantidade de veículos cuja placa termine em 9 ou 0.
	SELECT COUNT(idVeiculo) AS 'Quantidade de veículos cuja placa finda em 9 ou 0', placaVeiculo AS 'Placa do veículo' FROM tbVeiculos
		WHERE placaVeiculo LIKE '__9%' OR placaVeiculo LIKE '__0%'
	GROUP BY placaVeiculo

--T)  A quantidade de veículos por ano de fabricação.
	SELECT COUNT(idVeiculo) AS 'Quantidade de veículos por...', YEAR(anoVeiculo) AS 'Ano de fabricação'FROM tbVeiculos
	GROUP BY anoVeiculo
	ORDER BY anoVeiculo

	-- distinct não quer funcionar u.u


--U)  A quantidade de motoristas por pontuação acumulada.
	SELECT COUNT(idMotorista) AS 'Quantidade de motoristas por...', pontuacaoMotorista AS 'Pontuação' FROM tbMotoristas
	GROUP BY pontuacaoMotorista
	ORDER BY pontuacaoMotorista

--V)  A quantidade de motoristas que ultrapassaram os 20 pontos.
	SELECT COUNT(pontuacaoMotorista) AS 'Quantidade de motoristas acima de 20 em pontuação' FROM tbMotoristas
		WHERE pontuacaoMotorista > '20'

--W)  A pontuação média dos motoristas nascidos no ano de 2000.
	SELECT AVG(idMotorista) AS 'Quantidade de motoristas à esquerda', pontuacaoMotorista AS 'Pontuação média' FROM tbMotoristas
		WHERE YEAR(dataNascimentoMotorista) = 2000
	GROUP BY pontuacaoMotorista
	ORDER BY pontuacaoMotorista

--X)  A média dos pontos das multas aplicadas em julho de 2017.
	SELECT AVG(pontosMulta) AS 'Pontuação média das multas', dataMulta 'Data da multa' FROM tbMulta
		WHERE MONTH(dataMulta) = 07 AND YEAR(dataMulta) = 2017
	GROUP BY dataMulta
	ORDER BY dataMulta
--Y)  A quantidade de veículos não podem circular na segunda-feira (placa final 1 ou 2).
	SELECT COUNT(idVeiculo) AS 'Quantidade de veículos que não podem circular na segunda-feira', placaVeiculo AS 'Placa do veículo' FROM tbVeiculos
		WHERE placaVeiculo LIKE '__1%' OR placaVeiculo LIKE '__2%'
	GROUP BY placaVeiculo


