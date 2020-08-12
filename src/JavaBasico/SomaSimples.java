package JavaBasico;
import java.util.Scanner;


public class SomaSimples {
	//Bloco de variáveis
	private static int valorA, valorB, Soma;
	
	
		public static void main (String[]args) {
			//Criação do Scanner
			Scanner input = new Scanner(System.in);
			
		//Começo do metodo main
			System.out.println("+++++++++++ Bem Vindo Usuário ++++++++++");
			System.out.println(" Informe o primeiro valor para a soma \n");
			valorA= input.nextInt();
			System.out.println("");
			System.out.println(" Informe o segundo valor para a soma \n ");
			valorB= input.nextInt();
			System.out.println("");
			input.close();
			Soma= (valorA + valorB);
			System.out.println(" SOMA = "+Soma);
			System.out.println("");
	//Fim do metodo main
	}
}
