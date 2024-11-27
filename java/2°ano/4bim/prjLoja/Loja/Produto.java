package Model; //Apenas Modelagem da aplicação
//Atributos e Gets and Sets
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;
import DAO.ProdutoDao;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

public class Produto extends JDialog{
	//Categoria Produto (tbCategoriaProduto) 1°GUIA
	private JLabel lbNomeCategoriaProduto; //Nome Categoria 1° Coluna
	private JTextField txNomeCategoriaProduto;
	private JButton btCadastrarCategoriaProduto, btDeleteCategoriaProduto;
	private DefaultTableModel modeloTabelaCategoriaProduto;
	private JTable tabelaCategorias;
    private ArrayList<String> listaCategoria;
	
	//Produto (tbProduto) 2°GUIA
	private JLabel lbNomeProduto; //Nome 1° Coluna
	private JTextField txNomeProduto;
	private JLabel lbValorProduto; //Valor 2° Coluna
	private JTextField txValorProduto;
	private JLabel lbQuantidadeProduto; //Quantidade 3° Coluna
	private JTextField txQuantidadeProduto; 
	private JLabel lbIdCategoriaProduto; //Id Categoria Produto 4° Coluna
	private JTextField txIdCategoriaProduto; 
	private JButton btCadastrarProduto, btDeleteProduto;  //Botão Cadastrar 2° Guia
	private DefaultTableModel modeloTabelaProduto;
	private JTable tabelaProdutos;
	private ArrayList<String> listaProduto;
	
	private int idUpProduto;
	private int idProduto;
	private int idCategoriProduto;
	
	  //Categoria Produto (tbCategoriaProduto) 1°GUIA
	    public String getNomeCategoriaProduto() { // RECUPERA o Nome Categoria Produto
	        return txNomeCategoriaProduto.getText(); 
	    }
	    public void setNomeCategoriaProduto(String nomeCategoriaProduto) { // DEFINE o Nome Categoria Produto
	        txNomeCategoriaProduto.setText(String.valueOf(nomeCategoriaProduto));
	    }
	  //Produto (tbProduto) 2°GUIA
	    public String getNomeProduto() { // RECUPERA o Nome Produto
	    	return txNomeProduto.getText();
	    }
	    public void setNomeProduto(String nomeProduto) { // DEFINE o Nome Produto
	    	txNomeProduto.setText(String.valueOf(nomeProduto));
	    }
	    public double getValorProduto() { // RECUPERA o Valor Produto
	    	return Double.parseDouble(txValorProduto.getText());
	    }
	    public void setValorProduto(double valorProduto) { // DEFINE o Valor Produto
	    	txValorProduto.setText(String.valueOf(valorProduto));
	    }
	    public int getQuantidadeProduto() { // RECUPERA o Quantidade Produto
	    	return Integer.parseInt(txQuantidadeProduto.getText());
	    }
	    public void setQuantidadeProduto(int quantidadeProduto) { // DEFINE o Quantidade Produto
	    	txQuantidadeProduto.setText(String.valueOf(quantidadeProduto));
	    }
	    public int getIdCategoriaProduto() { // RECUPERA a Id Categoria Produto
	        return Integer.parseInt(txIdCategoriaProduto.getText()); 
	    }
	    public void setIdCategoriaProduto(int id) { // DEFINE a Id Categoria Produto
	        txIdCategoriaProduto.setText(String.valueOf(id));
	    }
	    public int getIdCategoriProduto() {
	        return idCategoriProduto;
	    }
	    public void setIdCategoriProduto(int idCategoriProduto) {
	        this.idCategoriProduto = idCategoriProduto;
	    }
	    public int getIdUpProduto() { //Atualizar Produto
	        return idUpProduto;
	    }
	    public void setIdUpProduto(int idUpProduto) {
	        this.idUpProduto = idUpProduto;
	    }    
	    public int getIdProduto() { //Deletar Produto
	        return idProduto;
	    }
	    public void setIdProduto(int idProduto) {
	        this.idProduto = idProduto;
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
		 
		 //Botão Cadastrar Categoria Produto(tbCategoriaProduto)
		 btCadastrarCategoriaProduto = new JButton("Cadastrar");
		 btCadastrarCategoriaProduto.setBounds(10,35,100,20);
		 painelProduto1.add(btCadastrarCategoriaProduto);
		 
		 //Botão Delete Categoria Produto(tbCategoriaProduto)
		 btDeleteCategoriaProduto = new JButton("Delete");
		 btDeleteCategoriaProduto.setBounds(135,35,100,20);
		 painelProduto1.add(btDeleteCategoriaProduto);
			
		//Categoria Produto COLUNA 1
		 lbNomeCategoriaProduto = new JLabel("Categoria: "); //Nome Produto
		 lbNomeCategoriaProduto.setBounds(10, 15, 75, 20);
		 painelProduto1.add(lbNomeCategoriaProduto);
		 
		 txNomeCategoriaProduto = new JTextField();
		 txNomeCategoriaProduto.setBounds(85, 15, 150, 20);
		 painelProduto1.add(txNomeCategoriaProduto);
		 
		 listaCategoria = new ArrayList<>();
		 
		 modeloTabelaCategoriaProduto = new DefaultTableModel();//Tabela Mostrar tbCategoriaProduto
		 modeloTabelaCategoriaProduto.addColumn("Categoria");
		 tabelaCategorias  = new JTable(modeloTabelaCategoriaProduto);
		 JScrollPane scrollPane = new JScrollPane(tabelaCategorias);
		 scrollPane.setBounds(10, 75, 400, 470);  // Defina o tamanho e a posição do JScrollPane
		 painelProduto1.add(scrollPane);  // Adicionando o JScrollPane no painel
		 
		 EventoBotaoCadastrarCategoriaProduto evbCcp = new EventoBotaoCadastrarCategoriaProduto(); //Cadastrar
		 btCadastrarCategoriaProduto.addActionListener(evbCcp);
		 
		 EventoBotaoDeleteCategoriaProduto evbCd = new EventoBotaoDeleteCategoriaProduto(); //Delete
		 btDeleteCategoriaProduto.addActionListener(evbCd);
		 
		 //Add Painel(tbCategoriaProduto) 1° GUIA
		 ProdutoPane.addTab("Categoria Produto", null,painelProduto1,"Primeiro Painel");
		 ProdutoPainel.add(ProdutoPane); 	 
		 
		 //2° GUIA	
		//Produto(tbProduto)
		 JPanel painelProduto2 = new JPanel();
		 painelProduto2.setLayout(null);
		 
		//Botão Cadastrar Produto
		 btCadastrarProduto = new JButton("Cadastrar Produto");
		 btCadastrarProduto.setBounds(15,5,175,20);
		 painelProduto2.add(btCadastrarProduto);
		 
		//Botão Cadastrar Produto
		 btDeleteProduto = new JButton("Delete Produto");
		 btDeleteProduto.setBounds(195,5,175,20);
		 painelProduto2.add(btDeleteProduto);
			
		//Nome Produto COLUNA 1
		 lbNomeProduto = new JLabel("Nome Produto:"); //Nome Produto
		 lbNomeProduto.setBounds(10, 25, 85, 20);
		 painelProduto2.add(lbNomeProduto);
		 
		 txNomeProduto = new JTextField();
		 txNomeProduto.setBounds(130, 25, 150, 20);
		 painelProduto2.add(txNomeProduto);
		 
		//Valor Produto COLUNA 2
		 lbValorProduto = new JLabel("Valor:"); //Valor Produto
		 lbValorProduto.setBounds(10, 45, 75, 20);
		 painelProduto2.add(lbValorProduto);
		 
		 txValorProduto = new JTextField();
		 txValorProduto.setBounds(130, 45, 150, 20);
		 painelProduto2.add(txValorProduto);
		 
		//Quantidade Produto COLUNA 3
		 lbQuantidadeProduto = new JLabel("Quantidade:"); //Nome Produto
		 lbQuantidadeProduto.setBounds(10, 65, 75, 20);
		 painelProduto2.add(lbQuantidadeProduto);
		 
		 txQuantidadeProduto = new JTextField();
		 txQuantidadeProduto.setBounds(130, 65, 150, 20);
		 painelProduto2.add(txQuantidadeProduto);
		 
		//Id Categoria Produto COLUNA 4
		 lbIdCategoriaProduto = new JLabel("Id Categoria Produto:"); //Valor Produto
		 lbIdCategoriaProduto.setBounds(10, 85, 125, 20);
		 painelProduto2.add(lbIdCategoriaProduto);
		 
		 txIdCategoriaProduto = new JTextField();
		 txIdCategoriaProduto.setBounds(130, 85, 150, 20);
		 painelProduto2.add(txIdCategoriaProduto);
		 
		 listaProduto = new ArrayList<>();
		 
		 modeloTabelaProduto = new DefaultTableModel();//Tabela Mostrar tbProduto
		 modeloTabelaProduto.addColumn("Produto");
		 tabelaProdutos  = new JTable(modeloTabelaProduto);
		 JScrollPane scrollPaneProduto = new JScrollPane(tabelaProdutos);
		 scrollPaneProduto.setBounds(10, 135, 400, 400);  // Defina o tamanho e a posição do JScrollPane
		 painelProduto2.add(scrollPaneProduto);  // Adicionando o JScrollPane no painel
		 
		 EventoBotaoCadastrarProduto evbP = new EventoBotaoCadastrarProduto();
		 btCadastrarProduto.addActionListener(evbP);
		 
		 EventoBotaoDeleteProduto evbDP = new EventoBotaoDeleteProduto();
		 btDeleteProduto.addActionListener(evbDP);
		 
		//Add Painel(tbProduto) 2° GUIA
		 ProdutoPane.addTab("Produto", null,painelProduto2,"Segundo Painel");
		 ProdutoPainel.add(ProdutoPane); 	 
	}
	
	  private class EventoBotaoCadastrarCategoriaProduto implements ActionListener {
		    public void actionPerformed(ActionEvent event) {
		      String categoria = txNomeCategoriaProduto.getText().trim();
		      if (!categoria.isEmpty()) {
		        listaCategoria.add(categoria);
		        Produto.this.modeloTabelaCategoriaProduto.addRow(new Object[]{categoria});
	            Produto categoriaProduto = new Produto(); // OBJETO 1° Guia
	            categoriaProduto.setNomeCategoriaProduto(txNomeCategoriaProduto.getText()); // Categoria
	            ProdutoDao produtoDao = new ProdutoDao();
			 	//List<Produto> categoriaProdutos = new ArrayList<>(); // Inicializando os dados
	            try {
	                // Adiciona a nova categoria no banco
	                produtoDao.adicionarCategoriaProduto(categoriaProduto);

	                // Recupera a lista atualizada de categorias
	                List<Produto> categoriaProdutos = produtoDao.getListaCategoria();

	                // Atualiza a tabela com a lista de categorias recuperadas do banco
	                modeloTabelaCategoriaProduto.setRowCount(0); // Limpa a tabela
	                for (Produto categoria1 : categoriaProdutos) {
	                    modeloTabelaCategoriaProduto.addRow(new Object[]{categoria1.getNomeCategoriaProduto()});
	                }

	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        } else {
	            JOptionPane.showMessageDialog(null, "Insira um nome de categoria"); // Aviso
	        }
	    }   	
	   }
	   
	  private class EventoBotaoDeleteCategoriaProduto implements ActionListener {
		    public void actionPerformed(ActionEvent event){
		        int linhaCategoria = tabelaCategorias.getSelectedRow();
		        if (linhaCategoria != -1) {
		            String nomeCategoriaExcluir = (String) tabelaCategorias.getValueAt(linhaCategoria, 0);
		            listaCategoria.remove(nomeCategoriaExcluir); // Remove da lista
		            modeloTabelaCategoriaProduto.removeRow(linhaCategoria); // Remove da tabela (modelo)
		            
		            Produto categoriaProduto = new Produto(); // OBJETO 1° Guia
		            categoriaProduto.setNomeCategoriaProduto(txNomeCategoriaProduto.getText()); // Categoria
		            ProdutoDao produtoDao = new ProdutoDao();
		            try {
		                produtoDao.deleteCategoriaProduto(categoriaProduto); // Remove da base de dados
		            } catch (SQLException e) {
		                e.printStackTrace();
		            }
		        } else {
		            JOptionPane.showMessageDialog(null, "Selecione um nome para excluir.", "Erro", JOptionPane.ERROR_MESSAGE);
		        }
		    }
		}
	   
	   private class EventoBotaoCadastrarProduto implements ActionListener{ //BOTÃO SEGUNDA GUIA
		    public void actionPerformed(ActionEvent event) {
			      String produto = txNomeProduto.getText().trim();
			      if (!produto.isEmpty()) {
			        listaProduto.add(produto);
			        Produto.this.modeloTabelaProduto.addRow(new Object[]{produto});
		            Produto produto2 = new Produto(); // OBJETO 1° Guia
		            produto2.setNomeProduto(txNomeProduto.getText()); // Produto
		            produto2.setValorProduto(Double.parseDouble(txValorProduto.getText()));
		            produto2.setQuantidadeProduto(Integer.parseInt(txQuantidadeProduto.getText()));
		            produto2.setIdCategoriaProduto(Integer.parseInt(txIdCategoriaProduto.getText()));
		            ProdutoDao produtoDao = new ProdutoDao();
				 	//List<Produto> categoriaProdutos = new ArrayList<>(); // Inicializando os dados
		            try {
		                // Adiciona a nova categoria no banco
		                produtoDao.adicionarProduto(produto2);

		                // Recupera a lista atualizada de categorias
		                List<Produto> produtos = produtoDao.getListaProduto();

		                // Atualiza a tabela com a lista de produtos recuperadas do banco
		                modeloTabelaProduto.setRowCount(0); // Limpa a tabela
		                for (Produto categoria1 : produtos) {
		                    modeloTabelaProduto.addRow(new Object[]{categoria1.getNomeProduto()});
		                }

		            } catch (SQLException e) {
		                e.printStackTrace();
		            }
		        } else {
		            JOptionPane.showMessageDialog(null, "Insira um nome do produto"); // Aviso
		        }
		    }   	
		   }
	   
	   private class EventoBotaoDeleteProduto implements ActionListener{ //BOTÃO SEGUNDA GUIA
		    public void actionPerformed(ActionEvent event){
		        int linhaProduto = tabelaProdutos.getSelectedRow();
		        if (linhaProduto != -1) {
		            String nomeProdutoExcluir = (String) tabelaProdutos.getValueAt(linhaProduto, 0);
		            listaProduto.remove(nomeProdutoExcluir); // Remove da lista
		            modeloTabelaProduto.removeRow(linhaProduto); // Remove da tabela (modelo)
		            
		            Produto produto = new Produto(); // OBJETO 1° Guia
		            produto.setNomeProduto(txNomeProduto.getText()); // Produto
		            ProdutoDao produtoDao = new ProdutoDao();
		            try {
		                produtoDao.deleteProduto(produto); // Remove da base de dados
		            } catch (SQLException e) {
		                e.printStackTrace();
		            }
		        } else {
		            JOptionPane.showMessageDialog(null, "Selecione um nome para excluir.", "Erro", JOptionPane.ERROR_MESSAGE);
		        }
		    }
		}
	   
}
