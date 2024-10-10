/*SELECT * FROM tbContaCorrente
SELECT * FROM tbDeposito

2 - Criar dois triggers que:			''      DATE '1990-02-10'     smalldatetime '08-02-2016 23:21:00'

A) Ao ser feito um depósito atualize o saldo da conta corrente, somando à quantia depositada*/
CREATE TRIGGER tgAtualizaSaldoConCor
ON tbDeposito
FOR INSERT
AS

	DECLARE @idNumConta INT, @idDeposito INT, @valDeposito MONEY
 
	SET @idNumConta = (SELECT idNumConta FROM INSERTED)

	SELECT @idDeposito = idDeposito, @valDeposito = valorDeposito FROM INSERTED
 
	--SET @saldCont = (SELECT saldoConta FROM tbContaCorrente WHERE idNumConta = @idNumConta)
	UPDATE tbContaCorrente
		SET saldoConta = saldoConta + @valDeposito
			WHERE idNumConta = @idNumConta

	-- Testando Trigger
SELECT * FROM tbCliente
SELECT * FROM tbContaCorrente
SELECT * FROM tbDeposito

	/* Inserts p/ teste dessa e da próxima questão
	INSERT INTO tbCliente (nomeCliente, cpfCliente)
	VALUES('Ramon Antunes', '12345678901')
	,('Amaral Serqueira', '12345768902')

	INSERT INTO tbContaCorrente (saldoConta, idCliente)
	VALUES(0, 1)
	,(0, 2)
	*/
INSERT INTO tbDeposito (valorDeposito, dataDeposito, horaDeposito, idNumConta)
	VALUES(1125, '14-12-2024', '14-12-2024 10:06:00', 2)
	
INSERT INTO tbDeposito (valorDeposito, dataDeposito, horaDeposito, idNumConta)
	VALUES(200, '09-12-2024', '09-12-2024 22:33:00', 1)
/*	DROP TRIGGER tgAtualizaSaldoConCor	*/
	
/*	DROP TRIGGER tgMinusSaldoContaCorrente 	*/
	
--B) Ao ser feito um saque atualize o saldo da conta corrente, descontando o valor da última (caso haja saldo bastante)
CREATE TRIGGER tgMinusSaldoContaCorrente 
ON tbSaque
AFTER INSERT
AS

	 DECLARE @idNumConta INT, @idSaque INT, @valSaque MONEY, @saldCont MONEY
 
	 SET @idNumConta = (SELECT idNumConta FROM INSERTED)

	 SET @saldCont = (SELECT saldoConta FROM tbContaCorrente WHERE idNumConta = @idNumConta)

	 SELECT @idSaque = idSaque, @valSaque = valorSaque FROM INSERTED
 
	IF (@valSaque > @saldCont)
	BEGIN
		PRINT('Não foi possível efetuar o saque pois o valor de R$' + @valSaque +' é superior ao saldo atual da conta - a saber: R$' + @saldCont + '.')
	END
	ELSE
	BEGIN
	 UPDATE tbContaCorrente
		SET saldoConta = saldoConta - @valSaque
		 WHERE idNumConta = @idNumConta
	END

	-- Testando Trigger
SELECT * FROM tbContaCorrente
SELECT * FROM tbSaque
SELECT * FROM tbDeposito

INSERT INTO tbSaque (valorSaque, dataSaque, horaSaque, idNumConta)
	VALUES(55, '15-12-2024', '15-12-2024 17:49:00', 1)
	
INSERT INTO tbSaque (valorSaque, dataSaque, horaSaque, idNumConta)
	VALUES(150, '17-12-2024', '17-12-2024 15:53:00', 1)
