package heranca;

public class Triangulo extends FiguraGeometrica{
	
	public void CalcularAreaTriangulo() {
		r = (getAltura()*getBase())/2;
		System.out.println("A área do Triângulo é: "+r);
	}

}
