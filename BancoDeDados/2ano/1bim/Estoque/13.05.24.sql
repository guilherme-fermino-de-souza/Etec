-- FULL e CROSS JOIN e novos dados

/* 1° cadastrar três novos fornecedores; + */
   INSERT INTO  tbFornecedor
     (nomeFornecedor, contatoFornecedor)
   VALUES
     ('Adria', 'Alice Saumes')
	 ,('Caboclo', 'Roberto Ferreira')
	 ,('Liza', 'Ana Barros')

/* 2° Fazer uma consulta utilizando o nome do fornecedor e a descrição dos 
produtos que cada fornecedor fornece; + */
   
   SELECT nomeFornecedor AS 'Fornecedor', 
   tbProduto.descricaoProduto AS 'Produto' FROM tbFornecedor
   INNER JOIN tbProduto ON tbProduto.idFornecedor = tbFornecedor.idFornecedor

/* 3° Criar uma instrução utilizando LEFT JOIN e outra utilizando RIGHT JOIN para
exibir todos os fornecedores, incluindo os três novos; + */
   
   SELECT nomeFornecedor AS 'Fornecedor', 
   tbProduto.descricaoProduto AS 'Produto' FROM tbFornecedor
   LEFT JOIN tbProduto ON tbProduto.idFornecedor = tbFornecedor.idFornecedor

   SELECT descricaoProduto AS 'Produto',
   tbFornecedor.nomeFornecedor AS 'Fornecedor' FROM tbProduto
   RIGHT JOIN tbFornecedor ON tbFornecedor.idFornecedor = tbProduto.idFornecedor

/* 4° Cadastrar três novos produtos deixando para eles o código do fornecedor em 
branco; + */

   INSERT INTO tbProduto
     (descricaoProduto, valorProduto, quantidadeProduto, idFabricante)
   VALUES
     ('Miojo da Mônica', 4.50, 2000, 1)
	 ,('Pão de coco', 14.00, 900, 2)
	 ,('Trakinas de Morango', 9.99, 2200, 3)

/* 5° Criar um SELECT utilizando a instrução FULL JOIN exibindo assim todos os
fornecedores e todos os produtos; + */

   SELECT nomeFornecedor AS 'Fornecedores',
   tbProduto.descricaoProduto AS 'Produto' FROM tbFornecedor
   FULL JOIN tbProduto ON tbProduto.idFornecedor = tbFornecedor.idFornecedor

/* 6° Criar um SELECT com a  instrução CROSS JOIN entre fornecedor e produto. + */
     
/* O que aconteceu? 
  Todos os resutados possíveis de FORNECEDOR com PRODUTO foram mostrados*/
     
/* Quantos registros a consulta retornou?
   78 Registros, completamente inviável para um banco de dados grande */
   
   SELECT nomeFornecedor AS 'Fornecedor',
   tbProduto.descricaoProduto AS 'Produto' FROM tbFornecedor
   CROSS JOIN tbProduto 
