package JavaBasico;

import java.util.Scanner;
import java.util.Locale;
import java.lang.Math;

public class DistanciaDoisPontos {
	//Bloco de variáveis
	private static double pontoX1,pontoX2,pontoY1,pontoY2,distancia;
	
		public static void main (String[]args) {
			//Bloco de declarações
			Locale.setDefault(Locale.US);
			Scanner input = new Scanner(System.in);
		//Começo do metodo main
			System.out.println("=============== Bem Vindo Usuário ===============");
			System.out.println("");
			System.out.println(" Informe o ponto X no plano cartesiano ");
			pontoX1=input.nextDouble();
			System.out.println("");
			System.out.println(" Informe o ponto Y no plano cartesiano ");
			pontoY1=input.nextDouble();
			System.out.println("");
			System.out.println(" Informe segundo ponto X no plano cartesiano ");
			pontoX2=input.nextDouble();
			System.out.println("");
			System.out.println(" Informe segundo ponto Y no plano cartesiano ");
			pontoX2=input.nextDouble();
			System.out.println("");
			
			
			//Calculo da distância 
			distancia=Math.sqrt((Math.pow((pontoX2-pontoX1),2))+(Math.pow((pontoY2-pontoY1),2)));
			System.out.println("==================================================");
			System.out.println(" A DISTÂNCIA ENTRE OS PONTOS É ");
			System.out.printf("%.4f",distancia);
			
	//Fim do metodo main
	}
}

