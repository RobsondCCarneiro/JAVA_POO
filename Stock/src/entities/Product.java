package entities;

public class Product {
	//Aqui sao os atributos
	public String name;
	public double price;
	public int quantity;
	
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
