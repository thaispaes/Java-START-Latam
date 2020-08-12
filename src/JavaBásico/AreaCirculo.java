package JavaBásico;
import java.util.Scanner;
import java.util.Locale;

public class AreaCirculo {
	//Bloco de variáveis
	private static double pi = 3.14159;
	private static double raio, area;
	
	public static void main(String[]args) {
		//Bloco de declarações
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		//Inicio metodo main
		System.out.println("-------- Calculo da Area do Circulo --------");
		System.out.println("");
		System.out.println(" Informe o raio do circulo \n");
		raio=input.nextDouble();
		input.close();
		area=(pi*(Math.pow(raio, 2)));
		System.out.println("--------------------------------------------");
		System.out.println(" A Area do circulo é ");
		System.out.printf("A = %.4f %n",area);
		System.out.println("--------------------------------------------");
		
	}// Fim do metodo main
}
