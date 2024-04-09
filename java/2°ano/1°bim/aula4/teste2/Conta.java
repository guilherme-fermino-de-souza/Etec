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
