package entidades;

public class Funcionarios {
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	public double aumentaSalario(double porcentagem) {
		double salarioP = salarioBruto*porcentagem/100.0;
		return  salarioLiquido() + salarioP;
	}
}
