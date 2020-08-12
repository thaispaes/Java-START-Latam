package JavaBasico;
import java.util.Scanner;

public class ValorMaior {
	//Bloco de variáveis
	private static int valorA,valorB,valorC, maiorAB, maiorABC;
	
		public static void main (String[]args) {
			//Bloco de declarações
			Scanner input = new Scanner(System.in);
			
		//Começo do metodo main
			System.out.println("=============== Bem Vindo Usuário ===============");
			System.out.println(" Informe o primeiro valor ");
			valorA=input.nextInt();
			System.out.println("");
			System.out.println(" Informe o segundo valor ");
			valorB=input.nextInt();
			System.out.println("");
			System.out.println(" Informe o ultimo valor ");
			valorC=input.nextInt();
			System.out.println("");
			input.close();
			
			//Calculo do maior
			
			
			System.out.println(" eh o maior ");
			
	//Fim do metodo main
	}
}
