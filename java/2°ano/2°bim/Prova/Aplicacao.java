import java.util.Scanner;
public class Aplicacao {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Carro c = new Carro();

		System.out.print("Insira o modelo: ");
		carro.setModelo(in.next());
		System.out.print("Insira a fabricante: ");
		carro.setFabricante(in.next());
		System.out.print("Insira o Ano de fabricacao: ");
		carro.setAnoFabricacao(in.next());
		
		System.out.println("\n"+carro.getModelo()+"\n"+carro.getFabricante()+"\n"+carro.getAnoDeFabricacao());
		
	}

}
