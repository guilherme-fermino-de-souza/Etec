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


--3. Criar uma Stored Procedure para cadastrar os clientes abaixo relacionados, sendo que deverão ser feitas
--duas validações:			- Verificar pelo CPF se o cliente já existe. Caso já exista emitir a mensagem: 
--´´Cliente de CPF XXXXX já cadastrado´´ (acrescentar a coluna CPF)			- Verificar se o cliente é mora
---dor de Itaquera ou Guaianases, pois a confeitaria não realiza entregas para clientes doutros bairros.
--Caso o cliente não seja morador desses bairros enviar a mensagem ´´Não foi possível cadastrar o cliente
--XXXX pois o bairro XXXX não é atendido pela confeitaria.´´
CREATE PROCEDURE spEntreClien
	@cpfClien CHAR(11)
	,@nomeClien VARCHAR(40)
	,@dataNasClien SMALLDATETIME
	,@ruaClien VARCHAR(55)
	,@numCasaClien VARCHAR(5)
	,@cepClien CHAR(9)
	,@bairroClien VARCHAR(20)
	,@sexoClien CHAR(1)
AS 
BEGIN
	DECLARE @idClien INT
	IF EXISTS (SELECT cpfCliente FROM tbCliente WHERE cpfCliente LIKE @cpfClien)
	BEGIN
	--Acabo de perceber que o CPF possui 11 números, e não 9. Talvez eu e lembre disso ao passar o código para o GitHub, mas n garanto
		PRINT('O cpf ' + @cpfClien + ' não pôde ser cadastrado pois já existe: ')
		SELECT cpfCliente FROM tbCliente
	END
	ELSE IF (@bairroClien != 'Itaquera' AND @bairroClien !='Guaianases')
	BEGIN
		PRINT('Não foi possível cadastrar o cliente' + @nomeClien +' pois o bairro ' + @bairroClien + ' não é atendido pela confeitaria.')
	END
	ELSE
	BEGIN
		INSERT tbCliente (cpfCliente, nomeCliente, dataNasCliente, ruaCliente, numCasaCliente, cepCliente, bairroCliente, sexoCliente)
		VALUES (@cpfClien, @nomeClien, @dataNasClien, @ruaClien, @numCasaClien, @cepClien, @bairroClien, @sexoClien)
	END
END

/* EXECUTES CORRETOS
EXECUTE spEntreClien '012345678', 'Samira Fatah', '05/05/1990', 'Rua Aguapeí', '1000', '08090-000', 'Guaianases', 'F'
EXECUTE spEntreClien '008642678', 'Celia Nogueira', '06/06/1992', 'Rua Andes', '234', '08456-090', 'Guaianases', 'F'
EXECUTE spEntreClien '012396318', 'Paulo Cesar Siqueira', '04/04/1984', 'Rua Castelo do Piauí', '232', '08109-000', 'Itaquera', 'M'
EXECUTE spEntreClien '018503678', 'Rodrigo Favaroni', '09/04/1991', 'Rua Sansão Castelo Branco', '10', '08431-090', 'Guaianases', 'M'
EXECUTE spEntreClien '012851678', 'Flávia Regina Brito', '22/04/1992', 'Rua Mariano Moro', '300', '08200-123', 'Itaquera', 'F'

EXECUTES ´´INCORRETOS´´
EXECUTE spEntreClien '012345678', 'awseg', '05/10/1955', 'Rua da Bahêa', '400', '12345-987', 'Guaianases', 'F'
EXECUTE spEntreClien '012308638', 'awmud', '05/10/1983', 'Beco do Clóvis', '90', '12915-987', 'Cracolândia', 'M'
*/
--SELECT idCliente, nomeCliente, dataNasCliente, ruaCliente, numCasaCliente, cepCliente, bairroCliente, sexoCliente FROM tbCliente
--DROP PROCEDURE spEntreClien	
