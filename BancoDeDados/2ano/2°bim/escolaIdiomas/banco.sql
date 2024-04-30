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
	 ('Paulo Santos', '10-03-2000', 822821220, 'SP')
	 ,('Maria da Gloria', '03-10-1999', 822821220, 'SP')
	 ,('Pedro Noqueira da Silva', '04-04-1998', 822821220, 'SP')
	 ,('Gilsonn Barros Silva', '09-09-1995', 822821220, 'PE')
	 ,('Mariana Barbosa Santos', '10-10-2001', 822821220, 'RJ')
	 ,('Alessandro Pereira', '11-10-2003', 822821220, 'ES')
	 ,('Aline Melo', '08-10-2001', 822821220, 'RJ')

INSERT INTO tbCurso
   (nomeCurso, cargaHorariaCurso, valorCurso)
   VALUES
    ('Inglês', 2000, 356.00)
	,('Alemão', 3000, 478.00)
	,('Espanhol', 4000, 500.00)

INSERT INTO tbTurma
  (nomeTurma, horarioTurma, idCurso)
  VALUES
   ('1|A', '01-01-1900 12:00:00', 1)
   ,('1|B', '01-01-1900 18:00:00', 3)
   ,('1|C', '01-01-1900 18:00:00', 1)
   ,('1|AA', '01-01-1900 19:00:00', 2)

INSERT INTO tbMatricula
   (dataMatricula, idAluno, idTurma)
   VALUES
     ('03-10-2015', 1, 1)
	 ,('04-05-2014', 2, 1)
	 ,('04-05-2014', 2, 4)
	 ,('03-05-2012', 3, 2)
	 ,('03-03-2016', 1, 3)
	 ,('07-05-2015', 4, 2)
	 ,('05-07-2015', 4, 3)

	 -- 1 Apresentar os nomes dos alunos ao lado do curso  
	 SELECT nomeAluno AS 'Nome Aluno', 
	 nomeCurso AS 'Curso' FROM tbCurso
	 INNER JOIN tbCurso ON tbCurso.idCurso = tbTurma.idCurso
	 INNER JOIN tbTurma ON tbTurma.idCurso = tbMatricula.idTurma
	 INNER JOIN tbMatricula ON tbMatricula.idMatricula = tbAluno.idAluno
	 GROUP BY nomeAluno


	 -- 2 Apresentar a quantidade de alunos matriculados por curso

	 SELECT nomeCurso AS 'Curso',
	 COUNT (tbMatricula.idAluno) AS 'quant Alunos' FROM tbAluno
	 INNER JOIN tbMatricula ON tbMatricula.idAluno = tbAluno.idAluno
	  GROUP BY nomeCurso

	 -- 3 Apresentar a quantidade de alunos matriculados por turma

	 -- 4 Apresentar a quantidade de alunos que se matricularam em maio de 2016

	 -- 5 Apresentar o nome dos alunos em ordem alfabética ao lado do nome das turmas e os nomes dos cursos em que estão matriculados

	 -- 6 Apresentar o nome nome dos cursos e os horários em que eles são oferecidos

	 -- 7 Apresentar a quantidade de alunos nascidos por estado que estejam matriculados no curso de inglês

	 -- 8 Apresentar o nome dos alunos ao lado da data de matrícula no formato dd/mm/aaaa
	 
	 -- 9 Apresentar os alunos cujo nome comece com A e que estejam matriculados no curso de inglês

	 -- 10 Apresentar a quantidade de matriculas feitas no ano de ano 2016

	 -- 11 Apresentar a quantidade de matriculas por nome do curso

	 -- 12 Apresentar a quantidade de alunos que fazem os cursos que cursos que custam mais de R$ 300,00

	 -- 13 Apresentar os nomes dos alunos que fazem o curso de alemão
