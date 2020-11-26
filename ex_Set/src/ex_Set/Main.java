package ex_Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Sera que pode fazer uma Array de Set?
		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		System.out.println("Quantos estudantes do curso A: ");
		int n = sc.nextInt();
		for(int i = 1; i<=n; i++) {
			System.out.print("Adicionando o estudante # " + i + " do curso A, \nInsira matricula: ");
			int numero = sc.nextInt();
			a.add(numero);
		}
		
		System.out.println("Quantos estudantes do curso B: ");
		n = sc.nextInt();
		for(int i = 1; i<=n; i++) {
			System.out.print("Adicionando o estudante # " + i + " do curso B, \nInsira matricula: ");
			int numero = sc.nextInt();
			b.add(numero);
		}
		
		System.out.println("Quantos estudantes do curso C: ");
		n = sc.nextInt();
		for(int i = 1; i<=n; i++) {
			System.out.print("Adicionando o estudante # " + i + " do curso C, \nInsira matricula: ");
			int numero = sc.nextInt();
			c.add(numero);
		}
		
		//a variavel total está  sendo instanciado pela classe HashSet que serva para 
		Set<Integer> total = new HashSet<>(a);
		total.addAll(b);
		total.addAll(c);
		
		System.out.println("Total de estudantes: " + total.size());
		sc.close();

	}

}
