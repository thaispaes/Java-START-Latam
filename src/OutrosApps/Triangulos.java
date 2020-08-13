package OutrosApps;
import java.util.Scanner;
import java.util.Locale;

public class Triangulos {
	//Bloco de vari�veis
	private static int valorA, valorB, valorC;
	
		public static void main (String[]args) {
			//Bloco de declara��es
			Locale.setDefault(Locale.US);
			Scanner input = new Scanner(System.in);
		//Come�o do metodo main
			System.out.println("=============== Bem Vindo Usu�rio ===============");
			System.out.println(" Informe o maior lado do tri�ngulo ");
			valorA=input.nextInt();
			System.out.println("");
			System.out.println(" Informe o 2� lado do tri�ngulo ");
			valorB=input.nextInt();
			System.out.println("");
			System.out.println(" Informe o 3� lado do tri�ngulo ");
			valorC=input.nextInt();
			System.out.println("");
			input.close();
			
			//Classifica��o dos tri�ngulos 
			if (valorA>= (valorB+valorC)) {
				System.out.println("N�O FORMA TRIANGULO");
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