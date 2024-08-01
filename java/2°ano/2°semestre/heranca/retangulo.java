package heranca;

public class Retangulo extends FiguraGeometrica{
	//Feito
	public void CalcularAreaRetangulo() {
		r = getAltura()*getBase();
		System.out.println("A área do Retângulo é: "+r);
	}
}
