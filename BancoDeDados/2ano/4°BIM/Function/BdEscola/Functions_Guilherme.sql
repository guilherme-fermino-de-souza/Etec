/* FUNCTION 
	Bloco de comando SQL resposável por executar um procedimento e retornar um valor
*/

-- 1. Crie uma função que informada uma data da matrícula , retorne o dia da semana.

CREATE FUNCTION fc_DiaSemana(@DiaSemana DATE) -- Nome função(@parâmetro tipo dado parâmetro)
RETURNS VARCHAR(24) AS -- Retorno --
BEGIN 

DECLARE @DiaSemana VARCHAR(40)
DECLARE @Dia INT -- Váriavel a ser usada na função --

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



-- 2. Crie uma função que de acordo com a carga horária do curso exiba curso rápido ou curso extenso. (Rápido menos de 1000 horas) +.

CREATE FUNCTION fc_TempoCurso(@CargaHoraria INT) -- Nome função(@parâmetro tipo dado parâmetro)
RETURNS VARCHAR (14) AS -- Retorno --
	BEGIN

	DECLARE @TempoCurso VARCHAR(15)

	IF @CargaHoraria < 1000 BEGIN
		SET @TempoCurso = 'Rápido'
	END
	IF @CargaHoraria >= 1000 BEGIN
		SET @TempoCurso = 'Extenso'
	END

	RETURN @TempoCurso
END

-- DROP FUNCTION dbo.fc_TempoCurso --
-- SELECT  cargaHorariaCurso AS 'Carga Horária Curso', tempoCurso=dbo.fc_TempoCurso(cargaHorariaCurso) FROM tbCurso --


-- 3. Crie uma função que de acordo com o valor do curso exiba curso caro ou curso barato. (Curso caro acima de 400) + .

CREATE FUNCTION fc_ValorCurso (@PrecoCurso INT) RETURNS VARCHAR(20) AS
	BEGIN
	DECLARE @valor VARCHAR(15)

	IF @PrecoCurso < 400 BEGIN
	SET @valor = 'Curso Barato'
	END
	IF @PrecoCurso >= 400 BEGIN
	SET @valor = 'Curso Caro' 
	END

	RETURN @valor
END

-- DROP FUNCTION dbo.fc_ValorCurso --
-- SELECT valorCurso AS 'Preço Curso', precoCurso = dbo.fc_ValorCurso(valorCurso) FROM tbCurso + --

-- 4. Criar uma função que informada a data da matrícula converta-a no formato dd/mm/aaaa.]
CREATE FUNCTION fc_DataMatricula(@DataMatricula DATETIME) RETURNS VARCHAR(20) AS
	BEGIN
	DECLARE @data VARCHAR(10)
	SET @data = CONVERT(VARCHAR(10), @DataMatricula, 103)
	RETURN @data
END

-- DROP FUNCTION dbo.fc_DataMatricula --
-- SELECT  dataMatricula AS 'Data Matrícula', Data=dbo.fc_DataMatricula(dataMatricula) FROM tbMatricula --

