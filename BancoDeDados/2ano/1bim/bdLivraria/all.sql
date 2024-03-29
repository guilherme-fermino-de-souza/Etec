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

    INSERT INTO tbAutor
    (nomeAutor)
	  VALUES
	   ('Machado de Assis')
	   ,('Cora Coralina')
	   ,('Graciliano Ramos')
	   ,('Clarice Lispector')
	   ,('Erico Verissimo')

   INSERT INTO tbEditora
    (nomeEditora)
	  VALUES
	   ('Cia das Letra')
	   ,('Atica')
	   ,('Saraiva')
	   
   INSERT INTO tbGenero
     (nomeGenero)
	   VALUES
	     ('Romance')
		 ,('Posia')
		 ,('Literatura Brasileira')
	--chatGPT/15livros, 3autor, 5editora, 5genero--
	-- Inserir 3 livros para cada autor
-- Inserir 3 livros para cada autor
-- Inserir livros para cada autor, editora e gênero
   INSERT INTO tbLivro (nomeLivro, numPaginas, idGenero, idAutor, idEditora)
    VALUES 
     ('Dom casmurro', 300, 1, 1, 1),
     ('Memórias póstumas de brás cubas', 250, 1, 1, 1),
     ('Quincas borba', 200, 1, 1, 1),
     ('Meu livro de cordel', 150, 2, 2, 2),
     ('Vintém de cobre', 180, 2, 2, 2),
     ('Estórias da casa velha da ponte', 120, 2, 2, 2),
     ('Vidas secas', 220, 3, 3, 3),
     ('Angústia', 180, 3, 3, 3),
     ('São bernardo', 200, 3, 3, 3),
     ('A hora da estrela', 180, 1, 4, 1),
     ('A paixão segundo g.h.', 160, 1, 4, 1),
     ('Laços de família', 150, 1, 4, 1),
     ('O tempo e o vento', 400, 1, 5, 1),
     ('Incidente em antares', 350, 1, 5, 1),
     ('Clarissa', 320, 1, 5, 1);

	--EXERCÍCIOS--

	--A
    SELECT 'A - Total de livros que começam com a letra P' AS Descricao, COUNT(*) AS Total_Livros FROM tbLivro
	 WHERE nomeLivro LIKE 'P%';

	--B
    SELECT MAX(numPaginas) AS 'B - Maior número de páginas dentre todos os livros' FROM tbLivro

	--C
    SELECT MIN(numPaginas) AS 'C - Menor número de páginas dentre todos os livros' FROM tbLivro

	--D
	SELECT AVG(numPaginas) AS 'D - Média de páginas entre todos os livros' FROM tbLivro

	--E
	SELECT SUM(numPaginas) AS 'E - Soma do número de páginas da editora código 1' FROM tbLivro
	WHERE idEditora = 1;

	--F
	SELECT SUM(numPaginas) AS 'F - Soma do número de páginas dos livros que começam com a letra A' FROM tbLivro
	WHERE nomeLivro LIKE 'A%';

	--G
	SELECT AVG(numPaginas) AS 'G - A média do número de páginas dos livros que sejam do autor de código 03' FROM tbLivro
	WHERE idAutor = 3;

	--H
	SELECT COUNT(*) AS 'H - A quantidade de livros da editora de código 04' FROM tbLivro
	WHERE idEditora = 4;

	--I
	SELECT AVG(numPaginas) AS 'I - A média do número de páginas de livros que possuam a palavra Estrela no nome' FROM tbLivro
	WHERE nomeLivro LIKE '%Estrela%';

	--J
	SELECT COUNT(*) AS 'J - Quantidade de livros que possuam a palavra Poema em seu nome' FROM tbLivro
	WHERE nomeLivro LIKE '%Poema%';

	--K
	SELECT nomeLivro, nomeGenero, COUNT(*) AS Quantidade FROM tbLivro
	INNER JOIN tbGenero ON tbLivro.idGenero = tbLivro.idGenero
	GROUP BY nomeLivro, nomeGenero;
    
