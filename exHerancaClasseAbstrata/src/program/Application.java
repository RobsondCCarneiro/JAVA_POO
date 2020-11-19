package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas desejas consultar? ");
		int n = sc.nextInt();
		
		List<TaxPayer> list = new ArrayList<>();
		
		for(int i = 1; i<=n; i++) {
			System.out.print("Pessoa física (PF) ou Pessoa Jurídica (PJ)");
			char ch = sc.next().charAt(1);
			sc.nextLine();
			System.out.println("Digite o nome: ");
			String name = sc.nextLine();
			System.out.print("Digite a renda anual: ");
			Double anualIncome = sc.nextDouble();
			
			if(ch == 'F') {
				System.out.println("Digite o gasto com saúde: ");
				Double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpenditures));
			}
			
			if(ch == 'J') {
				System.out.print("Digite a quantidade de empregados: ");
				Integer numberOfEmployees = sc.nextInt();
				list.add(new Company(name, anualIncome, numberOfEmployees));
			}
		}
		
		double sum = 0.0;
		System.out.println("Pagadores de imposto: ");
		for(TaxPayer payer : list) {
			double tax = payer.tax();
			System.out.println(payer.getName() + ": $ " + String.format("%.2f", tax));
			sum += tax;
		}
		
		System.out.println("\nTotal de impostos: $ " + String.format("%.2f", sum));
		sc.close();
	}

}
