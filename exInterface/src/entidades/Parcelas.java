package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Parcelas {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date dataVenc;
	private Double quantidade;
	
	public Parcelas() {
		
	}

	public Parcelas(Date dataVenc, Double quantidade) {
		super();
		this.dataVenc = dataVenc;
		this.quantidade = quantidade;
	}

	public Date getDataVenc() {
		return dataVenc;
	}

	public void setDataVenc(Date dataVenc) {
		this.dataVenc = dataVenc;
	}

	public Double getquantidade() {
		return quantidade;
	}

	public void setquantidade(Double quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return sdf.format(dataVenc) + " - " + String.format("%.2f", quantidade);
	}
	
	
}
