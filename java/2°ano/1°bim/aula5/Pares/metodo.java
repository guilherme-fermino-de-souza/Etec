package aula4;

import java.util.Scanner;

public class ExibirNumeros {
	// Método sem retorno e sem parâmetro que exiba os números pares de 0 a 100
	Scanner in = new Scanner(System.in);
	
	public void Pares() {
		for (int n=0; n<101; n++) {
			if (n%2==0) {
				System.out.print(n+"\n");
			} 
			
		}
	}
	  

}
