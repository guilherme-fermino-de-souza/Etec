import javax.swing.JDialog;

public class Cadastrar extends JDialog{

	public Cadastrar() {		
		this.setTitle("Cadastro de Clientes"); /* Cadastro de Clientes*/
	    this.setModal(true);
	    this.setSize(500,470);  
	    this.setResizable(false);
	    this.setLocationRelativeTo(null);		
	}
}
