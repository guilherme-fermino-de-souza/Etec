package heranca;

public class Quadrado extends FiguraGeometrica{
	FiguraGeometrica f = new FiguraGeometrica();
	
	public void CalcularAreaQuadrado() {
		r = getBase()*getAltura();
		System.out.println("A área do Quadrado é: "+r);
	}

}
