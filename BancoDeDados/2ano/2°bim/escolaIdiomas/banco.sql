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

	 -- 1 Apresentar os nomes dos alunos ao lado do curso + 
	 SELECT nomeAluno AS 'Nome Aluno', 
	 nomeCurso AS 'Curso' FROM tbAluno
	 INNER JOIN tbMatricula ON tbAluno.idAluno = tbMatricula.idAluno
	 INNER JOIN tbTurma ON tbMatricula.idTurma = tbTurma.idTurma
	 INNER JOIN tbCurso ON tbTurma.idCurso = tbCurso.idCurso


	 -- 2 Apresentar a quantidade de alunos matriculados por curso +

	 SELECT nomeCurso AS 'Curso',
	 COUNT (idAluno) AS 'Quantidade Alunos' FROM tbMatricula
	 INNER JOIN tbTurma ON tbMatricula.idTurma = tbTurma.idTurma
	 INNER JOIN tbCurso ON tbTurma.idCurso = tbCurso.idCurso
	  GROUP BY nomeCurso

	 -- 3 Apresentar a quantidade de alunos matriculados por turma +

	 SELECT nomeTurma AS 'Turma',
	 COUNT (idAluno) AS 'Quantidade Alunos' FROM tbMatricula
	 INNER JOIN tbTurma ON tbMatricula.idTurma = tbTurma.idTurma
	 GROUP BY nomeTurma

	 -- 4 Apresentar a quantidade de alunos que se matricularam em maio de 2016 +?

	 SELECT COUNT (tbAluno.idAluno) AS 'Quantidade Alunos' FROM tbMatricula
	 INNER JOIN tbAluno ON tbAluno.idAluno = tbMatricula.idAluno
	 WHERE MONTH(dataMatricula) = 5 AND YEAR(dataMatricula) = 2016
	 GROUP BY tbAluno.idAluno

	 -- 5 Apresentar o nome dos alunos em ordem alfabética ao lado do nome das turmas e os nomes dos cursos em que estão matriculados +

	 SELECT nomeAluno AS 'Nome Aluno',
	 nomeTurma AS 'Turma',
	 nomeCurso AS 'Curso' FROM tbAluno
	 INNER JOIN tbMatricula ON tbAluno.idAluno = tbMatricula.idAluno
	 INNER JOIN tbTurma ON tbMatricula.idTurma = tbTurma.idTurma
	 INNER JOIN tbCurso ON tbTurma.idCurso = tbCurso.idCurso
	 ORDER BY nomeAluno

	 -- 6 Apresentar o nome dos cursos e os horários em que eles são oferecidos +

	 SELECT nomeCurso AS 'Curso',
	 horarioTurma AS 'Horário' FROM tbCurso
	 INNER JOIN tbTurma ON tbCurso.idCurso = tbTurma.idCurso

	 -- 7 Apresentar a quantidade de alunos nascidos por estado que estejam matriculados no curso de inglês +

	  SELECT COUNT (nomeAluno) AS 'Quantidade de Alunos',
	  naturalidadeAluno AS 'Estado', (tbTurma.idCurso) AS 'Curso de Inglês' FROM tbAluno
	  INNER JOIN tbMatricula ON tbAluno.idAluno = tbMatricula.idAluno
	  INNER JOIN tbTurma ON tbMatricula.idTurma = tbTurma.idTurma
	  WHERE (tbTurma.idCurso) = 1
	  GROUP BY tbTurma.idCurso, naturalidadeAluno

	 -- 8 Apresentar o nome dos alunos ao lado da data de matrícula no formato dd/mm/aaaa +

	 SELECT nomeAluno AS 'Aluno',
	 FORMAT (dataMatricula, 'dd-MM-yyyy') AS 'Data Matrícula' FROM tbAluno
	 INNER JOIN tbMatricula ON tbAluno.idAluno = tbMatricula.idAluno
	 ORDER BY nomeAluno
	 
	 -- 9 Apresentar os alunos cujo nome comece com A e que estejam matriculados no curso de inglês +?

	  SELECT nomeAluno AS 'Aluno' FROM tbAluno
	  INNER JOIN tbMatricula ON tbAluno.idAluno = tbMatricula.idAluno
	  INNER JOIN tbTurma ON tbMatricula.idTurma = tbTurma.idTurma
	  WHERE idCurso = 1 AND nomeAluno = 'A%'
	 


	 -- 10 Apresentar a quantidade de matriculas feitas no ano de ano 2016 +?

	 SELECT COUNT (tbAluno.idAluno) AS 'Números Matrículas' FROM tbMatricula
	 INNER JOIN tbAluno ON tbAluno.idAluno = tbMatricula.idAluno
	 WHERE YEAR(dataMatricula) = 2016

	 -- 11 Apresentar a quantidade de matriculas por nome do curso +

	 SELECT idMatricula AS 'Quantidade Matrículas Curso', 
	 nomeCurso AS 'Curso' FROM tbMatricula
	 INNER JOIN tbTurma ON tbMatricula.idTurma = tbTurma.idTurma
	 INNER JOIN tbCurso ON tbTurma.idCurso = tbCurso.idCurso

	 -- 12 Apresentar a quantidade de alunos que fazem os cursos que cursos que custam mais de R$ 300,00 +

	 SELECT COUNT (tbAluno.idAluno) AS 'Quantidade Alunos' FROM tbAluno
	 INNER JOIN tbMatricula ON tbAluno.idAluno = tbMatricula.idAluno
	 INNER JOIN tbTurma ON tbMatricula.idTurma = tbTurma.idTurma
	 INNER JOIN tbCurso ON tbTurma.idCurso = tbCurso.idCurso
	 WHERE valorCurso > 300

	 -- 13 Apresentar os nomes dos alunos que fazem o curso de alemão +

	 SELECT nomeAluno AS 'Aluno' FROM tbAluno
	 INNER JOIN tbMatricula ON tbAluno.idAluno = tbMatricula.idAluno
	 INNER JOIN tbTurma ON tbMatricula.idTurma = tbTurma.idTurma
	 INNER JOIN tbCurso ON tbTurma.idCurso = tbCurso.idCurso
	 WHERE tbCurso.idCurso = 2
