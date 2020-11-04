package model.entities;

import model.exceptions.DomainException;

public class Account {
	private int number;
	private String holder;
	private double balance;
	private double withdrawLimit;
	
	//Construtor da classe Account
	public Account(int number, String holder, double balance, double withdrawLimit) {
		//super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	//método para depositar uma quantidade dada pelo usuário
	public void deposit(double amount) {
		balance += amount;
	}
	/* método para o saque, primeiro tratando as exceções para os seguintes casos:
	 * se não houver saldo na conta, ou se o valor do saque for superior ao limite de saque da conta
	 */
	public void withdraw(double amount) {
		if(amount > withdrawLimit) {
			//Serve para lançar uma mensagem na DomainException (criada por mim) para que o sistema possa tratar a exceção por essa classe
			throw new DomainException("The amount exceeds withdraw limit");
		}
		if(amount > balance) {
			throw new DomainException("Not enough balance");
		}
		balance -= amount;
	}
	
}
