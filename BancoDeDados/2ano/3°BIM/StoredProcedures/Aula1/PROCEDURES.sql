-- Técnica para a realização de ações repetitivas --
-- Funciona como um método sem retorno para a realização de comandos repetitivos --


-- 1. Criar uma stored procedure Busca_Aluno que receba o Id do aluno e retorne seu nome e data de nascimento. --	
/*CREATE PROCEDURE spBuscaAluno

 @nome VARCHAR(70)
,@dataNasci SMALLDATETIME
AS
	SELECT idAluno, nomeAluno, dataNasciAluno FROM tbAluno
BEGIN
	DECLARE @idAluno INT
	PRINT ('Insira o código de identificação do aluno.')
	IF EXISTS (SELECT idAluno FROM tbAluno)
	BEGIN 
		PRINT ('O aluno de código ' + @idAluno + ' se chama ' + @idAluno + ' e nasceu em ' + @dataNasci)
	END
	ELSE
	BEGIN
		PRINT (Essa identificação é inválida!)
	END
END*/

-- 2. Criar uma stored procedure Insere_Aluno que insira um registro na tabela de Alunos. --

/* 3. Criar uma stored procedure Aumenta_Preco que, dados o nome do curso e um percentual, 
aumente o valor do curso com a porcentagem. */

-- 4. Criar uma stored procedure Exibe_Turma que, dados o nome da turma exiba todas as informações dela--

-- 5. Criar uma stored procedure Exibe_AlunosdaTurma que, dado o nome da turma exiba os seus alunos. --

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
/* 7. Criar uma stored procedure que rebeba o nome do curso o nome do curso e 
o nome do aluno e matricule o mesmo no curso pretendido. */
