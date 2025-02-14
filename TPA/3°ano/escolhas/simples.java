import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ler data atual e data nascimento e retornar idade
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira o ano que você nasceu: ");
		int anoNas = ler.nextInt();
		System.out.println("Insira o ano atual: ");
		int anoAtual = ler.nextInt();
		int idade = anoAtual -anoNas;
		
		if (idade >= 18) {
			System.out.println("Você tem: " + idade + " anos\n Já pode beber!");

		} else {
			System.out.println("Você tem: " + idade + " anos\n Ainda não pode beber");
		}		
	}
}
