package OutrosApps;
import java.util.Scanner;
import java.util.Locale;

public class Salario {
	//Bloco de vari�veis
	private static double salarioFunc, salarioReajuste, reajuste;
	private static int porcentagem;
	private static boolean valorValido = false;
		public static void main (String[]args) {
			//Bloco de declara��es
			Locale.setDefault(Locale.US);
			Scanner input = new Scanner(System.in);
		//Come�o do metodo main
			System.out.println("=============== Bem Vindo Usu�rio ===============");
				while (valorValido==false) {
					System.out.println(" Informe o sal�rio atual do funcion�rio ");
					salarioFunc=input.nextDouble();
					System.out.println("");
					input.close();
					if(salarioFunc<0) {
						valorValido=false;
						System.out.println(" O valor informado n�o � valido ");
						System.out.println("Insira um valor entre 0 e acima de R$2000");
						System.out.println("");
					}else {
						valorValido=true;
					}
				}
			
				if(salarioFunc<=400.00) {
					salarioReajuste=(salarioFunc*1.15);
					reajuste = (salarioFunc-salarioReajuste);
					porcentagem = 15;
				} else if(salarioFunc<=800.00) {
					salarioReajuste=(salarioFunc*1.12);
					reajuste = (salarioFunc-salarioReajuste);
					porcentagem = 12;
				} else if(salarioFunc<=1200.00) {
					salarioReajuste=(salarioFunc*1.10);
					reajuste = (salarioFunc-salarioReajuste);
					porcentagem = 10;
				} else if(salarioFunc<=2000.00) {
					salarioReajuste=(salarioFunc*1.7);
					reajuste = (salarioFunc-salarioReajuste);
					porcentagem = 7;
				} else if(salarioFunc>=2000.00) {
					salarioReajuste=(salarioFunc*1.4);
					reajuste = (salarioFunc-salarioReajuste);
					porcentagem = 4;
				}
				
				System.out.println("===================== SALARIO ===================");
				System.out.println("");
				System.out.printf(" O novo sal�rio do funcion�rio � -> R$%.2f %n",salarioReajuste);
				System.out.printf(" O reajuste ganho foi de -> %.2f %n ",reajuste);
				System.out.println("E o indice de reajuste -> "+porcentagem+"%");
				System.out.println("=================================================");
	//Fim do metodo main
	}
}

