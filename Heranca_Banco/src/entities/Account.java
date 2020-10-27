package entities;

public class Account {
	private Integer number;
	private String holder;
	//private Double balance;
	protected Double balance;
	//Quando coloco o protected, posso acessar 'balance' pela subclasse, porém nao permite que acessa por fora
	
	public Account() {
		
	}

	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}
	
	//A paritr daqui foi a aula de sobreposição
	public void withdraw(double amount) {
		//Quando o saque tem uma taxa de R$ 5
		balance -= amount + 5.0;
	}
	public void deposit(double amount) {
		balance += amount;
	}
	
}
