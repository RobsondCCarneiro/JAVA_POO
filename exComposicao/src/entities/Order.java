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
	
	//Aqui serve para cocatenar todas as variaveis e retornar como String para fora dessa classe que estah se comportando como uma funcao
	//O append serve apenas para cocatenar tudo em uma variavel para depois retornar, poderia cocatenar tudo linha de return.
	//O append eh usado preferencialmente quando ha LISTA/ARRAY ja que pode fazer um laco e cocatenando independentemente do tamanho da LISTA/ARRAY
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Momento do pedido: ");
		sb.append(sdf.format(momento) + "\n");
		sb.append("Estado do pedido: ");
		sb.append(status + "\n");
		sb.append("Cliente: ");
		sb.append(cliente + "\n");
		sb.append("Pedido dos itens: \n");
		
		//Nesse for each, OrderItem eh a classe, item eh o apelido e itens eh a variavel instanciado
		for(OrderItem item : itens) {
			sb.append(item + "\n");
		}
		sb.append("Preco total: $ ");
		
		//Esse metodo eh para pegar um float para transforma-lo em uma String, com precisao de duas casas decimais
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
	
	
	
}
