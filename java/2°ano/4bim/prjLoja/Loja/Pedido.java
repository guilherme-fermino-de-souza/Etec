package Model;//Apenas Modelagem da aplicação
//Atributos e Gets and Sets
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.*;

import DAO.PedidoDao;

import java.time.LocalDate; //Permite variaveis tipo Data
import java.time.format.DateTimeFormatter; //Converte o formato do dado

public class Pedido extends JDialog{
	//Pedido (tbPedido) 1°GUIA
	private JLabel lbDataPedido; //Data 1° Coluna
	private JTextField txDataPedido;
	private JLabel lbValorPedido; //Valor 2° Coluna
	private JTextField txValorPedido;
	private JLabel lbDataEntregaPedido; //Data Entrega 3° Coluna
	private JTextField txDataEntregaPedido;
	private JLabel lbIdCliente; //Id Cliente 4° Coluna
	private JTextField txIdCliente;
	private JButton btCadastrarPedido; //Botão Cadastrar 1° Guia
	//Itens Pedido(tbItensPedido) 2°GUIA
	private JLabel lbQuantidadeItensPedido; //Quantidade 1° Coluna
	private JTextField txQuantidadeItensPedido;
	private JLabel lbIdPedido; //Id Pedido 2° Coluna
	private JTextField txIdPedido;
	private JLabel lbIdProduto; //Id Produto 3° Coluna
	private JTextField txIdProduto;
	private JButton btCadastrarItensPedido; //Botão Cadastrar 2° Guia
	
	private int idUpPedido;
	private int idItensPedido;
	private int idPedidoItensPedido;
	private int idProdutoItensPedido;
	
	 //GETs e SETs 
    //Encapsulação = atributos de uma classe serão escondidos ou privados
   //GET = retorna o valor de um atributo / SET = define ou modifica o valor de um atributo
  //Pedido (tbPedido) 1°GUIA
    public LocalDate getDataPedido() { // RECUPERA a Data Pedido 
        return LocalDate.parse(txDataPedido.getText(), DateTimeFormatter.ISO_LOCAL_DATE); //Converte para (dd-mm-yyyy)
    }
    public void setDataPedido(LocalDate dataPedido) { // DEFINE a Data Pedido
        txDataPedido.setText(dataPedido.format(DateTimeFormatter.ISO_LOCAL_DATE));
    }
    
   //Valor Pedido
    public double getValorPedido() { // RECUPERA o Valor Pedido
    	return Double.parseDouble(txValorPedido.getText());
    }
    public void setValorPedido(double valorPedido) { // DEFINE o Valor Pedido
    	txValorPedido.setText(String.valueOf(valorPedido));
    }   
   //Data Entrega Pedido
    public LocalDate getDataEntregaPedido() { // RECUPERA a Data Entrega Pedido 
        return LocalDate.parse(txDataEntregaPedido.getText(), DateTimeFormatter.ISO_LOCAL_DATE); //Converte para (dd-mm-yyyy)
    }
    public void setDataEntregaPedido(LocalDate dataEntregaPedido) { // DEFINE a Data Pedido
        txDataEntregaPedido.setText(dataEntregaPedido.format(DateTimeFormatter.ISO_LOCAL_DATE));
    }
   //Id Cliente
    public int getIdCliente() { // RECUPERA o Nome Produto
    	return Integer.parseInt(txIdCliente.getText());
    }
    public void setIdCliente(int idCliente) { // DEFINE o Nome Produto
    	txIdCliente.setText(String.valueOf(idCliente));
    }
    
  //Itens Pedido (tbItensPedido) 2°GUIA
  //Id Itens Pedido
    public int getIdItensPedido() {
    	return idItensPedido;
    }
    public void setIdItensPedido(int idItensPedido) { 
    	this.idItensPedido = idItensPedido;
    }
  //Quantidade Pedido
    public int getQuantidadeItensPedido() { // RECUPERA o Quantidade Pedido
    	return Integer.parseInt(txQuantidadeItensPedido.getText());
    }
    public void setQuantidadeItensPedido(int quantidadeItensPedido) { // DEFINE o Quantidade Pedido
    	txQuantidadeItensPedido.setText(String.valueOf(quantidadeItensPedido));
    }
   //Id Pedido
    public int getIdPedido() { // RECUPERA o Id Pedido
    	return Integer.parseInt(txIdPedido.getText());
    }
    public void setIdPedido(int idPedido) { // DEFINE o Id Pedido
    	txIdPedido.setText(String.valueOf(idPedido));
    }
   //Id Produto
    public int getIdProduto() { // RECUPERA o Id Produto
    	return Integer.parseInt(txIdProduto.getText());
    }
    public void setIdProduto(int idProduto) { // DEFINE o Id Produto
    	txIdProduto.setText(String.valueOf(idProduto));
    }
    //UPDATE pedido
    public int getIdUpPedido() { 
        return idUpPedido;
    }
    public void setIdUpPedido(int idUpPedido) {
        this.idUpPedido= idUpPedido;
    }
    //UPDATE Itens
    public int getIdPedidoItensPedido() {
    	return idPedidoItensPedido;
    }
    public void setIdPedidoItensPedido(int idPedidoItensPedido) { 
    	this.idPedidoItensPedido = idPedidoItensPedido;
    }  
    public int getIdProdutoItensPedido() {
    	return idProdutoItensPedido;
    }
    public void setIdProdutoItensPedido(int idProdutoItensPedido) { 
    	this.idProdutoItensPedido = idProdutoItensPedido;
    } 
	
	public Pedido() {
		this.setTitle("Cadastrar Pedido");
		this.setModal(true);
		this.setSize(450, 380);
		this.setResizable(false);
		
		Container CadastroPedido = this.getContentPane();
		setLocationRelativeTo(CadastroPedido);
		CadastroPedido.setLayout(null);
		
		//Criar o JTabbedPane(Painel com Guias)
		JTabbedPane PedidoPane = new JTabbedPane();
		PedidoPane.setBounds(0, 0, 500, 470); //Tamanho e Posicionamento do JTabbedPane
		
		//1° GUIA
		
		//Pedido(tbPedido)
		JPanel painelPedido1 = new JPanel();
		painelPedido1.setLayout(null);
		
		//Data Pedido COLUNA 1
		lbDataPedido = new JLabel("Data: ");
		lbDataPedido.setBounds(10, 15, 75, 20);
		painelPedido1.add(lbDataPedido);
		
		txDataPedido = new JTextField();
		txDataPedido.setBounds(95, 15, 150, 20);
		painelPedido1.add(txDataPedido);
		
		//Valor Total Pedido COLUNA 2
		lbValorPedido = new JLabel("Valor Total: ");
		lbValorPedido.setBounds(10, 35, 75, 20);
		painelPedido1.add(lbValorPedido);
		
		txValorPedido = new JTextField();
		txValorPedido.setBounds(95, 35, 150, 20);
		painelPedido1.add(txValorPedido);
		
		//Data Entrega Pedido COLUNA 3
		lbDataEntregaPedido = new JLabel("Data Entrega: ");
		lbDataEntregaPedido.setBounds(10, 55, 85, 20);
		painelPedido1.add(lbDataEntregaPedido);
		
		txDataEntregaPedido = new JTextField();
		txDataEntregaPedido.setBounds(95, 55, 150, 20);
		painelPedido1.add(txDataEntregaPedido);
		
		//Id Cliente(FOREIGN KEY) COLUNA 4
		lbIdCliente = new JLabel("Id Cliente: ");
		lbIdCliente.setBounds(10, 75, 85, 20);
		painelPedido1.add(lbIdCliente);
		
		txIdCliente = new JTextField();
		txIdCliente.setBounds(95, 75, 150, 20);
		painelPedido1.add(txIdCliente);
		
		//Botão Cadastrar Pedido(tbPedido)
		btCadastrarPedido = new JButton("Cadastrar Pedido");
		btCadastrarPedido.setBounds(15,150,175,20);
		painelPedido1.add(btCadastrarPedido);	
		
		 EventoBotaoPedido evbP = new EventoBotaoPedido();
		 btCadastrarPedido.addActionListener(evbP);
		
		//Add Painel(tbPedido) 1° GUIA
		 PedidoPane.addTab("Pedido", null,painelPedido1,"Primeiro Painel");
		 CadastroPedido.add(PedidoPane); 
		 
		//2° GUIA
			
		//Itens Pedido(tbItensPedido)
		JPanel painelPedido2 = new JPanel();
		painelPedido2.setLayout(null);
		
		//Quantidade Pedido COLUNA 1
		lbQuantidadeItensPedido = new JLabel("Quantidade Pedido: ");
		lbQuantidadeItensPedido.setBounds(10, 15, 115, 20);
		painelPedido2.add(lbQuantidadeItensPedido);
				
		txQuantidadeItensPedido = new JTextField();
		txQuantidadeItensPedido.setBounds(120, 15, 150, 20);
		painelPedido2.add(txQuantidadeItensPedido);
		
		//Id Pedido COLUNA 2
		lbIdPedido = new JLabel("Id Pedido: ");
		lbIdPedido.setBounds(10, 35, 75, 20);
		painelPedido2.add(lbIdPedido);
				
		txIdPedido = new JTextField();
		txIdPedido.setBounds(120, 35, 150, 20);
		painelPedido2.add(txIdPedido);
		
		//Id Pedido COLUNA 3
		lbIdProduto = new JLabel("Id Produto: ");
		lbIdProduto.setBounds(10, 55, 75, 20);
		painelPedido2.add(lbIdProduto);
				
		txIdProduto = new JTextField();
		txIdProduto.setBounds(120, 55, 150, 20);
		painelPedido2.add(txIdProduto);
		
		//Botão Cadastrar Itens Pedido(tbItensPedido)
		btCadastrarItensPedido = new JButton("Cadastrar Itens Pedido");
		btCadastrarItensPedido.setBounds(15,150,175,20);
		painelPedido2.add(btCadastrarItensPedido);	
		
		 EventoBotaoPedidoItens evbI = new EventoBotaoPedidoItens();
		 btCadastrarItensPedido.addActionListener(evbI);
		
		//Add Painel(tbItensPedido) 2° GUIA
		 PedidoPane.addTab("Itens", null,painelPedido2,"Segundo Painel");
		 CadastroPedido.add(PedidoPane); 
		
	}
	   private class EventoBotaoPedido implements ActionListener{ //BOTÃO PRIMEIRA GUIA
	       public void actionPerformed(ActionEvent event){
	    	   	JOptionPane.showMessageDialog(null,"Data: "+txDataPedido.getText()+"\n"+"Valor Total: "+txValorPedido.getText()+"\n"+"Data Entrega: "+txDataEntregaPedido.getText()+"\n"+"Id Cliente: "+txIdCliente.getText());
	       
	    	   	Pedido pedido = new Pedido(); //OBJETO 1° Guia
    	   			pedido.setDataPedido(LocalDate.parse(txDataPedido.getText())); //Data
    	   			pedido.setValorPedido(Double.parseDouble(txValorPedido.getText())); //Valor
    	   			pedido.setDataEntregaPedido(LocalDate.parse(txDataEntregaPedido.getText())); //Data Entrega
    	   			pedido.setIdCliente(Integer.parseInt(txIdCliente.getText())); //Id Cliente
    	   			PedidoDao pedidoDao = new PedidoDao();
    	   				try {
    	   					pedidoDao.adicionarPedido(pedido);
    	   				} catch (SQLException e) {
    	   					// TODO Auto-generated catch block
    	   					e.printStackTrace();
    	   				}
	       }   
	  }
	   
	   private class EventoBotaoPedidoItens implements ActionListener{ //BOTÃO SEGUNDA GUIA
	       public void actionPerformed(ActionEvent event){
	    	   	JOptionPane.showMessageDialog(null,"Quantidade: "+txQuantidadeItensPedido.getText()+"\n"+"Id Pedido: "+txIdPedido.getText()+"\n"+"Id Produto: "+txIdPedido.getText());
	        
	    	   	Pedido itensPedido = new Pedido(); //OBJETO 2° Guia
	    	   	itensPedido.setQuantidadeItensPedido(Integer.parseInt(txQuantidadeItensPedido.getText())); //Quantidade Pedido
	    	   	itensPedido.setIdPedido(Integer.parseInt(txIdPedido.getText())); //Id Pedido
	    	   	itensPedido.setIdProduto(Integer.parseInt(txIdProduto.getText())); //Id Produto
	   				PedidoDao pedidoDao = new PedidoDao();
	   					try {
	   						pedidoDao.adicionarItensPedido(itensPedido);
	   					} catch (SQLException e) {
	   						// TODO Auto-generated catch block
	   						e.printStackTrace();
	   					}
	       }   
	  }

}
