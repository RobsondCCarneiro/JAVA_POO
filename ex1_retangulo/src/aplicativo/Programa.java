package aplicativo;

import java.util.Locale;
import java.util.Scanner;

import entidade.Retangulo;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo x;
		x = new Retangulo();
		System.out.println("Entre rectangle width and height: ");
		x.b = sc.nextDouble();
		x.h = sc.nextDouble();
		
		System.out.printf("%nAREA = %.2f", x.area());
		System.out.printf("\nPERIMETER = %.2f", x.perimetro());
		System.out.printf("%nDIAGONAL = %.2f", x.diagonal());
		
		sc.close();
	}

}
