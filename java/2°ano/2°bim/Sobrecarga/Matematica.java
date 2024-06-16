package sobrecarga;
import java.util.Scanner;
public class Matematica {
	Scanner ler = new Scanner(System.in);
	private int n1;
	private int n2;
	private int r;
	
	public int setSoma (int r) {			
		System.out.print("Insira o 1° número da Soma: ");
		n1 = ler.nextInt();
		System.out.print("Insira o 2° número da Soma: ");
		n2 = ler.nextInt();
		r = n1+n2;
		return r;
	}	
	public int getSoma() {
		return this.setSoma(r);
	}

	public void setSoma() {
	    int n1;
		int n2;
		System.out.print("Insira o 1° número da Soma: ");
		n1 = ler.nextInt();
		System.out.print("Insira o 2° número da Soma: ");
		n2 = ler.nextInt();		
   }
	public int getSoma(int r) {
		this.setSoma(0);
        r = this.n1+this.n2;
        return r;       
	}
   
	public double setSoma(double n1, double n2, double r) {
		System.out.print("Insira o 1° número da Soma: ");
		n1 = ler.nextDouble();
		System.out.print("Insira o 2° número da Soma: ");
		n2 = ler.nextDouble();	
		r= n1 - n1;
		return r;
	}
	public double getSoma(double r) {
		return this.r;
	}
	
	
	
	
	
	public int setSubtracao (int r) {
		
		System.out.print("Insira o 1° número da Subtração: ");
		n1 = ler.nextInt();
		System.out.print("Insira o 2° número da Subtração: ");
		n2 = ler.nextInt();
		r = n1 - n2;
		return r;
	}	
	public int getSubtracao() {
		return this.setSoma(r);
	}
	
	public void setSubtracao() {
	    int n1;
		int n2;
		System.out.print("Insira o 1° número da Subtração: ");
		n1 = ler.nextInt();
		System.out.print("Insira o 2° número da Subtração: ");
		n2 = ler.nextInt();
		
   }
	public int getSubtracao(int r) {
		this.setSoma(0);
        r = (this.n1)-(this.n2);
        return r; 
        
	}
	public double setSubtracao(double n1, double n2, double r) {
		System.out.print("Insira o 1° número da Soma: ");
		n1 = ler.nextDouble();
		System.out.print("Insira o 2° número da Soma: ");
		n2 = ler.nextDouble();	
		return r;
	}
	public double getSubtracao(double r) {
		return this.r;
	}
}
