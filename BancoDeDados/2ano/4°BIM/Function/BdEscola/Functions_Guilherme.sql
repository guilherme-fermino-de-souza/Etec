/* FUNCTION 
	Bloco de comando SQL resposável por executar um procedimento e retornar um valor
*/

-- 1. Crie uma função que informada uma data da matrícula , retorne o dia da semana.

CREATE FUNCTION fc_DiaSemana(@DiaSemana DATETIME) -- Nome função(@parâmetro tipo dado parâmetro)
RETURNS VARCHAR(14) AS
BEGIN 

DECLARE @Dia INT

SET @Dia = DATEPART(dw, @DiaSemana)

	IF @Dia = 1 BEGIN
		SET @DiaSemana='Domingo'
	END

	IF @Dia = 2 BEGIN
		SET @DiaSemana='Segunda-Feira'
	END

	IF @Dia = 3 BEGIN	
	SET @DiaSemana='Terça-Feira'
	END

	IF @Dia = 4 BEGIN
	SET @DiaSemana = 'Quarta-Feira'
	END
	IF @Dia = 5 BEGIN
	SET @DiaSemana = 'Quinta-Feira'
	END

	IF @Dia = 4 BEGIN
	SET @DiaSemana = 'Sexta-Feira'
	END

	IF @Dia = 7 BEGIN
	SET @DiaSemana = 'Sábado'
	END

	RETURN @DiaSemana -- Valor Retornado
	END

-- DROP FUNCTION dbo.fc_DiaSemana --
 SELECT  dataMatricula AS 'Data Matrícula', DiaDaSemana=dbo.fc_DiaSemana(dataMatricula) FROM tbMatricula



-- 2. Crie uma função que de acordo com a carga horária do curso exiba curso rápido ou curso extenso. (Rápido menos de 1000 horas).



-- 3. Crie uma função que de acordo com o valor do curso exiba curso caro ou curso barato. (Curso caro acima de 400).



-- 4. Criar uma função que informada a data da matrícula converta-a no formato dd/mm/aaaa.
