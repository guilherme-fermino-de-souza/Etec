package heranca;
import java.util.Scanner;

public class Quadrado extends FiguraGeometrica{
	//Feito
	public void CalcularArea() {
    	Scanner ler = new Scanner(System.in);
    		System.out.println("Insira o valor do Lado: ");
    		double lado = ler.nextDouble();
    		double area = lado*lado;
    		System.out.println("A área do Quadrado é: "+area);
	}
}
