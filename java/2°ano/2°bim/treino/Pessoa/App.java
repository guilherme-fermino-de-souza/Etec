package Treino;

import java.util,Scanner;

public class Pessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		App a = new App();
		a.CadastrarPessoa1(null);
		a.CadastrarPessoa2();
		
		a.ExibirPessoa1();
		a.ExibirPessoa2();

	}

}
