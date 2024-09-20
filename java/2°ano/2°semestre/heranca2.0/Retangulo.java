package figuras;
import java.util.Scanner;

public class Retangulo extends FiguraGeometrica{
	//Feito
	public void CalcularArea() {
    		Scanner ler = new Scanner(System.in);
    		System.out.println("Insira o valor da Base: ");
      		this.lado = ler.nextDouble();
      		System.out.println("Insira o valor da Altura: ");
      		this.altura = ler.nextDouble();
      		this.area = lado*altura;
		System.out.println("A área do Retangulo é: "+area);
	}
}
