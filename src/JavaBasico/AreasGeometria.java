package JavaBasico;
import java.util.Scanner;
import java.util.Locale;

public class AreasGeometria {
	//Bloco de variáveis
	private static double valorA,valorB,valorC;
	private static double areaTriangulo,areaCirculo,areaTrapezio,areaQuadrado,areaRetangulo;
	private static double pi = 3.14159;
	
	
		public static void main (String[]args) {
			//Bloco de declarações
			Locale.setDefault(Locale.US);
			Scanner input = new Scanner(System.in);
			
		//Começo do metodo main
			System.out.println("==================== Bem Vindo Usuário ===================");
			System.out.println("== Informe três valores para realizar o calculo da area ==");
			System.out.println("");
			System.out.println(" Insira o primeiro valor para o calculo ");
			valorA=input.nextDouble();
			System.out.println("");
			System.out.println(" Insira o segundo valor para o calculo ");
			valorB=input.nextDouble();
			System.out.println("");
			System.out.println(" Insira o terceiro e ultimo valor para o calculo ");
			valorC=input.nextDouble();
			System.out.println("");
			System.out.println("----------------------------------------------------------");
			input.close();
			
			//Calculo das areas geometricas
			areaTriangulo = ((valorA*valorC)/2);
			areaCirculo = (pi*(Math.pow(valorC, 2)));
			areaTrapezio = (((valorA+valorB)*valorC)/2);
			areaQuadrado = (Math.pow(valorB, 2));
			areaRetangulo = (valorA*valorB);
			
			System.out.println("");
			System.out.printf("TRIANGULO: %.3f %n",areaTriangulo);
			System.out.printf("CIRCULO: %.3f %n",areaCirculo);
			System.out.printf("TRAPEZIO: %.3f %n",areaTrapezio);
			System.out.printf("QUADRADO: %.3f %n",areaQuadrado);
			System.out.printf("RETANGULO: %.3f %n",areaRetangulo);
			System.out.println("----------------------------------------------------------");
			
			
			
			
	//Fim do metodo main
	}
}
