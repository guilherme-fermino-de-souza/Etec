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



/* 7. Criar uma função que receba o código de um vendedor e o mês e informe o total
de vendas do vendedor no mês informado*/



-- 8. Criar uma função que usando o bdEstoque diga se o cpf do cliente é ou não válido

