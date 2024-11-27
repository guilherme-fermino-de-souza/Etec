package Model;

import java.awt.Container;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.List;
import java.time.format.DateTimeFormatter;

import DAO.ClienteDao;
import DAO.ProdutoDao;

import java.util.ArrayList;
import java.sql.SQLException;
import java.awt.*;
import javax.swing.*;

public class Cliente extends JDialog{
		//tbTelefoneCliente 	-	2ª Guia/Aba
	private JLabel lbTelefoneCliente; //Telefone cliente Aba1 - 1ª coluna
	private JTextField txTelefoneCliente;
	private JLabel lbIdCliente;	//ID cliente (FK) Aba1 - 2ª coluna
	private JTextField txIdCliente;
	private JButton btCadastrarTelefoneCliente, btDeleteTelefoneCliente; //Botão Cadastrar e Deletar 1ª Guia/Aba
	private DefaultTableModel modeloTabelaTelefoneCliente;
	private JTable tabelaTelefoneCliente;
    private ArrayList<String> listaTelefoneCliente;
    
	private JLabel lbNomeCliente; //Cliente Aba1 - nome cliente 1° Coluna
	private JTextField txNomeCliente;
	private JLabel lbCpfCliente;	//cpf 2° Coluna
	private JTextField txCpfCliente;
	private JLabel lbSexoCliente;	//Gênero 3° Coluna
	private JTextField txSexoCliente;
/*	private JLabel lbDataNasCliente;	//Data 4° Coluna
	private JTextField txDataNasCliente;    */
	private JLabel lbRuaCliente; //Início logradouro cliente - rua Logra 5° Coluna
	private JTextField txRuaCliente;
	private JLabel lbBairroCliente;	//Bairro logra 6° Coluna
	private JTextField txBairroCliente;
	private JLabel lbCidadeCliente;	//Cidade logra 7° Coluna
	private JTextField txCidadeCliente;
	private JLabel lbEstadoCliente;	//Estado logra 8° Coluna
	private JTextField txEstadoCliente;
	private JLabel lbCepCliente;  	//CEP logra 9° Coluna
	private JTextField txCepCliente;
	private JButton btCadastrarCliente, btDeleteCliente; //Botão Cadastrar e Deletar 1° Guia/Aba
	private DefaultTableModel modeloTabelaCliente;
	private JTable tabelaCliente;
	private ArrayList<String> listaCliente;
	
	
	
	/*private int idUpCliente;*/
	private int idCliente;
	private int idClienteTelefoneCliente;
	/*private int idProdutoItensPedido;
	private int upQuantidadeItensPedido;*/
  //Pedido (tbPedido) 1°GUIA
    public String getNomeCliente() {
    	return txNomeCliente.getText();
    }
    public void setNomeCliente(String nomeCliente) {
    	txNomeCliente.setText(String.valueOf(nomeCliente));
    }
    public int getCPF() {	//RECUPERA o CPF do Cliente
        return Integer.parseInt(txCpfCliente.getText());
    }
    public void setCPF(int cpfCliente) {
    	txCpfCliente.setText(String.valueOf( cpfCliente));
    }/*public void setCpfCliente(String cpf) {
        try {
            long cpfLong = Long.parseLong(cpf);
            // Verifica se o CPF tem 11 dígitos (após a conversão para long, o número de dígitos pode mudar)
            if (String.valueOf(cpfLong).length() == 11) {
                // Armazena o CPF em um atributo da classe
                this.CpfCliente = cpfLong;
            } else {
                // Exibir mensagem de erro para o usuário
                System.out.println("CPF inválido.");
            }
        } catch (NumberFormatException e) {
            // Se der erro
            System.out.println("CPF inválido.");
        }
    } */
    public String getSexoCliente() {
        return txSexoCliente.getText();
    }
    public void setSexoCliente(String sexoCliente) {	
    	txSexoCliente.setText(String.valueOf(sexoCliente));
    }
 
		/*    public LocalDate getDataNasCliente() { 
		        return LocalDate.parse(txDataNasCliente.getText(), DateTimeFormatter.ISO_LOCAL_DATE); //Converte para (dd-mm-yyyy)
		    }
		    public void setDataNasCliente(LocalDate dataNasCliente) { // DEFINE a Data Nasci. Cliente
		    	txDataNasCliente.setText(dataNasCliente.format(DateTimeFormatter.ISO_LOCAL_DATE)); //Converte para (dd-mm-yyyy)
		    }				*/
    
    public String getRuaCliente() {
    	return txRuaCliente.getText();
    }
    public void setRuaCliente(String ruaCliente) {
    	txRuaCliente.setText(String.valueOf(ruaCliente));
    }
    
    public String getBairroCliente() { // RECUPERA o Bairro do Cliente
    	return txBairroCliente.getText();
    }
    public void setBairroCliente(String bairroCliente) { // DEFINE o Bairro do Cliente
    	txBairroCliente.setText(String.valueOf(bairroCliente));
    }
    
    //Cidade Cliente
    public String getCidadeCliente() { // RECUPERA a cidade do Cliente
    	return txCidadeCliente.getText();
    }
    public void setCidadeCliente(String cidadeCliente) { // DEFINE a cidade do Cliente
    	txCidadeCliente.setText(String.valueOf(cidadeCliente));
    }
    
    //Estado Cliente
    public String getEstadoCliente() { // RECUPERA o Estado do Cliente
    	return txEstadoCliente.getText();
    }
    public void setEstadoCliente(String estadoCliente) { // DEFINE o Estado do Cliente
    	txEstadoCliente.setText(String.valueOf(estadoCliente));
    }
    //Estado Cliente
    public int getCepCliente() { // RECUPERA o CEP do Cliente
    	return Integer.parseInt(txCepCliente.getText());
    }
    public void setCepCliente(String cepCliente) { // DEFINE o CEP do Cliente
    	txCepCliente.setText(String.valueOf(cepCliente));
    }
    
  //Telefone Cliente (tbTelefoneCliente) 2°GUIA
  //Telefone Cliente
    public int getTelefoneCliente() {
    	return Integer.parseInt(txTelefoneCliente.getText());    
    }
    public void setTelefoneCliente(int telefoneCliente) { 
    	txTelefoneCliente.setText(String.valueOf(telefoneCliente));
    }
    
   //Id Cliente
    public int getIdTelefoneCliente() { // RECUPERA o Id Cliente
    	return Integer.parseInt(txIdCliente.getText());
    }
    public void setIdTelefoneCliente(int idTelefoneCliente) { // DEFINE o Id do Cliente
    	txIdCliente.setText(String.valueOf(idTelefoneCliente));
    }
    
	public Cliente() {
		this.setTitle("Cadastrar Cliente");
		this.setModal(true);
		this.setSize(450, 380);
		this.setResizable(false);
		
		 Container CadastroCliente = this.getContentPane();  
		 setLocationRelativeTo(CadastroCliente);
		 CadastroCliente.setLayout(null);
		 
		//Criar o JTabbedPane(painel com guias)
		JTabbedPane ClientePane = new JTabbedPane();
		ClientePane.setBounds(0, 0, 500, 470);	//Tamanho e Posicionamento do JTabbedPane
		
		//telefone Cliente - 1° GUIA
		//Cadastro Telefone
		JPanel painelCliente1 = new JPanel();
		painelCliente1.setLayout(null);
					
		//Botão Cadastrar Cliente
		btCadastrarTelefoneCliente = new JButton("Cadastrar Telefone");
		btCadastrarTelefoneCliente.setBounds(5,150,100,20);
		painelCliente1.add(btCadastrarTelefoneCliente);	
		
		//Botão Deletar Cliente
		btDeleteTelefoneCliente = new JButton("Deletar Telefone");
		btDeleteTelefoneCliente.setBounds(5,150,100,20);
		painelCliente1.add(btDeleteTelefoneCliente);
		
		
		
		//Telefone Cliente - coluna 1
			lbTelefoneCliente = new JLabel("Telefone Cliente:");
			lbTelefoneCliente.setBounds(10, 25, 75, 20);
			painelCliente1.add(lbTelefoneCliente);
			
			txTelefoneCliente = new JTextField();
			txTelefoneCliente.setBounds(85, 25, 150, 20);
			painelCliente1.add(txTelefoneCliente);
					
			//Cód. Cliente
			lbIdCliente = new JLabel("Identificação do Cliente:");
			lbIdCliente.setBounds(10,45,75,20);
			painelCliente1.add(lbIdCliente);
					
			txIdCliente = new JTextField();
			txIdCliente.setBounds(85, 45, 150, 20);
			painelCliente1.add(txIdCliente);

			listaTelefoneCliente = new ArrayList<>();
			
			modeloTabelaTelefoneCliente = new DefaultTableModel();//Tabela Mostrar tbTelefoneCliente
			modeloTabelaTelefoneCliente.addColumn("Categoria");
			tabelaTelefoneCliente  = new JTable(modeloTabelaTelefoneCliente);
			 JScrollPane scrollPane = new JScrollPane(tabelaTelefoneCliente);
			 scrollPane.setBounds(10, 75, 400, 470);  // Defina o tamanho e a posição do JScrollPane
			 painelCliente1.add(scrollPane);  // Adicionando o JScrollPane no painel
					
			 EventoBotaoCadastrarTelefoneCliente evbTCc = new EventoBotaoCadastrarTelefoneCliente();
			 btCadastrarTelefoneCliente.addActionListener(evbTCc);
			 
			 EventoBotaoDeleteTelefoneCliente evbTCd = new EventoBotaoDeleteTelefoneCliente();
			 btDeleteTelefoneCliente.addActionListener(evbTCd);
					
			//Add Painel 
			 ClientePane.addTab("telefone", null,painelCliente1,"Primeiro Painel");
			 CadastroCliente.add(ClientePane); 
					
		
		
		//2° GUIA
	
		//Cadastro Cliente
	JPanel painelCliente2 = new JPanel();
	painelCliente2.setLayout(null);
	
	//Botão Cadastrar Cliente
	btCadastrarCliente = new JButton("Cadastrar-se");
	btCadastrarCliente.setBounds(5, 5, 100, 20);
	painelCliente2.add(btCadastrarCliente);	
	
	//Botão Deletar Cliente
	btDeleteCliente = new JButton("Deletar conta");
	btDeleteCliente.setBounds(115, 5, 100, 20);
	painelCliente2.add(btDeleteCliente);
	
	//Nome Cliente
	lbNomeCliente = new JLabel("Nome:");
	lbNomeCliente.setBounds(10, 25, 75, 20);
	painelCliente2.add(lbNomeCliente);
	
	txNomeCliente = new JTextField();
	txNomeCliente.setBounds(85, 25, 150, 20);
	painelCliente2.add(txNomeCliente);
	
	//Cpf Cliente
	lbCpfCliente = new JLabel("Cpf:");
	lbCpfCliente.setBounds(10, 45, 75, 20);
	painelCliente2.add(lbCpfCliente);
	
	txCpfCliente = new JTextField();
	txCpfCliente.setBounds(85, 45, 150, 20);
	painelCliente2.add(txCpfCliente);

	//Sexo Cliente (logradouro)
	lbSexoCliente = new JLabel("Sexo do cliente:");
	lbSexoCliente.setBounds(10, 65, 75, 20);
	painelCliente2.add(lbSexoCliente); 
	
	txSexoCliente = new JTextField();
	txSexoCliente.setBounds(85, 65, 150, 20);
	painelCliente2.add(txSexoCliente);

/*	//Data de nascimento Cliente
	lbDataNasCliente = new JLabel("Data de nascimento:");
	lbDataNasCliente.setBounds(10, 95, 75, 20);
	painelCliente1.add(lbDataNasCliente); 
	
	txDataNasCliente = new JTextField();
	txDataNasCliente.setBounds(85, 95, 150, 20);
	painelCliente1.add(txDataNasCliente);		*/

	//Rua Cliente (logradouro)
	lbRuaCliente = new JLabel("Rua do cliente:");
	lbRuaCliente.setBounds(10, 85, 75, 20);
	painelCliente2.add(lbRuaCliente);
	
	txRuaCliente = new JTextField();
	txRuaCliente.setBounds(85, 85, 150, 20);
	painelCliente2.add(txRuaCliente);

	//Bairro Cliente (logradouro)
	lbBairroCliente = new JLabel("Bairro do cliente:");
	lbBairroCliente.setBounds(10, 105, 75, 20);
	painelCliente2.add(lbBairroCliente);
	
	txBairroCliente = new JTextField();
	txBairroCliente.setBounds(85, 105, 150, 20);
	painelCliente2.add(txBairroCliente);

	//Cidade Cliente (logradouro)
	lbCidadeCliente = new JLabel("Cidade do cliente:");
	lbCidadeCliente.setBounds(10, 125, 75, 20);
	painelCliente2.add(lbCidadeCliente);
	
	txCidadeCliente = new JTextField();
	txCidadeCliente.setBounds(85, 125, 150, 20);
	painelCliente2.add(txCidadeCliente);

	//Estado Cliente (logradouro)
	lbEstadoCliente = new JLabel("Estado do cliente:");
	lbEstadoCliente.setBounds(10, 145, 75, 20);
	painelCliente2.add(lbEstadoCliente);
	
	txEstadoCliente = new JTextField();
	txEstadoCliente.setBounds(85, 145, 150, 20);
	painelCliente2.add(txEstadoCliente);
	
	//Cep Cliente (logradouro)
	lbCepCliente = new JLabel("Cep do cliente:");
	lbCepCliente.setBounds(10, 165, 75, 20);
	painelCliente2.add(lbCepCliente);
	
	txCepCliente = new JTextField();
	txCepCliente.setBounds(85, 165, 150, 20);
	painelCliente2.add(txCepCliente);

	listaCliente = new ArrayList<>();
	
	modeloTabelaCliente = new DefaultTableModel();//Tabela Mostrar tbProduto
	modeloTabelaCliente.addColumn("Produto");
	tabelaCliente  = new JTable(modeloTabelaCliente);
	 JScrollPane scrollPaneProduto = new JScrollPane(tabelaCliente);
	 scrollPaneProduto.setBounds(10, 195, 400, 400);  // Defina o tamanho e a posição do JScrollPane
	 painelCliente2.add(scrollPaneProduto);  // Adicionando o JScrollPane no painel
	
	EventoBotaoCadastrarCliente evbCc = new EventoBotaoCadastrarCliente();
	 btCadastrarCliente.addActionListener(evbCc);
	
	EventoBotaoDeleteCliente evbCd = new EventoBotaoDeleteCliente();
	 btDeleteCliente.addActionListener(evbCd);
	 
	//Add Painel 
	 ClientePane.addTab("Cliente", null,painelCliente2,"Segundo Painel");
	 CadastroCliente.add(ClientePane); 
	
		
	}
	
	   private class EventoBotaoCadastrarCliente implements ActionListener{ //BOTÃO PRIMEIRA GUIA
		    public void actionPerformed(ActionEvent event) {
			      String nome = txNomeCliente.getText().trim();
			      if (!nome.isEmpty()) {
			    	  listaCliente.add(nome);
			        Cliente.this.modeloTabelaCliente.addRow(new Object[]{nome});
		            Cliente cliente = new Cliente(); // OBJETO 1° Guia
		            cliente.setNomeCliente(txNomeCliente.getText()); // Categoria
		            ClienteDao clienteDao = new ClienteDao();
				 	//List<Produto> categoriaProdutos = new ArrayList<>(); // Inicializando os dados
		            try {
		                // Adiciona a novo cliente no banco
		                clienteDao.adicionarCliente(cliente);

		                // Recupera a lista atualizada de clientes
		                List<Cliente> clientes = clienteDao.getListaCliente();

		                // Atualiza a tabela com a lista de clientes recuperadas do banco
		                modeloTabelaCliente.setRowCount(0); // Limpa a tabela
		                for (Cliente cliente1 : clientes) {
		                	modeloTabelaCliente.addRow(new Object[]{cliente1.getNomeCliente()});
		                }

		            } catch (SQLException e) {
		                e.printStackTrace();
		            }
		        } else {
		            JOptionPane.showMessageDialog(null, "Insira um telefone"); // Aviso
		        }
		    }   	
		   }
	   
		  private class EventoBotaoDeleteCliente implements ActionListener {
			    public void actionPerformed(ActionEvent event){
			        int linhaCliente = tabelaCliente.getSelectedRow();
			        if (linhaCliente != -1) {
			            String nomeClienteExcluir = (String) tabelaCliente.getValueAt(linhaCliente, 0);
			            listaCliente.remove(nomeClienteExcluir); // Remove da lista
			            modeloTabelaCliente.removeRow(linhaCliente); // Remove da tabela (modelo)
			            
			            Cliente cliente = new Cliente(); // OBJETO 1° Guia
			            cliente.setNomeCliente(txNomeCliente.getText()); // Categoria
			            ClienteDao clienteDao = new ClienteDao();
			            try {
			            	clienteDao.deleteCliente(cliente); // Remove da base de dados
			            } catch (SQLException e) {
			                e.printStackTrace();
			            }
			        } else {
			            JOptionPane.showMessageDialog(null, "Selecione um nome para excluir.", "Erro", JOptionPane.ERROR_MESSAGE);
			        }
			    }
			}
	   
	   private class EventoBotaoCadastrarTelefoneCliente implements ActionListener {
		    public void actionPerformed(ActionEvent event) {
		      String telefone = txTelefoneCliente.getText().trim();
		      if (!telefone.isEmpty()) {
		    	  listaTelefoneCliente.add(telefone);
		        Cliente.this.modeloTabelaTelefoneCliente.addRow(new Object[]{telefone});
	            Cliente cliente = new Cliente(); // OBJETO 1° Guia
	            cliente.setTelefoneCliente(txTelefoneCliente.getText());; // Categoria
	            ClienteDao clienteDao = new ClienteDao();
			 	//List<Produto> categoriaProdutos = new ArrayList<>(); // Inicializando os dados
	            try {
	                // Adiciona a novo cliente no banco
	                clienteDao.adicionarTelefonCliente(cliente);

	                // Recupera a lista atualizada de clientes
	                List<Cliente> clientes = clienteDao.getListaTelefoneCliente();

	                // Atualiza a tabela com a lista de clientes recuperadas do banco
	                modeloTabelaTelefoneCliente.setRowCount(0); // Limpa a tabela
	                for (Cliente cliente1 : clientes) {
	                	modeloTabelaTelefoneCliente.addRow(new Object[]{cliente1.getTelefoneCliente()});
	                }

	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        } else {
	            JOptionPane.showMessageDialog(null, "Insira um telefone"); // Aviso
	        }
	    }   	
	   }
	   
	   
	   
		  private class EventoBotaoDeleteTelefoneCliente implements ActionListener {
			    public void actionPerformed(ActionEvent event){
			        int linhaTelefoneCliente = tabelaCliente.getSelectedRow();
			        if (linhaTelefoneCliente != -1) {
			            String nomeTelefoneClienteExcluir = (String) tabelaCliente.getValueAt(linhaTelefoneCliente, 0);
			            listaTelefoneCliente.remove(nomeTelefoneClienteExcluir); // Remove da lista
			            modeloTabelaTelefoneCliente.removeRow(linhaTelefoneCliente); // Remove da tabela (modelo)
			            
			            Cliente cliente = new Cliente(); // OBJETO 1° Guia
			            cliente.setTelefoneCliente(txTelefoneCliente.getText()); // Categoria
			            ClienteDao clienteDao = new ClienteDao();
			            try {
			            	clienteDao.deleteTelefoneCliente(cliente); // Remove da base de dados
			            } catch (SQLException e) {
			                e.printStackTrace();
			            }
			        } else {
			            JOptionPane.showMessageDialog(null, "Selecione um Telefone para excluir.", "Erro", JOptionPane.ERROR_MESSAGE);
			        }
			    }
			}
	   
}
