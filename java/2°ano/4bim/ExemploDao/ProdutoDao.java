package DAO; /*Data Acess Object
(Objeto de Acesso a Dados) do Produto */

import java.sql.SQLException;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Model.Produto; //Importação do Produto

public class ProdutoDao {
	
	private Connection connection;
	
	public ProdutoDao() { //Construtor(O mesmo nome da classe)
		this.connection = new ConectionFactory().getConnection();
		//Gera conexão com o banco toda vez que se instacia um objeto
	}
	
	//ADICIONAR Produto Banco De Dados
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
	
	//CONSULTA Banco De Dados
	public List<Produto> getLista() throws SQLException{
		try {
			List<Produto> produtos = new ArrayList<Produto>(); //Define a Lista
			
			PreparedStatement stmt = this.connection.prepareStatement("select * from tbProduto"); //Prepara a instrução MySQL
			ResultSet rs = stmt.executeQuery(); //Armazena e Executa instrução em RS
			
			while(rs.next()) { // Busca todos o objetos armazenados no BD
				Produto produto = new Produto();
				produto.setIdProduto(rs.getInt(1)); //Id
				produto.setProduto(rs.getString(2)); //Nome
				produto.setValorProduto(rs.getDouble(3)); //Valor

				produtos.add(produto); //Cria um objeto para cada produto buscado
			}
			
			rs.close();
			stmt.close();
			
			return produtos;
		} 
		catch(SQLException e) {
			throw new RuntimeException("Erro ao consultar tabela", e);
		}
		finally {
			connection.close();
		}
	}
	
	//UPDATE Banco De Dados
	public void alterar(Produto produto) throws SQLException{
		String sql = "update tbProduto set produto = ? , produtoValor = ? where idProduto = ?";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, produto.getProduto());
			stmt.setDouble(2, produto.getValorProduto());
			stmt.setInt(3, produto.getIdProduto());
			
			stmt.execute();
			stmt.close();
			System.out.println("Dados Alterados Com Sucesso");
		}
		catch(SQLException e) {
			throw new RuntimeException("Erro ao dar update na tabela", e);
		}
		finally {
			connection.close();
		}
	}
	
	//Exclusão Banco De Dados
	public void excluir(Produto produto) throws SQLException{
		
		String sql = "delete from tbProduto where idProduto = ?";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, produto.getIdProduto());
			stmt.execute();
			stmt.close();
			System.out.println("Dados excluidos com sucesso");
		}
		catch(SQLException e) {
			throw new RuntimeException("Erro ao excluir tabela", e);
		}
		finally {
			connection.close();
		}
	}
}
