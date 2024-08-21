package heranca;
import java.util.Scanner;

public class Triangulo extends FiguraGeometrica{
	//Feito
	public boolean eUmTriangulo() {
		Scanner ler  = new Scanner(System.in);
		System.out.println("Insira o Valor do 1º Lado: ");
		double ladoUm = ler.nextDouble();
		System.out.println("Insira o Valor do 2º Lado: ");
		double ladoDois = ler.nextDouble();
		System.out.println("Insira o Valor do 3º Lado: ");
		double ladoTres = ler.nextDouble();
		if (ladoUm>ladoDois+ladoTres || ladoDois>ladoUm+ladoTres || ladoTres>ladoUm+ladoDois) {
			System.out.println("Não é um Triângulo.");
			return false;
		} else {
			System.out.println("É um Triângulo.");	
			return true;
		}
	}

	public void CalcularArea() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Insira o Valor da Base: ");
		double base = ler.nextDouble();
		System.out.println("Insira o Valor da Altura: ");
		double altura = ler.nextDouble();
		double area = (base*altura)/2;
		System.out.println("A área do Triângulo é: "+area+".");
	}
}
