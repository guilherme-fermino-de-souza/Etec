
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.util.Scanner;

public class Calculadora extends JFrame{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Atributo de instância 
	
    private JLabel lbNumero1;
    private JTextField txNumero1;
    private JLabel lbNumero2;
    private JTextField txNumero2;
    private JButton btSoma; 

    public void Calcular() {    	
    	Scanner ler = new Scanner(System.in);
        // Número 1
        lbNumero1 = new JLabel(); // Inicializando o JLabel(TEXTO)
        lbNumero1.setText("Primeiro Número: ");
        lbNumero1.setBounds(50, 100, 175, 35); // Posição x(horizontal),y(vertical) e largura e altura
        add(lbNumero1);

        txNumero1 = new JTextField(); // Inicializando o JTextField(INSERIR) 
        txNumero1.setBounds(175, 100, 150, 35); 
        add(txNumero1);
        
        // Número 2
        lbNumero2 = new JLabel(); // Inicializando o JLabel(TEXTO)
        lbNumero2.setText("Segundo Número: ");
        lbNumero2.setBounds(50, 150, 175, 35); // Posição x(horizontal),y(vertical) e largura e altura
        add(lbNumero2);
        
        txNumero2 = new JTextField(); // Inicializando o JTextField(INSERIR)
        txNumero2.setBounds(175, 150, 150, 35); // 
        add(txNumero2);
        
        // Soma
        btSoma = new JButton();
        btSoma.setBounds(200, 200, 75, 35);
        btSoma.setText("Somar");
        add(btSoma);
        btSoma.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		double numero1 = Double.parseDouble(txNumero1.getText());
        		double numero2 = Double.parseDouble(txNumero2.getText());
        		double Resultado = numero1 + numero2;
        		JOptionPane.showMessageDialog(null, "O resultado é "+Resultado);
        	}
        });
        
        
        // CONFIGURAÇÕES
        setTitle("Protótipo");
        setSize(800, 600);  // Largura e altura (pixels)
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Libera da memória ao fechar
        setLayout(null);
        setResizable(false); // Não será possível redimensionar o tamanho da janela
        setLocationRelativeTo(null); // Centraliza a janela na tela
        setVisible(true); // SEMPRE A ÚLTIMA LINHA (False por padrão)
    }
}
