package JavaBasico;
import java.util.Scanner;
import java.util.Locale;

public class TesteSelecao {
	//Bloco de variáveis
	private static int valorA,valorB,valorC,valorD;
	
		public static void main (String[]args) {
			//Bloco de declarações
			Locale.setDefault(Locale.US);
			Scanner input = new Scanner(System.in);
			
		//Começo do metodo main
			System.out.println("=============== Bem Vindo Usuário ===============");
			System.out.println("");
			System.out.println("Informe o 1º valor para verificação ");
			valorA=input.nextInt();
			System.out.println("");
			System.out.println("Informe o 2º valor para verificação ");
			valorB=input.nextInt();
			System.out.println("");
			System.out.println("Informe o 3º valor para verificação ");
			valorC=input.nextInt();
			System.out.println("");
			System.out.println("Informe o ultimo valor para verificação ");
			valorD=input.nextInt();
			System.out.println("");
			input.close();
			
			if((valorB>valorC)&&(valorD>valorA)&&((valorC+valorD)>(valorA+valorB)&&(valorC>0)&&
					(valorD>0)&&(valorA%2==0))) {

				System.out.println("Os valores informados são aceitos");
				System.out.println(" VALORES ACEITOS ");
				
			}else {
				
				System.out.println("Os valores informados não são aceitos");
				System.out.println(" VALORES NÃO SÃO ACEITOS ");
			}
			System.out.println("=================================================");
	//Fim do metodo main
	}
}
