package OutrosApps;
import java.util.Scanner;
import java.util.Locale;

public class Voleibol {
	//Bloco de variáveis
	public static int numJogadores, numSaques=0, numBloqueios=0,numAtaques=0, totalTentativasA,
	totalTentativasB, totalTentativasS,totalAcertosA, totalAcertosS, totalAcertosB,saques=0,bloqueios=0,ataques=0,
	percentualSaques,percentualBloqueios,percentualAtaques;
	public static String nomeJogador;
	
		public static void main (String[]args) {
			//Bloco de declarações
			Locale.setDefault(Locale.US);
			Scanner input = new Scanner(System.in);
			
		//Começo do metodo main
			System.out.println("=============== Bem Vindo Usuário ===============");
			System.out.println("");
			System.out.println("Informe a quantidade de jogadores");
			numJogadores=input.nextInt();
			System.out.println("");
			for (int i=0; i<numJogadores;i++) {
				System.out.println("");
				System.out.println("=================================================");
				System.out.println("");
				System.out.println("Insira o "+(i+1)+"º nome do jogador");
				nomeJogador=input.next();
				System.out.println("");
				System.out.println("=================================================");
				System.out.println("============== TENTATIVAS E ERROS ===============");
				System.out.println("");
				System.out.println("Informe a quantidade total de tentivas de saque");
				numSaques=input.nextInt();
				
				System.out.println("");
				System.out.println("Informe a quantidade total de tentivas de bloqueio");
				numBloqueios=input.nextInt();
				System.out.println("");
				System.out.println("Informe a quantidade total de tentivas de ataques");
				numAtaques=input.nextInt();
				System.out.println("");
				System.out.println("=================================================");
				System.out.println("");
				System.out.println("============ TENTATIVAS DE SUCESSO!! ============");
				System.out.println("");
				System.out.println("Informe a quantidade de saques de "+nomeJogador);
				saques=input.nextInt();
				System.out.println("");
				System.out.println("Informe a quantidade de bloqueios de "+nomeJogador);
				bloqueios=input.nextInt();
				System.out.println("");
				System.out.println("Informe a quantidade de ataques de "+nomeJogador);
				ataques=input.nextInt();
				System.out.println("");
				System.out.println("=================================================");
				System.out.println("");
				
				//bla blabla
				totalTentativasA+=numAtaques;
				totalTentativasB+=numBloqueios;
				totalTentativasS+=numSaques;
				
				//bl bla bla 
				totalAcertosA+=ataques;
				totalAcertosB+=bloqueios;
				totalAcertosS+=saques;
			}
			input.close();
			//Calculo do percentual 
			percentualSaques=((totalAcertosS*100)/totalTentativasS);
			percentualAtaques=((totalAcertosA*100)/totalTentativasA);
			percentualBloqueios=((totalAcertosB*100)/totalTentativasB);
			
			System.out.println("=================================================");
			System.out.println("==============  PERCENTUAL DO TIME ==============");
			System.out.println("");
			System.out.println("Pontos de Saque: "+percentualSaques+"%");
			System.out.println("Pontos de Bloqueio: "+percentualBloqueios+"%");
			System.out.println("Pontos de Ataque: "+percentualAtaques+"%");
			System.out.println("");
			System.out.println("=================================================");
			System.out.println("");
	//Fim do metodo main
	}
}
