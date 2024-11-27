package Model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.List;
import DAO.ProdutoDao;
import DAO.PedidoDao;
import Model.Produto;
import Model.Pedido;

public class ObjTabbedPane extends JDialog{

		private JButton btConsultaCategoria; //PRODUTO
		private JButton btConsultaProduto;
		private JButton btConsultaPedido; //PEDIDO
		private JButton btConsultaItensPedido;
	  /*private JButton btConsultaPedido; //CLIENTE
		private JButton btConsultaItensPedido;*/
		
	
	public ObjTabbedPane() {
	 this.setTitle("Consultar Banco");
	 this.setModal(true);                       
	 this.setSize(450,380);
	 this.setResizable(false);                       
	                        
	 Container janelaCalc = this.getContentPane();  
	 setLocationRelativeTo(janelaCalc);
	 janelaCalc.setLayout(null);
	 //cria o JTabbedPane
     JTabbedPane tabbedpane = new JTabbedPane();
  
     //PRIMEIRA GUIA
  
     //tamanho e posicionamento do JTabbedPane
     tabbedpane.setBounds(0,0,500,470);     
  
      //PAINEL PRODUTO
	  JPanel painel1 = new JPanel();
	  painel1.setLayout(null);
	  
	  //BOTÃO CONSULTA CATEGORIA
	  btConsultaCategoria = new JButton("Consulta Categoria");
	  btConsultaCategoria.setBounds(15,35,175,20); // Posição x(horizontal),y(vertical) e largura e altura
	  painel1.add(btConsultaCategoria);
	
	  EventoBotaoCategoria evbC = new EventoBotaoCategoria();
	  btConsultaCategoria.addActionListener(evbC);
	  
	  //BOTÃO CONSULTA PRODUTO
	  btConsultaProduto = new JButton("Consulta Produtos");
	  btConsultaProduto.setBounds(15,55,175,20); // Posição x(horizontal),y(vertical) e largura e altura
	  painel1.add(btConsultaProduto);
	
	  EventoBotaoProduto evbP = new EventoBotaoProduto();
	  btConsultaProduto.addActionListener(evbP);
	  
	  //add painel
	  tabbedpane.addTab("Produto", null,painel1,"Primeiro Painel");
	  
	  //SEGUNDA GUIA
	  
      //PAINEL CLIENTE
	  JPanel painel2 = new JPanel();
	  painel2.setLayout(null);
	  painel2.setBackground(Color.WHITE);  
	  
	  //add painel
	  tabbedpane.addTab("Cliente", null,painel2,"Segundo Painel");  
	  
	  //TERCEIRA GUIA
	  
	  //PAINEL PEDIDO
	  JPanel painel3 = new JPanel(); 
	  painel3.setLayout(null);
	
	  //BOTÃO CONSULTA PEDIDO
	  btConsultaPedido = new JButton("Consulta Pedido");
	  btConsultaPedido.setBounds(15,35,175,20); // Posição x(horizontal),y(vertical) e largura e altura
	  painel3.add(btConsultaPedido);
	
	  EventoBotaoPedido evbPE = new EventoBotaoPedido();
	  btConsultaPedido.addActionListener(evbPE);
	  
	  //BOTÃO ITENS PEDIDO
	  btConsultaItensPedido = new JButton("Consulta Itens Pedido");
	  btConsultaItensPedido.setBounds(15,55,175,20); // Posição x(horizontal),y(vertical) e largura e altura
	  painel3.add(btConsultaItensPedido);
	
	  EventoBotaoItensPedido evbIPE = new EventoBotaoItensPedido();
	  btConsultaItensPedido.addActionListener(evbIPE);
	
	  //add painel
	  tabbedpane.addTab("Pedido", null,painel3,"Terceiro Painel");  
	
	  janelaCalc.add(tabbedpane);   
  }
	//BOTÕES PRIMEIRA GUIA PRODUTOS
   private class EventoBotaoCategoria implements ActionListener{ // CATEGORIA PRODUTO
       public void actionPerformed(ActionEvent event){
    	   		List<Produto> categoriaProduto;
				try {
					categoriaProduto = new ProdutoDao().getListaCategoria();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					throw new RuntimeException("Erro ao consultar tabela", e);
				} //Atributo que Carrega o SELECT ProdutoDao
    	   		for(Produto pro: categoriaProduto) { //Exibe os itens da Lista
    	   			JOptionPane.showMessageDialog(null,"Id Categoria: "+pro.getIdCategoriaProduto()+" "+"Nome Categoria: "+pro.getNomeCategoriaProduto());
    	   		}
       }   
   } 
   
   private class EventoBotaoProduto implements ActionListener{ // PRODUTO
       public void actionPerformed(ActionEvent event){
    	   		List<Produto> produtos;
				try {
					produtos = new ProdutoDao().getListaProduto();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					throw new RuntimeException("Erro ao consultar tabela", e);
				} //Atributo que Carrega o SELECT ProdutoDao
	   			for(Produto pro: produtos) { //Exibe os itens da Lista
	   				JOptionPane.showMessageDialog(null,"Nome: "+pro.getNomeProduto()+" "+"Valor: "+pro.getValorProduto()+" "+"Quantidade: "+pro.getQuantidadeProduto()+" "+"Id Categoria: "+pro.getIdCategoriaProduto());
	   			}
       }   
   }
	//BOTÕES SEGUNDA GUIA PEDIDO
   private class EventoBotaoPedido implements ActionListener{ // PEDIDO
       public void actionPerformed(ActionEvent event){	
    	   		List<Pedido> pedidos;
				try {
					pedidos = new PedidoDao().getListaPedido();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					throw new RuntimeException("Erro ao consultar tabela", e);
				} //Atributo que Carrega o SELECT PedidoDao
    	   		for(Pedido pro: pedidos) { //Exibe os itens da Lista
    	   			JOptionPane.showMessageDialog(null,"Id: "+pro.getIdPedido()+" "+"Data: "+pro.getDataPedido()+" "+"Valor: "+pro.getValorPedido()+" "+"DataEntrega: "+pro.getDataEntregaPedido());
    	   		}
       }   
   }
   
   private class EventoBotaoItensPedido implements ActionListener{ // ITENS PEDIDO
       public void actionPerformed(ActionEvent event){
    	   		List<Pedido> itensPedido;
				try {
					itensPedido = new PedidoDao().getListaItensPedido();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					throw new RuntimeException("Erro ao consultar tabela", e);
				} //Atributo que Carrega o SELECT ProdutoDao
    	   		for(Pedido pro: itensPedido) { //Exibe os itens da Lista
    	   			JOptionPane.showMessageDialog(null,"Quantidade: "+pro.getQuantidadeItensPedido()+" "+"id Pedido: "+pro.getIdPedido()+" "+"id Produto: "+pro.getIdProduto());
    	   		}
       }   
   }
   
}
