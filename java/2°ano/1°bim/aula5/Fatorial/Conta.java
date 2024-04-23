package aula4;

import java.util.Scanner;

public class Fatorial {
	Scanner in = new Scanner(System.in);
	//Método com retorno e com parâmetro que exiba o fatorial de um número;

	public int Conta (int n, int f) {
		
		System.out.println("Insira o número que você deseja calcular o fatorial");
		n = in.nextInt();
		f = 1;
        for (int i=n; i>1;) {
            f = f*i; 
        	i--;
        }
        System.out.println("O fatorial de "+n+" é "+f);
		
		return(f);
	}

}
