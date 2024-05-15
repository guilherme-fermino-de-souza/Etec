import java.util.Scanner;

public class Pessoa {
	Scannner in = new Scanner(System.in);
		
	public void CadastrarPessoa1(	string nome string email int idade double peso) {
		
		System.out.println("Insira o seu nome:");
		nome = in.next();
		
		System.out.println("Insira o sua idade:");
		idade = in.nextInt();
		
		System.out.println("Insira o seu peso:");
		peso = in.nextDouble();
		
		System.out.println("Insira o seu e-mail:");
		email = in.next();	
		
	}
	
    public void CadastrarPessoa2() {   	
    	string nome, email;
    	int idade; 
    	double peso; 
		
		System.out.println("Insira o seu nome:");
		nome = in.next();
		
		System.out.println("Insira o sua idade:");
		idade = in.nextInt();
		
		System.out.println("Insira o seu peso:");
		peso = in.nextDouble();
		
		System.out.println("Insira o seu e-mail:");
		email = in.next();			
	}
    
 public void ExibirPessoa1() {  	
    	System.out.println("Nome: "+nome);
    	System.out.println("Idade: "+idade);
    	System.out.println("Peso: "+peso);
    	System.out.println("E-mail: "+email);
    }
}
