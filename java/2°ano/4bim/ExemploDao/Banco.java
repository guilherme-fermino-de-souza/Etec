-- Ligar Eclipse ao MySql Exemplo --
CREATE DATABASE bdExemploDao
-- Tabela Produto
CREATE TABLE tbProduto(
    idProduto INT PRIMARY KEY AUTO_INCREMENT
    ,produto VARCHAR(40)
    ,produtoValor FLOAT
);
