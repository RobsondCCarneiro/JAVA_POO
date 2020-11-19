package entities;

public class Product {
	private String name;
	private Double price;
	
	//Construtor para a classe Product
	public Product(String name, Double price) {
		//super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	//Metodo que retorna com o valor em String para imprimir a etiqueta de precos na classe principal
	public String priceTag() {
		return name + " $ " + String.format("%.2f", price);
	}
	
}
