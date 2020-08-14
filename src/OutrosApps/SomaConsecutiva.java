package OutrosApps;
import java.util.Scanner;
import java.util.Locale;

public class SomaConsecutiva {
	//Bloco de variáveis
	private static boolean valorPar=false,valorMaior=false;
	private static int valorA,valorB,somatorio;
	
		public static void main (String[]args) {
			//Bloco de declarações
			Locale.setDefault(Locale.US);
			Scanner input = new Scanner(System.in);
		//Começo do metodo main
			System.out.println("=============== Bem Vindo Usuário ===============");
			while (valorPar==false&&valorMaior==false) {
				System.out.println("Informe um valor par aleátorio");
				valorA=input.nextInt();
				System.out.println("");
				System.out.println("Informe um outro valor par aleátorio maior que o anterior");
				valorB=input.nextInt();
				System.out.println("");
				
				if(((valorA%2==0)&&(valorB%2==0))&&(valorA<valorB)) {
					valorPar=true;
					valorMaior=true;
				}else{
					System.out.println("O valor informado não é par ou é menor que o valorA");
					System.out.println("Informe um valor válido para continuar");
					System.out.println("");
					System.out.println("----------------------------------------");
				}
			}
			input.close();
			
		//Calculo dos valores entre os impares
			for(int i=valorA;i<valorB;i++) {
				if(i%2!=0){
					somatorio+=i;
				}
			}
			System.out.println("=================================================");
			System.out.println("SOMATÓRIO");
			System.out.println(""+somatorio);
			System.out.println("=================================================");
	//Fim do metodo main
	}
}

