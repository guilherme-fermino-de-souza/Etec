MERGE tbAlunos3ano desti
	USING (
		SELECT rmAluno, nomeAluno, statusAluno FROM tbAlunos2a WHERE statusAluno = 'APROVADO'
			UNION ALL
		SELECT rmAluno, nomeAluno, statusAluno FROM tbAlunos2b WHERE statusAluno = 'APROVADO'
	) ori
	ON desti.rmAluno = ori.rmAluno
	WHEN NOT MATCHED BY TARGET THEN
		INSERT (rmAluno, nomeAluno, statusAluno) VALUES (ori.rmAluno, ori.nomeAluno, ori.statusAluno);

SELECT * FROM tbAlunos3ano
