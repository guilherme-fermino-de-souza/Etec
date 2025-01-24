import java.util.Scanner;
public class questThree {

	public static void main(String[] args) {
		// leia os valores de uma matrix 3x3 e apresente cada valor ímpar e par, assim como as suas respectivas posições e quantidades;
    Scanner in = new Scanner(System.in);
    int a[][] = new int [3][3];
    int par=0, impar=0;
    
    for (int i=0; i<3;i++) {
    	for (int j=0;j<3;j++) {
    		System.out.println("insira o valor da "+(i+1)+"° linha e da "+(j+1)+"° coluna:");
    		a[i][j] = in.nextInt();
    	}
    }
    
    for (int i=0; i<3;i++) {
    	for (int j=0;j<3;j++) {
    		if (a[i][j]%2==0) {
    			par++;
    		 System.out.println("O valor "+a[i][j]+" da "+(i+1)+"° linha e da "+(j+1)+"° coluna é PAR.");
    		} else {
    			impar++;
    			System.out.println("O valor "+a[i][j]+" da "+(i+1)+"° linha e da "+(j+1)+"° coluna é ÍMPAR.");
    		}
    		
    		
    	}
    }
    System.out.println("existem "+par+" número(s) par(es) e "+impar+" número(s) ímpar(es)");
    
    
    in.close();
	}

}
