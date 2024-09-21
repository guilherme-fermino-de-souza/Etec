package Janela;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.swing.ButtonGroup;
import java.swing.JButton;
import java.swing.JCheckBox;
import java.Swing.JComboBox;
import java.Swing.JFrame;
import java.Swing.JLabel;
import java.Swing.JList;
import java.Swing.JOptionPane;
import java.Swing.JRadioButton;
import java.Swing.JTextField;

  public class PrimeiraJanela extends JFrame{
    JLabel lbNome;
    JTextField txNome;
    JButton btExibir;
    JComboBox cbCurso;
    JRadioButton rdTurma1;
    JRadioButton rdTurma2;
    JRadioButton rdTurma3;
    ButtonGroup bgTurma;
    JCheckBox ckCoresPreferida1;
    JCheckBox ckCoresPreferida2;
    JCheckBox ckCoresPreferida3;
    ButtonGroup bgCore;

    public PrimeiraJanela() {
      this.setTitle(“Minha Primeira Janela!“);
      this.setSize(300, 300);
      this.setLocotaionRelativeTo(null);
      this.setDefaultCloseOperation(EXIT_ON_CLOSE);

      lbNome = new JLabel();
      lbNome setBounds(20, 20, 100, 20);
      lbNome.setText(“Digite seu Nome: “);
      add(lbNome);

      txNome = new JTextField();
      txNome.setBounds(20, 40, 100, 20);
      add(txNome);

      btExibir = new JButton();
      btExibir.setBounds(100, 100, 100, 40);
      btExibir.setText(“Exibir“);
      btExibir.setBackground(Color.BLACK);
      btExibir.setForeground(Color.YELLOW);
      add(btExibir);

      btExibir.addActionListener(new ActionListener() {
        @Override
        public void ActionPerformed(ActionEvent e) {
          String nome, curso, turma=““, cor=““;
          nome = txNome.getTExt();
          curso = cbCurso.getSelected().toString();
          if(rdTurma1.isSelected()) {
            turma = rdTurma1.getText();
          } else if(rdTurma2.isSelect()) {
            turma = rdTurma2.getText();
          } else {
            turma = rdTurma3.getText();
          }
          if(ckCoresPreferida1.isSelected()) {
            cor = cor + “ “ + ckCoresPreferida1.getText();
          }
          if(ckCoresPreferida2.isSelected()) {
            cor = cor + “ “ + ckCoresPreferida2.getText();
          }
          if(ckCoresPreferida3.isSelected()) {
            cor = cor + “ “ + ckCoresPreferida3.getText();
          }

            JOptionPane.showMessageDialog(null, “Nome do Aluno: “+ nome +
            “\nNome do Curso: “ + curso + “\nNome da Turma:  + turma + “\nCor Preferida: “ + cor);
        }
      }
      
      cbCurso = new JComboBox();
      cbCurso.setBounds(20, 20, 150, 20);
      cbCurso.addItem(“ ETEC Ds“);
      cbCurso.addItem(“ MTEC Nutrição“);
      cbCurso.addItem(“ Técnico em ADM“);
      add(cbCurso);

      rdTurma1 = new JRadioButton();
      rdTurma1.setBoumds(20, 100, 100, 20);
      rdTurma1.setText(“ 1° série “);
      add(rdTurma1);

      rdTurma2 = new JRadioButton();
      rdTurma2.setBoumds(125, 100, 100, 20);
      rdTurma2.setText(“ 2° série “);
      add(rdTurma2);

      rdTurma3 = new JRadioButton();
      rdTurma3.setBoumds(225, 100, 100, 20);
      rdTurma3.setText(“ 3° série “);
      add(rdTurma3);

      bgTurma = new ButtonGroup();
      bgTurma.add(rdTurma1);
      bgTurma.add(rdTurma2);
      bgTurma.add(rdTurma3);
      
      ckCoresPreferidas = new JCheckBox();
      ckCoresPreferidas.setBoumds(20, 130, 100, 20);
      ckCoresPreferidas.setText(“ Azul “);
    }
  }
