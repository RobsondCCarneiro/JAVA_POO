package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Product product = new Product();
		
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		//product.name = sc.nextLine();
		String name = sc.nextLine(); //Alteracao por causa do construtor
		System.out.println("Price");
		//product.price = sc.nextDouble();
		double price = sc.nextDouble(); //Alteracao por causa do construtor
		//System.out.println("Quantity in stock");
		//product.quantity = sc.nextInt(); Aqui foi antes
		/*
		 * Aqui foi depois de colocar o contrutor
		int quantity = sc.nextInt(); //Alteracao por causa do construtor
		Product product = new Product(name, price, quantity); //Agora instanciando o product como contrutor
		*/
		Product product = new Product(name, price);
		
		//Testando o setName e o getName
		product.setName("Computer");
		System.out.println("Update name: " + product.getName());
		product.setPrice(1200.0);
		System.out.println("Update price: " + product.getPrice());
		//product.setQuantity(10); so eh usado o getQuantity para proteger a qtde de estoque
		System.out.println("Update quantity: " + product.getQuantity());
		
		
		System.out.println();
		//System.out.println(product.name + ", " + product.price + ", " + product.quantity);		
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.println("Enter number of products to be added in stock: ");
		//quantity = sc.nextInt();
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();		
		System.out.println("Update data: " + product);
		
		System.out.println();
		System.out.println("Enter number of products to be removed in stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();		
		System.out.println("Update data: " + product);
		
		sc.close();

	}

}
