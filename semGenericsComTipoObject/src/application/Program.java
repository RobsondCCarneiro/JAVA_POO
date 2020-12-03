package application;

import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PrintService ps = new PrintService();
		
		/*
		 * Quando eu adiciono o tipo String numa lista de inteiros
		 * o programa nao iria reclamar, porem no momento da impressao
		 * o programa ira exibir erros
		 */
		ps.addValue("Maria");
		
		System.out.println("Quantos valores? ");
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			Integer value = sc.nextInt();
			ps.addValue(value);
		}
		ps.print();
		//precisei fazer um cast
		Integer x = (Integer) ps.first();
		System.out.println("First " + x);
		sc.close();

	}

}
