package JavaBasico;

import java.util.Scanner;
import java.util.Locale;

public class Intervalo {
	//Bloco de vari�veis
	private static double valorX;
	
		public static void main (String[]args) {
			//Bloco de declara��es
			Locale.setDefault(Locale.US);
			Scanner input = new Scanner(System.in);
		//Come�o do metodo main
			System.out.println("=============== Bem Vindo Usu�rio ===============");
			System.out.println(" Informe um valor ale�torio ");
			valorX=input.nextDouble();
			System.out.println("");
			input.close();
			if((valorX<0)||(valorX>100.0)) {
				
				System.out.println(" FORA DE INTERVALO ");
			} else if (valorX<25){
				System.out.println(" Intervalo [0,25]");
			} else if (valorX<50) {
				System.out.println(" Intervalo (25,50]");
			} else if (valorX<75) {
				System.out.println(" Intervalo (50,75]");
			} else if (valorX<=100) {
				System.out.println(" Intervalo (75,100]");
			}
			System.out.println("=================================================");
	//Fim do metodo main
	}
}