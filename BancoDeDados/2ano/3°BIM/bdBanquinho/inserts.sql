INSERT INTO tbCliente (nomeCliente, cpfCliente)
	VALUES('Ramon Antunes', '12345678901')
	,('Amaral Serqueira', '12345768902')

INSERT INTO tbContaCorrente (numConta, saldoConta, idCliente)
	VALUES(1, 200, 1)
	,(2, 7.000, 2)

INSERT INTO tbDeposito (valorDeposito, dataDeposito, horaDeposito, idNumConta)
	VALUES(150, '08-12-2024', '08-12-2024 13:21:00', 1)
	,(2.000, '13-12-2024', '13-12-2024 20:57:00', 2)

