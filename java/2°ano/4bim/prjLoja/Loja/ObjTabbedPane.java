import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class ObjJTabbedPane extends JDialog{

		private JLabel lbNomeProduto; //PRODUTO
		private JTextField txNomeProduto;
		private JLabel lbValorProduto;
		private JTextField txValorProduto;
		private JButton btCadastrar;
		private JLabel lbNomeCliente; //CLIENTE
		private JTextField txNomeCliente;
		private JLabel lbcpfCliente;
		private JTextField txcpfCliente;
		private JButton btCadastrarCliente;
		private JButton btCadastrarPedido; //PEDIDO
	
	public ObjJTabbedPane() {
	 this.setTitle("Cadastro de Clientes");
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
	  
	  //Nome Produto
	  lbNomeProduto = new JLabel("Nome:");
	  lbNomeProduto.setBounds(10,15,75,20);     
	  painel1.add(lbNomeProduto);   
	     
	  txNomeProduto = new JTextField();
	  txNomeProduto.setBounds(85, 15, 150, 20);
	  painel1.add(txNomeProduto);
	  
	  //Valor Produto
	  lbValorProduto = new JLabel("Valor em R$:");
	  lbValorProduto.setBounds(10,55,75,20);     
	  painel1.add(lbValorProduto);   
	     
	  txValorProduto = new JTextField();
	  txValorProduto.setBounds(85, 55, 150, 20);
	  painel1.add(txValorProduto);
	  
	  //BOTÃO CADASTRAR
	  btCadastrar = new JButton("Cadastrar");
	  btCadastrar.setBounds(15,150,100,20); // Posição x(horizontal),y(vertical) e largura e altura
	  painel1.add(btCadastrar);
	
	  EventoBotao evb = new EventoBotao();
	  btCadastrar.addActionListener(evb);
	  //add painel
	  tabbedpane.addTab("Produto", null,painel1,"Primeiro Painel");
	  
	  //SEGUNDA GUIA
	  
      //PAINEL CLIENTE
	  JPanel painel2 = new JPanel();
	  painel2.setLayout(null);
	  painel2.setBackground(Color.WHITE);  
	  
	  //Nome Cliente
	  lbNomeCliente = new JLabel("Nome:");
	  lbNomeCliente.setBounds(10,15,50,20);     
	  painel2.add(lbNomeCliente);   
	     
	  txNomeCliente = new JTextField();
	  txNomeCliente.setBounds(60, 15, 150, 20);
	  painel2.add(txNomeCliente);
	  
	  //CPF Cliente
	  lbcpfCliente = new JLabel("CPF:");
	  lbcpfCliente.setBounds(10,55,50,20);     
	  painel2.add(lbcpfCliente);   
	     
	  txcpfCliente = new JTextField();
	  txcpfCliente.setBounds(60, 55, 150, 20);
	  painel2.add(txcpfCliente);
	  
	  //BOTÃO CADASTRAR
	  btCadastrarCliente = new JButton("Cadastrar");
	  btCadastrarCliente.setBounds(15,150,100,20); // Posição x(horizontal),y(vertical) e largura e altura
	  painel2.add(btCadastrarCliente);
	
	  EventoBotaoCliente evbC = new EventoBotaoCliente();
	  btCadastrarCliente.addActionListener(evbC);
	  
	  //add painel
	  tabbedpane.addTab("Cliente", null,painel2,"Segundo Painel");  
	  
	  //TERCEIRA GUIA
	  
	  //PAINEL PEDIDO
	  JPanel painel3 = new JPanel(); 
	  painel3.setLayout(null);
	  
	  //Nome Cliente
	  lbNomeCliente = new JLabel("Nome Cliente:");
	  lbNomeCliente.setBounds(10,15,85,20);     
	  painel3.add(lbNomeCliente);   
	     
	  txNomeCliente = new JTextField();
	  txNomeCliente.setBounds(95, 15, 150, 20);
	  painel3.add(txNomeCliente);
	  
	  //Nome Produto
	  lbNomeProduto = new JLabel("Nome Produto:");
	  lbNomeProduto.setBounds(10,55,85,20);     
	  painel3.add(lbNomeProduto);   
	     
	  txNomeProduto = new JTextField();
	  txNomeProduto.setBounds(95, 55, 150, 20);
	  painel3.add(txNomeProduto);
	
	  //BOTÃO CADASTRAR PEDIDO
	  btCadastrarPedido = new JButton("Cadastrar Pedido");
	  btCadastrarPedido.setBounds(15,150,200,20); // Posição x(horizontal),y(vertical) e largura e altura
	  painel3.add(btCadastrarPedido);
	
	  EventoBotaoPedido evbP = new EventoBotaoPedido();
	  btCadastrarPedido.addActionListener(evbP);
	  
	  //add painel
	  tabbedpane.addTab("Pedido", null,painel3,"Terceiro Painel");  
	
	  janelaCalc.add(tabbedpane);   
  }
   
   private class EventoBotao implements ActionListener{ //BOTÃO PRIMEIRA GUIA
       public void actionPerformed(ActionEvent event){
    	   	JOptionPane.showMessageDialog(null,"Nome Produto: "+txNomeProduto.getText()+"\n"+"Valor Produto: "+txValorProduto.getText());
        }   
   } 
   
   private class EventoBotaoCliente implements ActionListener{ //BOTÃO SEGUNDA GUIA
       public void actionPerformed(ActionEvent event){
    	   	JOptionPane.showMessageDialog(null,"Nome Cliente: "+txNomeCliente.getText()+"\n"+"CPF Cliente: "+txcpfCliente.getText());
        }   
   }
   
   private class EventoBotaoPedido implements ActionListener{ //BOTÃO TERCEIRA GUIA
       public void actionPerformed(ActionEvent event){
    	   	JOptionPane.showMessageDialog(null,"Nome Cliente: "+txNomeCliente.getText()+"\n"+"Nome Produto: "+txNomeProduto.getText());
        }   
   }
}
