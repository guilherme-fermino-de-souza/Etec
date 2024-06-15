package sobrecarga;

public class App {

	public static void main(String[] args) {
		
		Matematica m = new Matematica();
		
		m.Soma();
		System.out.println("O resultado da soma é: "+m.Soma(0));
		m.Soma(0, 0, 0);

	}

}
