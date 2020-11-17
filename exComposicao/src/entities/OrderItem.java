package entities;

public class OrderItem {
	private Integer quantidade;
	private Double preco;
	
	//Como a associacao eh de um para um na COMPOSICAO, entao colocamos como uma variavel simples OrderItem vai guardar apenas um Product por vez
	private Product produto;

	public OrderItem(Integer quantidade, Double preco, Product produto) {
		//super();
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Product getProduto() {
		return produto;
	}

	public void setProduto(Product produto) {
		this.produto = produto;
	}
	
	//Adicionando metodo exigido pelo exercicio
	public double subTotal() {
		return preco*quantidade;
	}
	
	
	@Override
	public String toString() {
		return produto.getnome() + " , $ " + String.format("%.2f", preco)
		+", Quantidade: " + quantidade + ", Subtotal: $ "
		+ String.format("%.2f", subTotal());
	}
	
}
