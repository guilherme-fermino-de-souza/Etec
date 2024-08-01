package heranca;

public class Quadrado extends FiguraGeometrica{
	FiguraGeometrica f = new FiguraGeometrica();
	//Feito
	public void CalcularAreaQuadrado() {
		r = getBase()*getAltura();
		System.out.println("A área do Quadrado é: "+r);
	}
}
