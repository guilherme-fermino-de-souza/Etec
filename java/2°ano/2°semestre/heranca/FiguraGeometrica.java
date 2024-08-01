package heranca;
import java.util.Scanner;
public class FiguraGeometrica {
	Scanner ler = new Scanner(System.in);
	//Feito
	private double altura;
	private double base;
	private double raio;
	private double ladoUm;
	private double ladoDois;
	private double ladoTres;
	double r;
	
	//ALTURA
	public double setAltura(double altura) {
		System.out.println("Insira o valor da Altura: ");
		altura = ler.nextDouble();
		return altura;
	}
	
	public double getAltura() {
		return this.setAltura(altura);
	}
	//BASE
	public double setBase(double base) {
		System.out.println("Insira o valor da Base: ");
		base = ler.nextDouble();
		return base;
	}
	
	public double getBase() {
		return this.setBase(base);
	}
	//RAIO
	public double setRaio(double raio) {
		System.out.println("Insira o valor do Raio: ");
		raio = ler.nextDouble();
		return raio;
	}
	
	public double getRaio() {
		return this.setRaio(raio);
	}
	//LADO1
	public double setLadoUm(double ladoUm) {
		System.out.println("Insira o valor do 1° lado: ");
		ladoUm = ler.nextDouble();
		return ladoUm;
	}
	
	public double getLadoUm() {
		return this.setLadoUm(ladoUm);
	}
	//LADO2
	public double setLadoDois(double ladoDois) {
		System.out.println("Insira o valor do 2° lado: ");
		ladoDois = ler.nextDouble();
		return ladoDois;
	}
	
	public double getLadoDois() {
		return this.setLadoDois(ladoDois);
	}
	//LADO3
	public double setLadoTres(double ladoTres) {
		System.out.println("Insira o valor do 3° lado: ");
		ladoTres = ler.nextDouble();
		return ladoTres;
	}
	
	public double getLadoTres() {
		return this.setLadoTres(ladoTres);
	}
}
