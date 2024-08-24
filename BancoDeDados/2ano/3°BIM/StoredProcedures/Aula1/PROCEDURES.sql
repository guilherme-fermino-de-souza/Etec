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
		
