package JavaBasico;
import java.util.Scanner;
import java.util.Locale;

public class ConsumoMedio {
	//Bloco de vari�veis
	private static int distanciaTotal;
	private static float combustivelGasto,consumoMedio;
	
		public static void main (String[]args) {
			//Bloco de declara��es
			Locale.setDefault(Locale.US);
			Scanner input = new Scanner(System.in);
			
		//Come�o do metodo main
			System.out.println("=============== Bem Vindo Usu�rio ===============");
			System.out.println(" Informe a dist�ncia percorrida");
			distanciaTotal=input.nextInt();
			System.out.println("");
			System.out.println(" Insira o total de combustivel gasto");
			combustivelGasto=input.nextFloat();
			System.out.println("");
			input.close();
			
			//Calculo da media
			consumoMedio=(distanciaTotal/combustivelGasto);
			System.out.println("=================================================");
			System.out.println("  O CONSUMO M�DIO FOI ");
			System.out.printf(" %.3f ",consumoMedio);
			System.out.printf("km/l");
			
			
	//Fim do metodo main
	}
}
