package aplicativo;

import java.util.Locale;
import java.util.Scanner;

import entidade.Aluno;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos alunos desejas registrar? ");
		int n = sc.nextInt();
		Aluno[] aluno = new Aluno[n];
		sc.nextLine();
		
		//Instanciando cada elemento num vetor
		
		for(int i = 0 ; i<n ; i++) {
			System.out.println("Digite o nome do aluno: ");
			String nome = sc.nextLine();
			System.out.println("Digite o nota 1 do aluno: ");
			double n1 = sc.nextDouble();
			System.out.println("Digite o nota 2 do aluno: ");
			double n2 = sc.nextDouble();
			sc.nextLine();
			aluno[i] = new Aluno(n1, n2, nome);
		}
		
		for(int i=0; i<n; i++) {
			System.out.println("O aluno 1: " + aluno[i].getNome());
			System.out.printf("NOTA FINAL = %.2f\n", aluno[i].getMedia());
			if(aluno[i].getMedia() < 6.0) {
				System.out.printf("RECUPERACAO\nFALTANDO %.2f PONTOS", 6.0 - aluno[i].getMedia());
				System.out.println();
				System.out.printf("na RECUPERACAO precisa de: %.2f", 12.0 - aluno[i].getMedia());
				System.out.println();
				System.out.println("nota de recuperacao: ");
				double nrec = sc.nextDouble();
				aluno[i].media(nrec);
				if(aluno[i].getMedia() < 6.0)
					System.out.println("REPROVADO!!!");
				else
					System.out.println("APROVADO!!!");
			}
			else {
				System.out.println("APROVADO!");
			}
		}
		
		sc.close();

	}

}
