package aplicativo;

import java.util.ArrayList;
import java.util.List;

import entidades.Circulo;
import entidades.Forma;
import entidades.Retangulo;
import entidades.Triangulo;

public class Programa {

	/*
	 * testando o hashCode, quando não sobreescreve o método dentro da classe,
	 * dará hashCode diferentes mesmo quando os atributos são iguais.
	 * 
	public static void main(String[] args) {
		Circulo circulo1 = new Circulo(2.0);
		Circulo circulo2 = new Circulo(2.0);
		
		System.out.println(circulo1.hashCode());
		System.out.println(circulo2.hashCode());
	}*/
	
	/*
	 * testando os hashCode
	 * Quando instanciados, mesmo com o mesmo valor no parametro
	 * o HashCode vai dar diferente por causa do endereço de memória.
	 * Então é necessário sobreescrever o método dentro da classe para
	 * que possa utilizar o HashCode que retorna números iguais quando
	 * os elementos são iguais.
	 * 
	 * Sem instanciar o HashCode dá igual.
	public static void main(String[] args) {
		String nome1 = new String("robson");
		String nome2 = "robson";
		
		Integer i = 10;
		
		
		System.out.println(nome1 == nome2);
		
		System.out.println(nome1.equals(nome2));
		System.out.println(nome1.hashCode());
		System.out.println(nome2.hashCode());
	}
	*/
	public static void main1(String[] args) {
		//Criando uma lista do tipo forma
		List<Forma> figura = new ArrayList<>();
		//Adicionando elementos nessa lista que foi instanciado em figura
		figura.add(new Retangulo(3.0, 2.0));
		figura.add(new Circulo(2.0));
		figura.add(new Triangulo(2.0, 2.0));
		
		System.out.println(figura.hashCode());
		
		for(Forma fig : figura) {
			System.out.print("A area de 'figura' adicionada é: ");
			System.out.println(fig.area());
		}
		
		System.out.println("A area total dos elementos guardado em 'figura' é: " + areaTotal(figura));
		
		
		//Posso criar uma lista apenas com circulos.
		System.out.println("\n ***** Criando outra lista apenas com circulo");
		List<Circulo> circulos = new ArrayList<>();
		circulos.add(new Circulo(2.0));
		circulos.add(new Circulo(3.0));
		for(Circulo cir : circulos) {
			System.out.print("A area de 'circulos' adicionados é: ");
			System.out.println(cir.area());
		}
		System.out.println("A area total dos elementos guardado em 'circulos' é: " + areaTotal(circulos));

	}
	/*
	 * O compilador reclamaria se nao houvesse uma delimitação no curinga da lista,
	 * desta forma foi necessário colocar Forma para permetir todo subtipo de Forma
	 * (superclasse abstrata que estava sendo uma interface, pois todas as figuras têm area),
	 * que nesse caso seria Retangulo e Circulo.
	 */
	public static double areaTotal(List <? extends Forma> lista) {
		double soma = 0;
		
		/*
		 * Coloquei curinga delimitado por causa da area, se fosse só para imprimir a lista
		 * não era necessário usar "entends Forma".
		 */
		for (Forma f : lista) {
			soma += f.area();
		}
		return soma;
	}
	/*
	 * Lembre-se que List<Forma> não é um supertipo de 
	 * List<Retangulo>, Lista<Triangulo> e List<Circulo>
	 * apesar que Forma é um supertipo de Retangulo, Triangulo e Circulo.
	 */

}
