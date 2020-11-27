package servicos;

public class PaypalService implements ServicoPgtoOnline{

	//constante para quando precisar alterar, nao ficar olhando cada atributo que precisa desse.
	private static final double TAXA_PGTO = 0.02;
	
	private static final double JUROS_MENSAIS = 0.01;
	@Override
	public double taxaPgto(double quantidade) {
		return quantidade*TAXA_PGTO;
	}

	@Override
	public double juros(double quantidade, int meses) {
		
		return quantidade*meses*JUROS_MENSAIS;
	}

}
