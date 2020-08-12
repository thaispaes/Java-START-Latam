package JavaBásico;
import java.util.Scanner;


public class extremamenteBasico {
	//Bloco de variáveis
	private static int valorA, valorB, valorX;
	//Criação do Scanner
	static Scanner leia = new Scanner(System.in);
	
		public static void main (String[]args) {
		//Começo do metodo main
			System.out.println("+++++++++++ Bem Vindo Usuário ++++++++++");
			System.out.println(" Informe o primeiro valor para soma:");
			valorA= leia.nextInt();
			System.out.println("");
			System.out.println(" Informe o segundo valor para soma: ");
			valorB= leia.nextInt();
			System.out.println("");
			valorX= (valorA + valorB);
			System.out.println(" X = "+valorX);
			System.out.println("");
	//Fim do metodo main
	}
}
