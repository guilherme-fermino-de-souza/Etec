package heranca;
import java.util.Scanner;

public class Triangulo extends FiguraGeometrica{
	//Feito
	public void CalcularArea() {
    	Scanner ler  = new Scanner(System.in);
      		System.out.println("Insira o Valor do 1º Lado: ");
      		double ladoUm = ler.nextDouble();
      		System.out.println("Insira o Valor do 2º Lado: ");
      		double ladoDois = ler.nextDouble();
      		System.out.println("Insira o Valor do 3º Lado: ");
      		double ladoTres = ler.nextDouble();
		
      		if (ladoUm>ladoDois+ladoTres || ladoDois>ladoUm+ladoTres || ladoTres>ladoUm+ladoDois) {
      			System.out.println("Não é um Triângulo.");
      		} else {
      			if (ladoUm==ladoDois && ladoDois==ladoTres) {
      				System.out.println("É um Triângulo Equilátero.");
      			} else if (ladoUm==ladoDois || ladoDois==ladoTres || ladoUm==ladoTres) {
      				System.out.println("É um Triângulo Isósceles.");
      			} else {
      				System.out.println("É um Triângulo Escaleno.");
      			}

      			System.out.println("Insira o Valor da Base: ");
      			double base = ler.nextDouble();
      			System.out.println("Insira o Valor da Altura: ");
		    	double altura = ler.nextDouble();
		    	double area = (base*altura)/2;
		    	System.out.println("A área do Triângulo é: "+area+".");
      		}
	}
}
