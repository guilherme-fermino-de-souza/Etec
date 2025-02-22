
public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Vetor com números aleatórios
		int matriz[] = new int[5];
        int max = 9;
        int min = 0;
        int range = max - min + 1;
		
		for (int x = 0; x < 5; x++) {
				int aleatorio = (int)(Math.random() * range) + min;
				System.out.println(aleatorio);
				matriz[x] = aleatorio;
		}
		
		System.out.println("\nVETOR\n");
		
		for (int x = 0; x < 5; x++) {
				System.out.print(" " + matriz[x] + " |");
			}
			System.out.println();
	}
}
