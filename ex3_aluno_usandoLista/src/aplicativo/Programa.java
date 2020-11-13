package aplicativo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Aluno;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Aluno> list = new ArrayList<>();
		
		System.out.println("Quantos alunos serao registrados: ");
		int n = sc.nextInt();
		
		//Laco para instanciar cada aluno numa lista
		
		//Parte 1 - lendo dados
		for(int i=1; i<n; i++) {
			System.out.println();
			System.out.println("Aluno #" + i + ": ");
			Integer id = i;
			
			System.out.println("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("nota 1: ");
			double n1 = sc.nextDouble();
			System.out.println("nota 2: ");
			double n2 = sc.nextDouble();
			
			list.add(new Aluno(n1, n2, nome, id));
		}
		
		//Part 2 - 
		
		sc.close();

	}

}
