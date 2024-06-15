package sobrecarga;
import java.util.Scanner;
public class Matematica {
	Scanner ler = new Scanner(System.in);
	private int n1;
	private int n2;
	private int r;
	
	public int setSoma (int r) {
				
		System.out.print("Insira o 1° número: ");
		n1 = ler.nextInt();
		System.out.print("Insira o 2° número: ");
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
		System.out.print("Insira o 1° número: ");
		n1 = ler.nextInt();
		System.out.print("Insira o 2° número: ");
		n2 = ler.nextInt();
		
   }
	public int getSoma(int r) {
		this.setSoma(0);
        r = this.n1+this.n2;
        return r; 
        
	}
   
	
   /*public void setSoma(int n1, int n2, int r) {
	   	System.out.print("Insira o 1° número: ");
		n1 = ler.nextInt();
		System.out.print("Insira o 2° número: ");
		n2 = ler.nextInt();
		r = n1+n2;
		System.out.println("O resultado da soma é: "+r);   
   }  
   public void getSoma() {
	  return this.setSoma(r, r, r);
   }*/

}
