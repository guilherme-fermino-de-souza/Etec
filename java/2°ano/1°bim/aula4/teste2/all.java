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
// -|-
import java.util.Scanner;
public class EscolherConta {
	Scanner in = new Scanner(System.in);
	int escolha, conta;
	public int EscolhadaConta() {
		System.out.println("Escolha entre soma(1), subtração(2), multiplicação(3), divisão(4) ou Porcentagem(5)");
		int i = 0;
		while (i==0) {
			conta = in.nextInt();
			if (conta==1){
				escolha=1;
				i = 1;
			}else if (conta==2){
				escolha=2;
				i = 1;
			}else if (conta==3){
				escolha=3;
				i = 1;
			}else if (conta==4){
				escolha=4;
				i = 1;
			}else if (conta==5){
				escolha=5;
				i = 1;
			}else {
				System.out.println("Operação invalida, coloque outra");
				i=0;
			}
		}
		return escolha;
	}
}
// -|-
import java.util.Scanner;
public class Conta {
	double num1, num2;
	double resultado;
	
	Scanner in = new Scanner(System.in);
	
	public void Soma() {
			System.out.print("Selecione o 1º número: ");
			num1 = in.nextDouble();
			System.out.print("\nSelecione o 2º número: ");
			num2 = in.nextDouble();
			resultado = num1+num2;
			System.out.println("A soma de "+num1+" + "+num2+" é "+resultado);
	}
	
	public void Subtracao() {
			System.out.print("Selecione o minuendo: ");
			num1 = in.nextDouble();
			System.out.print("\nSelecione o subtraendo: ");
			num2 = in.nextDouble();
			resultado = num1-num2;
			System.out.println("A subtração de "+num1+" - "+num2+" é "+resultado);
	}
	public void Multiplicacao() {
		System.out.print("Selecione o 1º número: ");
		num1 = in.nextDouble();
		System.out.print("\nSelecione o 2º número: ");
		num2 = in.nextDouble();
		resultado = num1*num2;
		System.out.println("A multiplicação de "+num1+" x "+num2+" é "+resultado);
	}
	public void Divisao() {
		System.out.print("Selecione o dividendo: ");
		num1 = in.nextDouble();
		System.out.print("\nSelecione o divisor: ");
		num2 = in.nextDouble();
		resultado = num1/num2;
		System.out.println("A multiplicação de "+num1+" / "+num2+" é "+resultado);
	}
	public void Porcentagem() {
		System.out.print("Insira o número que deseja saber a porcentagem: ");
		num1 = in.nextDouble();
		System.out.print("\nInsira a porcentagem que deseja saber: ");
		num2 = in.nextDouble();
		resultado = num1*num2/100;
		System.out.println(num2+"% de "+num1+" equivale a "+resultado);
	}
	
}
