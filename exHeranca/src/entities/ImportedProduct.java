package entities;

public class ImportedProduct extends Product {

	private Double alfandega;

	public ImportedProduct(String nome, Double preco, Double alfandega) {
		super(nome, preco); //O super vai preencher os atributos que estao na superclasse (classe-mãe).
		this.alfandega = alfandega;
	}

	public Double getalfandega() {
		return alfandega;
	}

	public void setalfandega(Double alfandega) {
		this.alfandega = alfandega;
	}
	
	public Double totalPreco() {
		return getPreco() + alfandega;
	}
	
	@Override
	public String priceTag() {
		//Como os atributos nome e preco nao sao visiveis aqui, mas como eh uma classe herdeira de Product, entao os metodos getNome() e getPreco() funcionam aqui
		return getNome() + " $ " + String.format("%.2f", totalPreco()) + " (Alfandega: $ " + String.format("%.2f", alfandega) + ")";
	}
}
