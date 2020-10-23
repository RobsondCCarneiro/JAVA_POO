package application;

import java.util.Scanner;

import entities.Quartos;

public class Sistema {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//O pensionato tem 10 quartos
		final int n = 10;
		int nQuarto;
		Quartos estudante[] = new Quartos[n];
		
		System.out.println("Quantos quartos serao alugados: ");
		int quartos = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i<quartos; i++) {
			int j = i+1;
			System.out.println("\nAluguel #" + j);
			System.out.println("Nome do hospede: ");
			String nome = sc.nextLine();
			System.out.println("E-mail do hospede: ");
			String email = sc.nextLine();
			System.out.println("Quarto: ");
			nQuarto = sc.nextInt();
			sc.nextLine();
			estudante[nQuarto] = new Quartos(nome, email);
		}
		System.out.println("Quartos ocupados: \n");
		for(int i = 0; i < n; i++) {
			if(estudante[i] != null)
				System.out.println(i + ": " + estudante[i].getName() + ", " + estudante[i].getEmail());
		}
		
		sc.close();
	}

}
