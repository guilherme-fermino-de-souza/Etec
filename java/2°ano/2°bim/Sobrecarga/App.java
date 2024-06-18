package sobrecarga;

public class App {

	public static void main(String[] args) {
		
		Matematica m = new Matematica();
		
		System.out.println("Os valores da são Soma: "+m.getSoma());
		
		System.out.println("Os valores da são Soma: "+m.getSoma(0));
		
		System.out.println("Os valores da são Soma: "+m.getSoma(0, 0, 0));
		
		System.out.println("Os valores da são Subtração: "+m.getSubtracao());
		
		System.out.println("Os valores da são Subtração: "+m.getSubtracao(0));
	
		System.out.println("Os valores da são Subtração: "+m.getSubtracao(0, 0, 0));


	}

}
