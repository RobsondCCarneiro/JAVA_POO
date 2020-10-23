package entidade;

public class Retangulo {
	public double b, h;
	
	public double area() {
		return b*h;
	}
	public double perimetro() {
		return 2*(b+h);
	}
	public double diagonal() {
		return Math.sqrt((b*b)+(h*h));
	}
}
