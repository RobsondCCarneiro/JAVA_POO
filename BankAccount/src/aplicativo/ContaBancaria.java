package aplicativo;

import java.util.Locale;
import java.util.Scanner;

import entidades.DadosBancarios;

public class ContaBancaria {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DadosBancarios account;
		
		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		System.out.println("Enter account holder: ");
		//Sempre que foi colocar nextInt, antes de nextLine precisa colocar um extra para obriga ao sistema andar o cursor
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.println("Is there an initian deposit (y/n)? ");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.println("enter Initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new DadosBancarios(number, holder, initialDeposit);
			
		}
		else {
			account = new DadosBancarios(number, holder);
		}
		System.out.println("\nAccount data: ");
		System.out.println(account);
		
		System.out.println("\nEnter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("\nAccount data: ");
		System.out.println(account);
		
		
		System.out.println("\nEnter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("\nAccount data: ");
		System.out.println(account);
		
		sc.close();
	}

}
