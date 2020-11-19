package program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Application {

	public static void main(String[] args) throws ParseException{
		//instanciado sdf na classe nativa do JAVA o SimpleDateFormat, para receber datas no formato comum no Brasil
		final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		//Isto serve para imprimir com ponto ao invés de vírgulas.
		Locale.setDefault(Locale.US);
		
		//Instanciando a classe que ira receber e processar o que o usuario digita no teclado
		Scanner sc = new Scanner(System.in);
		
		//Lista que se comportam como vetor, para receber sem precisar declarar o tamanho (caso fosse um vetor, teria que impor um tamanho fixo)
		List<Product> list = new ArrayList<>();
		
		//Recebendo do usuario a quantidade de dados que ele quer colocar, mas nao era necessario, 
		//porque eu podia fazer um sistema que o usuário escolheria no final para sair
		System.out.println("Entre com a quantidade de produtos: ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			System.out.println("Produto #" + i + "dados: ");
			System.out.print("Comum, usado ou importado (c/u/i)?");
			char ch = sc.next().charAt(0); //'ch' so recebe o primeiro caractere que o usuario digitou
			sc.nextLine(); //Isso eh para passar para a proxima linha, ja que a tela bugaria e nao sairia se nao tivesse colocado
			System.out.print("Nome: ");
			String nome = sc.nextLine(); //'nome' recebe tudo que o usuario digitar ate precionar o ENTER
			System.out.println("Preco: ");
			Double preco = sc.nextDouble(); //'preco' recebe apenas valores em double que o usuario digitou
			
			if(ch == 'i') {
				System.out.print("Alfandega: ");
				Double alfandega = sc.nextDouble();
				list.add(new ImportedProduct(nome, preco, alfandega)); //adicionando na lista que eh do tipo "Product", mas como "ImportProduct" herda dessa classe, pode ser instanciado aqui
			}
			else if(ch == 'u') {
				System.out.println("Data de fabricacao: ");
				Date date = sdf.parse(sc.next());
				list.add(new UsedProduct(nome, preco, date)); //adicionando na lista que eh do tipo "Product", mas como "UsedProduct" herda dessa classe, pode ser instanciado aqui
			}
			else {
				list.add(new Product(nome, preco)); //adicionando na lista
				//Isso acima seria uma simplificacao que poderia tambem fazer desse jeito
				/*
				 * Product variavel = new Product(nome, preco);
				 * list.add(variavel);
				 * */
			}
		}
		
		//Aqui esta lendo tudo o que estiver na lista e imprime para o usuario
		System.out.println("\nEtiquetas de precos: ");
		for (Product produto : list) {
			System.out.println(produto.priceTag());
		}
		
		sc.close();

	}

}
;