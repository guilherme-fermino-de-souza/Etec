package aula4;

import java.util.Scanner;

public class Triangulo {
	Scanner in = new Scanner(System.in);
	//Método com retorno e com parêmetro que informe se 3 valores formam um triângulo
    
	public double Inserir (double a, double b, double c, double resul){
		
		
		
		//Inserir números
		System.out.println("Insira o 1° número");
		a = in.nextDouble();
		System.out.println("Insira o 2° número");
		b = in.nextDouble();
		System.out.println("Insira o 3° número");
		c = in.nextDouble();
		    
		//Checando o tipo de Triângulo
		if (a>b+c || b>a+c || c>a+b) {
			resul=1;
			System.out.println("Não é um triângulo");
		} else {
			if (a==b && b==c) {
				resul=2;
				System.out.println("É um triângulo Equilátero");
			} else if (a==b || b==c || a==c) {
				resul=3;
				System.out.println("É um triângulo Isósceles");
			} else {
				resul=4;
				System.out.println("É um triângulo Escaleno");
			}
		}
		//Retorna o valor "resul"
		return(resul);	
		}		
	}
