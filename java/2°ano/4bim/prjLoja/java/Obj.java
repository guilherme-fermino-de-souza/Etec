import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class ObjetoJTabbedPane extends JDialog{
   	
	private JLabel lbNome;   
	private JTextField txNome;
	private JButton btCadastrar;

   public ObjetoJTabbedPane(){     
     this.setTitle("Cadastro de Alunos");
     this.setModal(true);
     this.setSize(500,470);  
     this.setResizable(false);  
   
     Container janelacalc = this.getContentPane();
     setLocationRelativeTo(janelacalc);
     janelacalc.setLayout(null);
    
     //cria o JTabbedPane
     JTabbedPane tabbedpane = new JTabbedPane();
  
     //Primeira guia
  
     //tamanho e posicionamento do JTabbedPane
     tabbedpane.setBounds(0,0,500,470);     
  
	  JPanel painel1 = new JPanel();
	  painel1.setLayout(null);
	  
	  lbNome = new JLabel("Nome:");
	  lbNome.setBounds(10,15,50,20);     
	  painel1.add(lbNome);   
	     
	  txNome = new JTextField();
	  txNome.setBounds(55, 15, 150, 20);
	  painel1.add(txNome);
	  
	  btCadastrar = new JButton("Cadastrar");
	  btCadastrar.setBounds(15,350,100,20);
	  painel1.add(btCadastrar);
	
	  EventoBotao evb = new EventoBotao();
	  btCadastrar.addActionListener(evb);
	  
	  tabbedpane.addTab("Aba 1", null,painel1,"Primeiro Painel");
	  
	  //segunda guia  
	  JPanel painel2 = new JPanel();
	  painel2.setLayout(null);
	  painel2.setBackground(Color.WHITE);  
	  
	  tabbedpane.addTab("Aba 2", null,painel2,"Segundo Painel");  
	  
	  //terceira guia
	  JPanel painel3 = new JPanel(); 
	  painel3.setLayout(null);
	  
	  tabbedpane.addTab("Aba 3", null,painel3,"Terceiro Painel");  
	
	  janelacalc.add(tabbedpane);   

  }
   
   private class EventoBotao implements ActionListener{
       public void actionPerformed(ActionEvent event){
    	   	JOptionPane.showMessageDialog(null,"Nome: "+txNome.getText());
        }   
   }   
}
