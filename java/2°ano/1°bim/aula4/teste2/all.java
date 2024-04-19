import java.util.Scanner;
public class Calculadora {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		EscolherConta ec = new EscolherConta();
		Conta c = new Conta();
		
		ec.EscolhadaConta();
		if (ec.escolha == 1) {
			c.Soma();
		}else if (ec.escolha == 2) {
			c.Subtracao();
		}else if (ec.escolha == 3) {
			c.Multiplicacao();
		}else if (ec.escolha == 4) {
			c.Divisao();
		}else {
			c.Porcentagem();
		}
	}
}
