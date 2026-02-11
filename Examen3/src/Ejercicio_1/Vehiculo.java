package Ejercicio_1;

public class Vehiculo {
	private String color;
	private String tipo;
	
	public Vehiculo(String tipo, String color) {
		this.color = color;
		this.tipo = tipo;
	}
	
	public String getcolor() {
		return this.color;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public String queSoy() {
		return "Es un vehículo "+ this.tipo + " de color " + this.color;
	}

}
