package entities;

public class ImportedProduct extends Product {

	//Atributo
	private Double alfandega;

	//Construtor
	public ImportedProduct(String nome, Double preco, Double alfandega) {
		super(nome, preco); //O super vai preencher os atributos que estao na superclasse (classe-mãe).
		this.alfandega = alfandega;
	}

	
	//gets e sets
	public Double getAlfandega() {
		return alfandega;
	}

	public void setAlfandega(Double alfandega) {
		this.alfandega = alfandega;
	}
	
	//metodo que calcula o preco mais a alfandega
	public Double totalPreco() {
		return getPreco() + alfandega;
	}
	
	//Metodo para retornar na classe principal uma string contendo o que teria na etiqueta de precos
	//Aqui eh um exemplo de sobrecarga de metodo, caracterizando um polimorfismo.
	@Override
	public String priceTag() {
		//Como os atributos nome e preco nao sao visiveis aqui, mas como eh uma classe herdeira de Product, entao os metodos getNome() e getPreco() funcionam aqui
		return getNome() + " $ " + String.format("%.2f", totalPreco()) + " (Alfandega: $ " + String.format("%.2f", alfandega) + ")";
	}
}
