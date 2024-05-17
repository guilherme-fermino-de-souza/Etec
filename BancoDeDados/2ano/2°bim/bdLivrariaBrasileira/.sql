CREATE DATABASE bdLivrariaBrasileira

CREATE TABLE tbAutor(
   idAutor INT PRIMARY KEY IDENTITY(1,1)
   ,nomeAutor VARCHAR (70) NOT NULL
   )

CREATE TABLE tbEditora(
   idEditora INT PRIMARY KEY IDENTITY(1,1)
   ,nomeEditora VARCHAR (70) NOT NULL
   )

CREATE TABLE tbGenero(
   idGenero INT PRIMARY KEY IDENTITY(1,1)
   ,nomeGenero VARCHAR (70) NOT NULL
   )

CREATE TABLE tbLivro(
   idLivro INT PRIMARY KEY IDENTITY(1,1)
   ,nomeLivro VARCHAR (70) NOT NULL
   ,numPaginas INT NOT NULL
   ,idGenero INT FOREIGN KEY REFERENCES tbGenero(idGenero)
   ,idAutor INT FOREIGN KEY REFERENCES tbAutor(idAutor)
   ,idEditora INT FOREIGN KEY REFERENCES tbEditora(idEditora)
   )
-- Executado até aqui
-- Inserts

INSERT INTO tbAutor
    (nomeAutor)
	  VALUES
	   ('Chico Buarque')
	   ,('Jorge Amado')
	   ,('J.K. Rowling')
	   ,('William Shakespeare')
	   ,('Monteiro Lobato')
	   ,('Cora Coralina')
	   ,('Clarice Lispector')
   INSERT INTO tbEditora
    (nomeEditora)
	  VALUES
	   ('Melhoramentos')
	   ,('Globo')
	   ,('Ática')
	   ,('Companhia das Letras')
	   ,('Abril')

   INSERT INTO tbGenero
     (nomeGenero)
	   VALUES
	     ('Ficção')
		 ,('Romance')
		 ,('Tragédia')
	
   INSERT INTO tbLivro (nomeLivro, numPaginas, idGenero, idEditora, idAutor)
    VALUES 
     ('Budapeste', 176, 2, 4, 1),
     ('O Brilho da Seda', 454, 2, 5, 3),
     ('Gabriela, Cravo e Canela', 214, 1, 2, 2),
     ('Reinações de Narizinho', 143, 2, 2, 5),
     ('Romeu e Julieta', 421, 1, 3, 4),
     ('O Irmão Alemão', 478, 1, 4, 1),
     ('Terra Sem Fim', 125, 1, 3, 2),
     ('Animais Fantásticos e Onde Habitam', 267, 2, 4, 3);
-- Executado até aqui
-- Joins

	-- Questão A) A quantidade de livros agrupado [agrupada] pelo nome do gênero
	SELECT COUNT(tbLivro.idLivro) AS 'Quantidade de livros',
	nomeGenero AS 'Gênero' FROM tbLivro
		FULL JOIN tbGenero ON tbLivro.idGenero = tbGenero.idGenero
		GROUP BY nomeGenero

	-- Questão B) A soma das páginas agrupada pelo nome do autor
	SELECT SUM(tbLivro.numPaginas) AS 'Soma das páginas',
	nomeAutor 'Autor' FROM tbLivro
		FULL JOIN tbAutor ON tbLivro.idAutor = tbAutor.idAutor
		GROUP BY nomeAutor

	-- Questão C) A média de páginas agrupada pelo nome do autorem ordem alfabética (de A a Z)
	SELECT AVG(tbLivro.numPaginas) AS 'Média das páginas',
	nomeAutor 'Autor' FROM tbLivro
		FULL JOIN tbAutor ON tbLivro.idAutor = tbAutor.idAutor
		GROUP BY nomeAutor

	-- Questão D) A quantidade de livros agrupada pelo nome da editoraem ordem alfabética inversa (de Z a A)
	SELECT COUNT(tbLivro.idLivro) AS 'Quantidade de livros',
	nomeEditora AS 'Editora'  FROM tbLivro
		FULL JOIN tbEditora ON tbLivro.idEditora = tbEditora.idEditora
		GROUP BY nomeEditora 			-- NÃO CONCLUÍDA

	-- Questão E) A soma de páginas dos livros agrupados pelo nome de autores cujo nome comece com a letra “C”
	SELECT SUM(numPaginas) AS 'Soma das páginas',
	nomeAutor 'Autor de inicial C ' FROM tbLivro
		FULL JOIN tbAutor ON tbLivro.idAutor = tbAutor.idAutor
		WHERE tbAutor.nomeAutor = 'C%'
		GROUP BY nomeAutor		-- NÃO CONCLUÍDA

	-- Questão F) A  quantidade  de  livros  agrupados  pelo  nome  do  autor,  
	--cujo  nome  do  autor  seja “Machado de Assis”, “Cora Coralina”, “Graciliano Ramos”, “Clarice Lispector”
	SELECT SUM(tbLivro.numPaginas) AS 'Soma das páginas',
	nomeAutor 'Autor' FROM tbLivro
		FULL JOIN tbAutor ON tbLivro.idAutor = tbAutor.idAutor
		WHERE nomeAutor = 'Machado de Assis' OR 'Graciliano Ramos' OR 'Clarisce Lispector' OR 'Cora Coralina'
		GROUP BY nomeAutor		-- NÃO CONCLUI´´DA
