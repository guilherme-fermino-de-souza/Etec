CREATE DATABASE bdLojaEstoqueTwo
GO


/*DROP DATABASE*/

CREATE TABLE tbCliente(
   idCliente INT PRIMARY KEY IDENTITY(1,1)
   ,nomeCliente VARCHAR (60) NOT NULL
   ,cpfCliente CHAR (11) UNIQUE NOT NULL
   ,emailCliente VARCHAR (30) UNIQUE NOT NULL
   ,sexoCliente CHAR (1) NOT NULL
   ,dataNasCliente SMALLDATETIME 
   )
CREATE TABLE tbFabricante(
   idFabricante INT PRIMARY KEY IDENTITY(1,1)
   ,nomeFabricante VARCHAR (60) NOT NULL
   )
CREATE TABLE tbFornecedor(
   idFornecedor INT PRIMARY KEY IDENTITY(1,1)
   ,nomeFornecedor VARCHAR (60) NOT NULL
   ,contatoFornecedor VARCHAR (90) NOT NULL
   )
CREATE TABLE tbVenda(
   idvenda INT PRIMARY KEY IDENTITY(1,1)
   ,dataVenda SMALLDATETIME 
   ,valorTotalVenda MONEY NOT NULL
   ,idCliente INT FOREIGN KEY REFERENCES tbCliente(idCliente)
   )
CREATE TABLE tbProduto(
   idProduto INT PRIMARY KEY IDENTITY(1,1)
   ,descricaoProduto VARCHAR (60) NOT NULL
   ,valorProduto MONEY NOT NULL
   ,quantidadeProduto INT NOT NULL 
   ,idFabricante INT FOREIGN KEY REFERENCES tbFabricante(idFabricante)
   ,idFornecedor INT FOREIGN KEY REFERENCES tbFornecedor(idFornecedor)
   )
CREATE TABLE tbItensVenda(
   codItensVenda INT PRIMARY KEY IDENTITY(1,1)
   ,quantidadeItensVenda VARCHAR (7) 
   ,subTotalItensVenda VARCHAR (7) NOT NULL
   ,idVenda INT FOREIGN KEY REFERENCES tbVenda(idVenda)
   ,idProduto INT FOREIGN KEY REFERENCES tbProduto(idProduto)
   )

   INSERT INTO tbCliente
      (nomeCliente, cpfCliente, emailCliente, sexoCliente, dataNasCliente)
	  VALUES 
	  ('Armando José Santana', '12345678900', 'armandojsantana@outlook.com', 'm', '21-02-1961')
	  ,('Shella Carvalho Leal', '45678909823', 'scarvalho@ig.com.br', 'f', '13-09-1978')
	  ,('Carlos Henrique Souza', '76598278299', 'chenrique@ig.com.br', 'm', '08-09-1981')
	  ,('Maria Aparecida Souza', '87365309899', 'mapdasouza@outlook.com', 'f', '1962-07-07')
      ,('Adriana Noqueira Silva', '76354309388', 'drica1977@ig.com.br', 'f', '09-04-1977')
	  ,('Paulo Henrique Silva', '87390123111', 'phsilva80@hotmail.com', 'm', '02-02-1987')

    INSERT INTO tbFabricante
      (nomeFabricante)
       VALUES
	   ('Unilever')
	   ,('P&G')
	   ,('Bunge')

	INSERT INTO tbFornecedor
	   (nomeFornecedor, contatoFornecedor)
	   VALUES
	    ('Atacadão', 'Carlos Santos')
		,('Assai', 'Maria Stella')
		,('Roldão', 'Paulo César')

INSERT INTO tbProduto
	   (descricaoProduto, valorProduto, quantidadeProduto, idFabricante, idFornecedor)
	   VALUES
	    ('Amaciante Downy', 5.76, 1500, 2, 1)
		,('Amaciante Confort', 5.45, 2300, 1, 1)
		,('Sabão em pó OMO', 5.99, 1280, 1, 2)
		,('Margarina Qually', 4.76, 2500, 3, 1)
		,('Salsicha Hot Dog Sadia', 6.78, 2900, 3, 2)
		,('Mortadela Perdigão', 2.50, 1200, 3, 3)
		,('Hambuguer Sadia', 9.89, 1600, 3, 1)
		,('Fralda Pampers', 36.00, 340, 2, 3)
		,('Xampu Seda', 5.89, 800, 1, 2)
		,('Condicionador Seda', 6.50, 700, 1, 3)

   INSERT INTO tbVenda
      (dataVenda, valorTotalVenda, idCliente)
	  VALUES
	   ('01-02-2014', 4500.00, 1)
	   ,('03-02-2014', 3400.00, 1)
	   ,('10-02-2014', 2100.00, 2)
	   ,('15-02-2014', 2700.00, 3)
	   ,('17-03-2014', 560.00, 3)
	   ,('09-04-2014', 1200.00, 4)
	   ,('07-05-2014', 3500.00, 5)
	   ,('07-05-2014', 3400.00, 1)
	   ,('05-02-2014', 4000.00, 2)

	INSERT INTO tbItensVenda
	   (quantidadeItensVenda, subTotalItensvenda, idVenda, idProduto)
	   VALUES
	   ('200', '1500.00', 1, 1)
	   ,('300', '3000.00', 1, 2)
	   ,('120', '1400.00', 2, 4)
	   ,('200', '1000.00', 2, 2)
	   ,('130', '1000.00', 2, 3)
	   ,('200', '2100.00', 3, 5)
	   ,('120', '1500.00', 4, 4)
	   ,('450', '700.00', 4, 5)
	   ,('200', '560.00', 5, 5)
	   ,('200', '600.00', 6, 7)
	   ,('300', '600.00', 6, 6)
	   ,('300', '2500.00', 8, 1)
	   ,('200', '1000.00', 8, 2)
	   ,('250', '1700.00', 9, 6)
	   ,('200', '1700.00', 9, 5)
	   ,('1000', '4000.00', 9, 4)
	   
	   -- EXECUTADO ATÉ AQUI --
USE bdLojaEstoqueTwO

UPDATE tbProduto
SET valorProduto = valorProduto * 1.10
WHERE idFabricante = (SELECT idFabricante FROM tbFabricante WHERE nomeFabricante = 'Unilever');

UPDATE tbProduto
SET valorProduto = valorProduto * 0.93
WHERE idFabricante = (SELECT idFabricante FROM tbFabricante WHERE nomeFabricante = 'P&G');

UPDATE tbProduto
SET quantidadeProduto = valorProduto - 30
WHERE idFornecedor = (SELECT idFornecedor FROM tbFornecedor WHERE nomeFornecedor = 'Atacadão');

UPDATE tbCliente
SET nomeCliente = 'Adriana Nogueira Silva Campos'
WHERE nomeCliente = 'Adriana Nogueira Silva'

UPDATE tbVenda
SET valorTotalVenda = valorTotalVenda * 0.95
WHERE MONTH(dataVenda) = 2 AND YEAR(dataVenda) = 2014;

DELETE FROM tbItensVenda
WHERE idProduto IN (SELECT idProduto FROM tbProduto WHERE descricaoProduto = 'Salsicha Hot Dog Sadia');

UPDATE tbProduto
SET valorProduto = valorProduto * valorProduto * 0.80
WHERE quantidadeProduto >= 1000;

UPDATE tbVenda
SET valorTotalVenda = valorTotalVenda * 0.90
WHERE idCliente BETWEEN 2 AND 4;

UPDATE tbProduto
SET valorProduto = valorProduto * 1.06
WHERE descricaoProduto LIKE '%Sadia%';

UPDATE tbVenda
SET valorTotalVenda = valorTotalVenda * 1.02
WHERE MONTH(dataVenda) = 2 AND YEAR(dataVenda) = 2014;

--EXECUTADO ATÉ AQUI--
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

	
	--Parte 2  18/04/2024

	-- A listar as descrições dos produtos ao lado do nome dos fabricantes Copy--

	  SELECT descricaoProduto AS 'Descricao', nomeFabricante
	  AS 'Fabricante' FROM tbProduto
	    INNER JOIN tbFabricante
		   ON tbProduto.idFabricante = tbFabricante.idFabricante
		     

	-- B listar as descrições dos produtos ao lado do nome dos fornecedores --

	   SELECT descricaoProduto AS 'Descricao', nomeFornecedor
	   AS 'fornecedor' FROM tbProduto
	     INNER JOIN tbFornecedor
		   ON tbProduto.idFornecedor = tbFornecedor.idFornecedor

	-- C listar a soma das quantidades dos produtos agrupados pelo nome do fabricante --

	   SELECT nomeFabricante AS 'Fabricante',
	   COUNT (tbProduto.idProduto) AS 'Quantidade de produtos por fabricante' FROM tbFabricante
	      INNER JOIN tbProduto
		    ON tbProduto.idFabricante = tbFabricante.idFabricante
			   GROUP BY tbFabricante.nomeFabricante

	-- D listar o total de vendas ao lado do nome do cliente

	   SELECT nomeCliente AS 'Cliente',
	   COUNT (tbVenda.idvenda) AS 'Total de vendas' FROM tbCliente
	     INNER JOIN tbVenda
		   ON tbVenda.idCliente = tbCliente.idCliente
		     GROUP BY tbCliente.nomeCliente

	-- E listar a média dos preços dos produtos agrupados pelo nome do fornecedor

	    SELECT nomeFornecedor AS 'Nome fornecedor', 
		AVG (tbProduto.valorProduto) AS 'Media preco produto' FROM tbFornecedor
		  INNER JOIN tbProduto
		    ON tbProduto.idFornecedor = tbFornecedor.idFornecedor
			  GROUP BY tbFornecedor.nomeFornecedor


	-- F listar todas as somas das vendas agrupadas pelo nome do cliente em ordem alfabetica

	    SELECT nomeCliente AS 'Nome Cliente', -- Não Entendi --
		SUM (tbVenda.idvenda) AS 'Soma das vendas' FROM tbCliente
		  INNER JOIN tbVenda
		    ON tbVenda.idCliente = tbCliente.idCliente
			  GROUP BY tbCliente.nomeCliente

	-- G listar a soma dos preços dos produtos agrupados pelo nome do fabricante

	   SELECT nomeFabricante AS 'Nome fabricante',
	   SUM (tbProduto.valorProduto) AS 'Soma dos precos' FROM tbFabricante
	     INNER JOIN tbProduto
		   ON tbProduto.idFabricante = tbFabricante.idFabricante
		     GROUP BY tbFabricante.nomeFabricante

	-- H listar a média dos preços dos produtos agrupados pelo nome do fornecedor

	   SELECT nomeFornecedor AS 'Nome fornecedor',  --Repetida E
	   AVG (tbProduto.valorProduto) AS 'Média dos preços' FROM tbFornecedor
	     INNER JOIN tbProduto
		   ON tbProduto.idFornecedor = tbFornecedor.idFornecedor
	     GROUP BY tbFornecedor.nomeFornecedor

	-- I listar a soma das vendas agrupadas pelo nome do produto

	    SELECT descricaoProduto AS 'Nome Produto',
		SUM (tbVenda.valorTotalVenda) AS 'Soma das vendas' FROM tbProduto
		  INNER JOIN tbVenda
		    ON tbVenda.idvenda = tbProduto.idProduto
			  GROUP BY tbProduto.descricaoProduto

	-- J listar a soma das vendas pelo nome do cliente somente das vendas realizadas em fev. de 2024
	    
		SELECT nomeCliente as 'Cliente', dataVenda AS 'Data' FROM tbCliente,tbVenda
		  INNER JOIN tbVenda
		     ON tbCliente.idCliente = tbVenda.idCliente

	    SELECT nomeCliente AS 'Nome cliente', 
		SUM (tbVenda.valorTotalVenda) AS 'Soma das vendas' FROM tbCliente
		  INNER JOIN tbVenda
		     ON tbCliente.idCliente = tbVenda.idvenda 
			 WHERE MONTH(dataVenda) = 2 AND YEAR(dataVenda) = 2014
			   GROUP BY tbCliente.nomeCliente

