package servicos;

import java.util.Calendar;
import java.util.Date;

import entidades.Contrato;
import entidades.Parcelas;

public class ContratoServico {
	//Nao compor o PayPalService diretamente no ContratoServico
	//Porque quando quiser modificar o PayPalService, seria necessario o modificar aqui em ContratoServico
	//O exemplo de auto-acomplamento
	// private PaypalService paypalService = new PaypalService();
	
	//Exemplo de inversao de controle
	//Nunca deixar a classe responsavel pelo controle de instancia de outras classes, tem que deixar o agente externo entregar a instancia
	
	//Declara com o tipo da interface, nao com o tipo especifico
	private ServicoPgtoOnline servicoPgtoOnline;
	
	public ContratoServico(ServicoPgtoOnline servicoPgtoOnline) {
		this.servicoPgtoOnline = servicoPgtoOnline;
	}
	
	public void processaContrato(Contrato contrato, int meses) {
		double contaBasica = contrato.getTotalValor()/meses;
		for(int i =1 ; i<=meses; i++) {
			double contaAtualizada = contaBasica + servicoPgtoOnline.juros(contaBasica, i);
			double contaFinal = contaAtualizada + servicoPgtoOnline.taxaPgto(contaAtualizada);
			Date dataVenc = addMeses(contrato.getData(), i);
			contrato.getParcelas().add(new Parcelas(dataVenc, contaFinal));
		}
	}
	
	private Date addMeses(Date data, int N) {
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(data);
		calendario.add(Calendar.MONTH, N);
		return calendario.getTime();
	}
}
