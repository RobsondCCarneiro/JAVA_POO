package entities;

public class CurrencyConverter {
	public double dollar, cotacaoDollar, iof;
	
	public double conversor() {
		iof = dollar*cotacaoDollar*0.06;
		return dollar*cotacaoDollar+iof;
	}
}
