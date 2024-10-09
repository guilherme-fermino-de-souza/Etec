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
SELECT * FROM tbContaCorrente
SELECT * FROM tbDeposito

INSERT INTO tbDeposito (valorDeposito, dataDeposito, horaDeposito, idNumConta)
	VALUES(1125, '14-12-2024', '14-12-2024 10:06:00', 1)

/*	DROP TRIGGER tgAtualizaSaldoConCor	*/
	
--B) Ao ser feito um saque atualize o saldo da conta corrente, descontando o valor da última (caso haja saldo bastante)
CREATE TRIGGER tgAtualizaSaldoContaCorrente 
ON tbSaque
AFTER INSERT
AS

	 DECLARE @idNumConta INT, @idSaque INT, @valSaque INT
 
	 SET @idNumConta = (SELECT idNumConta FROM tbSaque WHERE idNumConta = @idNumConta)

	 SELECT @idSaque = idSaque
 
	 SELECT @valSaque = valorSaque
 
	 UPDATE tbContaCorrente
		SET saldoConta = saldoConta - @valSaque
		 WHERE idNumConta = @idNumConta


	-- Testando Trigger
SELECT * FROM tbContaCorrente
SELECT * FROM tbSaque

INSERT INTO tbSaque (valorSaque, dataSaque, horaSaque, idNumConta)
	VALUES(55, '15-12-2024', '15-12-2024 17:49:00', 1)
