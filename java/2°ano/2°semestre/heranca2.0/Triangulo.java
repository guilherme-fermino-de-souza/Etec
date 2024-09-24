package figuras;
import java.util.Scanner;

public class Triangulo extends FiguraGeometrica{
	//Feito
	double ladoUm,ladoDois, ladoTres;
	Scanner ler  = new Scanner(System.in);
	public boolean eUmTriangulo() {
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
    if (ladoUm == ladoDois && ladoDois == ladoTres) { // Equilátero
        System.out.println("O Triângulo é Equilátero");
        this.area = (Math.pow(ladoUm, 2) * Math.sqrt(3)) / 4;
        this.altura = (ladoUm * Math.sqrt(3)) / 2;
    } else if (ladoUm != ladoDois && ladoDois != ladoTres && ladoUm != ladoTres) { // Escaleno
        System.out.println("O Triângulo é Escaleno");
        // Calcular a área usando a fórmula de Heron
        double semiPerimetro = (ladoUm + ladoDois + ladoTres) / 2;
        this.area = Math.sqrt(semiPerimetro * (semiPerimetro - ladoUm) * (semiPerimetro - ladoDois) * (semiPerimetro - ladoTres));
        // Para a altura, precisamos de um dos lados
        this.altura = (2 * area) / ladoUm; // Exemplo, usando ladoUm
    } else { // Isósceles
        System.out.println("O Triângulo é Isósceles");
        if (ladoUm == ladoDois) {
            this.lado = ladoUm;
            this.altura = Math.sqrt(Math.pow(ladoUm, 2) - Math.pow(ladoTres / 2, 2));
        } else if (ladoDois == ladoTres) {
            this.lado = ladoDois;
            this.altura = Math.sqrt(Math.pow(ladoDois, 2) - Math.pow(ladoUm / 2, 2));
        } else {
            this.lado = ladoTres;
            this.altura = Math.sqrt(Math.pow(ladoTres, 2) - Math.pow(ladoUm / 2, 2));
        }
        area = (lado * altura) / 2;
    }

    System.out.println("A área do Triângulo é: " + this.area + " e a Altura é " + this.altura + ".");
}

}
