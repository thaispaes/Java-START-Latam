package JavaBasico;
import java.util.Scanner;
import java.util.Locale;

public class Lanche {
	//Bloco de variáveis
	private static int codProduto,quantProduto,quantNotaFiscal;
	private static double totalPagar;
	
		public static void main (String[]args) {
			//Bloco de declarações
			Locale.setDefault(Locale.US);
			Scanner input = new Scanner(System.in);
			
		//Começo do metodo main
			System.out.println("=============== Bem Vindo Usuário ===============");
			System.out.println(" Informe quantos produtos será inseridos ");
			quantNotaFiscal=input.nextInt();
			System.out.println("");
			
			for (int i=0; i<quantNotaFiscal; i++) {
				System.out.println(" Informe o codigo do "+i+"º produto ");
				codProduto=input.nextInt();
				System.out.println(" Informe a quantidade do "+i+"º produto de Nº"+codProduto);
				quantProduto=input.nextInt();
				
				if(codProduto==1) {
					totalPagar=(4*quantProduto);
				} else if(codProduto==2) {
					totalPagar=(4.50*quantProduto);
				} else if (codProduto==3) {
					totalPagar=(5*quantProduto);
				} else if (codProduto==4) {
					totalPagar=(2*quantProduto);
				} else if (codProduto==5) {
					totalPagar=(1.50*quantProduto);
				}
				
			}	
			System.out.println("");
			input.close();
			
			System.out.println("================== NOTA FISCAL =================");
			System.out.println("");
			System.out.printf(" TOTAL A PAGAR: R$ %.2f %n",totalPagar);
			System.out.println("=================================================");
	//Fim do metodo main
	}
}
