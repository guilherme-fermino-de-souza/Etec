CREATE DATABASE bdLojaEstoque

/*DROP DATABASE bdLojaEstoque*/

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
   ,valorTotalVenda INT NOT NULL
   ,idCliente INT FOREIGN KEY REFERENCES tbCliente(idCliente)
   )
CREATE TABLE tbProduto(
   idProduto INT PRIMARY KEY IDENTITY(1,1)
   ,descricaoProduto VARCHAR (60) NOT NULL
   ,valorProduto INT NOT NULL
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
