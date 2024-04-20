package aula4;

import java.util.Scanner;

public class Calculo {
	Scanner in = new Scanner(System.in);
	// Método sem retorno e com parâmetro que calcule as raízes de uma equação do segundo grau
	
    public void Raizes(double x1, double x2, double delta, double a, double b, double c) {
    	
    	//Valores iniciais
    	System.out.println("Insira o valor de A, B e C(respectivamente)");
		a = in.nextDouble();
		b = in.nextDouble();
		c = in.nextDouble();
		
		//Cálculo do Delta
		delta = (b*b)-(4*a*c); 
		
    	 //Cálculo das raízes   
   			x1 = -b+Math.sqrt(delta);
   			x2 = -b-Math.sqrt(delta);
   			x1 = x1/(2*a);
   			x2 = x2/(2*a);
   
   			
   			if(delta>=0) {
   				if (x1==x2) {
   					System.out.println("x1 = x2 = "+x1);
   					System.out.println("delta = "+delta);
   				} else {
   					System.out.println("x1 = "+x1);
   					System.out.println("x2 = "+x2);	
   					System.out.println("delta = "+delta);
   				}
   				
   			} else {
   				System.out.println("O Delta não possui raízes reais");
   				System.out.println("delta = "+delta);
   			}   	
    }	
}

