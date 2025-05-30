-- 1. Crie uma função que informada uma data da matrícula , retorne o dia da semana.		OBS:
-- O código desta questão foi-nos repassado pela profa. Aline Mendonça como base para resolução de questões posteriores.
CREATE FUNCTION fc_diaSemanaMatri(@dataMatricula DATETIME)
	RETURNS VARCHAR(40)
AS
BEGIN
	DECLARE @diaSemana AS VARCHAR(40), @dia INT
	SET @dia = DATEPART(DW, @dataMatricula)
	IF @dia = 1
		BEGIN
		SET @diaSemana = 'Domingo.'
		END
	IF @dia = 2
		BEGIN
		SET @diaSemana = 'Segunda-feira.'
		END
	IF @dia = 3
		BEGIN
		SET @diaSemana = 'Terça-feira.'
		END
	IF @dia = 4
		BEGIN
		SET @diaSemana = 'Quarta-feira.'
		END
	IF @dia = 5
		BEGIN
		SET @diaSemana = 'Quinta-feira.'
		END
	IF @dia = 6
		BEGIN
		SET @diaSemana = 'Sexta-feira.'
		END
	IF @dia = 7
		BEGIN
		SET @diaSemana = 'Sábado.'
		END
	RETURN @diaSemana
END

/*DROP FUNCTION dbo.fc_diaSemanaMatri
	SELECT dataMatricula AS 'Data da matrícula', DiaDaSemana = dbo.fc_diaSemanaMatri(dataMatricula) fROM tbMatricula*/

-- 2. Crie uma função que de acordo com a carga horária do curso exiba curso rápido ou curso extenso. (Rápido menos de 1000 horas).
CREATE FUNCTION fc_cargaHorariaCurso(@carHorCur INT)
	RETURNS VARCHAR(20)
AS
BEGIN
	DECLARE @tamanSo VARCHAR(20)
	IF @carHorCur < 1000
		BEGIN
		SET @tamanSo = 'Curso rápido.'
		END
	IF @carHorCur >= 1000
		BEGIN
		SET @tamanSo = 'Curso extenso.'
		END
	
	RETURN @tamanSo
END

/*DROP FUNCTION dbo.fc_cargaHorariaCurso
	SELECT cargaHorariaCurso AS 'Carga horária do curso', CargaHorariaCurso = dbo.fc_cargaHorariaCurso(cargaHorariaCurso) fROM tbCurso*/


-- 3. Crie uma função que de acordo com o valor do curso exiba curso caro ou curso barato. (Curso caro acima de 400).
CREATE FUNCTION fc_valorCurso (@valCur INT)
	RETURNS VARCHAR(20)
AS
BEGIN
	DECLARE @classiVal VARCHAR(20)
	IF @valCur < 400
		BEGIN
		SET @classiVal = 'Curso barato.'
		END
	IF @valCur >= 400
		BEGIN
		SET @classiVal = 'Curso caro.'
		END
	
	RETURN @classiVal
END

/*DROP FUNCTION dbo.fc_fc_valorCurso
	SELECT valorCurso AS 'Valor do curso', TipoDeValorDoCurso = dbo.fc_valorCurso(valorCurso) fROM tbCurso*/



-- 4. Criar uma função que informada a data da matrícula converta-a no formato dd/mm/aaaa.
CREATE FUNCTION fc_conversaoDataMatri(@dataMatricula DATETIME)
	RETURNS VARCHAR(12)
AS
BEGIN
	DECLARE @converDataMa VARCHAR(12)
	SET @converDataMa = CONVERT(VARCHAR(10), @dataMatricula, 103)

	RETURN @converDataMa
END

/*DROP FUNCTION dbo.fc_conversaoDataMatri
	SELECT dataMatricula, DataMatriculaModeloBrasileiro = dbo.fc_conversaoDataMatri(dataMatricula) FROM tbMatricula
*/
