package heranca;

public class Circulo extends FiguraGeometrica{
	//Feito
	public void CalcularAreaCirculo() {
		r = Math.pow(getRaio(), 2)*3.14;
		System.out.println("A área do Círculo é: "+r);
	}
}
