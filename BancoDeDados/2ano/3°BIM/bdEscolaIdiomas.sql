CREATE PROCEDURE spBuscaAluno

 @nome VARCHAR(70)
,@dataNasci SMALLDATETIME
AS
	SELECT idAluno, nomeAluno, dataNasciAluno FROM tbAluno
BEGIN
	DECLARE @idAluno INT
	PRINT ('Insira o código de identificação do aluno.')
	/*IF EXISTS (SELECT idAluno FROM tbAluno)
	BEGIN 
		PRINT ('O aluno de código ' + @idAluno + ' se chama ' + @idAluno + ' e nasceu em ' + @dataNasci)
	END
	ELSE
	BEGIN
		PRINT (Essa identificação é inválida!)
	END
END*/
