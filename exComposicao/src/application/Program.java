package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do cliente: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("E-mail: ");
		String email = sc.nextLine();
		System.out.print("Data de nascimento (dd/MM/aaaa): ");
		Date aniversario = sdf.parse(sc.next());
		
		Client cliente = new Client(nome, email, aniversario);
		
		System.out.println("entre com os dados do pedido: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order pedido = new Order(new Date(), status, cliente);
		
		System.out.println("Quantos itens para este pedido? ");
		
		sc.close();
	}

}
