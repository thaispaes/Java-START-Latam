package JavaBasico;
import java.util.Scanner;
import java.util.Locale;

public class MediaSimples {
	//Bloco de vari�veis
	private static Double notaA, notaB, mediaAluno;
	private static boolean valoresAceitos = false;
	
		public static void main (String[]args) {
			//Bloco de declara��es
			Locale.setDefault(Locale.US);
			Scanner input = new Scanner(System.in);
			
		//Come�o do metodo main
			System.out.println("=============== Bem Vindo Usu�rio ===============");
			
			//Loop de inserir as notas do aluno
			while (valoresAceitos == false) {
				System.out.println(" Informe a primeira nota do aluno \n");
				notaA= input.nextDouble();
				System.out.println("");
				System.out.println(" Informe a segunda nota do aluno \n ");
				notaB= input.nextDouble();
				
				//Verifica se a nota informada foi entre 0.0 ou 10.0
					if ((notaA>=0.0 && notaA<=10.0)&&(notaB>=0.0 && notaB<=10.0)) {
						valoresAceitos=true;
						
					}else {
						valoresAceitos = false;
						System.out.println("");
						System.out.println("Um dos valores informados foi inv�lido");
						//Comando que limpa o console
						System.out.println("Informe um valor entre 0.0 e 10.0");
						System.out.println("");
					}
			}
			System.out.println("");
			input.close();
			mediaAluno = ((notaA*3.5)+(notaB*7.5))/11;
			System.out.printf(" MEDIA = %.5f %n",mediaAluno);
			
	//Fim do metodo main
	}
}
