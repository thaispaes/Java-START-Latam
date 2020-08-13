package JavaBasico;

import java.util.Scanner;
import java.util.Locale;

public class Distancia {
	//Bloco de variáveis
	final private static int velocidadeCarroX = 60;
	private static int distanciaCarroY,tempoCarroY;
	
		public static void main (String[]args) {
			//Bloco de declarações
			Locale.setDefault(Locale.US);
			Scanner input = new Scanner(System.in);
			
		//Começo do metodo main
			System.out.println("=============== Bem Vindo Usuário ===============");
			System.out.println(" Informe a distância do carro Y ");
			distanciaCarroY=input.nextInt();
			System.out.println("");
			input.close();
			
			//Calculo da distância
			tempoCarroY=((velocidadeCarroX*distanciaCarroY)/30/*Distancia do carro X*/);
			System.out.println(" O CARRO Y LEVA UM TEMPO DE: ");
			System.out.println(tempoCarroY+" minutos");
			
			
	//Fim do metodo main
	}
}
