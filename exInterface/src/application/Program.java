package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.Contrato;
import entidades.Parcelas;
import servicos.ContratoServico;
import servicos.PaypalService;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com os dados do contrato ");
		System.out.print("Numero: ");
		Integer numero = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		Date data = sdf.parse(sc.next());
		System.out.println("Valor do contrato: ");
		Double valorTotal = sc.nextDouble();
		
		Contrato contrato = new Contrato(numero, data, valorTotal);
		
		System.out.print("Entre com a quantidade de parcelas: ");
		int N = sc.nextInt();
		
		ContratoServico cs = new ContratoServico(new PaypalService());
		
		cs.processaContrato(contrato, N);
		
		System.out.println("Parcelas: ");
		//Para cada parcela que houver em contrato, imprima
		for(Parcelas parc : contrato.getParcelas()) {
			System.out.println(parc);
		}
		
		
		sc.close();

	}

}
