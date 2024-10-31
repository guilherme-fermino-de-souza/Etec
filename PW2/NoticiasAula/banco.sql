CREATE DATABASE dbNoticias

CREATE TABLE tbNoticias (
    idNoticias INT PRIMARY KEY AUTO_INCREMENT
    ,tituloNoticias VARCHAR(100)
    ,subtituloNoticias VARCHAR(100)
    .descNoticias VARCHAR(555)
    ,imgNoticias INT
);

CREATE TABLE tbParagrafo (
    idParagrafo INT PRIMARY KEY AUTO_INCREMENT
    ,textoParagrafo VARCHAR(1555)
    ,noticias_id INT
    ,FOREIGN KEY (noticias_id) REFERENCES tbNoticias(idNoticias)
);
