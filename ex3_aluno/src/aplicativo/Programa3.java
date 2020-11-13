package aplicativo;

import java.util.Locale;
import java.util.Scanner;

import entidades.Aluno;

public class Programa3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("nome do aluno: ");
		String nome = sc.nextLine();
		System.out.println("nota 1: ");
		double n1 = sc.nextDouble();
		System.out.println("nota 2: ");
		double n2 = sc.nextDouble();
		System.out.println("nota 3: ");
		double n3 = sc.nextDouble();
		
		//Instanciando a variavel ponteiro "aluno" da classe "Aluno"
		Aluno aluno = new Aluno(n1, n2, n3, nome);
		
		System.out.printf("NOTA FINAL = %.2f\n", aluno.media());
		if(aluno.media() < 6.0) {
			System.out.printf("REPROVADO\nFALTANDO %.2f PONTOS", 6.0 - aluno.media());
			System.out.println();
		}
		else {
			System.out.println("APROVADO!");
		}
		
		System.out.println("Testando o getN2: ");
		System.out.println(aluno.getN2());
		
		System.out.println("Testando o setN1: ");
		n1 = sc.nextDouble();
		aluno.setN1(n1);
		System.out.println("Saindo o valor de n1:");
		System.out.println(aluno.getN1());
		sc.close();

	}

}
