package sobrecarga;
import java.util.Scanner;
public class Matematica {
	Scanner ler = new Scanner(System.in);
	
	public void setSoma() {
		int n1;
		int n2;
		int r;
		
		System.out.print("Insira o 1° número: ");
		n1 = ler.nextInt();
		System.out.print("Insira o 2° número: ");
		n2 = ler.nextInt();
		r = n1+n2;
		System.out.println("O resultado da soma é: "+r);
	}	
	public void getSoma() {
		System.out.println("O resultado da soma é: "+this.setSoma());
	}
	
	public int setSoma(int r) {
	    int n1;
		int n2;
		System.out.print("Insira o 1° número: ");
		n1 = ler.nextInt();
		System.out.print("Insira o 2° número: ");
		n2 = ler.nextInt();
		r = n1+n2;
		
		return r;
   }
	public int getSoma(int r) {
		return this.setSoma(0);
	}
   
   public void setSoma(int n1, int n2, int r) {
	   	System.out.print("Insira o 1° número: ");
		n1 = ler.nextInt();
		System.out.print("Insira o 2° número: ");
		n2 = ler.nextInt();
		r = n1+n2;
		System.out.println("O resultado da soma é: "+r);   
   }  
   public void getSoma(int r) {
	   System.out.println(this.setSoma(r, r, r));
   }

}
