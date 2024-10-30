package Model;//Apenas Modelagem da aplicação
//Atributos e Gets and Sets
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
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
	private JLabel lbQuantidadePedido; //Quantidade 1° Coluna
	private JTextField txQuantidadePedido;
	private JLabel lbIdPedido; //Id Pedido 2° Coluna
	private JTextField txIdPedido;
	private JLabel lbIdProduto; //Id Produto 3° Coluna
	private JTextField txIdProduto;
	private JButton btCadastrarItensPedido; //Botão Cadastrar 2° Guia
	
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
    
  //Produto (tbProduto) 2°GUIA
  //Nome Produto
    public String getNomeProduto() { // RECUPERA o Nome Produto
    	return txNomeProduto.getText();
    }
    public void setNomeProduto(String nomeProduto) { // DEFINE o Nome Produto
    	txNomeProduto.setText(String.valueOf(nomeProduto));
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
		lbQuantidadePedido = new JLabel("Quantidade Pedido: ");
		lbQuantidadePedido.setBounds(10, 15, 115, 20);
		painelPedido2.add(lbQuantidadePedido);
				
		txQuantidadePedido = new JTextField();
		txQuantidadePedido.setBounds(120, 15, 150, 20);
		painelPedido2.add(txQuantidadePedido);
		
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
	        }   
	  }
	   
	   private class EventoBotaoPedidoItens implements ActionListener{ //BOTÃO SEGUNDA GUIA
	       public void actionPerformed(ActionEvent event){
	    	   	JOptionPane.showMessageDialog(null,"Quantidade: "+txQuantidadePedido.getText()+"\n"+"Id Pedido: "+txIdPedido.getText()+"\n"+"Id Produto: "+txIdPedido.getText());
	        }   
	  }

}
