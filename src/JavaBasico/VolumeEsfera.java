package JavaBasico;
import java.util.Scanner;
import java.util.Locale;

public class VolumeEsfera {
	//Bloco de vari�veis
	private static double pi = 3.14159;
	private static double raio, volume;
	private static double formula = (4/3.0);
	
	public static void main(String[]args) {
		//Bloco de declara��es
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		//Inicio metodo main
		System.out.println("-------- Calculo do volume da VolumeEsfera --------");
		System.out.println("");
		System.out.println(" Informe o raio do circulo \n");
		raio=input.nextDouble();
		input.close();
		
		volume=(formula*pi*(Math.pow(raio, 3)));
		System.out.println("--------------------------------------------");
		System.out.println(" O Volume da esfera � ");
		System.out.printf("VOLUME = %.3f %n",volume);
		System.out.println("--------------------------------------------");
		
	}// Fim do metodo main
}
