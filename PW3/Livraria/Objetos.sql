CREATE DATABASE dbLivraria /*Nome do banco */

Cliente:  OBJETO
  idCliente AUTO_INCREMENT
  nomeCliente
  emailCliente 
  cpfCliente
  logradouro

Vendedor: OBJETO
  idVendedor AUTO_INCREMENT
  nome
  email
  cpf
  logradouro

AUTOR:
  idAutor AUTO_INCREMENT
  nome
  dataNascimento
  

Livro: OBJETO
  idLivro AUTO_INCREMENT
  titulo
  sinopse  
  anoPublicacao
  numPaginas
  quantEstoque
  preco
  genero FOREIGN KEY
  autorLivro FOREIGN KEY
  vendedorLivro FOREIGN

GENERO:
  idGenero AUTO_INCREMENT
  tipoGenero

LIVRO_GENEROS: //muitos para muitos, cada livro pode ter vários gêneros
  CREATE TABLE Livro_Generos (
  idLivro INT,
  idGenero INT,
  PRIMARY KEY (idLivro, idGenero),
  FOREIGN KEY (idLivro) REFERENCES Livro(idLivro),
  FOREIGN KEY (idGenero) REFERENCES Genero(idGenero)
);

FORMA_PAGAMENTO:
CREATE TABLE Forma_Pagamento (
  idFormaPagamento INT AUTO_INCREMENT PRIMARY KEY,
  tipoPagamento VARCHAR(50) NOT NULL
);

VENDA:
CREATE TABLE Itens_Venda (
  idVenda INT,
  idLivro INT,
  quantidade INT NOT NULL,
  precoUnitario DECIMAL(10, 2) NOT NULL,
  PRIMARY KEY (idVenda, idLivro),
  FOREIGN KEY (idVenda) REFERENCES Venda(idVenda),
  FOREIGN KEY (idLivro) REFERENCES Livro(idLivro)
);

ITENS_VENDA:
CREATE TABLE Venda (
  idVenda INT AUTO_INCREMENT PRIMARY KEY,
  idCliente INT,
  idVendedor INT,
  idFormaPagamento INT,
  dataVenda TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  valorTotal DECIMAL(10, 2) NOT NULL,
  FOREIGN KEY (idCliente) REFERENCES Cliente(idCliente),
  FOREIGN KEY (idVendedor) REFERENCES Vendedor(idVendedor),
  FOREIGN KEY (idFormaPagamento) REFERENCES Forma_Pagamento(idFormaPagamento)
);

/**************************************************************Contato******************************************************************************************/

CREATE TABLE contato (
  idContato INT AUTO_INCREMENT PRIMARY KEY,
  emailContato varchar
  assuntoContato
  tesxtoContato
)
