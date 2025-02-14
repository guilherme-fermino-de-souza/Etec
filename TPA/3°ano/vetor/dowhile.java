import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// recebe um número inteiro positivo e retorna todos os impares até ele
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira o número que você deseja calcular: ");
		int num = ler.nextInt();
		int n = 0;
		
		do { 
			if (n % 2 != 0) {
				System.out.println(n);
			}
			n++;
		} while (n <= num);
	}
}
