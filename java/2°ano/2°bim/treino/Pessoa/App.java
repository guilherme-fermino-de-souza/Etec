package teino;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner in = new Scanner(System.in);
		
		Pessoa a = new Pessoa();
		String nome;
		int idade;
		double peso;
		String email;
		
		System.out.println("1");
		System.out.println("Insira o seu nome:");
		nome = in.nextLine();
		System.out.println("Insira o seu email:");
		email = in.nextLine();
		System.out.println("Insira a sua idade:");
		idade = in.nextInt();
		System.out.println("Insira o seu peso:");
		peso = in.nextDouble();
		
		a.CadastrarPessoa1(nome, email, idade, peso);
		a.ExibirPessoa1();
		
		a.CadastrarPessoa2();
		a.ExibirPessoa2();
		
		in.close();

	}

}
