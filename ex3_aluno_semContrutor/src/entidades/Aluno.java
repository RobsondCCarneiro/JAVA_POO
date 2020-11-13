package entidades;

public class Aluno {
	public double n1, n2, n3;
	public String nome;
	
	public double media(){
		if(n1>=0.0 && n2>=0.0 && n3>=0.0 && n1<=100.0 && n2<=100.0 && n3<=100.0) {
			//O problema original eh por soma, enquanto eu fiz por media ponderada
			return (n1*30.0 + n2*35.0 + n3*35.0)/100.0;
		}
		else return -1;
	}
}
