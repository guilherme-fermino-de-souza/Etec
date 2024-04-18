-- PARTE DO rapaz --

--Parte nhé salva
	--A
SELECT SUM(quantidadeProduto) AS 'A - Somatória das quantidades dos produtos P&G' FROM tbProduto
	WHERE idFabricante = 2
	--B
SELECT AVG(valorProduto) AS 'B - Média dos preços dos produos P&G' FROM tbProduto
	WHERE idFabricante = 2
	--C
SELECT SUM(valorProduto) AS 'C - Somatória dos preços dos produtos Unilever' FROM tbProduto
	WHERE idFabricante = 1
	--D
SELECT AVG(valorProduto) AS 'D - Média dos preços dos produtos Bunge' FROM tbProduto
	WHERE idFabricante = 3
	--E
SELECT SUM(quantidadeProduto) AS 'E - Somatória das quantidades dos produtos Bunge' FROM tbProduto
	WHERE idFabricante = 3
	--F
SELECT AVG(valorProduto) AS 'F - Média dos preços dos produtos Unilever' FROM tbProduto
	WHERE idFabricante = 1
	--G
SELECT AVG(quantidadeProduto) AS 'G - Média das quantidades dos produtos P&G' FROM tbProduto
	WHERE idFabricante = 2
	--H (produtos em estoque)
SELECT AVG(valorProduto) AS 'H - Média de preço dos produtos de quantidade < 200' FROM tbProduto
	WHERE quantidadeProduto < 200
	--I
SELECT AVG(quantidadeProduto) AS 'I - Média das quantidades dos produtos Unilever' FROM tbProduto
	WHERE idFabricante = 1
	--J
SELECT SUM(valorTotalVenda) AS 'J - Somatória das vendas de fev. e mar. de 2014' FROM tbVenda
	WHERE MONTH(dataVenda) = 2 AND YEAR(dataVenda)= 2014
	OR (MONTH(dataVenda) = 3 AND YEAR(dataVenda)= 2014)
	--K
SELECT SUM(quantidadeProduto) AS 'K - Somatória da quantidade dos amaciantes' FROM tbProduto
	--WHERE idProduto = 1 OR idProduto = 2
	WHERE idFornecedor < 3
	--L
SELECT MAX(valorProduto) AS 'L - Valor do mais caro dos produtos' FROM tbProduto
	--WHERE idFabricante = 1 |2 | 3
	--Messi
SELECT MIN(valorProduto) AS 'M - Valor do mais barato dos produtos' FROM tbProduto
	--WHERE idFabricante = 1 |2 | 3
	--N
SELECT AVG(valorProduto) AS 'N - Média de preço de todos os amaciantes' FROM tbProduto
	--WHERE idFabricante = 1 | 2 AND idProduto = 1 | 2
	WHERE (idFabricante = 1 OR idFabricante = 2) AND (idProduto = 1 OR idProduto = 2);
	--O
SELECT COUNT(DISTINCT idProduto) AS 'O - Quantos itens diferentes há no estoque' FROM tbProduto
	--P
SELECT COUNT(DISTINCT idProduto) AS 'P - Quantos itens da Unilever há no estoque' FROM tbProduto
	WHERE idFabricante = 1
	--Q
SELECT COUNT(DISTINCT idProduto) AS 'Q - Quantos itens exceto os da Unilever há no estoque' FROM tbProduto
	WHERE idFabricante != 1
	--R
SELECT SUM(quantidadeProduto) AS 'R - Somatória das quantidades dos produtos com mais de oitocentas unidades no estoque' FROM tbProduto
	WHERE  quantidadeProduto > 800
	--S
SELECT SUM(valorProduto) AS 'S - Preço médio dos produtos Unilever com mais de mil unidades no estoque' FROM tbProduto
	WHERE  idFabricante = 1 AND quantidadeProduto > 1000
	--T
SELECT AVG(valorTotalVenda) AS 'T - Somatória das quantidades dos produtos com mais de oitocentas unidades no estoque' FROM tbVenda
	WHERE  YEAR(dataVenda) = 2014
	--Urubundí
