INSERT INTO tbCliente (nomeCliente, cpfCliente)
	VALUES('Ramon Antunes', '12345678901')
	,('Amaral Serqueira', '12345768902')

INSERT INTO tbContaCorrente (numConta, saldoConta, idCliente)
	VALUES(1, 200, 1)
	,(2, 7.000, 2)

INSERT INTO tbDeposito (valorDeposito, dataDeposito, horaDeposito, idNumConta)
	VALUES(150, '08-12-2024', '08-12-2024 13:21:00', 1)
	,(2.000, '13-12-2024', '13-12-2024 20:57:00', 2)

INSERT INTO tbSaque (valorSaque, dataSaque, horaSaque, idNumConta)
	VALUES(50, '15-12-2024', '15-12-2024 17:49:00', 1)
	,(600, '23-12-2024', '23-12-2024 11:26:00', 2)
