CREATE TABLE tbFornecedor (
    idFornecedor INT PRIMARY KEY IDENTITY(1,1),
    nomeFornecedor VARCHAR(100),
    contatoFornecedor VARCHAR(100)
);

CREATE TABLE tbFabricante (
    idFabricante INT PRIMARY KEY IDENTITY(1,1),
    nomeFabricante VARCHAR(100)
);

CREATE TABLE tbCliente (
    idCliente INT PRIMARY KEY IDENTITY(1,1),
    nomeCliente VARCHAR(100),
    cpfCliente VARCHAR(11),
    emailCliente VARCHAR(100),
    sexoCliente CHAR(1),
    dataNascimentoCliente DATE
);

CREATE TABLE tbProduto (
    idProduto INT PRIMARY KEY IDENTITY(1,1),
    descricaoProduto VARCHAR(100),
    valorProduto MONEY,
    quantidadeProduto INT,
    idFabricante INT FOREIGN KEY REFERENCES tbFabricante(idFabricante)
);

CREATE TABLE tbSaidaProduto (
    idSaidaProduto INT PRIMARY KEY IDENTITY(1,1),
    dataSaidaProduto SMALLDATETIME,
    quantidadeSaidaProduto INT,
    idProduto INT FOREIGN KEY REFERENCES tbProduto(idProduto)
);

CREATE TABLE tbVenda (
    idVenda INT PRIMARY KEY IDENTITY(1,1),
    dataVenda SMALLDATETIME,
    valorTotalVenda MONEY,
    idCliente INT FOREIGN KEY REFERENCES tbCliente(idCliente)
);

CREATE TABLE tbItensVenda (
    idItensVenda INT PRIMARY KEY IDENTITY(1,1),
    quantidadeItensVenda INT,
    subTotalItensVenda MONEY,
    idVenda INT FOREIGN KEY REFERENCES tbVenda(idVenda),
    idProduto INT FOREIGN KEY REFERENCES tbProduto(idProduto)
);
