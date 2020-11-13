package entidades;

public class Aluno {
	private double n1, n2, n3;
	private String nome;
	
	
	//Construtor com parametros
	public Aluno(double n1, double n2, double n3, String nome) {
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
		this.nome = nome;
	}
	
	//Construtor padrao
	public Aluno() {
		
	}


	//Gets e Sets para capturar os valores quando quisesse acessar em qualquer area do codigo
	public double getN1() {
		return n1;
	}
	

	public void setN1(double n1) {
		this.n1 = n1;
	}


	public double getN2() {
		return n2;
	}


	public void setN2(double n2) {
		this.n2 = n2;
	}


	public double getN3() {
		return n3;
	}


	public void setN3(double n3) {
		this.n3 = n3;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double media(){
		if(n1>=0.0 && n2>=0.0 && n3>=0.0 && n1<=100.0 && n2<=100.0 && n3<=100.0) {
			//O problema original eh por soma, enquanto eu fiz por media ponderada
			return (n1*30.0 + n2*35.0 + n3*35.0)/100.0;
		}
		else return -1;
	}
}
