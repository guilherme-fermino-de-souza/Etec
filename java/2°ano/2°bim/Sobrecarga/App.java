package sobrecarga;

public class App {

	public static void main(String[] args) {
		
		Matematica m = new Matematica();
		
		System.out.println("Os valores da são Soma: "+m.getSoma());
		
		System.out.println("Os valores da são Soma: "+m.getSoma(0));
		/*System.out.print("Insira os valores da Soma: ");
		m.setSoma();
		System.out.println("resultado: "+m.setSoma(0));
		m.setSoma(0, 0, 0);*/

	}

}
