package JavaBasico;
import java.util.Scanner;
import java.util.Locale;

public class TesteSelecao {
	//Bloco de vari�veis
	private static int valorA,valorB,valorC,valorD;
	
		public static void main (String[]args) {
			//Bloco de declara��es
			Locale.setDefault(Locale.US);
			Scanner input = new Scanner(System.in);
			
		//Come�o do metodo main
			System.out.println("=============== Bem Vindo Usu�rio ===============");
			System.out.println("");
			System.out.println("Informe o 1� valor para verifica��o ");
			valorA=input.nextInt();
			System.out.println("");
			System.out.println("Informe o 2� valor para verifica��o ");
			valorB=input.nextInt();
			System.out.println("");
			System.out.println("Informe o 3� valor para verifica��o ");
			valorC=input.nextInt();
			System.out.println("");
			System.out.println("Informe o ultimo valor para verifica��o ");
			valorD=input.nextInt();
			System.out.println("");
			input.close();
			
			if((valorB>valorC)&&(valorD>valorA)&&((valorC+valorD)>(valorA+valorB)&&(valorC>0)&&
					(valorD>0)&&(valorA%2==0))) {

				System.out.println("Os valores informados s�o aceitos");
				System.out.println(" VALORES ACEITOS ");
				
			}else {
				
				System.out.println("Os valores informados n�o s�o aceitos");
				System.out.println(" VALORES N�O S�O ACEITOS ");
			}
			System.out.println("=================================================");
	//Fim do metodo main
	}
}
