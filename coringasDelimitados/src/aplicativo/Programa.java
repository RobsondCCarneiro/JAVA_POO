package aplicativo;

import java.util.ArrayList;
import java.util.List;

import entidades.Circulo;
import entidades.Forma;
import entidades.Retangulo;
import entidades.Triangulo;

public class Programa {

	public static void main(String[] args) {
		//Criando uma lista do tipo forma
		List<Forma> figura = new ArrayList<>();
		//Adicionando elementos nessa lista que foi instanciado em figura
		figura.add(new Retangulo(3.0, 2.0));
		figura.add(new Circulo(2.0));
		figura.add(new Triangulo(2.0, 2.0));
		
		
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
