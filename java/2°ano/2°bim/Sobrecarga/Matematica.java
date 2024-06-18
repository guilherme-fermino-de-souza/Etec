package sobrecarga;
import java.util.Scanner;
public class Matematica {
	Scanner ler = new Scanner(System.in);
	private int n1;
	private int n2;
	private int r;
	
	public int setSoma (int r) {			
		System.out.print("Insira o 1° número da 1° Soma: ");
		n1 = ler.nextInt();
		System.out.print("Insira o 2° número da 1° Soma: ");
		n2 = ler.nextInt();
		r = n1+n2;
		return r;
	}	
	public int getSoma() {
		return this.setSoma(r);
	}

	public int setSoma(int n1, int n2, int r) {
		System.out.print("Insira o 1° número da 2° Soma: ");
		n1 = ler.nextInt();
		System.out.print("Insira o 2° número da 2° Soma: ");
		n2 = ler.nextInt();		
		r = n1+n2;
		return r;
   }
	public int getSoma(int r) {
		return this.setSoma(0, 0, r);
	}
   
	public double setSoma(double n1, double n2, double r) {
		System.out.print("Insira o 1° número da 3° Soma: ");
		n1 = ler.nextDouble();
		System.out.print("Insira o 2° número da 3° Soma: ");
		n2 = ler.nextDouble();	
		r = n1+n2;
		return r;
	}
	public double getSoma(double r, double n1, double n2) {
		return this.setSoma(n1, n2, r);
	}
	
	
	
	
	
	public int setSubtracao (int r) {
		
		System.out.print("Insira o 1° número da 1° Subtração: ");
		n1 = ler.nextInt();
		System.out.print("Insira o 2° número da 1° Subtração: ");
		n2 = ler.nextInt();
		r = n1-n2;
		return r;
	}	
	public int getSubtracao() {
		return this.setSubtracao(r);
	}
	
	public int setSubtracao(int n1, int n2, int r) {
		System.out.print("Insira o 1° número da 2° Subtração: ");
		n1 = ler.nextInt();
		System.out.print("Insira o 2° número da 2° Subtração: ");
		n2 = ler.nextInt();
		r = n1-n2;	
		return r;
   }
	public int getSubtracao(int r) {
		return this.setSubtracao(0, 0, r);
        
	}
	public double setSubtracao(double n1, double n2, double r) {
		System.out.print("Insira o 1° número da 3° Subtração: ");
		n1 = ler.nextDouble();
		System.out.print("Insira o 2° número da 3° Subtração: ");
		n2 = ler.nextDouble();	
		r = n1-n2;
		return r;
	}
	public double getSubtracao(double n1, double n2, double r) {
		return this.setSubtracao(n1, n2, r);
	}
}
