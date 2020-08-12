package JavaBasico;
import java.util.Scanner;
import java.util.Locale;

public class BonusSalario {
	//Bloco de vari�veis
	private static String nome;
	private static double salarioFixo, vendasTotal, salarioTotal;
	final private static float comissao = 0.15f;
	
		public static void main (String[]args) {
			//Bloco de declara��es
			Locale.setDefault(Locale.US);
			Scanner input = new Scanner(System.in);
			
		//Come�o do metodo main
			System.out.println("=============== Bem Vindo Usu�rio ===============");
			System.out.println(" Insira o nome do funcion�rio ");
			nome=input.next();
			System.out.println("");
			System.out.println(" "+nome+" informe o seu sal�rio fixo mensal ");
			salarioFixo=input.nextDouble();
			System.out.println("");
			System.out.println(" Informe o total de vendas caro(a) "+nome);
			vendasTotal=input.nextDouble();
			System.out.println("");
			input.close();
			
			//Calculo do sal�rio com b�nus
			salarioTotal=(salarioFixo+(vendasTotal*comissao));
			System.out.printf("TOTAL = R$ %.2f %n",salarioTotal);
	//Fim do metodo main
	}
}
