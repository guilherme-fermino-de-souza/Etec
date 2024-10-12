import java.awt.event. *;
import javax.swing. *;
import javax.swing.event. *;

public class Menu extends JFrame{
	 
    public Menu(){   
              
    	this.setSize(800,600);
    	this.setTitle("Exemplo Menu");
    	this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    	this.setLocationRelativeTo(null);
    	this.setExtendedState(MAXIMIZED_BOTH);

        JMenu arq = new JMenu("Arquivo");
        JMenu cad = new JMenu("Cadastrar");        
        JMenu aju = new JMenu("Ajuda");
               
        JMenuItem sair = new JMenuItem("Sair"); 
        JMenuItem produto = new JMenuItem("Produto");
        JMenuItem clien = new JMenuItem("Cliente");
        JMenuItem pedido = new JMenuItem("Pedido"); 
        JMenuItem exemploJTabbedPane = new JMenuItem("JTabbedPane"); /*Painel com guias*/
        JMenuItem sobre = new JMenuItem("Sobre");
                      
        /*ADD no painel*/
        arq.add(sair); 
        cad.add(produto);
        cad.add(clien);
        cad.add(pedido);
        cad.add(exemploJTabbedPane);
        aju.add(sobre);
        /*MENU*/
        JMenuBar bar = new JMenuBar();
        setJMenuBar(bar);
        bar.add(arq);
        bar.add(cad); 
        bar.add(aju);
             
       sair.addActionListener( /* SAIR */
         new ActionListener(){
             public void actionPerformed(ActionEvent event){
               System.exit(0);
             }
         }
       );
       
       clien.addActionListener(
         new ActionListener(){
             public void actionPerformed(ActionEvent event){
            	 Cadastrar cadastroClien = new Cadastrar();
            	 cadastroClien.setVisible(true);
             }
         }
       );
       
       exemploJTabbedPane.addActionListener(
    	         new ActionListener(){
    	             public void actionPerformed(ActionEvent event){
    	            	 ObjJTabbedPane otp = new ObjJTabbedPane();
    	            	 otp.setVisible(true);
    	             }
    	         }
    	       );
       
      this.setVisible(true);
    }
}
