/* TRIGGER(gatilho) Função que é disparada mediante a alguma ação*/

/* 1. Criar um trigger que, ao ser feita uma venda (insert na tabela tbItensVenda), todos os produtos vendidos 
tenham sua quantidade atualizada na tabela tbProduto FEITO*/
	--FOR(disparado junto da ação)
	--AFTER(disparado após a ação)
	--INSTEAD OF(faz com que o Trigger seja realizado no lugar da ação)
	CREATE TRIGGER tgAtualizaProduto -- Nome do Trigger
	ON tbItensVenda   -- Nome da tabela (Ativara o Trigger mediante uma ação INSERT, UPDATE ou DELETE)
	FOR INSERT        -- define o momento que o Trigger é disparado (FOR/AFTER/INSTEAD OF)
	AS 
	DECLARE @idProduto INT, @quantidadeItensVenda INT -- inserted copia a tabela que a gerou com apenas 1 linha
	SELECT @idProduto = idProduto,
	@quantidadeItensVenda = quantidadeItensVenda FROM inserted

	UPDATE tbProduto
		SET quantidadeProduto = quantidadeProduto - @quantidadeItensVenda
		WHERE idProduto = @idProduto

	-- Testando Trigger
	SELECT * FROM tbItensVenda
	SELECT * FROM tbProduto
	SELECT * FROM tbVenda

		INSERT INTO tbFabricante (nomeFabricante)
	VALUES ('Fabricante Exemplo');
		INSERT INTO tbCliente (nomeCliente, cpfCliente, emailCliente, sexoCliente, dataNascimentoCliente)
	VALUES ('Carlos Almeida', '12345678901', 'carlos@example.com', 'M', '1985-04-15');
		INSERT INTO tbVenda (dataVenda, valorTotalVenda, idCliente)
	VALUES (GETDATE(), 110.00, 1); -- 110.00 é um exemplo, considerando produtos comprados
		INSERT INTO tbProduto (descricaoProduto, valorProduto, quantidadeProduto, idFabricante)
	VALUES ('Produto Exemplo', 29.99, 100, 1);
		INSERT INTO tbItensVenda (quantidadeItensVenda, subTotalItensVenda, idVenda, idProduto)
	VALUES (2, 100.00, 2, 2); -- 2 unidades do Produto com idProduto 1 na Venda com idVenda 1



/* 2. Criar um trigger que quando for inserida uma nova entrada de produtos na tbEntradaProduto, a quantidade 
desse produto seja atualizada e aumentada*/

/* 3. Criar uma trigger que, quando for feita uma venda de um produto determinado, seja feito um insert na 
tbSaidaProduto*/
