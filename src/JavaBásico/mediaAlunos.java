package JavaBásico;
import java.util.Scanner;


public class mediaAlunos {
	//Bloco de variáveis
	private static Double notaA, notaB, notaC, mediaAluno;
	//Criação do Scanner
	static Scanner leia = new Scanner(System.in);
	
		public static void main (String[]args) {
		//Começo do metodo main
			System.out.println("=============== Bem Vindo Caro aluno ===============");
			System.out.println(" Informe a primeira nota do aluno: ");
			notaA= leia.nextDouble();
			System.out.println("");
			System.out.println(" Informe a segunda nota do aluno: ");
			notaB= leia.nextDouble();
			System.out.println("");
			System.out.println(" Informe a terceira nota do aluno: ");
			notaC= leia.nextDouble();
			System.out.println("");
			mediaAluno = ((notaA*2)+(notaB*3)+(notaC*5)/3);
			System.out.println(" MEDIA = "+mediaAluno);
			System.out.println("");
	//Fim do metodo main
	}
}
