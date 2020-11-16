package entities;

import java.util.Date;

public class Client {

	private String nome;
	private String email;
	private Date aniversario;
	
	//construtor padrao
	public Client() {
		
	}

	//Construtor
	public Client(String nome, String email, Date aniversario) {
		super();
		this.nome = nome;
		this.email = email;
		this.aniversario = aniversario;
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

	public Date getaniversario() {
		return aniversario;
	}

	public void setaniversario(Date aniversario) {
		this.aniversario = aniversario;
	}
	
	
}
