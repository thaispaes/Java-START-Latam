package JavaBasico;
import java.util.Scanner;
import java.util.Locale;

public class BonusSalario {
	//Bloco de variáveis
	private static String nome;
	private static double salarioFixo, vendasTotal, salarioTotal;
	final private static float comissao = 0.15f;
	
		public static void main (String[]args) {
			//Bloco de declarações
			Locale.setDefault(Locale.US);
			Scanner input = new Scanner(System.in);
			
		//Começo do metodo main
			System.out.println("=============== Bem Vindo Usuário ===============");
			System.out.println(" Insira o nome do funcionário ");
			nome=input.next();
			System.out.println("");
			System.out.println(" "+nome+" informe o seu salário fixo mensal ");
			salarioFixo=input.nextDouble();
			System.out.println("");
			System.out.println(" Informe o total de vendas caro(a) "+nome);
			vendasTotal=input.nextDouble();
			System.out.println("");
			input.close();
			
			//Calculo do salário com bônus
			salarioTotal=(salarioFixo+(vendasTotal*comissao));
			System.out.printf("TOTAL = R$ %.2f %n",salarioTotal);
	//Fim do metodo main
	}
}
