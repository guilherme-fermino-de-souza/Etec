CREATE DATABASE bdLoginAula;

--DROP DATABASE bdLoginAula;

USE bdLoginAula;

--DROP TABLE tbUsuario;
/* Tabela das contas geradas no site */
CREATE TABLE tbUsuario (
    idUsuario INT PRIMARY KEY AUTO_INCREMENT
    ,nomeUsuario VARCHAR (60)
    ,senhaUsuario VARCHAR (255) /* Ideal para armazenar Hash*/
    ,tipoUsuario VARCHAR(4)
);
