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
    ('Dom Casmurro', 300, 1, 1, 1),
    ('Memórias Póstumas de Brás Cubas', 250, 1, 1, 1),
    ('Quincas Borba', 200, 1, 1, 1),
    ('Meu livro de cordel', 150, 2, 2, 2),
    ('Vintém de cobre', 180, 2, 2, 2),
    ('Estórias da Casa Velha da Ponte', 120, 2, 2, 2),
    ('Vidas Secas', 220, 3, 3, 3),
    ('Angústia', 180, 3, 3, 3),
    ('São Bernardo', 200, 3, 3, 3),
    ('A hora da estrela', 180, 1, 4, 1),
    ('A paixão segundo G.H.', 160, 1, 4, 1),
    ('Laços de família', 150, 1, 4, 1),
    ('O tempo e o vento', 400, 1, 5, 1),
    ('Incidente em Antares', 350, 1, 5, 1),
    ('Clarissa', 320, 1, 5, 1);

	--EXERCÍCIOS--
