CREATE DATABASE bdEscolaIdiomasProcedures

CREATE TABLE tbCurso(
	idCurso INT PRIMARY KEY IDENTITY(1,1)
	, nomeCurso VARCHAR(45) NOT NULL
	, cargaHorariaCurso INT NOT NULL
	, valorCurso FLOAT NOT NULL
)

CREATE TABLE tbAluno(
	idAluno INT PRIMARY KEY IDENTITY(1,1)
	, nomeAluno VARCHAR(75) NOT NULL
	, dataNasciAluno SMALLDATETIME NOT NULL
  	, cpfAluno CHAR(11) NOT NULL
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
  (nomeAluno, dataNasciAluno, cpfAluno, rgAluno, naturalidadeAluno)
    VALUES
	 ('Paulo Santos', '2000-03-10', 12345678909, 822821220, 'SP')
	 ,('Maria da Gloria', '1999-10-03', 23456789098, 822821220, 'SP')
	 ,('Pedro Noqueira da Silva', '1998-04-04', 34567890987, 822821220, 'SP')
	 ,('Gilsonn Barros Silva', '1995-09-09', 45678909876, 822821220, 'PE')
	 ,('Mariana Barbosa Santos', '2001-10-10', 56789098765, 822821220, 'RJ')
	 ,('Alessandro Pereira', '2003-10-11', 67890987654, 822821220, 'ES')
	 ,('Aline Melo', '2001-10-08', 78909876543, 822821220, 'RJ')

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
