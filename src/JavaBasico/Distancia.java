package JavaBasico;

import java.util.Scanner;
import java.util.Locale;

public class Distancia {
	//Bloco de vari�veis
	final private static int velocidadeCarroX = 60;
	private static int distanciaCarroY,tempoCarroY;
	
		public static void main (String[]args) {
			//Bloco de declara��es
			Locale.setDefault(Locale.US);
			Scanner input = new Scanner(System.in);
			
		//Come�o do metodo main
			System.out.println("=============== Bem Vindo Usu�rio ===============");
			System.out.println(" Informe a dist�ncia do carro Y ");
			distanciaCarroY=input.nextInt();
			System.out.println("");
			input.close();
			
			//Calculo da dist�ncia
			tempoCarroY=((velocidadeCarroX*distanciaCarroY)/30/*Distancia do carro X*/);
			System.out.println(" O CARRO Y LEVA UM TEMPO DE: ");
			System.out.println(tempoCarroY+" minutos");
			
			
	//Fim do metodo main
	}
}
