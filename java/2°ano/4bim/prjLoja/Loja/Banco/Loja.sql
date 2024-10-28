-- Ligar Eclipse ao MySql --
CREATE DATABASE bdLoja

    -- DROP DATABASE bdLoja --
-- Cadastrar Cliente --
CREATE TABLE tbCliente( -- Tabela Cliente
    idCliente INT PRIMARY KEY AUTO_INCREMENT
    ,nomeCliente VARCHAR(60)
    ,sexoCliente CHAR(1)
    ,dataNascimentoCliente DATE
    ,cpfCliente CHAR(11)  -- Logradouro
    ,ruaCliente VARCHAR(30)
    ,bairroCliente VARCHAR(30)
    ,CidadeCliente VARCHAR(20)
    ,EstadoCliente VARCHAR(20)
    ,cepCliente VARCHAR(60)
);

CREATE TABLE tbTelefoneCliente( -- Tabela Telefone Cliente
    idTelefoneCliente INT PRIMARY KEY AUTO_INCREMENT
    ,numeroTelefoneCliente CHAR(11)
    ,cliente_id INT
    ,FOREIGN KEY (cliente_id) REFERENCES tbCliente(idCliente)
);

-- CADASTRAR PRODUTO --
CREATE TABLE tbCategoriaProduto( -- Tabela Categoria Produto
    idCategoriaProduto INT PRIMARY KEY AUTO_INCREMENT
    ,nomeCategoriaProduto VARCHAR(35)
);   
    
CREATE TABLE tbProduto( -- Tabela Produto
    idProduto INT PRIMARY KEY AUTO_INCREMENT
    ,nomeProduto VARCHAR(30)
    ,valorProduto DOUBLE
    ,quantidadeProduto INT
    ,categoriaProduto_id INT
    ,FOREIGN KEY (categoriaProduto_id) REFERENCES tbCategoriaProduto(idCategoriaProduto)
);

-- CADASTRAR PEDIDO --
CREATE TABLE tbPedido( -- Tabela Pedido
    idPedido INT PRIMARY KEY AUTO_INCREMENT
   ,dataPedido DATE 
   ,valorTotalPedido DOUBLE
   ,dataEntregaPedido DATE
   ,cliente_id INT
   ,FOREIGN KEY (cliente_id) REFERENCES tbCliente(idCliente)
);

CREATE TABLE tbItensPedido( -- Tabela Itens Pedido 
   idItensPedido INT PRIMARY KEY AUTO_INCREMENT
   ,quantidadeProdutoItensPedido INT
   ,pedido_id INT
   ,FOREIGN KEY (pedido_id) REFERENCES tbPedido(idPedido)
   ,produto_id INT 
   ,FOREIGN KEY (produto_id) REFERENCES tbProduto(idProduto)
);
