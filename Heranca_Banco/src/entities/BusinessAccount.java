package entities;

public class BusinessAccount extends Account{
	private Double loanLimit;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if(amount <= loanLimit) {
			//deposit(amount);
			balance += (amount - 10.0);
			//tem uma funcao semelhante a funcao deposit(amount), mas caso eu queira dizer que 
			//o emprestima tem uma taxa de 10,0, eu preciso acessar a variavel balance diretamente
		}
	}
	//A partir daqui foi a aula de sobreposição
	//Aqui ele aproveitou o metodo da superclass (Account) e adicionou mais alguma coisa com a sobreposição
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}
}
