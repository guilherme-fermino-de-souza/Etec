
public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Matriz com números aleatórios
		int matriz[][] = new int[5][5];
        int max = 9;
        int min = 0;
        int range = max - min + 1;
		
		for (int x = 0; x < 5; x++) {
			for (int y =0; y < 5; y++) {
				int aleatorio = (int)(Math.random() * range) + min;
				System.out.println(aleatorio);
				matriz[x][y] = aleatorio;
			}
		}
		
		System.out.println("\nMATRIZ\n");
		
		for (int x = 0; x < 5; x++) {
			for (int y =0; y < 5; y++) {
				System.out.print(" " + matriz[x][y] + " |");
			}
			System.out.println();
		}
	}
}
