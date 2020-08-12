package JavaBasico;
import java.util.Scanner;


public class ExtremamenteBasico {
	//Bloco de variáveis
	private static int valorA, valorB, valorX;
	
	
		public static void main (String[]args) {
			//Criação do Scanner
			Scanner input = new Scanner(System.in);
			
		//Começo do metodo main
			System.out.println("+++++++++++ Bem Vindo Usuário ++++++++++");
			System.out.println(" Informe o primeiro valor para soma:");
			valorA= input.nextInt();
			System.out.println("");
			System.out.println(" Informe o segundo valor para soma: ");
			valorB= input.nextInt();
			System.out.println("");
			input.close();
			valorX= (valorA + valorB);
			System.out.println(" X = "+valorX);
			System.out.println("");
	//Fim do metodo main
	}
}
