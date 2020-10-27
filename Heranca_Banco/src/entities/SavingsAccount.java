package entities;
//Para a SavingsAccount não permitir que os métodos sejam herdadas por outras classe coloque "final"
//final: serve tanto para classes como para métodos!
public final class SavingsAccount extends Account{
	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	//Fazendo a sobreposição, nesse caso, é quando o saque é na poupança não é cobrado a taxa de R$ 5, enquanto a outra é cobrado.
	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}
	//Como é herança da Classe Account, então ele vai sobreescrever o método withdraw(), porque é uma exceção para o caso da poupança.
	
}
