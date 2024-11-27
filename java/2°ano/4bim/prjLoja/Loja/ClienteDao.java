package DAO;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Model.Cliente;

public class ClienteDao {
	
	private Connection connection;
	
	public ClienteDao() { //Construtor(O mesmo nome da classe)
		this.connection = new ConectionFactory().getConnection();
		//Gera conexão com o banco toda vez que se instacia um objeto
	}
	
	//ADICIONAR Categoria Produto Banco De Dados
	public void adicionarTelefonCliente(Cliente telefoneCliente) throws SQLException {
		try {
			String sql = "insert into tbTelefoneCliente"+
				"(numeroTelefoneCliente, cliente_id)"+
				"values (?, ?)";
			
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, telefoneCliente.getTelefoneCliente());
			stmt.setInt(2, telefoneCliente.getIdTelefoneCliente());
			stmt.execute();
			stmt.close();
			JOptionPane.showMessageDialog(null,"Categoria Produto Cadastrado Com Sucesso");
		} 
		catch(SQLException e) {
			System.out.println("Erro ao registrar Categoria Produto: "+e);
		}
	}
	
	//ADICIONAR Produto Banco De Dados
	public void adicionarCliente(Cliente cliente) throws SQLException {
		try {
			String sql = "insert into tbCliente"+
				"(nomeCliente, sexoCliente, cpfCliente, ruaCliente, bairroCliente, cidadeCliente, estadoCliente, cepCliente)"+
				"values (?, ?, ?, ?, ?, ?, ?, ?)";
			
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, cliente.getNomeCliente());
			stmt.setString(2, cliente.getSexoCliente());
			stmt.setInt(3, cliente.getCPF());
			stmt.setString(4, cliente.getRuaCliente());
			stmt.setString(5, cliente.getBairroCliente());
			stmt.setString(6, cliente.getCidadeCliente());
			stmt.setString(7, cliente.getEstadoCliente());
			stmt.setInt(8, cliente.getCepCliente());
			stmt.execute();
			stmt.close();
			JOptionPane.showMessageDialog(null,"Cliente Cadastrado Com Sucesso");
		} 
		catch(SQLException e) {
			System.out.println("Erro ao registrar Produto: "+e);
		}
	}
	
	//CONSULTA tbTelefoneCliente
		public List<Cliente> getListaTelefoneCliente() throws SQLException{
			List<Cliente> telefoneCliente = new ArrayList<Cliente>(); //Define a Lista
			try {		
				PreparedStatement stmt = this.connection.prepareStatement("select * from tbTelefoneCliente"); //Prepara a instrução MySQL
				ResultSet rs = stmt.executeQuery(); //Armazena e Executa instrução em RS
				
				while(rs.next()) { // Busca todos o objetos armazenados no BD
					Cliente telefoneCliente1 = new Cliente();
					telefoneCliente1.setIdTelefoneCliente(rs.getInt(1)); //Id Categoria
					telefoneCliente1.setTelefoneCliente(rs.getInt(2)); //Nome Categoria
					telefoneCliente1.add(telefoneCliente); //Cria um objeto para cada produto buscado
				}	
				
			} 
			catch(SQLException e) {
				throw new RuntimeException("Erro ao consultar tabela", e);
			}
			return telefoneCliente;
		}
		//CONSULTA tbCliente
		public List<Cliente> getListaCliente() throws SQLException{
			List<Cliente> clientes = new ArrayList<Cliente>(); //Define a Lista
			try {
				PreparedStatement stmt = this.connection.prepareStatement("select * from tbCliente"); //Prepara a instrução MySQL
				ResultSet rs = stmt.executeQuery(); //Armazena e Executa instrução em RS
				
				while(rs.next()) { // Busca todos o objetos armazenados no BD
					Cliente cliente = new Cliente();
					cliente.setNomeCliente(rs.getString(2)); //Nome cliente
					cliente.setSexoCliente(rs.getString(3)); //Nome cliente
					cliente.setCPF(rs.getInt(4)); //cpf cliente
					cliente.setRuaCliente(rs.getString(5)); //gênero cliente
					cliente.setBairroCliente(rs.getString(6)); //gênero cliente
					cliente.setCidadeCliente(rs.getString(7)); //gênero cliente
					cliente.setEstadoCliente(rs.getString(8)); //gênero cliente
					cliente.setCepCliente(rs.getInt(9)); //gênero cliente
					clientes.add(cliente); //Cria um objeto para cada produto buscado
				}		

			} 
			catch(SQLException e) {
				throw new RuntimeException("Erro ao consultar tabela", e);
			}
			return clientes;
		}
	
	//UPDATE tbCategoriaProdutos Banco De Dados
	public void updateCategoriaProduto(Produto produto) throws SQLException{
		String sql = "update tbCategoriaProduto set nomeCategoriaProduto = ? where idCategoriaProduto = ?";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, produto.getNomeCategoriaProduto());
			stmt.setInt(2, produto.getIdCategoriaProduto());
			
			stmt.execute();
			stmt.close();
			JOptionPane.showMessageDialog(null,"Dados Alterados Com Sucesso");
		}
		catch(SQLException e) {
			throw new RuntimeException("Erro ao dar update na tabela", e);
		}
	}
	
	//DELETE tbCategoriaProduto Banco De Dados
	public void deleteTelefoneCliente(Cliente cliente) throws SQLException {
	    // 1. Consulta o idCategoriaProduto com base no nome da categoria
	    String sqlSelect = "SELECT idCategoriaProduto FROM tbCategoriaProduto WHERE nomeCategoriaProduto = ?";
	    
	    // 2. Exclui os produtos relacionados com a categoria
	    String sqlDeleteProduto = "DELETE FROM tbProduto WHERE categoriaProduto_id = ?";
	    
	    // 3. Exclui a categoria
	    String sqlDeleteCategoria = "DELETE FROM tbCategoriaProduto WHERE idCategoriaProduto = ?";
	    
	    try {
	        PreparedStatement stmtSelect = connection.prepareStatement(sqlSelect);
	        stmtSelect.setString(1, produto.getNomeCategoriaProduto());
	        ResultSet rs = stmtSelect.executeQuery();
	        
	        if (rs.next()) {
	            int idCategoriaProduto = rs.getInt("idCategoriaProduto");
	            
	            // 4. Excluir os produtos que pertencem a essa categoria
	            PreparedStatement stmtDeleteProduto = connection.prepareStatement(sqlDeleteProduto);
	            stmtDeleteProduto.setInt(1, idCategoriaProduto); // Usando o id da categoria
	            stmtDeleteProduto.executeUpdate();
	            stmtDeleteProduto.close();
	            
	            // 5. Excluir a categoria
	            PreparedStatement stmtDeleteCategoria = connection.prepareStatement(sqlDeleteCategoria);
	            stmtDeleteCategoria.setInt(1, idCategoriaProduto); // Usando o id da categoria
	            stmtDeleteCategoria.executeUpdate();
	            stmtDeleteCategoria.close();
	            
	            JOptionPane.showMessageDialog(null, "Categoria e produtos excluídos com sucesso!");
	        } else {
	            JOptionPane.showMessageDialog(null, "Categoria não encontrada!");
	        }
	        
	        stmtSelect.close();
	        
	    } catch (SQLException e) {
	        throw new RuntimeException("Erro ao excluir categoria ou produtos", e);
	    }
	}
	
	//UPDATE tbProdutos Banco De Dados
	public void updateProduto(Produto produto) throws SQLException{
		String sql = "update tbProduto set nomeProduto = ?, valorProduto = ?, quantidadeProduto = ?, categoriaProduto_id = ? where idProduto = ?";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, produto.getNomeProduto());
			stmt.setDouble(2, produto.getValorProduto());
			stmt.setInt(3, produto.getQuantidadeProduto());
			stmt.setInt(4, produto.getIdCategoriProduto());
			stmt.setInt(5, produto.getIdUpProduto());
			
			stmt.execute();
			stmt.close();
			JOptionPane.showMessageDialog(null,"Dados Alterados Com Sucesso");
		}
		catch(SQLException e) {
			throw new RuntimeException("Erro ao dar update na tabela", e);
		}
}
	
	//DELETE tbProduto Banco De Dados
	public void deleteCliente(Cliente cliente) throws SQLException{
	    String sqlSelect = "SELECT idCliente FROM tbCliente WHERE nomeCliente = ?";
	    
	    // 2. Exclui os produtos relacionados com a categoria
	    String sqlDeletePedido = "DELETE FROM tbPedido WHERE cliente_id = ?";
	    String sqlDeleteProduto = "DELETE FROM tbCliente WHERE idCliente = ?";
	    try {
	        PreparedStatement stmtSelect = connection.prepareStatement(sqlSelect);
	        stmtSelect.setString(1, cliente.getNomeCategoriaProduto());
	        ResultSet rs = stmtSelect.executeQuery();
	        
	        PreparedStatement stmtSelect = connection.prepareStatement(sqlSelect);
	        stmtSelect.setString(1, cliente.getNomeCliente());
	        ResultSet rs = stmtSelect.executeQuery();
	        
	        if (rs.next()) {
	            int idProduto = rs.getInt("idProduto");
	            
	            PreparedStatement stmtDeleteProduto = connection.prepareStatement(sqlDeleteProduto);
	            stmtDeleteProduto.setInt(1, idProduto); // Usando o id da categoria
	            stmtDeleteProduto.executeUpdate();
	            stmtDeleteProduto.close();
	            
	            JOptionPane.showMessageDialog(null, "rodutos excluídos com sucesso!");
	        } else {
	            JOptionPane.showMessageDialog(null, "Categoria não encontrada!");
	        }
	        
	        stmtSelect.close();
	        
	    } catch (SQLException e) {
	        throw new RuntimeException("Erro ao excluir produtos", e);
	    }
	}
}
