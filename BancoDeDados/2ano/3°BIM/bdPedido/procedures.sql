---A. Criar uma Stored Procedure para exibir as categorias de produto conforme abaixo (imagens)
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


--B. Criar uma Stored Procedure para inserir os produtos abaixo, sendo que, a procedure deverá 
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


--C. Criar uma Stored Procedure para cadastrar os clientes abaixo relacionados, sendo que deverão ser feitas
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
	--Acabo de perceber que o CPF possui 11 números, e não 9. Talvez eu me lembre disso ao passar o código para o GitHub, mas n garanto
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



/*D. Criar via Stored Procedure as encomendas abaixo relacionadas, fazendo as verificações descritas abaixo:
- No momento da encomenda o cliente fornecerá seu CPF. Caso ele não tenha sido cadastrado ainda, enviar a mensagem 
´´Não foi possível efetivar a encomenda pois o cliente XXXX não está cadastrado´´		- Verificar se a 
data de entrega não é menor do que a data de encomenda. Caso seja enviar a mensagem ´´Não é possível entregar uma 
encomenda antes da encomenda ser realizada´´		- Caso esteja tudo certo, efetuar a encomenda e emitir 
a mensagem: ´´Encomenda XXXX para o cliente YYYY efetuada com sucesso´´. XXXX: Número da encomenda. YYYY: nomeClien.
*/

CREATE PROCEDURE spEncomenCert
	@idClien INT
	,@dataEncomen SMALLDATETIME
	,@valorTotalEncomen MONEY
	,@dataEntregaEncomen SMALLDATETIME
	,@nomeCliente VARCHAR (40)
	,@cpfClien CHAR (9)
AS
BEGIN
	DECLARE @idEncomen INT
	--SELECT  cpfCliente FROM tbCliente WHERE cpfCliente LIKE @cpfClien
	IF NOT EXISTS (SELECT cpfCliente FROM tbCliente WHERE cpfCliente LIKE @cpfClien)
	BEGIN
		PRINT('Não foi possível efetivar a encomenda pois o cliente ' + @nomeCliente + ' não está cadastrado.')
		SELECT cpfCliente FROM tbCliente
	END
	ELSE IF (@dataEntregaEncomen > @dataEncomen)
	BEGIN
		PRINT('Não é possível entregar uma encomenda antes da encomenda ser realizada.')
	END
	ELSE
	BEGIN
		BEGIN TRANSACTION
			INSERT tbEncomenda (idEncomenda, dataEncomenda, valorTotalEncomenda, dataEntregaEncomenda, idCliente) /*, nomeCliente, cpfCiente*/
			VALUES (@idEncomen, @dataEncomen, @valorTotalEncomen, @dataEntregaEncomen, @idClien) -- , @nomeCliente, @cpfClien)
			INSERT tbCliente (nomeCliente, cpfCliente)
			VALUES (@nomeCliente, @cpfClien)
		COMMIT TRANSACTION
		--VALUES (@nomeCliente, @cpfClien)
		--WHERE idCliente = @idClien
			--INNER JOIN  ON tbEncomenda.idCliente = tbCliente.idCliente
		PRINT('Encomenda ' + CONVERT(VARCHAR(5), @idEncomen) + ' para o cliente ' + @nomeCliente + 'efetuada com sucesso')

	END
END

/* EXECUTES CORRETOS
EXECUTE spEncomenCert 1, '08/08/2015', 450, '15/08/2015', 1
EXECUTE spEncomenCert 1, '08/08/2015', 450, '10/08/2015', 1


-- NÃO COMPLETADA

EXECUTES ´´INCORRETOS´´
EXECUTE spEncomenCert '012345678'
EXECUTE spEncomenCert 1, '08/08/2015', 450, '06/08/2015', 1
*/
--SELECT idEncomenda, dataEncomenda, valorTotalEncomenda, dataEntregaEncomenda, idCliente FROM tbEncomenda

--DROP PROCEDURE  spEncomenCert	


/*  E. Ao adicionar a encomenda, criar uma Stored Procedure, para que sejam inseridos os itens da encomenda ´´conforme a tabela a seguir.´´
*/
CREATE PROCEDURE spAddItemEncom
	@idEncomenda  INT
	,@idProduto INT
	,@quantiQuilos FLOAT
	,@subTotal MONEY NOT NULL
AS 
BEGIN
		DECLARE @idItemEncom INT
		INSERT tbItensEncomenda (idItensEncomenda, idEncomenda, idProduto, quantidadeQuilos, subTotal)
		VALUES (@idItemEncom, @idEncomenda, @idProduto, @quantiQuilos, @subTotal)
END

/*
	EXECUTE spAddItemEncom 1, 1, 1, '2,5', '105,00'
	EXECUTE spAddItemEncom 2, 1, 10, '2,6', '70,00'
	EXECUTE spAddItemEncom 3, 1, 9, '6', '150,00'
	EXECUTE spAddItemEncom 4, 1, 12, '4,3', '125,00'
	EXECUTE spAddItemEncom 5, 2, 9, '8', '200,00'
	EXECUTE spAddItemEncom 6, 3, 11, '3,2', '100,00'
	EXECUTE spAddItemEncom 7, 3, 9, '2', '50,00'
	EXECUTE spAddItemEncom 8, 4, 2, '2,5', '150,00'
	EXECUTE spAddItemEncom 9, 4, 3, '2,5', '100,00'
	EXECUTE spAddItemEncom 10, 5, 6, '3,4', '150,00'
*/
--SELECT idItensEncomenda, idEncomenda, idProduto, quantidadeQuilos, subTotal FROM tbItensEncomenda

--DROP PROCEDURED spAddItemEncom



/*  F. Após todos os cadastros, criar uma Stored Procedure para alterar o que se pede:
1 - O preço dos produtos da categoria "Bolo Festa" sofreram um aumento de 10%;
2 - O preço dos produtos da categoria "Bolo Simples" estão em promoção e terão um desconto de 20%;
3 - O preço dos produtos da categoria "Torta" aumentaram 25%;
4 - O preço dos produtos da categoria "Salgado", com exceção da esfiha de carne, sofreram um aumento de 20%.
*/
CREATE PROCEDURE spAlterValor
	--@CategoriaProduto VARCHAR(25)
AS 
BEGIN	-- 1
		UPDATE tbProduto 
		SET precoQuiloProduto = precoQuiloProduto * 1.10
		WHERE idCategoriaProduto =(SELECT idCategoriaProduto FROM tbCategoriaProduto WHERE nomeCategoriaProduto  = 'Bolo Festa')
		-- 2
		UPDATE tbProduto 
		SET precoQuiloProduto = precoQuiloProduto * 0.80
		WHERE idCategoriaProduto =(SELECT idCategoriaProduto FROM tbCategoriaProduto WHERE nomeCategoriaProduto  = 'Bolo Simples')
		-- 3
		UPDATE tbProduto 
		SET precoQuiloProduto = precoQuiloProduto * 1.25
		WHERE idCategoriaProduto =(SELECT idCategoriaProduto FROM tbCategoriaProduto WHERE nomeCategoriaProduto  = 'Torta')
		-- 4
		UPDATE tbProduto 
		SET precoQuiloProduto = precoQuiloProduto * 1.20
		WHERE idCategoriaProduto =(SELECT idCategoriaProduto FROM tbCategoriaProduto WHERE nomeCategoriaProduto  = 'Salgado' AND nomeProduto != 'Esfiha de carne')
END

/*
	EXECUTE spAlterValor
*/
--SELECT * FROM tbProduto

--DROP PROCEDURED spAlterValor



/*  G. Criar uma Procedure para excluir clientes pelo CPF sendo que:
1 - Caso o cliente possua encomendas, emitir a mensagem "Impossível remover esse cliente, pois o cliente XXXX possui encomendas".
2 - Caso o cliente não possua encomendas, realizar a remoção e emitir a mensagem "Cliente XXXXX removido com sucesso".
*/
CREATE PROCEDURE spDeletCpf
	
	@cpfClien CHAR (9)
	,@nomeClien VARCHAR (40)
	--,@idEncomen VARCHAR(25)
AS 
BEGIN
	INSERT tbCliente (cpfCliente/*, idCliente = (SELECT idCliente FROM tbEncomenda WHERE idEncomenda LIKE @idEncomen)*/,  nomeCliente)
	VALUES (@cpfClien, /*@idClien,*/  @nomeClien)
	IF EXISTS (SELECT idEncomenda FROM tbEncomenda WHERE idCliente = (SELECT idCliente FROM tbCliente WHERE cpfCliente LIKE @cpfClien))
	BEGIN
		PRINT('O cpf ' + @cpfClien + ' não pôde ser excluído pois possui encomendas.')
	END
	ELSE
	BEGIN
		DELETE FROM tbCliente 
			WHERE idCliente IN (SELECT idCliente FROM tbCliente WHERE cpfCliente LIKE @cpfClien)
		PRINT('O cliente' + @nomeClien +' de CPF ' + @cpfClien + ' foi removido com sucesso.')
	END
END

/* 
EXECUTE spDeletCpf '018503678', 'Rodrigo Favaroni'
*/
--SELECT * FROM tbCliente
--DROP PROCEDURE spDeletCpf



/*  H. Criar uma Procedure que permita excluir qualquer item de uma encomenda cuja data de entrega seja maior que a data atual. Para tal o cliente deverá 
fornecer o código da encomenda e o código do produto que será excluído da encomenda. A Procedure deverá remover o item e atualizar
o valor total da encomenda, do qual deverá ser subtraído o valor do item a ser removido. A Procedure poderá remover apenas um item da encomenda de cada vez.
*/
CREATE PROCEDURE spRemovItemEncom
	
	@cpfClien CHAR (9)
	,@nomeClien VARCHAR (40)
	,@idEncomen INT
	,@idProduto INT
	,@idItemEncomen INT
	--,@idEncomen VARCHAR(25)
AS 
BEGIN
	INSERT tbItensEncomenda(idEncomenda, idProduto)
	VALUES (@idEncomen, @idProduto)
	IF (@idProduto = (SELECT idProduto FROM tbEncomenda WHERE dataEncomenda > dataEntregaEncomenda AND idEncomenda = @idEncomen))
	BEGIN
		DELETE FROM tbCliente 
			WHERE idCliente IN (SELECT idCliente FROM tbCliente WHERE cpfCliente LIKE @cpfClien)
	END
	ELSE
	BEGIN
		PRINT('A encomenda ' + @idEncomen + ' não pôde ser excluído pois possui encomendas.')
	END
END
/* 
EXECUTE spRemovItemEncom '018503678', 'Rodrigo Favaroni'
*/
--SELECT * FROM tbCliente
--DROP PROCEDURE spRemovItemEncom
