package DAO; /*Data Acess Object
(Objeto de Acesso a Dados) do Produto */

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import Model.Produto; //Importação do Produto

public class ProdutoDao {
	
	private Connection connection;
	
	public ProdutoDao() { //Construtor(O mesmo nome da classe)
		this.connection = new ConectionFactory().getConnection();
		//Gera conexão com o banco
	}
	
	public void adicionar(Produto produto) throws SQLException {
		try {
			String sql = "insert into tbProduto"+
					"(produto, produtoValor)"+
					"values (?, ?)";
			
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, produto.getProduto());
			stmt.setDouble(2, produto.getValorProduto());
			stmt.execute();
			stmt.close();
			System.out.println("Produto Cadastrado Com Sucesso");
		} 
		catch(SQLException e) {
			System.out.println("Erro: "+e);
		}
		finally {
			connection.close();
		}
	}

}
