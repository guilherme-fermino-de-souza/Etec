--1. Criar uma stored procedure “ Busca_Aluno ” que receba o código do aluno e retorne seu nome e data de nascimento
CREATE PROCEDURE spBusca_Aluno
	@idAluno INT
AS
	SELECT nomeAluno, dataNasciAluno FROM tbAluno 
	WHERE @idAluno LIKE idAluno

EXEC spBusca_Aluno 1

-- 2. Criar uma Stored Procedure ``spInsereAluno`` que insira um registro na tabela de Alunos.
CREATE PROCEDURE spInsereAluninho
	@nomeAluno VARCHAR(75)
	,@dataNasciAluno SMALLDATETIME
	,@cpfAluno CHAR(11)
	,@rgAluno VARCHAR(14)
	,@naturaliAluno VARCHAR(20)
AS
BEGIN
	IF EXISTS(SELECT cpfAluno FROM tbAluno WHERE cpfAluno LIKE @cpfAluno)
	BEGIN
		PRINT ( 'Não foi possivel identificar o aluno! CPF ' + @cpfAluno +' incompatível e/ou já registrado!')
	END
	ELSE 
	INSERT tbAluno (nomeAluno, dataNasciAluno, cpfAluno, rgAluno, naturalidadeAluno) VALUES
		(@nomeAluno, @dataNasciAluno, @cpfAluno, @rgAluno, @naturaliAluno)
END

EXEC spInsereAluninho 'Aurélio de Assis','02/08/2009', '09876543217', '12365673912345', 'PA' 

SELECT * FROM tbAluno

-- 3. Criar uma Sored Procedure ``spAumentaPreco`` que, dados o nome do curso e um percentual, aumente o valor do 
	curso conforme a porcentagem informada + .
CREATE PROCEDURE spAumentaPreco
	@nomeCurso VARCHAR(45)
	,@percentAumentoCurso FLOAT NULL
AS
	SELECT nomeCurso, valorCurso FROM tbCurso --@percentAumentoCurso-- FROM tbCurso
	UPDATE tbCurso
	SET valorCurso = valorCurso + (valorCurso * (@percentAumentoCurso / 100))
	WHERE nomeCurso = @nomeCurso

EXEC spAumentaPreco 'Alemão', 15

--DROP PROCEDURE spAumentaPreco--

-- 4. Criar uma stored procedure Exibe_Turma que, dados o nome da turma exiba todas as informações dela + --
	
CREATE PROCEDURE Exibe_Turma
	@nomeTurma VARCHAR(20)
AS 
	SELECT * FROM tbTurma
	WHERE @nomeTurma = nomeTurma

EXEC Exibe_Turma '1|A'

	SELECT * FROM tbTurma
-- 5. Criar uma stored procedure Exibe_AlunosdaTurma que, dado o nome da turma exiba os seus alunos. + --

CREATE PROCEDURE Exibe_AlunodaTurma
	@nomeTurma VARCHAR(20)
AS
	SELECT nomeTurma, (tbAluno.nomeAluno) FROM tbTurma
	INNER JOIN  tbMatricula ON tbTurma.idTurma = tbMatricula.idTurma
	INNER JOIN tbAluno ON tbMatricula.idAluno = tbAluno.idAluno
	WHERE @nomeTurma LIKE nomeTurma

EXEC Exibe_AlunodaTurma '1|A'

	SELECT * FROM tbAluno

/* 6. Criar uma stored procedure para inserir alunos, verificando pelo cpf se o 
aluno existe ou não, e informar a condição via mensagem. + */
CREATE PROCEDURE spInsereAlunos
	@nomeAluno VARCHAR(75)
	,@dataNasciAluno SMALLDATETIME
	,@cpfAluno CHAR(11)
	,@rgAluno VARCHAR(14)
	,@naturalidadeAluno VARCHAR(20)
AS 
BEGIN
	DECLARE @idAluno INT
	IF EXISTS (SELECT cpfAluno FROM tbAluno WHERE cpfAluno LIKE @cpfAluno)
		BEGIN
			PRINT ('Não é possível Cadastrar! CPF ' +@cpfAluno+ 'CPF já existe!')
		END
		ELSE
		BEGIN
			INSERT tbAluno(nomeAluno, dataNasciAluno, cpfAluno, rgAluno, naturalidadeAluno) VALUES (@nomeAluno, @dataNasciAluno , @cpfAluno, @rgAluno, @naturalidadeAluno)
			SET @idAluno = (SELECT MAX(idAluno) FROM tbAluno)
			PRINT('Aluno '+@nomeAluno+' cadastrado com sucesso com o código '+CONVERT(VARCHAR(5), @idAluno) )
		END
END

EXEC spInsereAlunos 'Thomas','02/08/2009', '12345665432', '12345678912345', 'RS'

	SELECT * FROM tbAluno

/* 7. Criar uma stored procedure que rebeba o nome do curso e 
o nome do aluno e matricule o mesmo no curso pretendido. -*/

CREATE PROCEDURE spInsere_CursosFIVE
	@nomeAluno VARCHAR(75)
	,@nomeCurso VARCHAR(45)
	,@dataMatricula DATETIME
AS 
BEGIN
	DECLARE @idAluno INT
	SELECT nomeCurso ,nomeAluno  FROM tbAluno
	INNER JOIN tbMatricula ON tbAluno.idAluno = tbMatricula.idAluno
	INNER JOIN tbTurma ON tbMatricula.idTurma = tbTurma.idTurma
	INNER JOIN tbCurso ON tbTurma.idCurso  = tbCurso.idCurso
	WHERE nomeCurso = @nomeCurso
	INSERT tbMatricula(dataMatricula, idAluno, idTurma) VALUES (@dataMatricula, @idAluno, @nomeCurso)
	SET @nomeCurso = (SELECT nomeCurso FROM tbCurso)
	PRINT('Aluno '+@nomeAluno+' cadastrado no curso com o código '+CONVERT(VARCHAR(5), @nomeCurso) )
END

EXEC spInsere_CursosFIVE 'denovan', 'Alemão', '2014-05-04'

	SELECT * FROM tbAluno
	SELECT * FROM tbMatricula
	SELECT * FROM tbCurso





-- AULA DE HOJE 29/08/24

/* 7. Criar uma stored procedure que rebeba o nome do curso e 
o nome do aluno e matricule o mesmo no curso pretendido. -*/

CREATE PROCEDURE spInsere_Cursos
	@nomeAluno VARCHAR(75)
	,@nomeCurso VARCHAR(45)
	,@dataMatricula SMALLDATETIME
AS 
BEGIN
	DECLARE @idAluno INT, @idTurma INT
	SELECT nomeCurso ,nomeAluno  FROM tbAluno
	INNER JOIN tbMatricula ON tbAluno.idAluno = tbMatricula.idAluno
	INNER JOIN tbTurma ON tbMatricula.idTurma = tbTurma.idTurma
	INNER JOIN tbCurso ON tbTurma.idCurso  = tbCurso.idCurso
	WHERE nomeAluno LIKE  @nomeAluno
	INSERT tbMatricula(dataMatricula, idAluno, idTurma) VALUES (@dataMatricula, @idAluno, @idTurma)
	PRINT('Aluno '+@nomeAluno+' cadastrado no curso '+@nomeCurso+' com o código '+CONVERT(VARCHAR(5), @idAluno) )
END

EXEC spInsere_Cursos 'denovan', 'Alemão', '2014-05-04'

	SELECT * FROM tbAluno
	SELECT * FROM tbMatricula
	SELECT * FROM tbCurso


--DROP PROCEDURE spInsere_Cursos--

	--NÃO CONCLUÍDA--
