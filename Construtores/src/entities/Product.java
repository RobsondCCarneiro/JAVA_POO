package entities;

public class Product {
	//Aqui sao os atributos
	/*//Para proteger o sistema, ha o encapsulamento, ou seja, declarando as variaveis privadas
	* public String name;
	* public double price;
	* public int quantity;
	*/
	private String name;
	private double price;
	private int quantity;
	
	//Agora fazendo o construtor (funcao para obrigar a dar valor as instancias no lugar do default)
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//Agora fazendo sobrecarga que eh um construtor com o mesmo nome, mas tem parametro diferente
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	//Tambem posso colocar o construtor padrao, assim pode-se também instanciar a classe como é feito normalmente por padrão
	public Product() {
		
	}
	
	//Apos os construtores (metodos), vou fazer os metodos para acessar os atributos (variaveis)
	public String getName(){
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	/*public void setQuantity(int quantity) {
		this.quantity = quantity;
	} //apenas o getQuantity eh para ser utilizado */
	
	//Aqui sao os metodos (funcao)
	public double totalValueinStock() {
		return price * quantity;
	}
	public void addProducts(int quantity) {
		/*O this serve para dizer que a variavel eh o 
		 * atributo ao inves de ser o parametro da funcao (metodo)
		 * 
		 * Ou seja: o (atributo quantity) += (parametro quantity)
		 */
		this.quantity += quantity;
	}
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	/*Isso serve para sobrepor o toString padrao do Object
	 *ou seja, quando for imprimir, a variavel em String diretamente
	 */
	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity
				+ " units, Total: $ " +  String.format("%.2f", totalValueinStock());
	}
	
}
