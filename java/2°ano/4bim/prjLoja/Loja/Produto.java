import javax.swing.*;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Produto extends JDialog{
	
	private JLabel lbNomeProduto; // Produto
	private JTextField txNomeProduto;
	private JLabel lbValorProduto;
	private JTextField txValorProduto;
	private JButton btCadastrarProduto;
	private JLabel lbQuantidadeProduto; // Quant. Produto
	private JTextField txQuantidadeProduto;
	private JLabel lbValorTotalProduto;
	private JTextField txValorTotalProduto;
	private JButton btCadastrarProdutos;
	
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
		 
		//PRIMEIRA GUIA	
		 JPanel painelProduto1 = new JPanel();
		 painelProduto1.setLayout(null);
			
		//Cadastro Produto
		 lbNomeProduto = new JLabel("Nome"); //Nome Produto
		 lbNomeProduto.setBounds(10, 15, 75, 20);
		 painelProduto1.add(lbNomeProduto);
		 
		 txNomeProduto = new JTextField();
		 txNomeProduto.setBounds(85, 15, 150, 20);
		 painelProduto1.add(txNomeProduto);
		 
		 lbValorProduto = new JLabel("Valor em Reais"); //Valor Produto
		 lbValorProduto.setBounds(10, 55, 75, 20);
		 painelProduto1.add(lbValorProduto);
		 
		 txValorProduto = new JTextField();
		 txValorProduto.setBounds(85, 55, 150, 20);
		 painelProduto1.add(txValorProduto);
		 
		 //Botão Cadastrar Produto
		 btCadastrarProduto = new JButton("Cadastrar");
		 btCadastrarProduto.setBounds(15,150,100,20);
		 painelProduto1.add(btCadastrarProduto);
		 
		 EventoBotaoProduto evbP = new EventoBotaoProduto();
		 btCadastrarProduto.addActionListener(evbP);
		 
		 //Add Painel
		 ProdutoPane.addTab("Produto", null,painelProduto1,"Primeiro Painel");
		 ProdutoPainel.add(ProdutoPane); 	 
		 
		//SEGUNDA GUIA
		 JPanel painelProduto2 = new JPanel();
		 painelProduto2.setLayout(null);
			
		//Cadastro Produto
		 lbQuantidadeProduto = new JLabel("Quant. Produto:"); //Nome Produto
		 lbQuantidadeProduto.setBounds(10, 15, 75, 20);
		 painelProduto2.add(lbQuantidadeProduto);
		 
		 txQuantidadeProduto = new JTextField();
		 txQuantidadeProduto.setBounds(85, 15, 150, 20);
		 painelProduto2.add(txQuantidadeProduto);
		 
		 lbValorTotalProduto = new JLabel("Valor Total:"); //Valor Produto
		 lbValorTotalProduto.setBounds(10, 55, 75, 20);
		 painelProduto2.add(lbValorTotalProduto);
		 
		 txValorTotalProduto = new JTextField();
		 txValorTotalProduto.setBounds(85, 55, 150, 20);
		 painelProduto2.add(txValorTotalProduto);
		 
		 //Botão Cadastrar Produto
		 btCadastrarProdutos = new JButton("Cadastrar Produtos");
		 btCadastrarProdutos.setBounds(15,150,100,20);
		 painelProduto2.add(btCadastrarProdutos);
		 
		 EventoBotaoProdutos evbPs = new EventoBotaoProdutos();
		 btCadastrarProdutos.addActionListener(evbPs);
		 
		 //Add Painel
		 ProdutoPane.addTab("Produto", null,painelProduto2,"Segundo Painel");
		 ProdutoPainel.add(ProdutoPane); 	 
	}
	
	   private class EventoBotaoProduto implements ActionListener{ //BOTÃO PRIMEIRA GUIA
	       public void actionPerformed(ActionEvent event){
	    	   	JOptionPane.showMessageDialog(null,"Produto: "+txNomeProduto.getText()+"\n"+"Valor: "+txValorProduto.getText());
	        }   
	   }
	   
	   private class EventoBotaoProdutos implements ActionListener{ //BOTÃO SEGUNDA GUIA
	       public void actionPerformed(ActionEvent event){
	    	   	JOptionPane.showMessageDialog(null,"Quantidade Produtos: "+txQuantidadeProduto.getText()+"\n"+"Valor Total: "+txValorTotalProduto.getText());
	        }   	
	   }
	   
}
