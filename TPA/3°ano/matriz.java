import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		//ABC com matriz
		Scanner ler = new Scanner(System.in);
		char [][] tabuleiro = {{'a', 'b', 'c'},
								{'d', 'e', 'f'},
								{'g', 'h', 'i'}};
		
		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				System.out.print("" + tabuleiro[x][y] + "|");
			}
			System.out.println();
		}
	}

}
