package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		//Instanciando sc para a classe estatica Scanner para receber dados do usuario
		Scanner sc = new Scanner(System.in);
		
		//Colocando o formato da data para ser dia-mes-ano
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do cliente: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("E-mail: ");
		String email = sc.nextLine();
		System.out.print("Data de nascimento (dd/MM/aaaa): ");
		Date dataNasc = sdf.parse(sc.next());
		
		Client cliente = new Client(nome, email, dataNasc);
		
		System.out.println("entre com os dados do pedido: ");
		System.out.print("Status: ");
		//instanciando 'status' numa classe enumerada que eh mais facil de organizar valores possiveis, 
		//inclusive sendo mais facil de modificar, aqui ja pega o valor que o cliente passou pelo teclado
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		//instanciando 'pedido' com a data atual e o status e dados do cliente
		Order pedido = new Order(new Date(), status, cliente);
		
		System.out.println("Quantos itens para este pedido? ");
		int n = sc.nextInt();
		for(int i = 1; i<=n; i++) {
			System.out.println("Entre #" + i + " dado do item: ");
			System.out.println("Nome do produto: ");
			sc.nextLine();
			String nomeProduto = sc.nextLine();
			System.out.println("Preco do produto: ");
			double precoProduto = sc.nextDouble();
			
			Product produto = new Product(nomeProduto, precoProduto);
			
			System.out.println("Quantidade: ");
			int quantidade = sc.nextInt();
			
			OrderItem orderItem = new OrderItem(quantidade, precoProduto, produto);
			
			pedido.addItem(orderItem);
			
		}
		
		System.out.println("\nRESUMO DO PEDIDO: ");
		System.out.println(pedido);
		
		sc.close();
	}

}
