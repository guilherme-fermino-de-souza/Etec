http://localhost/phpmyadmin

create table tbContato(
	idContato int PRIMARY KEY AUTO_INCREMENT,
    nome varchar(50),
    email varchar(50),
    assunto varchar(100),
    mensagem varchar(2000)
);

insert into tbContato values(
	null,
	'Maria dos Santos',
   'maria@gmail.com',
	'Assunto da maria',
   'msg da maria'
);

insert into tbContato values(
	null,
	'André do Teste',
   'andre@gmail.com',
	'Assunto do andre',
   'msg do andre'
);

select * from tbContato;

delete from tbContato where idContato = 1;
