package JavaBasico;
import java.util.Scanner;
import java.util.Locale;

public class CalculoSimples {
	//Bloco de vari�veis
	private static int codPeca1, quantPecas1;
	private static double valorPeca1, valorPeca2, totalPagar;
	private static int codPeca2, quantPecas2;
	
		public static void main (String[]args) {
			//Bloco de declara��es
			Locale.setDefault(Locale.US);
			Scanner input = new Scanner(System.in);
		//Come�o do metodo main
			System.out.println("=============== Bem Vindo Usu�rio ===============");
			System.out.println("===== Informe os dados das pe�as compradas ======");
			System.out.println("");
			System.out.println(" Insira o codigo da primeira pe�a ");
			codPeca1=input.nextInt();
			System.out.println("");
			System.out.println(" Insira a quantidade comprada da primeira pe�a ");
			quantPecas1=input.nextInt();
			System.out.println("");
			System.out.println(" Informe o valor unit�rio da pe�a N�"+codPeca1);
			valorPeca1=input.nextDouble();
			System.out.println("------------------------------------------------");
			System.out.println(" Insira o codigo da segunda pe�a ");
			codPeca2=input.nextInt();
			System.out.println("");
			System.out.println(" Insira a quantidade de pe�as compradas ");
			quantPecas2=input.nextInt();
			System.out.println("");
			System.out.println(" Insira o valor unit�rio da pe�a N�"+codPeca2);
			valorPeca2=input.nextDouble();
			System.out.println("");
			input.close();
			
			//Calculo do valor total
			totalPagar = ((quantPecas1*valorPeca1)+(quantPecas2*valorPeca2));
			System.out.println("------------------------------------------------");
			System.out.printf(" VALOR A PAGAR: R$ %.2f %n",totalPagar);
			
	//Fim do metodo main
	}
}
