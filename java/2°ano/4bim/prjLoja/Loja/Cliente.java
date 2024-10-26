import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Cliente extends JDialog{
	
	private JLabel lbNomeCliente; //Cliente Aba1
	private JTextField txNomeCliente;
	private JLabel lbCpfCliente;
	private JTextField txCpfCliente;
	/*private JTextField txSexoCliente;
	private JLabel lbSexoCliente;
	private JLabel lbDataNasCliente;
	private JTextField txDataNasCliente;*/
	private JLabel lbRuaCliente; //Início logradouro cliente
	private JTextField txRuaCliente;
	private JLabel lbBairroCliente;
	private JTextField txBairroCliente;
	private JLabel lbCidadeCliente;
	private JTextField txCidadeCliente;
	private JLabel lbEstadoCliente;
	private JTextField txEstadoCliente;
	private JLabel lbCepCliente;  
	private JTextField txCepCliente;
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
		lbCpfCliente.setBounds(10, 55, 75, 20);
		painelCliente1.add(lbCpfCliente);
		
		txCpfCliente = new JTextField();
		txCpfCliente.setBounds(85, 55, 150, 20);
		painelCliente1.add(txCpfCliente);

		/* /Sexo Cliente (logradouro)
		lbSexoCliente = new JLabel("Sexo do cliente:");
		lbSexoCliente.setBounds(10, Y, 75, 20);
		painelCliente1.add(lbSexoCliente); 
		
		txSexoCliente = new JTextField();
		txSexoCliente.setBounds(85, Y, 150, 20);
		painelCliente1.add(txSexoCliente);*/

		/* /Data de nascimento Cliente
		lbDataNasCliente = new JLabel("Data de nascimento:");
		lbDataNasCliente.setBounds(10, Y, 75, 20);
		painelCliente1.add(lbDataNasCliente); 
		
		txDataNasCliente = new JTextField();
		txDataNasCliente.setBounds(85, Y, 150, 20);
		painelCliente1.add(txDataNasCliente);*/

		//Rua Cliente (logradouro)
		lbRuaCliente = new JLabel("Rua do cliente:");
		lbRuaCliente.setBounds(10, 115, 75, 20);
		painelCliente1.add(lbRuaCliente);
		
		txRuaCliente = new JTextField();
		txRuaCliente.setBounds(85, 115, 150, 20);
		painelCliente1.add(txRuaCliente);

		//Bairro Cliente (logradouro)
		lbBairroCliente = new JLabel("Bairro do cliente:");
		lbBairroCliente.setBounds(10, 145, 75, 20);
		painelCliente1.add(lbBairroCliente);
		
		txBairroCliente = new JTextField();
		txBairroCliente.setBounds(85, 145, 150, 20);
		painelCliente1.add(txBairroCliente);

		//Cidade Cliente (logradouro)
		lbCidadeCliente = new JLabel("Cidade do cliente:");
		lbCidadeCliente.setBounds(10, 175, 75, 20);
		painelCliente1.add(lbCidadeCliente);
		
		txCidadeCliente = new JTextField();
		txCidadeCliente.setBounds(85, 175, 150, 20);
		painelCliente1.add(txCidadeCliente);

		//Estado Cliente (logradouro)
		lbEstadoCliente = new JLabel("Estado do cliente:");
		lbEstadoCliente.setBounds(10, 205, 75, 20);
		painelCliente1.add(lbEstadoCliente);
		
		txEstadoCliente = new JTextField();
		txEstadoCliente.setBounds(85, 205, 150, 20);
		painelCliente1.add(txEstadoCliente);
		
		//Cep Cliente (logradouro)
		lbCepCliente = new JLabel("Cep do cliente:");
		lbCepCliente.setBounds(10, 235, 75, 20);
		painelCliente1.add(lbCepCliente);
		
		txCepCliente = new JTextField();
		txCepCliente.setBounds(85, 235, 150, 20);
		painelCliente1.add(txCepCliente);

		
		//Botão Cadastrar Cliente
		btCadastrarCliente = new JButton("Cadastrar");
		btCadastrarCliente.setBounds(15, 300, 100, 20);
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
	    	   	JOptionPane.showMessageDialog(null,"Nome Cliente: "+txNomeCliente.getText()+"\n"+"CPF Cliente: "+txCpfCliente.getText()+"\n"+"Rua do Cliente: "+txRuaCliente.getText()+"\n"+"Bairro do Cliente: "+txBairroCliente.getText()+"\n"
						      +"Cidade Cliente: "+txCidadeCliente.getText()+"\n"+"Estado do Cliente: "+txEstadoCliente.getText()+"\n"+"CEP do Cliente: "+txCepCliente.getText());
	        }   
	   }
	   
	   private class EventoBotaoTelefone implements ActionListener{ //BOTÃO SEGUNDA AGUIA
	       public void actionPerformed(ActionEvent event){
	    	   	JOptionPane.showMessageDialog(null,"Telefone Cliente: "+txTelefoneCliente.getText()+"\n"+"COD Cliente: "+txCodCliente.getText());
	        }   
	   }
	   
}
