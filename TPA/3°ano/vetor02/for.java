import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		// TODO Auto-generated method stub
		/*Chico tem 1,50 metro e cresce 2 centímetros por ano, enquanto Zé tem 1,10 metro e cresce 3 centímetros por ano. 
		Construa um algoritmo que calcule e imprima quantos anos serão necessários para que Zé seja maior que Chico.*/
		int alturaChico = 150, alturaZe = 110;
		int anos = 0;
		
		for (int i = 0; i != 1;) {
			alturaChico += 2;
			alturaZe += 3;
			anos++;
			System.out.println("Chico: " + alturaChico + "m Zé: " + alturaZe);
			if (alturaZe > alturaChico) {
				i = 1;
			}
		}
		System.out.println("Zé agora é maior que Chico!\nLevou " + anos + " anos para que isso acontecesse");
	}
}
