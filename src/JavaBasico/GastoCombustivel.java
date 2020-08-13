package JavaBasico;
import java.util.Scanner;
import java.util.Locale;

public class GastoCombustivel {
	//Bloco de variáveis
	private static int tempoGasto, velocidadeMedia;
	final private static int gasolinaPorKM=12;
	private static double litrosGasolina;
	
		public static void main (String[]args) {
			//Bloco de declarações
			Locale.setDefault(Locale.US);
			Scanner input = new Scanner(System.in);
		//Começo do metodo main
			System.out.println("=============== Bem Vindo Usuário ===============");
			System.out.println(" Informe o tempo gasto da viagem (em horas) ");
			tempoGasto=input.nextInt();
			System.out.println("");
			System.out.println(" Insira a velociade media no percusso da mesma");
			velocidadeMedia=input.nextInt();
			System.out.println("");
			System.out.println("=================================================");
			System.out.println("");
			input.close();
			
			//Calculo do litro de gasolina
			litrosGasolina=((tempoGasto*velocidadeMedia)/gasolinaPorKM);
			System.out.println(" A QUANTIDADE DE GASOLINA NECESSÁRIA É ");
			System.out.printf(" %.3f",litrosGasolina);
			System.out.printf(" Litros");
			
			
	//Fim do metodo main
	}
}