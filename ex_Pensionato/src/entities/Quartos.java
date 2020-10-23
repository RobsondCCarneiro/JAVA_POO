package entities;

public class Quartos {
	private String name, Email;
	
	
	
	public Quartos(String name, String email) {
		super();
		this.name = name;
		Email = email;
	}
	//Metodos get e set
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
}
