package prjLoja;

import javax.swing.*;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Produto extends JDialog{
	//Categoria Produto (tbCategoriaProduto) 1°GUIA
	private JLabel lbNomeCategoriaProduto; //Nome Categoria 1° Coluna
	private JTextField txNomeCategoriaProduto;
	private JButton btCadastrarCategoriaProduto;  //Botão Cadastrar 1° Guia
	//Produto (tbProduto) 2°GUIA
	private JLabel lbNomeProduto; //Nome 1° Coluna
	private JTextField txNomeProduto;
	private JLabel lbValorProduto; //Valor 2° Coluna
	private JTextField txValorProduto;
	private JLabel lbQuantidadeProduto; //Quantidade 3° Coluna
	private JTextField txQuantidadeProduto; 
	private JLabel lbIdCategoriaProduto; //Id Categoria Produto 4° Coluna
	private JTextField txIdCategoriaProduto; 
	private JButton btCadastrarProduto;  //Botão Cadastrar 2° Guia
	
	public Produto () {
		this.setTitle("Cadastrar Produto");
		 this.setModal(true);                       
		 this.setSize(450,380);
		 this.setResizable(false);      
		 
		 Container ProdutoPainel = getContentPane();
		 setLocationRelativeTo(ProdutoPainel);
		 ProdutoPainel.setLayout(null);
		 
		//Criar o JTabbedPane(painel cojm guias)
		 JTabbedPane ProdutoPane = new JTabbedPane();
		 ProdutoPane.setBounds(0, 0, 500, 470);
		 
		//1° GUIA
			
		//Categoria Produto(tbCategoriaProduto)	
		 JPanel painelProduto1 = new JPanel();
		 painelProduto1.setLayout(null);
			
		//Categoria Produto COLUNA 1
		 lbNomeCategoriaProduto = new JLabel("Categoria: "); //Nome Produto
		 lbNomeCategoriaProduto.setBounds(10, 15, 75, 20);
		 painelProduto1.add(lbNomeCategoriaProduto);
		 
		 txNomeCategoriaProduto = new JTextField();
		 txNomeCategoriaProduto.setBounds(85, 15, 150, 20);
		 painelProduto1.add(txNomeCategoriaProduto);
		 
		 //Botão Cadastrar Categoria Produto(tbCategoriaProduto)
		 btCadastrarCategoriaProduto = new JButton("Cadastrar Categoria");
		 btCadastrarCategoriaProduto.setBounds(15,150,175,20);
		 painelProduto1.add(btCadastrarCategoriaProduto);
		 
		 EventoBotaoCategoriaProduto evbC = new EventoBotaoCategoriaProduto();
		 btCadastrarCategoriaProduto.addActionListener(evbC);
		 
		 //Add Painel(tbCategoriaProduto) 1° GUIA
		 ProdutoPane.addTab("Categoria Produto", null,painelProduto1,"Primeiro Painel");
		 ProdutoPainel.add(ProdutoPane); 	 
		 
		//2° GUIA
			
		//Produto(tbProduto)
		 JPanel painelProduto2 = new JPanel();
		 painelProduto2.setLayout(null);
			
		//Nome Produto COLUNA 1
		 lbNomeProduto = new JLabel("Nome Produto:"); //Nome Produto
		 lbNomeProduto.setBounds(10, 15, 85, 20);
		 painelProduto2.add(lbNomeProduto);
		 
		 txNomeProduto = new JTextField();
		 txNomeProduto.setBounds(130, 15, 150, 20);
		 painelProduto2.add(txNomeProduto);
		 
		//Valor Produto COLUNA 2
		 lbValorProduto = new JLabel("Valor:"); //Valor Produto
		 lbValorProduto.setBounds(10, 35, 75, 20);
		 painelProduto2.add(lbValorProduto);
		 
		 txValorProduto = new JTextField();
		 txValorProduto.setBounds(130, 35, 150, 20);
		 painelProduto2.add(txValorProduto);
		 
		//Quantidade Produto COLUNA 3
		 lbQuantidadeProduto = new JLabel("Quantidade:"); //Nome Produto
		 lbQuantidadeProduto.setBounds(10, 55, 75, 20);
		 painelProduto2.add(lbQuantidadeProduto);
		 
		 txQuantidadeProduto = new JTextField();
		 txQuantidadeProduto.setBounds(130, 55, 150, 20);
		 painelProduto2.add(txQuantidadeProduto);
		 
		//Id Categoria Produto COLUNA 4
		 lbIdCategoriaProduto = new JLabel("Id Categoria Produto:"); //Valor Produto
		 lbIdCategoriaProduto.setBounds(10, 75, 125, 20);
		 painelProduto2.add(lbIdCategoriaProduto);
		 
		 txIdCategoriaProduto = new JTextField();
		 txIdCategoriaProduto.setBounds(130, 75, 150, 20);
		 painelProduto2.add(txIdCategoriaProduto);
		 
		 
		//Botão Cadastrar Produto
		 btCadastrarProduto = new JButton("Cadastrar Produto");
		 btCadastrarProduto.setBounds(15,150,175,20);
		 painelProduto2.add(btCadastrarProduto);
		 
		 EventoBotaoProduto evbP = new EventoBotaoProduto();
		 btCadastrarProduto.addActionListener(evbP);
		 
		//Add Painel(tbProduto) 2° GUIA
		 ProdutoPane.addTab("Produto", null,painelProduto2,"Segundo Painel");
		 ProdutoPainel.add(ProdutoPane); 	 
	}
	
	   private class EventoBotaoCategoriaProduto implements ActionListener{ //BOTÃO PRIMEIRA GUIA
	       public void actionPerformed(ActionEvent event){
	    	   	JOptionPane.showMessageDialog(null,"Categoria Produto: "+txNomeCategoriaProduto.getText());
	        }   
	   }
	   
	   private class EventoBotaoProduto implements ActionListener{ //BOTÃO SEGUNDA GUIA
	       public void actionPerformed(ActionEvent event){
	    	   	JOptionPane.showMessageDialog(null,"Nome Produto: "+txNomeProduto.getText()+"\n"+"Valor Produto: "+txValorProduto.getText()+"\n"+"Quantidade Produto: "+txQuantidadeProduto.getText()+"\n"+"Id Categoria Produto: "+txIdCategoriaProduto.getText());
	        }   	
	   }
	   
}
