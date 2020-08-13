package JavaBasico;
import java.util.Scanner;
import java.util.Locale;

public class FormulaBhaskara {
	//Bloco de vari�veis
	private static double valorA, valorB, valorC, delta;
	
		public static void main (String[]args) {
			//Bloco de declara��es
			Locale.setDefault(Locale.US);
			Scanner input = new Scanner(System.in);
		//Come�o do metodo main
			System.out.println("=============== Bem Vindo Usu�rio ===============");
			System.out.println("");
			System.out.println("Informe o valor de A para o calculo");
			valorA=input.nextDouble();
			System.out.println("");
			System.out.println("Informe o valor de B para o calculo");
			valorB=input.nextDouble();
			System.out.println("");
			System.out.println("Informe o valor de C para o calculo");
			valorC=input.nextDouble();
			System.out.println("");
			System.out.println("================================================");
			System.out.println("");
			input.close();
			
			//Calculo de bhaskara
			delta= ((valorB*valorB)-4*valorA*valorC);
			
			if (delta>=0 &&valorA!=0) {
				
				System.out.println(" AS RAIZES DO CALCULO � ");
				System.out.printf(" R1 = %.5f %n", ((valorB*-1) + Math.sqrt(delta))/(2*valorA));
				System.out.printf(" R2 = %.5f %n", ((valorB*-1) - Math.sqrt(delta))/(2*valorA));
			} else {
				
				System.out.println(" Impossivel realizar o calculo ");
			}
			
			System.out.println("=================================================");
	//Fim do metodo main
	}
}
