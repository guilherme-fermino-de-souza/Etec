import java.util.Scanner;
public class questFour {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[][] = new int [3][3];
        int linha, coluna, r=0, placarX=0, placarO=0;
        char jAtual = 'x';
        char [][] t = {               //cria o tabuleiro e possibilita que ele seja mostrado mais pra frente no código
        		{' ',' ',' '},
        		{' ',' ',' '},
        		{' ',' ',' '}
        };
        
        
        	System.out.println("-------------");
        	for (int i=0;i<3;i++) {
        		System.out.print("| ");
        		for (int j=0;j<3;j++) {
        			System.out.println(t[i][j]+" |");
        		}
        		System.out.println("\n--------------");     //escreveum semalhante para o tabuleiro
        	}
        	
        
        
       while (r<9) {
    	   System.out.println("jogador " + jAtual + " insira o valor da linha que você deseja jogar(0 a 2)");
    	   linha = in.nextInt();
    	   System.out.println("jogador " + jAtual + " insira o valor da coluna que você deseja jogar(0 a 2)");
    	   coluna = in.nextInt();
    	   
    	   if (t[linha][coluna] == ' ') {  //checa se a jogada é válida
    		   t[linha][coluna] = jAtual;

           	System.out.println("------");
           	for (int i=0;i<3;i++) {
           		System.out.print("| ");
           		for (int j=0;j<3;j++) {
           			System.out.print(t[i][j]+" | ");   //atualiza o tabuleiro conforme as jogadas
           		}
           		System.out.println("\n------");
           	}
           	
    	   
    	   
    	   if ((t[0][0] == jAtual && t[0][1] == jAtual && t[0][2] == jAtual )
    			|| (t[1][0] == jAtual && t[1][1] == jAtual && t[1][2] == jAtual)
    			|| (t[2][0] == jAtual && t[2][1] == jAtual && t[2][2] == jAtual)
    			|| (t[0][0] == jAtual && t[1][0] == jAtual && t[2][0] == jAtual)
    			|| (t[0][1] == jAtual && t[1][1] == jAtual && t[2][1] == jAtual)
    			|| (t[0][2] == jAtual && t[1][2] == jAtual && t[2][2] == jAtual)
    			|| (t[0][0] == jAtual && t[1][1] == jAtual && t[2][2] == jAtual)
    			|| (t[1][2] == jAtual && t[1][1] == jAtual && t[2][0] == jAtual)) { //checa se houve um vencedor
    		System.out.println("O jogador "+jAtual+" venceu!");
    		if (jAtual == 'x') { //marca um ponto para o jogador atual
     		   placarX++;
     	   } else {
     		  placarO++;
     	   }
    		break;
    	   }
    	   
    	   
    	   if (jAtual == 'x') { //troca a vez de cada jogador
    		   jAtual = 'o';
    	   } else {
    		   jAtual = 'x';
    	   }
    	   
    	   r++;
    	   } else {
    		   System.out.println("posição inválida");
    	   }
    	   
       }
       
       if (r == 9) { //encerra o código caso passe de 8 jogadas(velha)
    	   System.out.println("Empate!");
       }
       
       System.out.println("O placar está "+placarX+" para o jogador X e "+placarO+" para o jogador O."); //mostra o placar
	
     }
	
	
}
