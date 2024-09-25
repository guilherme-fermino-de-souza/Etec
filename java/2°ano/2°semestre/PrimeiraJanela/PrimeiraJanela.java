import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

  public class PrimeiraJanela extends JFrame{
	  private JLabel lbNome;
	  private JTextField txNome;
	  private JButton btExibir;
	  private JComboBox cbCurso;
	  private JRadioButton rdTurma1;
	  private JRadioButton rdTurma2;
	  private JRadioButton rdTurma3;
	  private ButtonGroup bgTurma;
	  private JCheckBox ckCorPreferida1;
	  private JCheckBox ckCorPreferida2;
	  private JCheckBox ckCorPreferida3;
	  private ButtonGroup bgCore;

    public void aJanela() {
      

      lbNome = new JLabel();
      lbNome.setText("Digite seu Nome: ");
      lbNome.setBounds(20, 20, 100, 20);
      add(lbNome);

      txNome = new JTextField();
      txNome.setBounds(20, 40, 100, 20);
      add(txNome);

      btExibir = new JButton();
      btExibir.setBounds(100, 100, 100, 40);
      btExibir.setText("Exibir");
      btExibir.setBackground(Color.BLACK);
      btExibir.setForeground(Color.YELLOW);
      add(btExibir);
      btExibir.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          String nome, curso, turma="", cor="";
          nome = txNome.getText();
          curso = cbCurso.getSelectedItem().toString();
          if(rdTurma1.isSelected()) {
            turma = rdTurma1.getText();
          } else if(rdTurma2.isSelected()) {
            turma = rdTurma2.getText();
          } else {
            turma = rdTurma3.getText();
          }
          if(ckCorPreferida1.isSelected()) {
            cor = cor + " " + ckCorPreferida1.getText();
          }
          if(ckCorPreferida2.isSelected()) {
            cor = cor + " " + ckCorPreferida2.getText();
          }
          if(ckCorPreferida3.isSelected()) {
            cor = cor + " " + ckCorPreferida3.getText();
          }
          JOptionPane.showMessageDialog(null, "Nome do Aluno: "+ nome +
          "\nNome do Curso: "+ curso + "\nNome da Turma: "  + turma + "\nCor Preferida: " + cor);
        }});
      cbCurso = new JComboBox();
      cbCurso.setBounds(20, 20, 150, 20);
      cbCurso.addItem("ETEC D.S.");
      cbCurso.addItem("MTEC Nutrição");
      cbCurso.addItem("Técnico em ADM");
      add(cbCurso);

      rdTurma1 = new JRadioButton();
      rdTurma1.setBounds(20, 100, 100, 20);
      rdTurma1.setText("1° série");
      add(rdTurma1);

      rdTurma2 = new JRadioButton();
      rdTurma2.setBounds(125, 100, 100, 20);
      rdTurma2.setText("2° série");
      add(rdTurma2);

      rdTurma3 = new JRadioButton();
      rdTurma3.setBounds(225, 100, 100, 20);
      rdTurma3.setText(" 3° série ");
      add(rdTurma3);

      bgTurma = new ButtonGroup();
      bgTurma.add(rdTurma1);
      bgTurma.add(rdTurma2);
      bgTurma.add(rdTurma3);
      
      ckCorPreferida1 = new JCheckBox();
      ckCorPreferida1.setBounds(20, 130, 100, 20);
      ckCorPreferida1.setText("Azul");
    
      ckCorPreferida2 = new JCheckBox();
      ckCorPreferida2.setBounds(125, 130, 100, 20);
      ckCorPreferida2.setText("Branco");
      
      ckCorPreferida3 = new JCheckBox();
      ckCorPreferida3.setBounds(225, 130, 100, 20);
      ckCorPreferida3.setText("Vermelho");
     
      setTitle("Minha Primeira Janela!");
      setSize(800, 600);  // Largura e altura (pixels)
      setDefaultCloseOperation(EXIT_ON_CLOSE); // Libera da memória ao fechar
      setLayout(null);
      setResizable(false); // Não será possível redimensionar o tamanho da janela
      setLocationRelativeTo(null); // Centraliza a janela na tela
      setVisible(true); // SEMPRE A ÚLTIMA LINHA (False por padrão) 
    }}     
    
