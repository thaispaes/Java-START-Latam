package JavaBasico;
import java.util.Scanner;
import java.util.Locale;

public class Cedulas_e_Moedas {
	//Bloco de vari�veis
	private static int troco, 
	notaCem, notaCinquenta, 
	notaVinte, notaDez, notaCinco, notaDois;
	private static double valor,moedaCinquenta, moedaVinteCinco, moedaDez, moedaCinco;
	
		public static void main (String[]args) {
			//Bloco de declara��es
			Locale.setDefault(Locale.US);
			Scanner input = new Scanner(System.in);
			
		//Come�o do metodo main
			System.out.println("=============== Bem Vindo Usu�rio ===============");
			System.out.println(" Informe o valor que deseja trocar ");
			valor=input.nextDouble();
			System.out.println("");
			input.close();
			
			//Calculo de notas 
			troco = (int) valor; //Atribui o valor para a variavel troco
			
			//Primeiro verifica o troco pelo maior, se pode receber desta nota ou n�o 
			notaCem= (troco/100); //O resultado da divis�o � a quantidade de notas usadas deste valor
			troco = (troco-(notaCem*100));//Nesta parte o valor de notasCem vai ser multiplicado e subtraido do troco a ser dado
			
			//E esse processo � feito com todas as notas 
			notaCinquenta=(troco/50);
			troco = (troco-(notaCinquenta*50));
			
			notaVinte=(troco/20);
			troco = (troco-(notaVinte*20));
			
			notaDez=(troco/10);
			troco = (troco-(notaDez*10));
			
			notaCinco=(troco/5);
			troco = (troco-(notaCinco*5));
			
			notaDois=(troco/2);
			troco = (troco-(notaDois*2));
			
			moedaCinquenta = troco/0.50;
			troco = (int) (troco - (moedaCinquenta*0.50));
			
			moedaVinteCinco = troco/0.25;
			troco = (int) (troco - (moedaVinteCinco*0.25));
			
			moedaDez = troco/0.10;
			troco = (int) (troco - (moedaDez *0.10));
			
			moedaCinco  = troco/0.05;
			troco = (int) (troco - (moedaCinco *0.05));
			
			
			//Resutado de quantas notas s�o necess�rias para o troco
			System.out.println("==================== TROCO ======================");
			System.out.println("");
			System.out.println(" O VALOR "+valor+" SER� PAGO COM UM TROCO DE ");
			System.out.println(notaCem+" nota(s) de R$ 100");
			System.out.println(notaCinquenta+" nota(s) de R$ 50");
			System.out.println(notaVinte+" nota(s) de R$ 20");
			System.out.println(notaDez+" nota(s) de R$ 10");
			System.out.println(notaCinco+" nota(s) de R$ 5");
			System.out.println(notaDois+" nota(s) de R$ 2");
			System.out.println("");
			System.out.println("=================================================");
			System.out.println("");
			System.out.println(moedaCinquenta+" moeda(s) de R$ 0.50");
			System.out.println(moedaVinteCinco+" moeda(s) de R$ 0.25");
			System.out.println(moedaDez+" moeda(s) de R$ 0.10");
			System.out.println(moedaCinco+" moeda(s) de R$ 0.05");
			System.out.println("");
			System.out.println("=================================================");
			
			
	//Fim do metodo main
	}
}
