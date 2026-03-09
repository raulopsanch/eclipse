package trabajo_documentacion;

public class Producto {
	private String nombre;
	private double precio;
	
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	
	public String getNombreProducto() {
		return this.nombre;
	}
	
	
	public double getPrecioProducto() {
		return this.precio;
	}
	
	
	public void setPrecioProducto(double newPrecio) {
		this.precio = newPrecio;
	}
	
	
	@Override
	public String toString() {
		return "\nNombre : " + this.nombre + "\nPrecio: " + this.precio + "€";
	}
	
}
