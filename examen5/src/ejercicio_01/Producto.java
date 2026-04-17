package ejercicio_01;

public class Producto {
	private String nombre;
	private double precio;
	private String proveedor;
	
	
	public Producto(String nombre, double precio, String proveedor) {
		this.nombre = nombre;
		this.precio = precio;
		this.proveedor = proveedor;
	}
	
	
	public String getNombre() {
		return this.nombre;
	}
	
	
	public double getPrecio() {
		return this.precio;
	}
	
	
	public String getProveedor() {
		return this.proveedor;
	}
	
	
	@Override
	public String toString() {
		return " | " + this.nombre + " -> " + this.precio;
	}
}
