import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Pedido extends JDialog{
	
	private JLabel lbIdCliente; //Pedido Aba1
	private JTextField txIdCliente;
	private JLabel lbIdProduto;
	private JTextField txIdProduto;
	private JLabel lbDataPedido;
	private JTextField txDataPedido;
	private JButton btCadastrarPedido; 
	
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
		
		//Primeira Guia
		
		//Pedido
		JPanel painelPedido1 = new JPanel();
		painelPedido1.setLayout(null);
		
		//Id Cliente
		lbIdCliente = new JLabel("Id Cliente: ");
		lbIdCliente.setBounds(10, 15, 75, 20);
		painelPedido1.add(lbIdCliente);
		
		txIdCliente = new JTextField();
		txIdCliente.setBounds(85, 15, 150, 20);
		painelPedido1.add(txIdCliente);
		
		//Id Produto
		lbIdProduto = new JLabel("Id Produto: ");
		lbIdProduto.setBounds(10, 55, 75, 20);
		painelPedido1.add(lbIdProduto);
		
		txIdProduto = new JTextField();
		txIdProduto.setBounds(85, 55, 150, 20);
		painelPedido1.add(txIdProduto);
		
		//Id Data Pedido
		lbDataPedido = new JLabel("Data Pedido: ");
		lbDataPedido.setBounds(10, 95, 75, 20);
		painelPedido1.add(lbDataPedido);
		
		txDataPedido = new JTextField();
		txDataPedido.setBounds(85, 95, 150, 20);
		painelPedido1.add(txDataPedido);
		
		//Botão Cadastrar Pedido
		btCadastrarPedido = new JButton("Cadastrar Pedido");
		btCadastrarPedido.setBounds(15,150,175,20);
		painelPedido1.add(btCadastrarPedido);	
		
		 EventoBotaoPedido evbP = new EventoBotaoPedido();
		 btCadastrarPedido.addActionListener(evbP);
		
		//Add Painel 
		 PedidoPane.addTab("Pedido", null,painelPedido1,"Primeiro Painel");
		 CadastroPedido.add(PedidoPane); 
		
	}
	   private class EventoBotaoPedido implements ActionListener{ //BOTÃO PRIMEIRA GUIA
	       public void actionPerformed(ActionEvent event){
	    	   	JOptionPane.showMessageDialog(null,"Id Cliente: "+txIdCliente.getText()+"\n"+"Id Produto: "+txIdProduto.getText()+"\n"+"Data Pedido: "+txDataPedido.getText());
	        }   
	  }

}
