package JavaBasico;
import java.util.Scanner;
import java.util.Locale;

public class ConversaoTempo {
	//Bloco de variáveis
	private static int totalEvento, horasEvento, minutosEvento, segundosEvento;
	
		public static void main (String[]args) {
			//Bloco de declarações
			Locale.setDefault(Locale.US);
			Scanner input = new Scanner(System.in);
			
		//Começo do metodo main
			System.out.println("=============== Bem Vindo Usuário ===============");
			System.out.println(" Informe o tempo total do evento em segundos ");
			totalEvento=input.nextInt();
			System.out.println("");
			input.close();
			
			//Calculo das horas
			horasEvento= (totalEvento/3600);
			minutosEvento=((totalEvento-(horasEvento*3600))/60);
			segundosEvento=(totalEvento%60);
			
			System.out.println(" O TEMPO TOTAL DO EVENTO ");
			System.out.println(" "+horasEvento+":"+minutosEvento+":"+segundosEvento);
			System.out.println("=================================================");
			
	//Fim do metodo main
	}
}
