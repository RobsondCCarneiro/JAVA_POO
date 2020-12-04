package application;

import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PrintService<Integer> ps = new PrintService<Integer>();
		
		System.out.print("Quantos valores? (Insira numeros inteiros)");
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			int value = sc.nextInt();
			ps.addValue(value);
		}
		
		ps.print();
		Integer x = ps.first();
		System.out.println("primeiro: " + x);
		
		
		/*
		 * Com o generics, eh possivel reaproveitar a classe 
		 * que tem os mesmo metodos.
		 */
		PrintService<String> pss = new PrintService<String>();
		System.out.print("Quantos valores? (insira Strings)");
		int m = sc.nextInt();
		
		for(int i = 0; i<m; i++) {
			String value = sc.next();
			pss.addValue(value);
		}
		
		pss.print();
		System.out.println("primeiro: " + pss.first());
		
		sc.close();


	}

}
