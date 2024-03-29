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
    
