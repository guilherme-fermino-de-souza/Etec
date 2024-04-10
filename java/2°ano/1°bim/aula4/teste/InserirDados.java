package aula4;

public class InserirDados {

	public static void main(String[] args) {
		//Instância
		Calculadora c1= new Calculadora();
		c1.InserirDados();
		
		/*c1.Calculo(c1.tipo); // chamada do método Calculo*/
		
		if (c1.tipo==1) {
			c1.Soma();
			
		} else if (c1.tipo==2) {		
			c1.Subtracao();
			
		} else if (c1.tipo==3) {			
			c1.Multiplicacao();
			
		} else if (c1.tipo==4) {
			c1.Divisao();
			
		} else {
			System.out.println("Número inválido");
		}
		
	}

}
