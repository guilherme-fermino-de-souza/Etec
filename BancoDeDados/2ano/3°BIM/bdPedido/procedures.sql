---1. Criar uma Stored Procedure para exibir as categorias de produto conforme abaixo (imagens)
CREATE PROCEDURE spCatPro
	@nomeCategoriaProduto VARCHAR(25)
AS 
BEGIN
		INSERT tbCategoriaProduto (nomeCategoriaProduto)
		VALUES (@nomeCategoriaProduto)
END

--EXECUTE spCatPro 'Salgado'
--SELECT idCategoriaProduto, nomeCategoriaProduto FROM tbCategoriaProduto

--DROP PROCEDURED spCatPro			''


--2. Criar uma Stored Procedure para inserir os produtos abaixo, sendo que, a procedure deverá 
--antes de inserir verificar se o nome do produto já existe, evitando assim que um produto seja duplicado
CREATE PROCEDURE spDifNomeCatPro
	@nomeCategoriaProduto VARCHAR(25)
AS 
BEGIN
	DECLARE @idCategoriaProduto INT
	IF EXISTS (SELECT nomeCategoriaProduto FROM tbCategoriaProduto WHERE nomeCategoriaProduto LIKE @nomeCategoriaProduto)
	BEGIN
		PRINT('Produto ' + @nomeCategoriaProduto + ' não pôde ser cadastrado pois já existe. ')
	END
	ELSE
	BEGIN
		INSERT tbCategoriaProduto (nomeCategoriaProduto)
		VALUES (@nomeCategoriaProduto)
	END
END

--EXECUTE spDifNomeCatPro 'Salgado'
--SELECT idCategoriaProduto, nomeCategoriaProduto FROM tbCategoriaProduto
--DROP PROCEDURE spDifNomeCatPro

