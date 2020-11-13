package entidades;

public class Aluno {
	private double media;
	private String nome;
	
	
	public void media(double n1, double n2, double n3){
		if(n1>=0.0 && n2>=0.0 && n3>=0.0 && n1<=100.0 && n2<=100.0 && n3<=100.0) {
			//O problema original eh por soma, enquanto eu fiz por media ponderada
			this.media = (n1*30.0 + n2*35.0 + n3*35.0)/100.0;
		}
		else
			System.out.println("entrada invalida!");
	}
	
	//Sobrecarga do metodo media
	public void media(double n1, double n2){
		if(n1>=0.0 && n2>=0.0 &&  n1<=100.0 && n2<=100.0) {
			//O problema original eh por soma, enquanto eu fiz por media ponderada
			this.media = (n1*45.0 + n2*55.0)/100.0;
		}
		else
			System.out.println("entrada invalida!");
	}
	//Sobrecarga do metodo media para ser utilizado quando eh necessaria a recuperacao
		public void media(double nrec) {
			media += nrec;
			media /= 2.0;
		}
	
	
	//Construtor com parametros tres notas
	public Aluno(double n1, double n2, double n3, String nome) {
		this.nome = nome;
		media(n1, n2, n3);
	}


	//Sobrecarga do construtor Aluno
	public Aluno(double n1, double n2, String nome) {
		this.nome = nome;
		media(n1, n2);
	}


	public String getNome() {
		return nome;
	}

	
	public double getMedia() {
		return media;
	}
}
