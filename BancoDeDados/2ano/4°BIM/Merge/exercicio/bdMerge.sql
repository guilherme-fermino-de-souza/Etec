-- TESTE, dps FINAL

--MERGE tb
MERGE tbAlunos3ano desti
	USING  tbAlunos2a ori
	ON ori.statusAluno = 'APROVADO'
	WHEN NOT MATCHED THEN	
		IF (SELECT rmAluno FROM tbAluno2a WHERE statusAluno = 'APROVADO')
		BEGIN
			INSERT VALUES (ori.rmAluno, ori.nomeAluno, ori.statusAluno)
		ELSE
		 UPDATE ori.statusAluno = 'RETIDO'
--	WHEN NOT MATCHED THEN
--		UPDATE SET ori.statusAluno = 'RETIDO';

