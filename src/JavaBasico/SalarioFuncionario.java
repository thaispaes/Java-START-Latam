package JavaBasico;
import java.util.Scanner;
import java.util.Locale;

public class SalarioFuncionario {
	//Bloco de vari�veis
	private static int codFuncionario, horasFuncionario;
	private static double salarioHora, salarioFuncionario;
	
		public static void main (String[]args) {
			//Bloco de declara��es
			Locale.setDefault(Locale.US);
			Scanner input = new Scanner(System.in);
			
		//Come�o do metodo main
			System.out.println("=============== Bem Vindo Funcion�rio ===============");
			System.out.println(" Informe o seu n�mero de identifica��o ");
			codFuncionario=input.nextInt();
			System.out.println("");
			System.out.println(" Insira agora a quantidade de horas de trabalho ");
			horasFuncionario=input.nextInt();
			System.out.println("");
			System.out.println(" Qual o valor pago a cada hora trabalhada? ");
			salarioHora=input.nextDouble();
			System.out.println("");
			input.close();
			
			//Calculo do sal�rio
			salarioFuncionario=(salarioHora*horasFuncionario);
			System.out.println("NUMBER = "+codFuncionario);
			System.out.printf("SALARY = U$ %.2f %n",salarioFuncionario);
			
	//Fim do metodo main
	}
}
