package figuras;
import java.util.Scanner;

public class Circulo extends FiguraGeometrica{
	//Feito
	public void CalcularArea() {
   	 Scanner ler = new Scanner(System.in);
			System.out.println("Insira o valor do raio");  
			double raio = ler.nextDouble(); 
			this.area = (raio*raio)*3.14;
			System.out.println("A área do Círculo é: "+raio);
	}
}
