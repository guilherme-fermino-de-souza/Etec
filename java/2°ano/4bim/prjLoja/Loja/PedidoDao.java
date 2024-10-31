package DAO; /*Data Acess Object
(Objeto de Acesso a Dados) do Pedido */

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.time.LocalDate; //Permite variaveis tipo Data
import java.time.format.DateTimeFormatter; //Converte o formato do dado
import Model.Pedido; //Importação do Pedido

public class PedidoDao {
	
	private Connection connection;
	
	public PedidoDao() { //Construtor(O mesmo nome da classe)
		this.connection = new ConectionFactory().getConnection();
		//Gera conexão com o banco toda vez que se instacia um objeto
	}
	
	//ADICIONAR Pedido Banco De Dados
	public void adicionarPedido(Pedido pedido) throws SQLException {
		try {
			String sql = "insert into tbPedido"+
				"(dataPedido, valorTotalPedido, dataEntregaPedido, cliente_id)"+
				"values (?, ?, ?, ?)";
			
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setDate(1, java.sql.Date.valueOf(pedido.getDataPedido()));
			stmt.setDouble(2, pedido.getValorPedido());
			stmt.setDate(3, java.sql.Date.valueOf(pedido.getDataEntregaPedido()));
			stmt.setInt(4, pedido.getIdCliente());
			stmt.execute();
			stmt.close();
			JOptionPane.showMessageDialog(null,"Pedido Cadastrado Com Sucesso");
		} 
		catch(SQLException e) {
			System.out.println("Erro ao registrar Pedido: "+e);
		}
		finally {
			connection.close();
		}
	}
	
	//ADICIONAR Itens Pedido Banco De Dados
	public void adicionarItensPedido(Pedido itensPedido) throws SQLException {
		try {
			String sql = "insert into tbItensPedido"+
				"(quantidadeItensPedido, pedido_id, produto_id)"+
				"values (?, ?, ?)";
			
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, itensPedido.getQuantidadePedido());
			stmt.setInt(2, itensPedido.getIdPedido());
			stmt.setInt(3, itensPedido.getIdProduto());
			stmt.execute();
			stmt.close();
			JOptionPane.showMessageDialog(null,"Itens Pedido Cadastrado Com Sucesso");
		} 
		catch(SQLException e) {
			System.out.println("Erro ao registrar Itens Pedido: "+e);
		}
		finally {
			connection.close();
		}
	}
	
	//CONSULTA tbPedido
	public List<Pedido> getListaPedido() throws SQLException{
		try {
			List<Pedido> pedidos = new ArrayList<Pedido>(); //Define a Lista
			
			PreparedStatement stmt = this.connection.prepareStatement("select * from tbPedido"); //Prepara a instrução MySQL
			ResultSet rs = stmt.executeQuery(); //Armazena e Executa instrução em RS
			
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			
			while(rs.next()) { // Busca todos o objetos armazenados no BD
				Pedido pedido = new Pedido();
				pedido.setIdPedido(rs.getInt(1)); //Id
				String txDataPedido = rs.getString(2); //Data
				LocalDate dataPedido = LocalDate.parse(txDataPedido, formatter);
				pedido.setDataPedido(dataPedido);
				pedido.setValorPedido(rs.getDouble(3)); //Valor
				String txDataEntregaPedido = rs.getString(2); //Data Entrega
				LocalDate dataEntregaPedido = LocalDate.parse(txDataEntregaPedido, formatter);
				pedido.setDataEntregaPedido(dataEntregaPedido);
				pedido.setIdCliente(rs.getInt(5)); //Id Cliente

				pedidos.add(pedido); //Cria um objeto para cada produto buscado
			}
			
			rs.close();
			stmt.close();
			
			return pedidos;
		} 
		catch(SQLException e) {
			throw new RuntimeException("Erro ao consultar tabela", e);
		}
		finally {
			connection.close();
		}
	}
	
	//CONSULTA tbItensPedido
	public List<Pedido> getListaItensPedido() throws SQLException{
		try {
			List<Pedido> itensPedidos = new ArrayList<Pedido>(); //Define a Lista
			
			PreparedStatement stmt = this.connection.prepareStatement("select * from tbItensPedido"); //Prepara a instrução MySQL
			ResultSet rs = stmt.executeQuery(); //Armazena e Executa instrução em RS
			
			while(rs.next()) { // Busca todos o objetos armazenados no BD
				Pedido pedido = new Pedido();
				pedido.setQuantidadePedido(rs.getInt(1)); //Quantidade
				pedido.setIdPedido(rs.getInt(2)); //Id Pedido
				pedido.setIdProduto(rs.getInt(3)); //Id Produto

				itensPedidos.add(pedido); //Cria um objeto para cada produto buscado
			}
			
			rs.close();
			stmt.close();
			
			return itensPedidos;
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
