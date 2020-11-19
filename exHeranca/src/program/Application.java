package program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Application {

	public static void main(String[] args) throws ParseException{
		final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		System.out.println("Entre com a quantidade de produtos: ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			System.out.println("Produto #" + i + "dados: ");
			System.out.print("Comum, usado ou importado (c/u/i)?");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.println("Preco: ");
			Double price = sc.nextDouble();
			
			if(ch == 'i') {
				System.out.print("Alfandega: ");
				Double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
			}
			else if(ch == 'u') {
				System.out.println("Data de fabricacao: ");
				Date date = sdf.parse(sc.next());
				list.add(new UsedProduct(name, price, date));
			}
			else {
				list.add(new Product(name, price));
			}
		}
		
		System.out.println("\nEtiquetas de precos: ");
		for (Product produto : list) {
			System.out.println(produto.priceTag());
		}
		sc.close();

	}

}
;