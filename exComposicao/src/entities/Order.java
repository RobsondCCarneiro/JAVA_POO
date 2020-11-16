package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	//Serva para colocar a data no formato que estamos acostumados a usar no Brasil
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date momento;
	private OrderStatus status;
	
	//variaveis da COMPOSICAO
	//A classe Order tem relacao 1 para 1 com a classe Cliente
	private Client cliente;
	//A classe Order tem relacao 1 para muitos com a classe OrderItem
	private List<OrderItem> itens = new ArrayList<>();
	

	//construtor com todos os atributos
	public Order(Date momento, OrderStatus status, Client cliente) {
		//super();
		//obs: o atributo que esta declarado como uma lista nao entra nesse construtor
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getCliente() {
		return cliente;
	}

	public void setCliente(Client cliente) {
		this.cliente = cliente;
	}

	public List<OrderItem> getItens() {
		return itens;
	}

	/*public void setItens(List<OrderItem> itens) {
		this.itens = itens;
	}*/
	
	
	//Adicionando os metodos dado na questao
	public void addItem(OrderItem item) {
		itens.add(item);
	}
	public void removeItem(OrderItem item) {
		itens.remove(item);
	}
	public double total() {
		double soma = 0.0;
		for(OrderItem item: itens) {
			soma += item.subTotal();
		}
		return soma;
	}
	
	
	
}
