--1Criar uma stored procedure “ Busca_Aluno ” que receba o código do aluno e retorne seu nome e data de nascimento
CREATE PROCEDURE spBusca_Aluno
	@dataNasciAluno SMALLDATETIME
	,@nomeAluno VARCHAR(75)
AS
BEGIN
	DECLARE @idAluno INT
	IF EXISTS(SELECT idAluno, nomeAluno, dataNasciAluno FROM tbAluno WHERE idAluno NOT LIKE @idAluno)
	BEGIN
		PRINT ( 'Não foi possivel identificar o aluno! ID ' + CONVERT(VARCHAR(5), @idAluno) +' não encontrado!')
	END
	ELSE (SELECT idAluno, nomeAluno, dataNasciAluno FROM tbAluno WHERE idAluno LIKE @idAluno)
	BEGIN
		PRINT ('O aluno de ID ' + CONVERT(VARCHAR(5), @idAluno) +' se chama' + @nomeAluno + 'e nasceu no dia' + @dataNasciAluno + '.')
	END
END

 EXEC spBusca_Aluno 2

	-- Não concluído

--DROP PROCEDURE spBusca_Aluno

/*
CREATE PROCEDURE spBusca_Aluno
@codAluno INT
AS
SELECT nomeAluno, DataNascAluno FROM tbAluno
WHERE codAluno = @codAluno

EXEC spBusca_Aluno 1*/


-- 2
	CREATE PROCEDURE spInsereAluninho
	@nomeAluno VARCHAR(75)
	,@dataNasciAluno SMALLDATETIME
	,@naturaliAluno VARCHAR(20)
	,@rgAluno VARCHAR(14)
AS
BEGIN
	DECLARE @idAluno INT
	SELECT idAluno, nomeAluno, dataNasciAluno FROM tbAluno WHERE idAluno LIKE @idAluno
		INSERT tbAluno (nomeAluno, dataNasciAluno, naturalidadeAluno, rgAluno) VALUES
			(@nomeAluno, @dataNasciAluno, @naturaliAluno, @rgAluno)
		--PRINT('O aluno de ID ' + CONVERT(VARCHAR(5), @idAluno) +' se chama' + @nomeAluno + ', é natural de ' + @naturaliAluno + ', seu RG é ' + @rgAluno + 'e nasceu no dia' + @dataNasciAluno + '.')--
END

EXEC spInsereAluninho 'Aurélio','02/08/2009',  'Americano', '12365673912345'
	-- Não concluído
	

-- 4. Criar uma stored procedure Exibe_Turma que, dados o nome da turma exiba todas as informações dela + --
	
	CREATE PROCEDURE Exibe_Turma
	@nomeTurma VARCHAR(20)
	AS 'Nome Turma'
	SELECT * FROM tbTurma
	WHERE @nomeTurma = nomeTurma

	EXEC Exibe_Turma 'Turma A'

	SELECT * FROM tbTurma
-- 5. Criar uma stored procedure Exibe_AlunosdaTurma que, dado o nome da turma exiba os seus alunos. + --

	CREATE PROCEDURE Exibe_AlunodasTurma
	@nomeTurma VARCHAR(20)
	AS
	SELECT nomeTurma, (tbAluno.nomeAluno) FROM tbTurma
	INNER JOIN  tbMatricula ON tbTurma.idTurma = tbMatricula.idTurma
	INNER JOIN tbAluno ON tbMatricula.idAluno = tbAluno.idAluno
	WHERE @nomeTurma LIKE nomeTurma

	EXEC Exibe_AlunodasTurma 'Turma A'

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

			EXEC spInsereAlunos 'Thomas','02/08/2009', '12345665432', '12345678912345', 'Americano'

	SELECT * FROM tbAluno

/* 7. Criar uma stored procedure que rebeba o nome do curso e 
o nome do aluno e matricule o mesmo no curso pretendido. */

	CREATE PROCEDURE spInsere_Curso
	@nomeAluno VARCHAR(75)
	,@nomeCurso VARCHAR(45)
	AS 
	BEGIN
		DECLARE @idAluno INT
		SELECT nomeCurso, nomeAluno FROM tbAluno
		INNER JOIN tbMatricula ON tbMatricula.idAluno = tbMatricula.idAluno
		INNER JOIN tbCurso ON tbAluno.idAluno = tbAluno.idAluno
		INSERT tbMatricula(dataMatricula, idAluno, idTurma) VALUES (,@idAluno,)

		SELECT * FROM tbAluno
		
