package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {

	//Metodo para manter a data no formato dd/MM/aaaa
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private String nome;
	private String email;
	private Date dataNasc;
	

	//Construtor
	public Client(String nome, String email, Date dataNasc) {
		//super();
		this.nome = nome;
		this.email = email;
		this.dataNasc = dataNasc;
	}

	//Gerado os get e set para acessar as variaveis por outras classes
	public String getnome() {
		return nome;
	}

	public void setnome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getdataNasc() {
		return dataNasc;
	}

	public void setdataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	@Override
	public String toString() {
		return nome + " (" + sdf.format(dataNasc) + ") - " + email;
	}
}
