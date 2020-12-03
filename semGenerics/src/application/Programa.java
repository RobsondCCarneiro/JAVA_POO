package application;

import java.util.Scanner;

import service.PrintService;
import service.PrintServiceString;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PrintService ps = new PrintService();
		
		System.out.print("Quantos valores? ");
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			int value = sc.nextInt();
			ps.addValue(value);
		}
		
		ps.print();
		System.out.print("primeiro: " + ps.first());
		
		
		/*
		 * Sem o Generics, precisei criar outra classe com os mesmos metodos,
		 * por isso que eh necessario a parametrizacao de generics.
		 * 
		 * Outra possibilidade eh criar uma classe do tipo Onjects, mas isso
		 * pode dar problema como vamos ver a seguir
		 */
		PrintServiceString pss = new PrintServiceString();
		System.out.print("Quantos valores? ");
		int m = sc.nextInt();
		
		for(int i = 0; i<m; i++) {
			String value = sc.next();
			pss.addValue(value);
		}
		
		pss.print();
		System.out.print("primeiro: " + pss.first());
		
		sc.close();

	}

}
