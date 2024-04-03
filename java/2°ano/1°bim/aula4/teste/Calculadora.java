package aula4;

import java.util.Scanner;

public class Calculadora {

		Scanner in = new Scanner(System.in);
		
		double num1, num2, resul;
		int tipo;

		//Método
		public void InserirDados() {
			//Implementação do Método
			
			System.out.println("Insira o 1° número da equação");
			num1 = in.nextDouble();
			System.out.println("Insira o 2° número da equação");
			num2 = in.nextDouble();
			System.out.println("1 = adição, 2 = subtração, 3 = multiplicação, 4 = divisão");
			tipo = in.nextInt();
			
			
			
		}
		
		public void Calculo (int tipo) {
			switch(tipo) {
			case 1:
				resul = num1+num2;
				System.out.println("O resultado da adição é "+resul);
				break;
			case 2:
				resul = num1-num2;
				System.out.println("O resultado da subtração é "+resul);
				break;
			case 3:
				resul = num1*num2;
				System.out.println("O resultado da multiplicação é "+resul);
				break;
			case 4:
				resul = num1/num2;
				System.out.println("O resultado da divisão é "+resul);
			}
		}
		
	}
