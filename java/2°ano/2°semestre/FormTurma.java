package formTurma;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class FormularioTurma extends JFrame {


	private static final long serialVersionUID = 1L;
	private JLabel lbNome;
	private JTextField txNome;
	private JLabel lbCpf;
	private JTextField txCpf;
	private JButton btEnviar;
	private JTextField txEnviar;
	
	public FormularioTurma() {

		setTitle("Formulário-protótipo");
		setSize(900, 700); // largura e altura
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);

		lbNome = new JLabel();
		lbNome.setText("Nome do Aluno: ");
		lbNome.setBounds(100, 100, 200, 80); //posição x, posição y, largura e altura
		add(lbNome);

		txNome = new JTextField();
		txNome.setBounds(220, 120, 140, 45); //posição x, posição y, largura e altura
		add(txNome);


		lbCpf  = new JLabel();
		lbCpf.setText("CPF do Aluno: ");
		lbCpf.setBounds(500, 100, 200, 80); //posição x, posição y, largura e altura
		add(lbCpf);

		txCpf = new JTextField();
		txCpf.setBounds(600, 120, 140, 45); //posição x, posição y, largura e altura
		add(txCpf);

		btEnviar = new JButton();
		btEnviar.setBounds(205, 200, 70, 50); //posição x, posição y, largura e altura
		btEnviar.setText("Verificar");
		btEnviar.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		String  nome = (txNome.getText());
        		String cpf = (txCpf.getText());
        		JOptionPane.showMessageDialog(null, "O nome do aluno é: "+nome+" e este é seu CPF"+cpf);
        	}
        });	
        	txEnviar = new JTextField();
        	txEnviar.setBounds(300, 320, 140, 45); //posição x, posição y, largura e altura
    		add(txEnviar);
        
        


		setVisible(true);
	}
}
     
