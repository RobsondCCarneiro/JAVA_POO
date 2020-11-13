//Ainda ha pendencias, faco depois

package entidades;

public class Aluno {
	private Double media;
	private String nome;
	
	
	
	public void media(Double n1, Double n2){
		if(n1>=0.0 && n2>=0.0 &&  n1<=100.0 && n2<=100.0) {
			//O problema original eh por soma, enquanto eu fiz por media ponderada
			this.media = (n1*45.0 + n2*55.0)/100.0;
		}
		else
			System.out.println("entrada invalida!");
	}
	//Sobrecarga do metodo media para ser utilizado quando eh necessaria a recuperacao
		public void media(Double nrec) {
			media += nrec;
			media /= 2.0;
		}

	//metodo aluno para lista
	public Aluno(Double n1, Double n2, String nome, Integer id) {
		this.nome = nome;
		media(n1, n2);
	}


	public String getNome() {
		return nome;
	}

	
	public Double getMedia() {
		return media;
	}
}
