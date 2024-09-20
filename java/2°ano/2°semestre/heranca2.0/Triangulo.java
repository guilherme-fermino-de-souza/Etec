package figuras;
import java.util.Scanner;

public class Triangulo extends FiguraGeometrica{
	//Feito
	double ladoUm,ladoDois, ladoTres;
	public boolean eUmTriangulo() {
		Scanner ler  = new Scanner(System.in);
		System.out.println("Insira o Valor do 1º Lado: ");
		ladoUm = ler.nextDouble();
		System.out.println("Insira o Valor do 2º Lado: ");
		ladoDois = ler.nextDouble();
		System.out.println("Insira o Valor do 3º Lado: ");
		ladoTres = ler.nextDouble();
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
		if (ladoUm == ladoDois && ladoDois == ladoTres) { //Equilatero
				System.out.println("O Triângulo é Equilatero");
				this.area = ((lado*lado) * Math.sqrt(3))/4;
		} else if (ladoUm != ladoDois && ladoDois != ladoTres) { //Escaleno
				System.out.println("O Triângulo é Escaleno");
			
		} else { //Isósceles
				System.out.println("O Triângulo é Isósceles");
				if (ladoUm <= ladoDois && ladoDois == ladoTres) {
					double hDois = ((ladoUm/2)*(ladoUm/2)) - (ladoDois*ladoDois);
					this.altura = Math.sqrt(hDois);
					this.lado = ladoUm;
				} else if (ladoTres <= ladoUm && ladoUm == ladoDois) {
					double hDois = ((ladoTres/2)*(ladoTres/2)) - (ladoDois*ladoDois);
					this.altura = Math.sqrt(hDois);
					this.lado = ladoTres;
				} else {
					double hDois = ((ladoDois/2)*(ladoDois/2)) - (ladoTres*ladoTres);
					this.altura = Math.sqrt(hDois);
					this.lado = ladoDois;
				}
				this.area = (lado*altura)/2;
				
		    }
		
		System.out.println("A área do Triângulo é: "+this.area+" e a Altura é "+this.altura+".");
	}
}
