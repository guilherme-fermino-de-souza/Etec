package heranca;
import java.util.Scanner;
public class FiguraGeometrica {
	Scanner ler = new Scanner(System.in);
	
	private double altura;
	private double base;
	private double raio;
	double r;
	
	public double setAltura(double altura) {
		System.out.println("Insira o valor da Altura: ");
		altura = ler.nextDouble();
		return altura;
	}
	
	public double getAltura() {
		return this.setAltura(altura);
	}
	
	public double setBase(double base) {
		System.out.println("Insira o valor da Base: ");
		base = ler.nextDouble();
		return base;
	}
	
	public double getBase() {
		return this.setBase(base);
	}
	
	public double setRaio(double raio) {
		System.out.println("Insira o valor do Raio: ");
		raio = ler.nextDouble();
		return raio;
	}
	
	public double getRaio() {
		return this.setRaio(raio);
	}
}
