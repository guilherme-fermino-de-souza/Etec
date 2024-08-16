CREATE DATABASE bdRecursosHumanos

CREATE TABLE tbDepartamento (
  idDepartamento INT PRIMARY KEY IDENTITY(1,1),
  nomeDepartamento VARCHAR(255)
);

CREATE TABLE tbFuncionario (
  idFuncionario INT PRIMARY KEY IDENTITY(1,1),
  nomeFuncionario VARCHAR(255),
  cpfFuncionario CHAR(11),
  sexoFuncionario CHAR(1),
  dataNascimento DATE,
  salarioFuncionario MONEY,
  idDepartamento INT FOREIGN KEY REFERENCES tbDepartamento(idDepartamento)
);

CREATE TABLE tbDependente (
  idDependente INT PRIMARY KEY IDENTITY(1,1),
  nomeDependente VARCHAR(255),
  dataNascimento DATE,
  sexoDependente CHAR(1),
  idFuncionario INT FOREIGN KEY REFERENCES tbFuncionario(idFuncionario)
);

-- INSERTS GPT -- 
-- Inserindo dados na tabela tbDepartamento
INSERT INTO tbDepartamento (nomeDepartamento) VALUES
( 'Compras'),
('Vendas'),
( 'TI'),
( 'Marketing');

-- Inserindo dados na tabela tbFuncionario
INSERT INTO tbFuncionario (nomeFuncionario, cpfFuncionario, sexoFuncionario, dataNascimento, salarioFuncionario, idDepartamento) VALUES
( 'Maria Luisa Moura', '12345678900', 'F', '1990-02-10', 3400.00, 1),
( 'Mariana Goulart', '45678909299', 'F', '1991-04-08', 2800.00, 1),
( 'Pedro Paulo Vidigal', '64587222388', 'M', '1994-05-07', 5400.00, 2),
( 'Carlos Calico', '83738232233', 'M', '1965-03-03', 8900.00, 2),
( 'Viviane Martins', '77832233399', 'F', '1976-06-06', 4300.00, 3),
( 'Analice Mendes', '83703383493', 'F', '1981-09-09', 6800.00, 3),
( 'Patricia Ishikawa', '43356609300', 'F', '1978-05-05', 4900.00, 4);

-- Inserindo dados na tabela tbDependente
INSERT INTO tbDependente ( nomeDependente, dataNascimento, sexoDependente, idFuncionario) VALUES
( 'Lucas Moura', '2015-01-10', 'M', 1),
( 'Carlos Calixto Jr', '2000-06-08', 'M', 4),
( 'Michele Costa Calodo', '2003-09-09', 'F', 4),
( 'Silvana Costa Calixto', '2006-04-04', 'F', 4),
( 'Arthur Mendes Silva', '2010-07-07', 'M', 6);

-- a) Criar uma view para exibir a quantidade de funcionários por nome de departamento + --

	CREATE VIEW vwQuant_Func AS 
		SELECT COUNT(tbFuncionario.idFuncionario) AS [Quantidade de funcionários por departamento], nomeDepartamento AS 'Departamento' FROM tbFuncionario	
		INNER JOIN tbDepartamento ON tbDepartamento.idDepartamento = tbFuncionario.idDepartamento
		GROUP BY tbDepartamento.nomeDepartamento;

--b) Usando a view anterior, exibir somente o nome do departamento que possui o menor número de funcionários + --

		SELECT Departamento AS [Departamento com menos funcionários] FROM vwQuant_Func
		WHERE [Quantidade de funcionários por departamento] = 
		(SELECT MIN([Quantidade de funcionários por departamento]) 
		FROM vwQuant_Func);
		
-- c) Criar uma view para exibir a soma dos salários por nome de departamento + --

	CREATE VIEW vwSoma_Salario	AS 
		SELECT SUM(tbFuncionario.salarioFuncionario) AS [Soma], nomeDepartamento AS [Departamento] FROM tbFuncionario	
		INNER JOIN tbDepartamento ON tbDepartamento.idDepartamento = tbFuncionario.idDepartamento
		GROUP BY tbDepartamento.nomeDepartamento

-- d) Utilizando a view do exercício anterior, mostrar somente a maior soma dentre os departamentos + --

		SELECT Soma FROM vwSoma_Salario
		WHERE [Soma] = (SELECT MAX([Soma])
		FROM vwSoma_Salario);

-- e) Criar uma view para exibir somente o nome dos funcionários e o nome dos departamentos daqueles funcionários que não possuem dependentes + --

	CREATE VIEW vwFunc_NoDepen AS
		SELECT tbFuncionario.nomeFuncionario AS 'Funcionário', nomeDepartamento AS 'Departamento' FROM tbFuncionario
		INNER JOIN tbDepartamento ON tbDepartamento.idDepartamento = tbFuncionario.idDepartamento
		LEFT JOIN tbDependente ON tbFuncionario.idFuncionario = tbDependente.idFuncionario
		WHERE tbDependente.idFuncionario IS NULL;
	
-- f) Criar uma view que exiba a quantidade de dependentes por nome de funcionário  + --

	CREATE VIEW vwFunc_Depen AS
		SELECT COUNT (idDependente) AS [Dependentes], (tbFuncionario.nomeFuncionario) AS [Funcionario] FROM tbFuncionario
		INNER JOIN tbDependente ON tbFuncionario.idFuncionario = tbDependente.idFuncionario
		GROUP BY nomeFuncionario

-- g) Utilizando a view anterior, mostrar somente o nome do funcionário que possui mais dependentes + --

		SELECT Funcionario FROM vwFunc_Depen
		WHERE Dependentes = 
		(SELECT MAX(Dependentes) 
		FROM vwFunc_Depen);

-- h) Criar uma view para exibir a quantidade de dependentes por departamento + --

	CREATE VIEW vwDepar_Depen AS
		SELECT COUNT(idDependente) AS [Dependentes], (tbDepartamento.nomeDepartamento) AS [Departamento] FROM tbDependente
		INNER JOIN tbFuncionario ON tbDependente.idFuncionario = tbFuncionario.idfuncionario
		INNER JOIN tbDepartamento ON tbFuncionario.idDepartamento = tbDepartamento.idDepartamento
		GROUP BY nomeDepartamento

-- i) Utilizando a view do exercícios anterior, apresentar a soma geral dos dependente + --

		SELECT COUNT(Dependentes) FROM vwDepar_Depen
