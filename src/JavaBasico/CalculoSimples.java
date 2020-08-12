package JavaBasico;
import java.util.Scanner;
import java.util.Locale;

public class CalculoSimples {
	//Bloco de variáveis
	private static int codPeca1, quantPecas1;
	private static double valorPeca1, valorPeca2, totalPagar;
	private static int codPeca2, quantPecas2;
	
		public static void main (String[]args) {
			//Bloco de declarações
			Locale.setDefault(Locale.US);
			Scanner input = new Scanner(System.in);
		//Começo do metodo main
			System.out.println("=============== Bem Vindo Usuário ===============");
			System.out.println("===== Informe os dados das peças compradas ======");
			System.out.println("");
			System.out.println(" Insira o codigo da primeira peça ");
			codPeca1=input.nextInt();
			System.out.println("");
			System.out.println(" Insira a quantidade comprada da primeira peça ");
			quantPecas1=input.nextInt();
			System.out.println("");
			System.out.println(" Informe o valor unitário da peça Nº"+codPeca1);
			valorPeca1=input.nextDouble();
			System.out.println("------------------------------------------------");
			System.out.println(" Insira o codigo da segunda peça ");
			codPeca2=input.nextInt();
			System.out.println("");
			System.out.println(" Insira a quantidade de peças compradas ");
			quantPecas2=input.nextInt();
			System.out.println("");
			System.out.println(" Insira o valor unitário da peça Nº"+codPeca2);
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
