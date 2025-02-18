import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		// TODO Auto-generated method stub
		//Matriz com números aleatórios
		int matriz[][] = new int[2][2];
		int par = 0, impar = 0;
		
		for (int x = 0; x < 2; x++) {
			for (int y =0; y < 2; y++) {
				System.out.println("Insira o valor da linha: " + (x+1) + " coluna: " + (y+1));
				matriz[x][y] = ler.nextInt();
				if (matriz[x][y] % 2 == 0 ) {
					par++;
				} else {
					impar++;
				}
			}
		}
		
		System.out.println("\nMATRIZ\n   1   2");
		
		for (int x = 0; x < 2; x++) {
			System.out.print((x+1) + " ");
			for (int y =0; y < 2; y++) {
				System.out.print(" " + matriz[x][y] + " |");
			}
			System.out.println();
		}
		System.out.println("\nSua matriz 2x2 tem " + par + " números pares e " + impar + " números ímpares");
	}
}
