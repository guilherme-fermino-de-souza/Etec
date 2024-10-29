package Model; //Apenas Modelagem da aplicação
//Atributos e Gets and Sets
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
	
	 //GETs e SETs 
    //Encapsulação = atributos de uma classe serão escondidos ou privados
   //GET = retorna o valor de um atributo / SET = define ou modifica o valor de um atributo
  //Categoria Produto (tbCategoriaProduto) 1°GUIA
    public String getNomeCategoriaProduto() { // RECUPERA o Nome Categoria Produto
        return txNomeCategoriaProduto.getText(); 
    }
    public void setNomeCategoriaProduto(String nomeCategoriaProduto) { // DEFINE o Nome Categoria Produto
        txNomeCategoriaProduto.setText(String.valueOf(nomeCategoriaProduto));
    }
    
  //Produto (tbProduto) 2°GUIA
  //Nome Produto
    public String getNomeProduto() { // RECUPERA o Nome Produto
    	return txNomeProduto.getText();
    }
    public void setNomeProduto(String nomeProduto) { // DEFINE o Nome Produto
    	txNomeProduto.setText(String.valueOf(nomeProduto));
    }
  //Valor Produto
    public int getValorProduto() { // RECUPERA o Valor Produto
    	return Integer.parseInt(txValorProduto.getText());
    }
    public void setValorProduto(int valorProduto) { // DEFINE o Valor Produto
    	txValorProduto.setText(String.valueOf(valorProduto));
    }
  //Quantidade Produto
    public int getQuantidadeProduto() { // RECUPERA o Nome Produto
    	return Integer.parseInt(txQuantidadeProduto.getText());
    }
    public void setQuantidadeProduto(String quantidadeProduto) { // DEFINE o Nome Produto
    	txQuantidadeProduto.setText(String.valueOf(quantidadeProduto));
    }
  //Id Categoria Produto 
    public int getIdCategoriaProduto() { // RECUPERA a Id Categoria Produto
        return Integer.parseInt(txIdCategoriaProduto.getText()); 
    }
    public void setIdCategoriaProduto(int id) { // DEFINE a Id Categoria Produto
        txIdCategoriaProduto.setText(String.valueOf(id));
    }
	
	public Produto () { //Construtor
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
