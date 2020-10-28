package entities;

import entities.enums.Color;

public abstract class Shape {
	private Color color;
	

	public Shape(Color color) {
		this.color = color;
	}

	public Shape() {
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	//Foi declarado este metodo porque eh em comum entre as duas outras classes que serao criadas
	public abstract double area();
	
}
