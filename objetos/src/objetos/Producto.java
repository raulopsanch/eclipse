package objetos;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Producto {
	String nombre;
	double precio;
	
	private double redondear(double valor) {
        BigDecimal bd = BigDecimal.valueOf(valor);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
	}
	
	public Producto(String nombre, double precio) {
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
	
	public double precioConIVA() {
		this.precio = redondear(this.precio * 1.21);
		return this.precio;
	}
	
	public double incrementar_precio(double porcentaje) {
		
		this.precio = redondear(this.precio * (1 + (porcentaje / 100)));
		return this.precio;
	}
	
	
	public String mostrarInfo() {
		return this.nombre + ": " + this.precio;
	}
	

	public static void main(String[] args) {
		Producto producto1 = new Producto("Arroz", 1.25);
		Producto producto2 = new Producto("Patatas", 2.10);
		Producto producto3 = new Producto("Agua", 0.90);
		
		
		System.out.println("==== PRODUCTOS INICIALES ====");
		System.out.println("1. " + producto1.mostrarInfo() + "€");
		System.out.println("2. " + producto2.mostrarInfo() + "€");
		System.out.println("3. " + producto3.mostrarInfo() + "€");
		
		System.out.println();

		System.out.print("Precio de patatas con IVA: ");
		System.out.println(producto2.precioConIVA() + "€");
		
		System.out.println();
		
		System.out.print("Precio de arroz más 15%: ");
		double nuevoPrecio = producto1.incrementar_precio(15);
		System.out.println(nuevoPrecio);
		
		System.out.print("Nuevo precio de arroz con IVA: ");
		System.out.println(producto1.precioConIVA());

		System.out.println();
		
		System.out.print("Precio neto del agua: ");
		System.out.println(producto3.getPrecio());
	}

}