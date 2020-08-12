package JavaBasico;
import java.util.Scanner;


public class Diferenca {
	//Bloco de variáveis
	private static int valorA, valorB, valorC, valorD;
	private static int difeProduto;
	
	
		public static void main (String[]args) {
			//Criação do Scanner
			Scanner input = new Scanner(System.in);
			
		//Começo do metodo main
			System.out.println("++++++++++++ Bem Vindo Usuário +++++++++++");
			System.out.println(" Informe o primeiro valor para o calculo ");
			valorA= input.nextInt();
			System.out.println("");
			System.out.println(" Informe o segundo valor para o calculo ");
			valorB= input.nextInt();
			System.out.println("");
			System.out.println(" Informe o terceiro valor para o calculo ");
			valorC= input.nextInt();
			System.out.println("");
			System.out.println(" Informe o quarto valor para o calculo ");
			valorD= input.nextInt();
			System.out.println("");
			input.close();
			
			difeProduto= ((valorA*valorB)-(valorC*valorD));
			System.out.println(" DIFERENCA = "+difeProduto);
			System.out.println("");
	//Fim do metodo main
	}
}
