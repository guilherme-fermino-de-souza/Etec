import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class FormularioTurma extends JFrame {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lbNome;
	private JTextField txNome;
	private JButton btEnviar;
	private JTextField txResult;
	private JLabel lbResult;
	
	public FormularioTurma() {
		
		setTitle("Calculadora-protótipo");
		setSize(900, 700); // largura e altura
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		
		lbNome = new JLabel();
		lbNome.setText("Primeiro valor: ");
		lbNome.setBounds(100, 100, 200, 80); //posição x, posição y, largura e altura
		add(lbNome);
		
		txNome = new JTextField();
		txNome.setBounds(220, 120, 140, 45); //posição x, posição y, largura e altura
		add(txNome);
		
		btEnviar = new JButton();
		btEnviar.setBounds(205, 200, 100, 30); //posição x, posição y, largura e altura
		btEnviar.setText("Somar");
		add(btEnviar);
		
		btEnviar = new JButton();
		btEnviar.setBounds(305, 200, 100, 30); //posição x, posição y, largura e altura
		btEnviar.setText("Subtrair");
		add(btEnviar);
		
		
		
		lbNome = new JLabel();
		lbNome.setText("Segundo valor: ");
		lbNome.setBounds(500, 100, 200, 80); //posição x, posição y, largura e altura
		add(lbNome);
		
		txNome = new JTextField();
		txNome.setBounds(600, 120, 140, 45); //posição x, posição y, largura e altura
		add(txNome);
		
		btEnviar = new JButton();
		btEnviar.setBounds(405, 200, 100, 30); //posição x, posição y, largura e altura
		btEnviar.setText("Multiplicar");
		add(btEnviar);
		
		btEnviar = new JButton();
		btEnviar.setBounds(505, 200, 100, 30); //posição x, posição y, largura e altura
		btEnviar.setText("Dividir");
		add(btEnviar);
		
		lbResult = new JLabel();
		lbResult.setText("Resultado: ");
		lbNome.setBounds(350, 300, 200, 80); //posição x, posição y, largura e altura
		add(lbResult);
		
		txResult = new JTextField();
		txResult.setBounds(350, 350, 140, 45); //posição x, posição y, largura e altura
		add(txResult);
		
		
		setVisible(true);
	}
}
