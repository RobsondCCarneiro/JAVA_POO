package servicos;

//A interface serve como um contrato de forma que tudo que estiver relacionado com ela, devera ter todas essas implementacoes (metodos e atributos)
public interface ServicoPgtoOnline {
	double taxaPgto(double quantidade);
	double juros(double quantidade, int meses);
}
