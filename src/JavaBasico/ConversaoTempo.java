package JavaBasico;
import java.util.Scanner;
import java.util.Locale;

public class ConversaoTempo {
	//Bloco de vari�veis
	private static int totalEvento, horasEvento, minutosEvento, segundosEvento;
	
		public static void main (String[]args) {
			//Bloco de declara��es
			Locale.setDefault(Locale.US);
			Scanner input = new Scanner(System.in);
			
		//Come�o do metodo main
			System.out.println("=============== Bem Vindo Usu�rio ===============");
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
