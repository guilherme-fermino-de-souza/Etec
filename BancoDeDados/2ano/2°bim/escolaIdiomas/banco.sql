CREATE DATABASE bdEscolaIdiomas

CREATE TABLE tbCurso(
	idCurso INT PRIMARY KEY IDENTITY(1,1)
	, nomeCurso VARCHAR(45)
	, cargaHorariaCurso INT NOT NULL
	, valorCurso MONEY
)

CREATE TABLE tbAluno(
	idAluno INT PRIMARY KEY IDENTITY(1,1)
	, nomeAluno VARCHAR(75) NOT NULL
	, dataNasciAluno SMALLDATETIME
	, rgAluno VARCHAR(14)
	, naturalidadeAluno VARCHAR(20)
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
