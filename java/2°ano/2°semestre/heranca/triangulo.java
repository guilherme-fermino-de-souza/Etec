package heranca;

public class Triangulo extends FiguraGeometrica{
	//Feito
	public void CalcularAreaTriangulo() {
		double ladoUm=getLadoUm(), ladoDois=getLadoDois(), ladoTres=getLadoTres();
		
		if (ladoUm>ladoDois+ladoTres || ladoDois>ladoUm+ladoTres || ladoTres>ladoUm+ladoDois) {
			System.out.println("Não é um Triângulo.");
		} else if (ladoUm==ladoDois && ladoDois==ladoTres) {
			System.out.println("É um Triângulo Equilátero.");
		} else if (ladoUm==ladoDois || ladoDois==ladoTres || ladoUm==ladoTres) {
			System.out.println("É um Triângulo Isósceles.");
		} else {
			System.out.println("É um Triângulo Escaleno.");
		}
		r = (getAltura()*getBase())/2;
		System.out.println("A área do Triângulo é: "+r+".");
	}
}
