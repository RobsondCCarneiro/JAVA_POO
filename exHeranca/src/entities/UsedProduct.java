package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	
	//Fazendo a data ser no formato dia-mes-ano
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	//Atributo
	private Date dataFabricacao;

	//Construtor da classe UsedProduct
	public UsedProduct(String nome, Double preco, Date dataFabricacao) {
		super(nome, preco);
		this.dataFabricacao = dataFabricacao;
	}

	//gets e sets
	public Date getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	
	//Sobrecarga do metodo priceTag, caracterizando como polimorfismo
	@Override
	public String priceTag() {
		return getNome() + " (used) $ " + String.format("%.2f", getPreco()) 
				+ " (data de fabricacao: " + sdf.format(dataFabricacao) + ")";
	}
}
