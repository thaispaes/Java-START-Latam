package OutrosApps;
import java.util.Scanner;
import java.util.Locale;

public class Triangulos {
	//Bloco de variáveis
	private static int valorA, valorB, valorC;
	
		public static void main (String[]args) {
			//Bloco de declarações
			Locale.setDefault(Locale.US);
			Scanner input = new Scanner(System.in);
		//Começo do metodo main
			System.out.println("=============== Bem Vindo Usuário ===============");
			System.out.println(" Informe o maior lado do triângulo ");
			valorA=input.nextInt();
			System.out.println("");
			System.out.println(" Informe o 2º lado do triângulo ");
			valorB=input.nextInt();
			System.out.println("");
			System.out.println(" Informe o 3º lado do triângulo ");
			valorC=input.nextInt();
			System.out.println("");
			input.close();
			
			//Classificação dos triângulos 
			if (valorA>= (valorB+valorC)) {
				System.out.println("NÃO FORMA TRIANGULO");
				System.out.println("");
			} else if (Math.pow(valorA, 2)==(Math.pow(valorB,2)+Math.pow(valorC, 2))) {
				System.out.println("TRIANGULO RETANGULO");
				System.out.println("");
			} else if (Math.pow(valorA, 2)>(Math.pow(valorB,2)+Math.pow(valorC, 2))) {
				System.out.println("TRIANGULO OBTUSANGULO");
				System.out.println("");
			} else if (Math.pow(valorA, 2)<(Math.pow(valorB,2)+Math.pow(valorC, 2))) {
				System.out.println("TRIANGULO ACUTANGULO");
				System.out.println("");
			} else if ((valorA==valorB)&&(valorA==valorC)&&(valorB==valorC)) {
				System.out.println("TRIANGULO EQUILATERO");
				System.out.println("");
			} else if ((valorA==valorB)||(valorB==valorC)||(valorA==valorC)) {
				System.out.println("TRIANGULO ISOSCELES");
				System.out.println("");
			}
			System.out.println("=================================================");
	//Fim do metodo main
	}
}