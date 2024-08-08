CREATE DATABASE bdEscolaIdiomas

CREATE TABLE tbCurso(
	idCurso INT PRIMARY KEY IDENTITY(1,1)
	, nomeCurso VARCHAR(45) NOT NULL
	, cargaHorariaCurso INT NOT NULL
	, valorCurso MONEY NOT NULL
)

CREATE TABLE tbAluno(
	idAluno INT PRIMARY KEY IDENTITY(1,1)
	, nomeAluno VARCHAR(75) NOT NULL
	, dataNasciAluno SMALLDATETIME NOT NULL
	, rgAluno VARCHAR(14) NOT NULL
	, naturalidadeAluno VARCHAR(20) NOT NULL
)
CREATE TABLE tbTurma(
	idTurma INT PRIMARY KEY IDENTITY(1,1)
	, nomeTurma VARCHAR(20) NOT NULL
	, horarioTurma DATETIME NOT NULL
	, idCurso INT FOREIGN KEY REFERENCES tbCurso(idCurso)
)

CREATE TABLE tbMatricula(
	idMatricula INT PRIMARY KEY IDENTITY(1,1)
	, dataMatricula DATETIME NOT NULL
	, idAluno INT FOREIGN KEY REFERENCES tbAluno(idAluno)
	, idTurma INT FOREIGN KEY REFERENCES tbTurma(idTurma)
)

INSERT INTO tbAluno
  (nomeAluno, dataNasciAluno, rgAluno, naturalidadeAluno)
    VALUES
	 ('Paulo Santos', '2000-03-10', 822821220, 'SP')
	 ,('Maria da Gloria', '1999-10-03', 822821220, 'SP')
	 ,('Pedro Noqueira da Silva', '1998-04-04', 822821220, 'SP')
	 ,('Gilsonn Barros Silva', '1995-09-09', 822821220, 'PE')
	 ,('Mariana Barbosa Santos', '2001-10-10', 822821220, 'RJ')
	 ,('Alessandro Pereira', '2003-10-11', 822821220, 'ES')
	 ,('Aline Melo', '2001-10-08', 822821220, 'RJ')

INSERT INTO tbCurso
   (nomeCurso, cargaHorariaCurso, valorCurso)
   VALUES
    ('Inglês', 2000, 356.00)
	,('Alemão', 3000, 478.00)
	,('Espanhol', 4000, 500.00)

INSERT INTO tbTurma
  (nomeTurma, horarioTurma, idCurso)
  VALUES
   ('1|A', '1900-01-01 12:00:00', 1)
   ,('1|B', '1900-01-01 18:00:00', 3)
   ,('1|C', '1900-01-01 18:00:00', 1)
   ,('1|AA', '1900-01-01 19:00:00', 2)

INSERT INTO tbMatricula
   (dataMatricula, idAluno, idTurma)
   VALUES
     ('2015-10-03', 1, 1)
	 ,('2014-05-04', 2, 1)
	 ,('2014-05-04', 2, 4)
	 ,('2012-05-03', 3, 2)
	 ,('2016-03-03', 1, 3)
	 ,('2015-05-07', 4, 2)
	 ,('2015-07-05', 4, 3)

	 -- FEITO

--1) Crie uma visão "precoBaixo" que exiba o código, nome do curso, carga horária e o valor do curso de todos os cursos que tenham o preço inferior ao preço médio
	--CREATE VIEW
	SELECT idCurso 'Identificação', nomeCurso 'Curso', cargaHorariaCurso 'Duração', valorCurso 'Valor do curso, abaixo do custo médio'  FROM tbCurso
		WHERE valorCurso < 444
--2) Usando a visão "precoBaixo", mostre todos os cursos ordenados por carga horária.
	--CREATE VIEW


--3) Crie uma visão "alunosTurma", que exiba o curso e a quantidade de alunos por turma. 
	--CREATE VIEW


--4) Crie uma visão "alunosTurma" exiba a turma com maior número de alunos.
	--CREATE VIEW


--5) Crie uma visão "turmaCurso" que exiba o curso e a quantidade de turmas.
	--CREATE VIEW


--6) Crie uma visão "turmaCurso" que exiba o curso com menor número de turmas.
