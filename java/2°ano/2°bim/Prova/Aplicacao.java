import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Carro c = new Carro();

		System.out.print("Insira o modelo: ");
		c.setModelo(in.next());
		System.out.print("Insira a fabricante: ");
		c.setFabricante(in.next());
		System.out.print("Insira o Ano de fabricacao: ");
		c.setAnoFabricacao(in.next());
		
		System.out.println("\n"+c.getModelo()+"\n"+c.getFabricante()+"\n"+c.getAnoFabricacao());
		
	}

}
