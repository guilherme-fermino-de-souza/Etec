---1. Criar uma Stored Procedure para exibir as categorias de produto conforme abaixo (imagens)
CREATE PROCEDURE spCatPro
	@nomeCategoriaProduto VARCHAR(25)
AS 
BEGIN
		INSERT tbCategoriaProduto (nomeCategoriaProduto)
		VALUES (@nomeCategoriaProduto)
END

/*
	EXECUTE spCatPro 'Bolo Festa'
	EXECUTE spCatPro 'Bolo Simples'
	EXECUTE spCatPro 'Torta'
	EXECUTE spCatPro 'Salgado'
*/
--SELECT idCategoriaProduto, nomeCategoriaProduto FROM tbCategoriaProduto

--DROP PROCEDURED spCatPro			''


--2. Criar uma Stored Procedure para inserir os produtos abaixo, sendo que, a procedure deverá 
--antes de inserir verificar se o nome do produto já existe, evitando assim que um produto seja duplicado
CREATE PROCEDURE spDifNomePro
	@nomeProduto VARCHAR(25)
	,@precoKgProduto MONEY
	,@idCategoriaProduto INT
AS 
BEGIN
	DECLARE @idProduto INT
	IF EXISTS (SELECT nomeProduto FROM tbProduto WHERE nomeProduto LIKE @nomeProduto)
	BEGIN
		PRINT('Produto ' + @nomeProduto + ' não pôde ser cadastrado pois já existe. ')
	END
	ELSE
	BEGIN
		INSERT tbProduto (nomeProduto, precoQuiloProduto, idCategoriaProduto)
		VALUES (@nomeProduto, @precoKgProduto, @idCategoriaProduto)
	END
END

/* 
EXECUTE spDifNomePro 'Bolo Floresta Negra', 42, 1
EXECUTE spDifNomePro 'Bolo Prestígio', 43, 1
EXECUTE spDifNomePro 'Bolo Nutella', 44, 1
EXECUTE spDifNomePro 'Bolo Formigueiro', 17, 2
EXECUTE spDifNomePro 'Bolo de Cenoura', 42, 2
EXECUTE spDifNomePro 'Torta de Palmito', 42, 3
EXECUTE spDifNomePro 'Torta de Frango e Catupiry', 47, 3
EXECUTE spDifNomePro 'Torta de Escarola', 44, 3
EXECUTE spDifNomePro 'Coxinha de Frango ', 25, 4
EXECUTE spDifNomePro 'Esfiha de Carne', 27, 4
EXECUTE spDifNomePro 'Folhado de Queijo', 31, 4
EXECUTE spDifNomePro 'Risole Misto', 29, 4
*/
--SELECT idProduto, nomeProduto, precoQuiloProduto, idCategoriaProduto FROM tbProduto
--DELETE  FROM  tbCategoriaProduto WHERE nomeCategoriaProduto = 'Salgado'
--DROP PROCEDURE spDifNomeCatPro


--3.
