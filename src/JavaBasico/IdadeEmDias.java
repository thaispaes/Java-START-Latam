package JavaBasico;
import java.util.Scanner;
import java.util.Locale;

public class IdadeEmDias {
	//Bloco de variáveis
	private static int idadeDias, anosIdade, mesesIdade, diasIdade;
	
		public static void main (String[]args) {
			//Bloco de declarações
			Locale.setDefault(Locale.US);
			Scanner input = new Scanner(System.in);
		//Começo do metodo main
			System.out.println("=============== Bem Vindo Usuário ===============");
			System.out.println(" Insira a sua idade em dias ");
			idadeDias=input.nextInt();
			System.out.println("");
			input.close();
			
			//Calculo da idade 
			anosIdade=(idadeDias/365);
			mesesIdade=((idadeDias%365)/30);
			diasIdade=((idadeDias%365)%30);
			
			System.out.println(" SUA IDADE EM DIAS MESES E ANOS É ");
			System.out.println(" "+anosIdade+" ano(s) \n "+
			mesesIdade+" mes(es) \n "+diasIdade+" dia(s)");
			System.out.println("=================================================");
			
	//Fim do metodo main
	}
}
