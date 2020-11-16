package entities;

public class Product {

	private String nome;
	private Double preco;
	
	public Product() {
		
	}

	public Product(String nome, Double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}

	public String getnome() {
		return nome;
	}

	public void setnome(String nome) {
		this.nome = nome;
	}

	public Double getpreco() {
		return preco;
	}

	public void setpreco(Double preco) {
		this.preco = preco;
	}
	
}
