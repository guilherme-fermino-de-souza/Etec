-- 1 Criar uma função que retorne o dia de semana da venda (no formato segunda, terça, etc) ao lado do código da venda, valor total da venda e sua data + --
CREATE FUNCTION fc_DiaVenda(@diaVenda DATE) RETURNS VARCHAR(40) AS 
	BEGIN

	DECLARE @DiaSemana VARCHAR(10)
	DECLARE @Dia INT
	SET @Dia = DATEPART(dw, @DiaVenda)

	IF @Dia = 1 BEGIN
		SET @DiaSemana = 'Domigo'
	END
	IF @Dia = 2 BEGIN
		SET @DiaSemana = 'Segunda'
	END
	IF @Dia = 3 BEGIN
		SET @DiaSemana = 'Terça'
	END
	IF @Dia = 4 BEGIN
		SET @DiaSemana = 'Quarta'
	END
	IF @Dia = 5 BEGIN
		SET @DiaSemana = 'Quinta'
	END
	IF @Dia = 6 BEGIN
		SET @DiaSemana = 'Sexta'
	END
		IF @Dia = 7 BEGIN
		SET @DiaSemana = 'Sábado'
	END

	RETURN @DiaSemana
END

-- DROP FUNCTION fc_DiaVenda --
--  SELECT Dia=dbo.fc_DiaVenda(dataVenda), idVenda AS 'iD', valorTotalVenda AS 'Valor', CONVERT(VARCHAR(10), dataVenda, 103) AS 'Data' FROM tbVenda --

-- 2 Criar uma função que receba o código do cliente e retorne o total de vendas que o cliente já realizou + --
CREATE FUNCTION fc_TotalCompras(@idCliente VARCHAR(10)) RETURNS VARCHAR(10) AS
	BEGIN
		DECLARE @numVendas INT
		SELECT  @numVendas =  COUNT(*) FROM tbVenda WHERE idCliente = @idCliente
		RETURN @numVendas
	END

-- DROP FUNCTION fc_TotalCompras --
 SELECT idCliente AS 'Cliente', Nvendas=dbo.fc_TotalCompras(idCliente) FROM tbVenda

-- 3 Criar uma função que receba o código de um vendedor e o mês e informe o total de vendas do vendedor no mês informado --
-- Feita com o Fornecedor
CREATE FUNCTION fc_Fornecedor(@idFornecedor INT, @data DATE) 
RETURNS VARCHAR(40)
BEGIN
		DECLARE @totalVendas INT, @retorno VARCHAR(40)

		SET @totalVendas = (SELECT COUNT(*) FROM tbVenda
		INNER JOIN tbItensVenda ON tbVenda.idVenda = tbItensVenda.idVenda
		INNER JOIN tbProduto ON tbItensVenda.idProduto = tbProduto.idProduto
		WHERE tbProduto.idFornecedor = @idFornecedor 
			AND MONTH(tbVenda.dataVenda) = MONTH(@data)
			AND YEAR(tbVenda.dataVenda) = YEAR(@data))

		SET @retorno = @totalVendas

		RETURN @retorno

	END

-- DROP FUNCTION dbo.fc_Fornecedor --
DECLARE @data DATE = '2024-10-01';
SELECT idFornecedor, totalVendasFornecedor = dbo.fc_Fornecedor(idFornecedor, @data) FROM tbFornecedor;

-- DROP FUNCTION dbo.fc_Fornecedor --
SELECT totalVendasFornecedor = dbo.fc_Fornecedor(idFornecedor) FROM tbFornecedor


-- 4 Criar uma função que usando o bdEstoque diga se o cpf do cliente é ou não válido + --
CREATE FUNCTION fc_VerificarCpf(@cpf CHAR(11)) RETURNS CHAR(1) AS
	BEGIN
		DECLARE @indice INT
			,@soma INT
			,@dig1 INT
			,@dig2 INT
			,@cpfTemporario CHAR(1)
			,@digitosIguais CHAR(1)
			,@resultados CHAR(1)

		SET @resultados = 'N'
	-- Não pode o mermo número repetido --
		SET @cpfTemporario = SUBSTRING(@cpf, 1,1) -- Extrai o primeiro caractere do @cpf --

		SET @indice = 1 -- valor 1 para começar no primeiro caractere --
		SET @digitosIguais = 'S' -- @digitosIguais começa como verdadeiro --

		WHILE (@indice <= 11)
			BEGIN
				IF SUBSTRING(@cpf, @indice, 1) <> @cpfTemporario -- '<>' = diferente --
					SET @digitosIguais = 'N'
					SET @indice = @indice + 1 -- Aumenta o @indice para pegar todos os caracteres do @cpf --
			END
		-- Caso números diferentes --
		IF @digitosIguais = 'N'
			BEGIN
				-- Calculo 1° Dígito
				SET @soma = 0
				SET @indice = 1 -- Retorna para 1 --
					WHILE (@indice <= 9)
					BEGIN
						SET @soma = @soma + CONVERT(INT, SUBSTRING(@cpf, @indice, 1)) * (11 - @indice)
						SET @indice = @indice + 1 -- aumenta o @indice --
					END

				SET @dig1 = 11 - (@soma % 11)

				IF @dig1>9
					SET @dig1=0

				-- Calculo 2° Dígito
				SET @soma = 0
				SET @indice = 1 -- Retorna para 1(dnv) --
					WHILE (@indice <= 10)
					BEGIN
						SET @soma = @soma + CONVERT(INT, SUBSTRING(@cpf, @indice, 1)) * (12 - @indice)
						SET @indice = @indice + 1
					END
				SET @dig2 = 11 - (@soma % 11)

				IF @dig2 > 9
					SET @dig2=0

				-- Validando --
				IF (@dig1 = SUBSTRING(@cpf, LEN(@cpf)-1,1)) AND (@dig2=SUBSTRING(@cpf, LEN(@cpf),1)) -- LEN pega o comprimento(caracteres)
					SET @resultados = 'S'
				ELSE
					SET @resultados = 'N'
				END
RETURN @resultados
END

-- DROP FUNCTION fc_VerificarCpf --
-- SELECT cpfCliente AS 'CPF', válido=dbo.fc_VerificarCpf(cpfCliente) FROM tbCliente --
