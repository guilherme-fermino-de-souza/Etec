package Model;//Apenas Modelagem da aplicação
//Atributos e Gets and Sets
import javax.swing.*;

import DAO.PedidoDao; //Classes
import DAO.ProdutoDao;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

//Data
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.text.ParseException;

public class Atualizar extends JDialog{
	//Categoria Produto (tbCategoriaProduto) 1°GUIA UPDATE
	private JLabel lbIdUpCategoriaProduto; //Id Categoria 1° Coluna
	private JTextField txIdUpCategoriaProduto;
	private JLabel lbNomeCategoriaProduto; //Nome Categoria 2° Coluna
	private JTextField txNomeCategoriaProduto;
	private JButton btUpdateCategoriaProduto;  //Botão Update 1° Guia
	//Categoria Produto (tbCategoriaProduto) 2°GUIA DELETE
	private JLabel lbIdCategoriaProduto; //Id Categoria 1° Coluna
	private JTextField txIdCategoriaProduto;
	private JButton btDeleteCategoriaProduto;  //Botão Delete 2° Guia
	//Produto (tbProduto) 3°GUIA UPDATE
	private JLabel lbIdUpProduto; //Id 1° Coluna
	private JTextField txIdUpProduto;
	private JLabel lbNomeProduto; //Nome 2° Coluna
	private JTextField txNomeProduto;
	private JLabel lbValorProduto; //Valor 2° Coluna
	private JTextField txValorProduto;
	private JLabel lbQuantidadeProduto; //Quantidade 2° Coluna
	private JTextField txQuantidadeProduto;
	private JLabel lbIdCategoriProduto; //Categoria FK 2° Coluna
	private JTextField txIdCategoriProduto;
	private JButton btUpdateProduto;  //Botão Update 3° Guia
	//Produto (tbProduto) 4°GUIA DELETE
	private JLabel lbIdProduto; //Id 1° Coluna
	private JTextField txIdProduto;
	private JButton btDeleteProduto;  //Botão Delete 4° Guia
	//Pedido (tbPedido) 5°GUIA UPDATE
	private JLabel lbIdUpPedido; //Id 1° Coluna
	private JTextField txIdUpPedido;
	private JLabel lbDataPedido; //data 2° Coluna
	private JTextField txDataPedido;
	private JLabel lbValorPedido; //Valor 3° Coluna
	private JTextField txValorPedido;
	private JLabel lbDataEntregaPedido; //data entrega 4° Coluna
	private JTextField txDataEntregaPedido;
	private JLabel lbIdCliente; //cliente FK 5° Coluna
	private JTextField txIdCliente;
	private JButton btUpdatePedido;  //Botão Update 5° Guia
	//Pedido (tbPedido) 6°GUIA DELETE
	private JLabel lbIdPedido; 
	private JTextField txIdPedido;
	private JButton btDeletePedido;  //Botão Delete 6° Guia
	//Itens Pedido (tbItensPedido) 7°GUIA DELETE
	private JLabel lbIdUpItensPedido; //Id upItensPedido
	private JTextField txIdUpItensPedido;
	private JLabel lbQuantidadeItensPedido;
	private JTextField txQuantidadeItensPedido; 
	private JLabel lbIdPedidoItensPedido; //FKs
	private JTextField txIdPedidoItensPedido;
	private JLabel lbIdProdutoItensPedido;
	private JTextField txIdProdutoItensPedido;
	private JButton btUpdateItensPedido;  //Botão Update 7° Guia
	//Itens Pedido (tbItensPedido) 8°GUIA DELETE
	private JLabel lbIdItensPedido;
	private JTextField txIdItensPedido;
	private JButton btDeleteItensPedido;  //Botão Delete 8° Guia
	
  //Categoria Produto UPDATE (tbCategoriaProduto) 1°GUIA
    public int getIdUpCategoriaProduto() { 
        return Integer.parseInt(txIdUpCategoriaProduto.getText()); 
    }
    public void setIdUpCategoriaProduto(int idUpCategoriaProduto) { 
        txIdUpCategoriaProduto.setText(String.valueOf(idUpCategoriaProduto));
    }
   //Categoria Produto DELETE (tbCategoriaProduto) 1°GUIA
    public int getIdCategoriaProduto() { 
        return Integer.parseInt(txIdCategoriaProduto.getText()); 
    }
    public void setIdCategoriaProduto(int idCategoriaProduto) { 
        txIdCategoriaProduto.setText(String.valueOf(idCategoriaProduto));
    }
    
  //Produto UPDATE (tbProduto) 3°GUIA
    public int getIdUpProduto() { 
        return Integer.parseInt(txIdUpProduto.getText()); 
    }
    public void setIdUpProduto(int idUpProduto) {
        txIdUpProduto.setText(String.valueOf(idUpProduto));
    }
    public String getNomeProduto() { 
        return txNomeProduto.getText(); 
    }
    public void setNomeProduto(String nomeProduto) { 
        txNomeProduto.setText(String.valueOf(nomeProduto));
    }
    public double getValorProduto() { 
        return Double.parseDouble(txValorProduto.getText()); 
    }
    public void setValorProduto(double valorProduto) {
        txValorProduto.setText(String.valueOf(valorProduto));
    }
    public int getQuantidadeProduto() {
        return Integer.parseInt(txQuantidadeProduto.getText()); 
    }
    public void setQuantidadeProduto(int quantidadeProduto) { 
        txQuantidadeProduto.setText(String.valueOf(quantidadeProduto));
    }
    public int getIdCategoriProduto() { 
        return Integer.parseInt(txIdCategoriProduto.getText()); 
    }
    public void setIdCategoriProduto(int idCategoriProduto) {
        txIdCategoriProduto.setText(String.valueOf(idCategoriProduto));
    }
   //Categoria Produto DELETE (tbProduto) 4°GUIA
    public int getIdProduto() { 
        return Integer.parseInt(txIdProduto.getText()); 
    }
    public void setIdProduto(int idProduto) {
        txIdProduto.setText(String.valueOf(idProduto));
    }
  //Pedido UPDATE (tbPedido) 5°GUIA
    public int getIdUpPedido() { 
        return Integer.parseInt(txIdUpPedido.getText()); 
    }
    public void setIdUpPedido(int idUpPedido) {
        txIdUpPedido.setText(String.valueOf(idUpPedido));
    }
    public LocalDate getDataPedido() { 
        return LocalDate.parse(txDataPedido.getText(), DateTimeFormatter.ISO_LOCAL_DATE); //Converte para (dd-mm-yyyy)
    }
    public void setDataPedido(LocalDate dataPedido) { 
        txDataPedido.setText(dataPedido.format(DateTimeFormatter.ISO_LOCAL_DATE));
    }
    
   //Valor Pedido
    public double getValorPedido() { 
    	return Double.parseDouble(txValorPedido.getText());
    }
    public void setValorPedido(double valorPedido) { 
    	txValorPedido.setText(String.valueOf(valorPedido));
    }   
   //Data Entrega Pedido
    public LocalDate getDataEntregaPedido() { 
        return LocalDate.parse(txDataEntregaPedido.getText(), DateTimeFormatter.ISO_LOCAL_DATE); //Converte para (dd-mm-yyyy)
    }
    public void setDataEntregaPedido(LocalDate dataEntregaPedido) { 
        txDataEntregaPedido.setText(dataEntregaPedido.format(DateTimeFormatter.ISO_LOCAL_DATE));
    }
   //Id Cliente
    public int getIdCliente() {
    	return Integer.parseInt(txIdCliente.getText());
    }
    public void setIdCliente(int idCliente) { 
    	txIdCliente.setText(String.valueOf(idCliente));
    }
    //7° Guia UPDATE itens pedido
    //Id Pedido

    
    public Atualizar () { //Construtor
		this.setTitle("Atualizar Banco");
		 this.setModal(true);                       
		 this.setSize(1050,380); //Largura,Altura
		 this.setResizable(false);      
		 
		 Container AtPainel = getContentPane();
		 setLocationRelativeTo(AtPainel);
		 AtPainel.setLayout(null);
		 
		//Criar o JTabbedPane(painel cojm guias)
		 JTabbedPane atPane = new JTabbedPane();
		 atPane.setBounds(0, 0, 1050, 670);
		 
		 //1° GUIA UPDATE	
			//Categoria Produto(tbCategoriaProduto)	
			 JPanel painelProduto1 = new JPanel();
			 painelProduto1.setLayout(null);
				
			//Categoria Produto COLUNA 1
			 lbIdUpCategoriaProduto = new JLabel("Id Categoria: "); //Id Categoria Produto
			 lbIdUpCategoriaProduto.setBounds(10, 15, 75, 20);
			 painelProduto1.add(lbIdUpCategoriaProduto);
			 
			 txIdUpCategoriaProduto = new JTextField();
			 txIdUpCategoriaProduto.setBounds(85, 15, 150, 20);
			 painelProduto1.add(txIdUpCategoriaProduto);
			 
			 lbNomeCategoriaProduto = new JLabel("Nome Categoria: "); //Nome Categoria Produto
			 lbNomeCategoriaProduto.setBounds(10, 35, 75, 20);
			 painelProduto1.add(lbNomeCategoriaProduto);
			 
			 txNomeCategoriaProduto = new JTextField();
			 txNomeCategoriaProduto.setBounds(85, 35, 150, 20);
			 painelProduto1.add(txNomeCategoriaProduto);
			 
			 //Botão update Categoria Produto(tbCategoriaProduto)
			 btUpdateCategoriaProduto = new JButton("Update Categoria Produto");
			 btUpdateCategoriaProduto.setBounds(15,150,175,20);
			 painelProduto1.add(btUpdateCategoriaProduto);
			 
			 EventoBotaoUpdateCategoriaProduto evbC = new EventoBotaoUpdateCategoriaProduto();
			 btUpdateCategoriaProduto.addActionListener(evbC);
			 
			 //Add Painel(tbCategoriaProduto) 1° GUIA
			 atPane.addTab("Update Categoria Produto", null,painelProduto1,"Primeiro Painel");
			 AtPainel.add(atPane); 	
			 
			//2° GUIA	DELETE	
			//Categoria Produto(tbCategoriaProduto)	
			JPanel painelProduto2 = new JPanel();
			painelProduto2.setLayout(null);
			
			//Categoria Produto COLUNA 1
			 lbIdCategoriaProduto = new JLabel("Id Categoria: "); //Nome Produto
			 lbIdCategoriaProduto.setBounds(10, 15, 75, 20);
			 painelProduto2.add(lbIdCategoriaProduto);
			 
			 txIdCategoriaProduto = new JTextField();
			 txIdCategoriaProduto.setBounds(85, 15, 150, 20);
			 painelProduto2.add(txIdCategoriaProduto);
			 
			 //Botão delete Categoria Produto(tbCategoriaProduto)
			 btDeleteCategoriaProduto = new JButton("Delete Categoria Produto");
			 btDeleteCategoriaProduto.setBounds(15,150,175,20);
			 painelProduto2.add(btDeleteCategoriaProduto);
			 
			 EventoBotaoDeleteCategoriaProduto evbD = new EventoBotaoDeleteCategoriaProduto();
			 btDeleteCategoriaProduto.addActionListener(evbD);
			 
			 //Add Painel(tbCategoriaProduto) 1° GUIA
			 atPane.addTab("Delete Categoria Produto", null,painelProduto2,"Segundo Painel");
			 AtPainel.add(atPane); 	
			 
			//3° GUIA UPDATE	
			//Produto(tbProduto)	
			JPanel painelProduto3 = new JPanel();
			painelProduto3.setLayout(null);
					
			//Produto COLUNA 1
			lbIdUpProduto = new JLabel("Id Produto: "); //Id Produto
			lbIdUpProduto.setBounds(10, 15, 75, 20);
			painelProduto3.add(lbIdUpProduto);
				 
			txIdUpProduto = new JTextField();
			txIdUpProduto.setBounds(85, 15, 150, 20);
			painelProduto3.add(txIdUpProduto);
				 
			lbNomeProduto = new JLabel("Nome: "); //Nome Produto
			lbNomeProduto.setBounds(10, 35, 75, 20);
			painelProduto3.add(lbNomeProduto);
				 
			txNomeProduto = new JTextField();
			txNomeProduto.setBounds(85, 35, 150, 20);
			painelProduto3.add(txNomeProduto);
			
			lbValorProduto = new JLabel("Valor: "); //Valor Produto
			lbValorProduto.setBounds(10, 55, 75, 20);
			painelProduto3.add(lbValorProduto);
				 
			txValorProduto = new JTextField();
			txValorProduto.setBounds(85, 55, 150, 20);
			painelProduto3.add(txValorProduto);
			
			lbQuantidadeProduto = new JLabel("Quantidade: "); //Quantidade Produto
			lbQuantidadeProduto.setBounds(10, 75, 75, 20);
			painelProduto3.add(lbQuantidadeProduto);
				 
			txQuantidadeProduto = new JTextField();
			txQuantidadeProduto.setBounds(85, 75, 150, 20);
			painelProduto3.add(txQuantidadeProduto);
			
			lbIdCategoriProduto = new JLabel("Id Categoria: "); //id Categoria Produto
			lbIdCategoriProduto.setBounds(10, 95, 75, 20);
			painelProduto3.add(lbIdCategoriProduto);
				 
			txIdCategoriProduto = new JTextField();
			txIdCategoriProduto.setBounds(85, 95, 150, 20);
			painelProduto3.add(txIdCategoriProduto);
				 
			//Botão update Produto(tbProduto)
			btUpdateProduto = new JButton("Update Produto");
			btUpdateProduto.setBounds(15,150,175,20);
			painelProduto3.add(btUpdateProduto);
				 
			EventoBotaoUpdateProduto evbP = new EventoBotaoUpdateProduto();
			btUpdateProduto.addActionListener(evbP);
				 
			//Add Painel(tbProduto) 3° GUIA
			atPane.addTab("Update Produto", null,painelProduto3,"Primeiro Painel");
			AtPainel.add(atPane); 	
			
			//4° GUIA delete	
			//Produto(tbProduto)	
			JPanel painelProduto4 = new JPanel();
			painelProduto4.setLayout(null);
					
			//Produto COLUNA 1
			lbIdProduto = new JLabel("Id Produto: "); //Id Produto
			lbIdProduto.setBounds(10, 15, 75, 20);
			painelProduto4.add(lbIdProduto);
				 
			txIdProduto = new JTextField();
			txIdProduto.setBounds(85, 15, 150, 20);
			painelProduto4.add(txIdProduto);
				 
			//Botão delete Produto(tbCategoriaProduto)
			btDeleteProduto = new JButton("Delete Produto");
			btDeleteProduto.setBounds(15,150,175,20);
			painelProduto4.add(btDeleteProduto);
				 
			EventoBotaoDeleteProduto evbDP = new EventoBotaoDeleteProduto();
			btDeleteProduto.addActionListener(evbDP);
				 
			//Add Painel(tbProduto) 4° GUIA
			atPane.addTab("Delete Produto", null,painelProduto4,"Quarto Painel");
			AtPainel.add(atPane); 
			
			//5° GUIA UPDATE	
			//Pedido(tbPedido)	
			JPanel painelProduto5 = new JPanel();
			painelProduto5.setLayout(null);
					
			//Produto COLUNA 1
			lbIdUpPedido = new JLabel("Id Pedido: "); //Id Pedido
			lbIdUpPedido.setBounds(10, 15, 75, 20);
			painelProduto5.add(lbIdUpPedido);
				 
			txIdUpPedido = new JTextField();
			txIdUpPedido.setBounds(85, 15, 150, 20);
			painelProduto5.add(txIdUpPedido);
				 
			lbDataPedido = new JLabel("Data Pedido: "); //Data Pedido
			lbDataPedido.setBounds(10, 35, 75, 20);
			painelProduto5.add(lbDataPedido);
				 
			txDataPedido = new JTextField();
			txDataPedido.setBounds(85, 35, 150, 20);
			painelProduto5.add(txDataPedido);
			
			lbValorPedido = new JLabel("Valor Pedido: "); //Valor Pedido
			lbValorPedido.setBounds(10, 55, 75, 20);
			painelProduto5.add(lbValorPedido);
				 
			txValorPedido = new JTextField();
			txValorPedido.setBounds(85, 55, 150, 20);
			painelProduto5.add(txValorPedido);
			
			lbDataEntregaPedido = new JLabel("Data Entrega: "); //Data Entrega Pedido
			lbDataEntregaPedido.setBounds(10, 75, 75, 20);
			painelProduto5.add(lbDataEntregaPedido);
				 
			txDataEntregaPedido = new JTextField();
			txDataEntregaPedido.setBounds(85, 75, 150, 20);
			painelProduto5.add(txDataEntregaPedido);
			
			lbIdCliente = new JLabel("Id Cliente: "); //id Cliente
			lbIdCliente.setBounds(10, 95, 75, 20);
			painelProduto5.add(lbIdCliente);
				 
			txIdCliente = new JTextField();
			txIdCliente.setBounds(85, 95, 150, 20);
			painelProduto5.add(txIdCliente);
				 
			//Botão update Pedido(tbPedido)
			btUpdatePedido = new JButton("Update Pedido");
			btUpdatePedido.setBounds(15,150,175,20);
			painelProduto5.add(btUpdatePedido);
				 
			EventoBotaoUpdatePedido evbUP = new EventoBotaoUpdatePedido();
			btUpdatePedido.addActionListener(evbUP);
				 
			//Add Painel(tbProduto) 5° GUIA
			atPane.addTab("Update Pedido", null,painelProduto5,"Primeiro Painel");
			AtPainel.add(atPane);
			
			//6° GUIA delete	
			//Pedido(tbPedido)	
			JPanel painelProduto6 = new JPanel();
			painelProduto6.setLayout(null);
					
			//Pedido COLUNA 1
			lbIdPedido = new JLabel("Id Pedido: "); //Id Pedido
			lbIdPedido.setBounds(10, 15, 75, 20);
			painelProduto6.add(lbIdPedido);
				 
			txIdPedido = new JTextField();
			txIdPedido.setBounds(85, 15, 150, 20);
			painelProduto6.add(txIdPedido);
				 
			//Botão delete Pedido(tbPedido)
			btDeletePedido = new JButton("Delete Pedido");
			btDeletePedido.setBounds(15,150,175,20);
			painelProduto6.add(btDeletePedido);
				 
			EventoBotaoDeletePedido evbDPE = new EventoBotaoDeletePedido();
			btDeletePedido.addActionListener(evbDPE);
				 
			//Add Painel(tbPedido) 6° GUIA
			atPane.addTab("Delete Pedido", null,painelProduto6,"Sexto Painel");
			AtPainel.add(atPane); 
			
			
			//7° GUIA update	
			//ItensPedido(tbItensPedido)	
			JPanel painelProduto7 = new JPanel();
			painelProduto7.setLayout(null);
					
			//Pedido COLUNA 1
			lbIdItensPedido = new JLabel("Id Itens Pedido: "); //1° Id Itens Pedido 
			lbIdItensPedido.setBounds(10, 15, 75, 20);
			painelProduto7.add(lbIdItensPedido);
				 
			txIdItensPedido = new JTextField();
			txIdItensPedido.setBounds(85, 15, 150, 20);
			painelProduto7.add(txIdItensPedido);
			
			lbQuantidadeItensPedido = new JLabel("Quantidade: "); //2° Quantidade Itens Pedido
			lbQuantidadeItensPedido.setBounds(10, 35, 75, 20);
			painelProduto7.add(lbQuantidadeItensPedido );
				 
			txQuantidadeItensPedido = new JTextField();
			txQuantidadeItensPedido.setBounds(85, 35, 150, 20);
			painelProduto7.add(txQuantidadeItensPedido);
			
			lbIdPedidoItensPedido = new JLabel("Id Pedido: "); //3° Pedido Id
			lbIdPedidoItensPedido.setBounds(10, 55, 75, 20);
			painelProduto7.add(lbIdPedidoItensPedido);
				 
			txIdPedidoItensPedido = new JTextField();
			txIdPedidoItensPedido.setBounds(85, 55, 150, 20);
			painelProduto7.add(txIdPedidoItensPedido);
			
			lbIdProdutoItensPedido = new JLabel("Id Produto: "); //4° Produto Id
			lbIdProdutoItensPedido.setBounds(10, 75, 75, 20);
			painelProduto7.add(lbIdProdutoItensPedido);
				 
			txIdProdutoItensPedido = new JTextField();
			txIdProdutoItensPedido.setBounds(85, 75, 150, 20);
			painelProduto7.add(txIdProdutoItensPedido);
				 
			//Botão update Update Itens Pedido(tbUpdateItensPedido)
			btUpdateItensPedido = new JButton("Update Itens Pedido");
			btUpdateItensPedido.setBounds(15,150,175,20);
			painelProduto7.add(btUpdateItensPedido);
				 
			EventoBotaoUpdateItensPedido evbUIPE = new EventoBotaoUpdateItensPedido();
			btUpdateItensPedido.addActionListener(evbUIPE);
				 
			//Add Painel(tbItensPedido) 7° GUIA
			atPane.addTab("Update ItensPedido", null,painelProduto7,"Sétimo Painel");
			AtPainel.add(atPane);
			
			//8° GUIA delete	
			//ItensPedido(tbItensPedido)	
			JPanel painelProduto8 = new JPanel();
			painelProduto8.setLayout(null);
					
			//Pedido COLUNA 1
			lbIdItensPedido = new JLabel("Id Itens Pedido: "); //Id Pedido
			lbIdItensPedido.setBounds(10, 15, 75, 20);
			painelProduto8.add(lbIdItensPedido);
				 
			txIdItensPedido = new JTextField();
			txIdItensPedido.setBounds(85, 15, 150, 20);
			painelProduto8.add(txIdItensPedido);
				 
			//Botão delete ItensPedido(tbItensPedido)
			btDeleteItensPedido = new JButton("Delete Itens Pedido");
			btDeleteItensPedido.setBounds(15,150,175,20);
			painelProduto8.add(btDeleteItensPedido);
				 
			EventoBotaoDeleteItensPedido evbDIPE = new EventoBotaoDeleteItensPedido();
			btDeleteItensPedido.addActionListener(evbDIPE);
				 
			//Add Painel(tbItensPedido) 8° GUIA
			atPane.addTab("Delete ItensPedido", null,painelProduto8,"Oitavo Painel");
			AtPainel.add(atPane); 
    }
    //Categoria Produto
	   private class EventoBotaoUpdateCategoriaProduto implements ActionListener{ //BOTÃO PRIMEIRA GUIA UPDATE
	       public void actionPerformed(ActionEvent event){
	    	   	Produto categoriaProduto = new Produto(); //OBJETO 1° Guia
	    	   		categoriaProduto.setIdCategoriaProduto(getIdUpCategoriaProduto()); //Categoria
	    	   		categoriaProduto.setNomeCategoriaProduto(txNomeCategoriaProduto.getText()); //Nome
	    	   		ProdutoDao produtoDao = new ProdutoDao();
	    	   			try {
							produtoDao.updateCategoriaProduto(categoriaProduto);
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	        }   
	   }
	   
	   private class EventoBotaoDeleteCategoriaProduto implements ActionListener{ //BOTÃO SEGUNDA GUIA DELETE
	       public void actionPerformed(ActionEvent event){
	    	   	Produto categoriaProduto = new Produto(); //OBJETO 2° Guia
	    	   		categoriaProduto.setIdCategoriaProduto(getIdCategoriaProduto()); //Categoria
	    	   		ProdutoDao produtoDao = new ProdutoDao();
	    	   			try {
							produtoDao.deleteCategoriaProduto(categoriaProduto);
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	        }   
	   }
	 //Produto
	   private class EventoBotaoUpdateProduto implements ActionListener{ //BOTÃO TERCEIRA GUIA UPDATE
	       public void actionPerformed(ActionEvent event){
	    	   	Produto produto = new Produto(); //OBJETO 3° Guia
	    	   		produto.setIdUpProduto(getIdUpProduto()); //Id produto
	    	   		produto.setNomeProduto(txNomeProduto.getText()); //Nome
	    	   		produto.setValorProduto(Double.parseDouble(txValorProduto.getText())); //Valor
	    	   		produto.setQuantidadeProduto(Integer.parseInt(txQuantidadeProduto.getText())); //Quantidade
	    	   		produto.setIdCategoriProduto(Integer.parseInt(txIdCategoriProduto.getText())); //ID Categori
	    	   		ProdutoDao produtoDao = new ProdutoDao();
	    	   			try {
							produtoDao.updateProduto(produto);
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	        }   
	   }
	   
	   private class EventoBotaoDeleteProduto implements ActionListener{ //BOTÃO QUARTA GUIA DELETE
	       public void actionPerformed(ActionEvent event){
	    	   	Produto produto = new Produto(); //OBJETO 4° Guia
	    	   		produto.setIdProduto(Integer.parseInt(txIdProduto.getText())); //Produto
	    	   		ProdutoDao produtoDao = new ProdutoDao();
	    	   			try {
							produtoDao.deleteProduto(produto);
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	        }   
	   }
	 //Pedido
	   private class EventoBotaoUpdatePedido implements ActionListener{ //BOTÃO QUINTA GUIA UPDATE
	       public void actionPerformed(ActionEvent event){
	    	   	Pedido pedido = new Pedido(); //OBJETO 5° Guia
	    	   		pedido.setIdUpPedido(Integer.parseInt(txIdUpPedido.getText())); //Id pedido
	    	   		pedido.setDataPedido(LocalDate.parse(txDataPedido.getText())); //Data 
	    	   		pedido.setValorPedido(Double.parseDouble(txValorPedido.getText())); //Valor
	    	   		pedido.setDataEntregaPedido(LocalDate.parse(txDataEntregaPedido.getText())); //Data Entrega
	    	   		pedido.setIdCliente(Integer.parseInt(txIdCliente.getText())); //ID Cliente
	    	   		PedidoDao pedidoDao = new PedidoDao();
	    	   			try {
							pedidoDao.updatePedido(pedido);
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	        }   
	   }
	   
	   private class EventoBotaoDeletePedido implements ActionListener{ //BOTÃO SEXTA GUIA UPDATE
	       public void actionPerformed(ActionEvent event){
	    	   	Pedido pedido = new Pedido(); //OBJETO 6° Guia
	    	   		pedido.setIdPedido(Integer.parseInt(txIdPedido.getText())); //Id pedido
	    	   		PedidoDao pedidoDao = new PedidoDao();
	    	   			try {
							pedidoDao.deletePedido(pedido);
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	        }   
	   }
	//Itens Pedido
	   private class EventoBotaoUpdateItensPedido implements ActionListener{ //BOTÃO SÉTIMA GUIA UPDATE
	       public void actionPerformed(ActionEvent event){
	    	   	Pedido itensPedido = new Pedido(); //OBJETO 7° Guia
	    	   	itensPedido.setIdItensPedido(Integer.parseInt(txIdItensPedido.getText())); //Id Itens Pedido
	    	   	itensPedido.setUpQuantidadeItensPedido(Integer.parseInt(txQuantidadeItensPedido.getText())); //Quantidade Itens Pedido
	    	   	itensPedido.setIdPedidoItensPedido(Integer.parseInt(txIdPedidoItensPedido.getText())); //Id Pedido 
	    	   	itensPedido.setIdPedidoItensPedido(Integer.parseInt(txIdProdutoItensPedido.getText())); //Id Produto
	    	   		PedidoDao pedidoDao = new PedidoDao();
	    	   			try {
							pedidoDao.updateItensPedido(itensPedido);
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	        }   
	   }
	   
	   private class EventoBotaoDeleteItensPedido implements ActionListener{ //BOTÃO OITAVO GUIA UPDATE
	       public void actionPerformed(ActionEvent event){
	    	   	Pedido itensPedido = new Pedido(); //OBJETO 8° Guia
	    	   	itensPedido.setIdItensPedido(Integer.parseInt(txIdItensPedido.getText())); //Id pedido
	    	   		PedidoDao pedidoDao = new PedidoDao();
	    	   			try {
							pedidoDao.deleteItensPedido(itensPedido);
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	        }   
	   }
}
