import java.util.Scanner;
public class atvOne {
  Scanner in = new Scanner(System.in);

  public double Fatorial(double num, double multi, double fat, double mul) {
    System.out.println("Insira o valor do qual queres o fatorial: ");
    num = in=nextDouble();
    multi = num - 1;
    mul = num - multi;
    fat = num*multi;

    for(mul = (num - multi); multi>mul; mul++) {
      fat = fat*mul;
      multi = multi*1;
    }
    System.out.println("O resultado é: "+fat);
    return num;
  }
  public void Tabuada() {
    int n = 5;
    System.out.println("Tabuada de cinco: ");
    for (int m=1; m<11; m++) {
      n = n*m;
      System.out.println(n);
      n = 5;
    }
  public void Triangulo(double b, double h, double r) {
    System.out.println("Insira o valor da Base: ")
    b = in.nextDouble();
    System.out.println("Insira o valor da Altura: ")
    h = in.nextDouble();
    r = (b*h)/2;
    System.out.println("O resultado é: "+r)
  }
}
