package entidades;

public class DadosBancarios {
	private int idConta;
	private String name;
	private double balance;
	
	
	//Fazendo os construtores
	public DadosBancarios(int number, String name) {
		idConta = number;
		this.name = name;
	}

	public DadosBancarios(int idConta, String name, double initialDeposit) {
		this.idConta = idConta;
		this.name = name;
		deposit(initialDeposit);
	}

	//Fazendo os metodos get e set
	public int getIdConta() {
		return idConta;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	//metodo para depositar
	public void deposit(double amount) {
		balance  += amount;
	}
	
	//metodo para sacar
	public void withdraw(double amount) {
		balance -= (amount+5.0);
	}

	//Esse metodo eh para imprimir la na tela de forma que nao precise repetir no main
	public String toString() {
		return "Account " +  idConta + ", Holder: " + name + ", Balance: $ " + String.format("%.2f", balance);
	}

	
	
}
