--MERGE tbProduto (1a) com tbProdutos(3a)
MERGE tbProdutos desti
	USING tbProduto ori
	ON ori.idProduto = desti.idProduto
	WHEN NOT MATCHED THEN
		INSERT VALUES (ori.idProduto, ori.nomeProduto, ori.valorProduto, ori.qtddeProduto)
	WHEN MATCHED THEN
		UPDATE SET desti.quantidadeProduto += ori.qtddeProduto;

--MERGE tbProdutoVenda (2a) com tbProdutos(3a)
MERGE tbProdutos desti
	USING tbProdutoVenda ori
	ON ori.codProduto = desti.idProduto
	WHEN NOT MATCHED THEN
		INSERT VALUES (ori.codProduto, ori.descricaoProduto, ori.precoProduto, ori.quantidadeProduto)
	WHEN MATCHED THEN
		UPDATE SET desti.quantidadeProduto += ori.quantidadeProduto;


SELECT * FROM tbProdutos
