package entidades;

/*
 * Como o circulo uso um método abstrato area() que pertence a interface Forma, então
 * o circulo deve implementar a interface (que funciona como um contrato) 
 */
public class Circulo implements Forma{

	private double raio;
	
	public Circulo(double raio) {
		super();
		this.raio = raio;
	}
	
	

	public double getRaio() {
		return raio;
	}



	public void setRaio(double raio) {
		this.raio = raio;
	}

/*
 * Precisei sobreescrever o metodo de area, isso eh padrao no JAVA
 */
	@Override
	public double area() {
		return Math.PI * raio * raio;
	}


/*
 * Sobreescrevendo o hashCode.
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(raio);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
*/


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circulo other = (Circulo) obj;
		if (Double.doubleToLongBits(raio) != Double.doubleToLongBits(other.raio))
			return false;
		return true;
	}
	
	

}
