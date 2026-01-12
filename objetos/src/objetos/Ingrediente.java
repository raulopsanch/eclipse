package objetos;

import java.text.DecimalFormat;

public class Ingrediente {
	private String nombre;
	private double precio;
	
	public Ingrediente(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getPrecio() {
		return this.precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public double calcularCoste(double cantidad) {
		return this.precio * cantidad;
	}
	
	public void mostrarInfo() {
		System.out.println("El " + this.nombre + " tiene un precio de " + 
				this.precio + "€.");
	}
	
	@Override
	public String toString() {
		return this.nombre + ", precio " + this.precio;
	}
	

	public static void main(String[] args) {
		Ingrediente ingrediente1 = new Ingrediente("Aceite", 16.80);
		Ingrediente ingrediente2 = new Ingrediente("Arroz", 1.50);
		
		//Mostar información con mostrarInfo()
		ingrediente1.mostrarInfo();
		ingrediente2.mostrarInfo();
		
		System.out.println();
		DecimalFormat df = new DecimalFormat("#.##");
		
		// Mostrar coste de 1.3 de aceite y 2.8 de arroz
		double costeAceite = ingrediente1.calcularCoste(1.3);
		double costeArroz = ingrediente2.calcularCoste(2.8);
		
		System.out.println("El coste de 1.3 de aceite es: " + df.format(costeAceite));
		System.out.println("El coste de 2.8 de arroz es: " + df.format(costeArroz));
		
		System.out.println();
		
		// Mostrar informacíon con toString()
		System.out.println(ingrediente1);
		System.out.println(ingrediente2);

	}

}
