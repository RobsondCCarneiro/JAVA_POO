package aplicativo;

import java.util.Locale;
import java.util.Scanner;

import entidades.Aluno;

public class Programa3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
		aluno.nome = sc.nextLine();
		aluno.n1 = sc.nextDouble();
		aluno.n2 = sc.nextDouble();
		aluno.n3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f\n", aluno.media());
		if(aluno.media() < 60) {
			System.out.printf("FAILED\nMISSING %.2f POINTS", 60.0 - aluno.media());
		}
		else {
			System.out.println("PASS");
		}
		sc.close();

	}

}
