package heranca;

public class Retangulo extends FiguraGeometrica{
	//Feito
	public void CalcularArea() {
		r = getAltura()*getBase();
		System.out.println("A área do Retângulo é: "+r);
	}
}
