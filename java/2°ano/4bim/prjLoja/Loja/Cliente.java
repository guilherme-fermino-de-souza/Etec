import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Cliente extends JDialog{
	
	private JLabel lbNomeCliente; //Cliente Aba1
	private JTextField txNomeCliente;
	private JLabel lbCpfCliente;
	private JTextField txCpfCliente;
	private JButton btCadastrarCliente; 
	private JLabel lbTelefoneCliente; //Telefone Aba2
	private JTextField txTelefoneCliente;
	private JLabel lbCodCliente;
	private JTextField txCodCliente;
	private JButton btCadastrarTelefone; 
	
	public Cliente() {
		this.setTitle("Cadastrar Cliente");
		this.setModal(true);
		this.setSize(450, 380);
		this.setResizable(false);
		
		 Container CadastroCliente = this.getContentPane();  
		 setLocationRelativeTo(CadastroCliente);
		 CadastroCliente.setLayout(null);
		 
		//Criar o JTabbedPane(painel cojm guias)
		JTabbedPane ClientePane = new JTabbedPane();
		ClientePane.setBounds(0, 0, 500, 470);	//Tamanho e Posicionamento do JTabbedPane
		
		
		//Primeira Guia	
	
		//Cadastro Cliente
		JPanel painelCliente1 = new JPanel();
		painelCliente1.setLayout(null);
		
		//Nome Cliente
		lbNomeCliente = new JLabel("Nome:");
		lbNomeCliente.setBounds(10, 15, 75, 20);
		painelCliente1.add(lbNomeCliente);
		
		txNomeCliente = new JTextField();
		txNomeCliente.setBounds(85, 15, 150, 20);
		painelCliente1.add(txNomeCliente);
		
		//Cpf Cliente
		lbCpfCliente = new JLabel("Cliente:");
		lbCpfCliente.setBounds(10,55,75,20);
		painelCliente1.add(lbCpfCliente);
		
		txCpfCliente = new JTextField();
		txCpfCliente.setBounds(85, 55, 150, 20);
		painelCliente1.add(txCpfCliente);
		
		//Botão Cadastrar Cliente
		btCadastrarCliente = new JButton("Cadastrar");
		btCadastrarCliente.setBounds(15,150,100,20);
		painelCliente1.add(btCadastrarCliente);	
		
		 EventoBotaoCliente evbC = new EventoBotaoCliente();
		 btCadastrarCliente.addActionListener(evbC);
		
		//Add Painel 
		 ClientePane.addTab("Cliente", null,painelCliente1,"Primeiro Painel");
		 CadastroCliente.add(ClientePane); 
		
	
		 //Cadastro Telefone
		JPanel painelCliente2 = new JPanel();
		painelCliente2.setLayout(null);
			
		//telefone Cliente
			lbTelefoneCliente = new JLabel("Telefone Cliente:");
			lbTelefoneCliente.setBounds(10, 15, 75, 20);
			painelCliente2.add(lbTelefoneCliente);
			
			txTelefoneCliente = new JTextField();
			txTelefoneCliente.setBounds(85, 15, 150, 20);
			painelCliente2.add(txTelefoneCliente);
			
			//Cod Cliente
			lbCodCliente = new JLabel("Cod Cliente:");
			lbCodCliente.setBounds(10,55,75,20);
			painelCliente2.add(lbCodCliente);
			
			txCodCliente = new JTextField();
			txCodCliente.setBounds(85, 55, 150, 20);
			painelCliente2.add(txCodCliente);
			
			//Botão Cadastrar Cliente
			btCadastrarTelefone = new JButton("Cadastrar Telefone");
			btCadastrarTelefone.setBounds(15,150,100,20);
			painelCliente2.add(btCadastrarTelefone);	
			
			 EventoBotaoTelefone evbT = new EventoBotaoTelefone();
			 btCadastrarTelefone.addActionListener(evbT);
			
			//Add Painel 
			 ClientePane.addTab("telefone", null,painelCliente2,"Segundo Painel");
			 CadastroCliente.add(ClientePane); 
			
		}
	
	
	   private class EventoBotaoCliente implements ActionListener{ //BOTÃO PRIMEIRA GUIA
	       public void actionPerformed(ActionEvent event){
	    	   	JOptionPane.showMessageDialog(null,"Nome Cliente: "+txNomeCliente.getText()+"\n"+"CPF Cliente: "+txCpfCliente.getText());
	        }   
	   }
	   
	   private class EventoBotaoTelefone implements ActionListener{ //BOTÃO SEGUNDA AGUIA
	       public void actionPerformed(ActionEvent event){
	    	   	JOptionPane.showMessageDialog(null,"Telefone Cliente: "+txTelefoneCliente.getText()+"\n"+"COD Cliente: "+txCodCliente.getText());
	        }   
	   }
	   
}
