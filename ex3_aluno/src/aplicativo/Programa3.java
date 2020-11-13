//Este exercicio foi atualizado, colocado encapsulamento e sobrecarga

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
		
		
		Aluno aluno1 = new Aluno(n1, n2, n3, nome);
		Aluno aluno2 = new Aluno(n1, n2, nome);
		
		System.out.println("O aluno 1: " + aluno1.getNome());
		System.out.printf("NOTA FINAL = %.2f\n", aluno1.getMedia());
		if(aluno1.getMedia() < 6.0) {
			System.out.printf("RECUPERACAO\nFALTANDO %.2f PONTOS", 6.0 - aluno1.getMedia());
			System.out.println();
			System.out.printf("na RECUPERACAO precisa de: %.2f", 12.0 - aluno1.getMedia());
			System.out.println();
			System.out.println("nota de recuperacao: ");
			double nrec = sc.nextDouble();
			aluno1.media(nrec);
			if(aluno1.getMedia() < 6.0)
				System.out.println("REPROVADO!!!");
			else
				System.out.println("APROVADO!!!");
		}
		else {
			System.out.println("APROVADO!");
		}
		
		System.out.println("O aluno 2: " + aluno2.getNome());
		System.out.printf("NOTA FINAL = %.2f\n", aluno2.getMedia());
		if(aluno2.getMedia() < 6.0) {
			System.out.printf("RECUPERACAO\nFALTANDO %.2f PONTOS", 6.0 - aluno2.getMedia());
			System.out.println();
			System.out.printf("na RECUPERACAO precisa de: %.2f", 12.0 - aluno2.getMedia());
			System.out.println();
			System.out.println("NOTA DE RECUPERACAO: ");
			double nrec = sc.nextDouble();
			aluno2.media(nrec);
			if(aluno2.getMedia() < 6.0)
				System.out.println("REPROVADO!!!");
			else
				System.out.println("APROVADO!!!");
		}
		else {
			System.out.println("APROVADO!");
		}
		
		sc.close();

	}

}
