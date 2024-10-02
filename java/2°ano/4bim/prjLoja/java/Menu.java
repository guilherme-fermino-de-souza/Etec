import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

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
        JMenuItem alu = new JMenuItem("Aluno");
        JMenuItem exemploJTabbedPane = new JMenuItem("JTabbedPane");
        JMenuItem sobre = new JMenuItem("Sobre");
                      
        arq.add(sair);
        cad.add(alu);
        cad.add(exemploJTabbedPane);
        aju.add(sobre);
       
        JMenuBar bar = new JMenuBar();
        setJMenuBar(bar);
        bar.add(arq);
        bar.add(cad); 
        bar.add(aju);
             
       sair.addActionListener(
         new ActionListener(){
             public void actionPerformed(ActionEvent event){
               System.exit(0);
             }
         }
       );
       
       alu.addActionListener(
         new ActionListener(){
             public void actionPerformed(ActionEvent event){
            	 FrmAluno frmAlu = new FrmAluno();
            	 frmAlu.setVisible(true);
             }
         }
       );
       
       exemploJTabbedPane.addActionListener(
    	         new ActionListener(){
    	             public void actionPerformed(ActionEvent event){
    	            	 ObjetoJTabbedPane otp = new ObjetoJTabbedPane();
    	            	 otp.setVisible(true);
    	             }
    	         }
    	       );
       
      this.setVisible(true);
    } 
}
