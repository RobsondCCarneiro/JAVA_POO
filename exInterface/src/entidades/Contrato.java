package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {
	private Integer numero;
	private Date data;
	private Double totalValor;
	
	List<Parcelas> parcelas = new ArrayList<Parcelas>();

	public Contrato() {
		super();
	}

	public Contrato(Integer numero, Date data, Double totalValor) {
		super();
		this.numero = numero;
		this.data = data;
		this.totalValor = totalValor;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getTotalValor() {
		return totalValor;
	}

	public void setTotalValor(Double totalValor) {
		this.totalValor = totalValor;
	}

	public List<Parcelas> getParcelas() {
		return parcelas;
	}

	//Para evitar a troca da lista jah criada e instanciada para o objeto desejado, entao nao havera set para essa lista
	/*public void setParcelas(List<Parcelas> parcelas) {
		this.parcelas = parcelas;
	}*/
	
}
