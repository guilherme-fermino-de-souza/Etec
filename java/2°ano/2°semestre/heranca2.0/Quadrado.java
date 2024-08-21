package heranca;
import java.util.Scanner;

public class Quadrado extends FiguraGeometrica{
	//Feito
	public void CalcularArea() {
    Scanner ler = new Scanner(System.in);
    	System.out.println("Insira o valor da Base: ");
      double base = ler.nextDouble();
      System.out.println("Insira o valor da Altura: ");
      double altura = ler.nextDouble();
		  double area = base*altura;
		  System.out.println("A área do Quadrado é: "+area);
	}
}
