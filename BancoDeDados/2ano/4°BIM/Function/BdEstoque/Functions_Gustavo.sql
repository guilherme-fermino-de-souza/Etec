/* 5. Criar uma função que retorne o dia de semana da venda (no formato segunda,
terça, etc) ao lado do código da venda, valor total da venda e sua data*/
CREATE FUNCTION fc_diaSemanaVenda(@dataVenda DATETIME)
	RETURNS VARCHAR(40)
AS
BEGIN
	DECLARE @diaSemana AS VARCHAR(40), @dia INT	/*, @idVenda INT, @valTotalVenda MONEY	Só permite 1 retorno ._.
	SET @dataVenda = (SELECT dataVenda FROM tbVenda WHERE idvenda = @idVenda)*/
	SET @dia = DATEPART(DW, @dataVenda)
	IF @dia = 1
		BEGIN
		SET @diaSemana = 'Domingo.'
		END
	IF @dia = 2
		BEGIN
		SET @diaSemana = 'Segunda-feira.'
		END
	IF @dia = 3
		BEGIN
		SET @diaSemana = 'Terça-feira.'
		END
	IF @dia = 4
		BEGIN
		SET @diaSemana = 'Quarta-feira.'
		END
	IF @dia = 5
		BEGIN
		SET @diaSemana = 'Quinta-feira.'
		END
	IF @dia = 6
		BEGIN
		SET @diaSemana = 'Sexta-feira.'
		END
	IF @dia = 7
		BEGIN
		SET @diaSemana = 'Sábado.'
		END

	/*		Estava achando que era Stored Procedure ainda.
	SET @valTotalVenda = (SELECT valorTotalVenda FROM tbVenda WHERE idvenda = @idVenda)
	DECLARE @converDataVen VARCHAR(12)
	SET @converDataVen = CONVERT(VARCHAR(10), @dataVenda, 103)	// + @idVenda + @valTotalVenda + @converDataVen
	DROP FUNCTION dbo.fc_diaSemanaVenda*/

	RETURN @diaSemana 
END

SELECT diaDaSemana = dbo.fc_diaSemanaVenda(dataVenda), idvenda, valorTotalVenda, dataVenda FROM tbVenda


/* 6. Criar uma função que receba o código do cliente e retorne o total de vendas que
o cliente já realizou*/
CREATE FUNCTION fc_numTotalVendasClien(@idCliente INT)
	RETURNS VARCHAR(40)
AS
BEGIN
	DECLARE @numTotalVendas INT
	SET @numTotalVendas = (SELECT COUNT(idVenda) FROM tbVenda WHERE idCliente = @idCliente)

	RETURN @numTotalVendas 
END

SELECT idCliente, idVenda, totalDeVendasDoCliente = dbo.fc_numTotalVendasClien(idCliente) FROM tbVenda
--WHERE idCliente = 1


/* 7. Criar uma função que receba o código de um vendedor e o mês e informe o total
de vendas do vendedor no mês informado
   OBS: não faço ideia de como inserir campos de tabelas totalmente diferentes na mesma instrução, DDL ou DML. Triste.*/
CREATE FUNCTION fc_numTotalVendasFornecedorPorMes(@idVenda INT)
	RETURNS VARCHAR(60)
AS
BEGIN
	DECLARE @numTotalVendas INT, @idFabricante INT, @mesVenda DATETIME, @retorno VARCHAR(60)
	SET @idFabricante = (SELECT idFabricante FROM tbVenda 
		INNER JOIN tbItensVenda ON tbVenda.idVenda = tbItensVenda.idVenda
		INNER JOIN tbProduto ON tbItensVenda.idProduto = tbProduto.idFabricante)
	
	SET @mesVenda = (SELECT MONTH(dataVenda) FROM tbVenda WHERE @idVenda = idvenda)
	
	SET @numTotalVendas = (SELECT COUNT(idVenda) FROM tbVenda WHERE @idFabricante = (SELECT idFabricante FROM tbItensVenda 
		INNER JOIN tbProduto ON tbItensVenda.idProduto = tbProduto.idFabricante))
	SET @numTotalVendas = ( SELECT COUNT(idVenda) FROM  tbVenda WHERE @mesVenda = MONTH(dataVenda))
		
	SET @retorno = @numTotalVendas

	RETURN @retorno 
END

SELECT dataVenda, idVenda, totalDeVendasDoFornecedorNesteMês = dbo.fc_numTotalVendasFornecedorPorMes(idVenda) FROM tbVenda
WHERE idVenda = 4 AND dataVenda = '15-02-2014'
--DROP FUNCTION dbo.fc_numTotalVendasFornecedorPorMes


-- 8. Criar uma função que usando o bdEstoque diga se o cpf do cliente é ou não válido

