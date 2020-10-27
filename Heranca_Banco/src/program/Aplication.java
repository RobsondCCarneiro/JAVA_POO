package program;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Aplication {

	public static void main(String[] args) {
		//A partir daqui é da aula de Downcasting e Upcastring
		/*Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		//Como BusinessAcount tambem eh um Account, entao nao ha problema em atribuir um objeto da BusinessAcount para um Account.
		//UPCASTING: eh converter um objeto da subclasse para a superclasse
		Account acc1 = bacc;
		acc1.getBalance();
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		//DOWNCASTING: eh converter um objeto da superclasse para a subclasse.
		BusinessAccount acc4 = (BusinessAccount)acc2;
		//Precisei forcar o casting para aceitar o acc2 que eh tipo Account em acc4 que eh BusinessAccount
		acc4.loan(100.0); //para aceitar o loan tive que fazer o downcasting, pois eh um metodo de BusinessAccount.
	
		//Nem todas as variaveis aceitam o Downcasting para isso eh necessario testar
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Loan!");
		}*/
		//A partir daqui é o que ele escreveu sobre a aula de sobreposição
		Account acc1 = new Account(1001, "Alex", 1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
		
		Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
	}

}
