package JavaBasico;
import java.util.Scanner;
import java.util.Locale;

public class ConsumoMedio {
	//Bloco de variáveis
	private static int distanciaTotal;
	private static float combustivelGasto,consumoMedio;
	
		public static void main (String[]args) {
			//Bloco de declarações
			Locale.setDefault(Locale.US);
			Scanner input = new Scanner(System.in);
			
		//Começo do metodo main
			System.out.println("=============== Bem Vindo Usuário ===============");
			System.out.println(" Informe a distância percorrida");
			distanciaTotal=input.nextInt();
			System.out.println("");
			System.out.println(" Insira o total de combustivel gasto");
			combustivelGasto=input.nextFloat();
			System.out.println("");
			input.close();
			
			//Calculo da media
			consumoMedio=(distanciaTotal/combustivelGasto);
			System.out.println("=================================================");
			System.out.println("  O CONSUMO MÉDIO FOI ");
			System.out.printf(" %.3f ",consumoMedio);
			System.out.printf("km/l");
			
			
	//Fim do metodo main
	}
}
