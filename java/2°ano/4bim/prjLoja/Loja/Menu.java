package prjLoja;

import java.awt.event. *;
import javax.swing. *;
import javax.swing.event. *;

import Model.ObjTabbedPane;
import Model.Pedido;
import Model.Produto;
import Model.Atualizar;

public class Menu extends JFrame{
	 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Menu(){   
              
    	this.setSize(800,600);
    	this.setTitle("Exemplo Menu");
    	this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    	this.setLocationRelativeTo(null);
    	this.setExtendedState(MAXIMIZED_BOTH);

        JMenu arquivo = new JMenu("Arquivo");
        JMenu cadastrar = new JMenu("Cadastrar");        
        JMenu ajuda = new JMenu("Ajuda");
               
        JMenuItem sair = new JMenuItem("Sair"); 
        JMenuItem produto = new JMenuItem("Produto");
        JMenuItem clien = new JMenuItem("Cliente");
        JMenuItem pedido = new JMenuItem("Pedido"); 
        JMenuItem exemploJTabbedPane = new JMenuItem("Consultar"); /*Consulta Banco*/
        JMenuItem sobre = new JMenuItem("Sobre");
        JMenuItem atualizar = new JMenuItem("Atualizar");
                      
        /*ADD no painel*/
        arquivo.add(sair); 
        cadastrar.add(clien); //INSERT
        cadastrar.add(produto);
        cadastrar.add(pedido); 
        cadastrar.add(exemploJTabbedPane); //SELECT
        cadastrar.add(atualizar); //UPDATE-EXCLUDE
        ajuda.add(sobre);
        
        /*MENU nav*/
        JMenuBar bar = new JMenuBar();
        setJMenuBar(bar);
        bar.add(arquivo);
        bar.add(cadastrar); 
        bar.add(ajuda);
             
       sair.addActionListener( /* SAIR */
         new ActionListener(){
             public void actionPerformed(ActionEvent event){
               System.exit(0);
             }
         }
       );
       
       /* Aba Cliente */
       clien.addActionListener(
         new ActionListener(){
             public void actionPerformed(ActionEvent event){
            	 Cliente c = new Cliente();
            	 c.setVisible(true);
             }
         }
       );
       
       /* Aba Produto */
       produto.addActionListener(
    		 new ActionListener() {
    			 public void actionPerformed(ActionEvent event) {
    				   Produto ProdutoPainel = new Produto();
    				   ProdutoPainel.setVisible(true);
    			 }
    		 }
    	);
       /* Aba Pedido */
       pedido.addActionListener(
    		 new ActionListener() {
    			 public void actionPerformed(ActionEvent event) {
    				   Pedido PedidoPainel = new Pedido();
    				   PedidoPainel.setVisible(true);
    			 }
    		 }
    	);
       
       /* Aba JTabbedPane Exemplo */
       exemploJTabbedPane.addActionListener(
    	      new ActionListener(){
    	          public void actionPerformed(ActionEvent event){
    	            ObjTabbedPane otp = new ObjTabbedPane();
    	            otp.setVisible(true);
    	             }
    	         }
    	       );
       
       /* Aba JTabbedPane Exemplo */
       atualizar.addActionListener(
    	      new ActionListener(){
    	          public void actionPerformed(ActionEvent event){
    	            Atualizar atl= new Atualizar();
    	            atl.setVisible(true);
    	             }
    	         }
    	       );
       
      this.setVisible(true);
    }
}
