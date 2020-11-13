package aplicativo;

import java.util.Locale;
import java.util.Scanner;

import entidades.Aluno;

public class Programa3 {

	public static void main(String[] args) {
		final double nMin = 6.0;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
		System.out.println("Digite o nome do aluno: ");
		aluno.nome = sc.nextLine();
		System.out.println("nota 1: ");
		aluno.n1 = sc.nextDouble();
		System.out.println("nota 2: ");
		aluno.n2 = sc.nextDouble();
		System.out.println("nota 3: ");
		aluno.n3 = sc.nextDouble();
		

		System.out.printf("MEDIA FINAL = %.2f\n", aluno.media());
		if(aluno.media() < nMin) {
			System.out.printf("REPROVADO\nFALTANDO %.2f PONTOS", nMin - aluno.media());
		}
		else {
			System.out.println("APROVADO");
		}
		sc.close();

	}

}
