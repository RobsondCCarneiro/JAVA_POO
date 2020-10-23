package aplicativo;

import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionarios;

public class Programa2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Funcionarios emp;
		emp = new Funcionarios();
		System.out.println("\nName: ");
		emp.nome = sc.nextLine();
		System.out.println("\nGross salary: ");
		emp.salarioBruto = sc.nextDouble();
		System.out.println("\nTax: ");
		emp.imposto = sc.nextDouble();
		
		System.out.printf("Employee: %s, $ %.2f%n", emp.nome, emp.salarioLiquido());
		System.out.println("Which percetage to increase salary? ");
		double porc = sc.nextDouble();
		System.out.printf("Update data: %s, %.2f", emp.nome, emp.aumentaSalario(porc));
		sc.close();

	}

}
