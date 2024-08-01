package heranca;

public class Circulo extends FiguraGeometrica{
	
	public void CalcularAreaCirculo() {
		r =(getRaio()*getRaio())*3.14;
		System.out.println("A área do Círculo é: "+r);
	}
}
