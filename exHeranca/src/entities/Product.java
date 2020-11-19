package entities;

public class Product {
	private String nome;
	private Double preco;
	
	//Construtor para a classe Product
	public Product(String nome, Double preco) {
		//super();
		this.nome = nome;
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	//Metodo que retorna com o valor em String para imprimir a etiqueta de precos na classe principal
	public String priceTag() {
		return nome + " $ " + String.format("%.2f", preco);
	}
	
}
