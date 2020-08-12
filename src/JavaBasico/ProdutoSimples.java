package JavaBasico;
import java.util.Scanner;


public class ProdutoSimples {
	//Bloco de variáveis
	private static int valorA, valorB, prod;
	
	
		public static void main (String[]args) {
			//Criação do Scanner
			Scanner input = new Scanner(System.in);
			
		//Começo do metodo main
			System.out.println("+++++++++++ Bem Vindo Usuário ++++++++++");
			System.out.println(" Informe o primeiro valor do calculo \n");
			valorA= input.nextInt();
			System.out.println("");
			System.out.println(" Informe o segundo valor do calculo \n ");
			valorB= input.nextInt();
			System.out.println("");
			input.close();
			prod= (valorA * valorB);
			System.out.println(" PROD = "+prod);
			System.out.println("");
	
	}//Fim do metodo main
}
