package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the dollar price? ");
		CurrencyConverter real = new CurrencyConverter();
		real.cotacaoDollar = sc.nextDouble();
		System.out.println("How many dollar will be brought? ");
		real.dollar = sc.nextDouble();
		System.out.printf("Amount to be paid in reais = %.2f", real.conversor());
		sc.close();

	}

}
