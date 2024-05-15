package teino;
import java.util.Scanner;
public class Pessoa {
	Scanner in = new Scanner(System.in);
	String nome;
	int idade;
	double peso;
	String email;
		
	public void CadastrarPessoa1(String n, String e, int i, double p) {
		nome = n;
		email= e;
		idade = i;
		peso = p;		
	}
	
    public void CadastrarPessoa2() {   	
    	System.out.println("Insira o seu nome:");
		nome = in.nextLine();
		System.out.println("Insira o seu e-mail:");
		email = in.nextLine();	
		System.out.println("Insira o sua idade:");
	    idade = in.nextInt();
		System.out.println("Insira o seu peso:");
		peso = in.nextDouble();
	}
    
 public void ExibirPessoa1() {  	
    	System.out.println("Nome: "+nome);
    	System.out.println("Idade: "+idade);
    	System.out.println("Peso: "+peso);
    	System.out.println("E-mail: "+email);
    }
 
 public String ExibirPessoa2() {  	
 	String exibir = nome+""+email+""+idade+""+peso;
 	return exibir;
 }
}
