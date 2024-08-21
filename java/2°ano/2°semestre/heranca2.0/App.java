package heranca;
import java.util.Scanner;
public class App {
	//Feito
	public static void main(String[] args) {
		    Scanner ler = new Scanner(System.in);
		    int escolha;
				
		    Quadrado q = new Quadrado();
		    Circulo c = new Circulo();
		    Triangulo t = new Triangulo();
		    Retangulo r = new Retangulo();
		
		    System.out.println("Escolha que tipo de conta deseja fazer:");
		    System.out.println("1.Quadrado 2.Círculo 3.Triângulo 4.Retângulo");
		    escolha = ler.nextInt();
		    if (escolha==1) {
			    q.CalcularArea();
		    } else if (escolha==2) {
			    c.CalcularArea();
		    } else if (escolha==3) {
		    	if (t.eUmTriangulo() == true) {
			    t.CalcularArea();
		    	} else {
			    System.out.println("Não é possível calcular.");
			    }
		    } else if (escolha==4) {
		    	r.CalcularArea();
		    } else {
		    	System.out.println("Número inválido");
		    }
	    }
}
