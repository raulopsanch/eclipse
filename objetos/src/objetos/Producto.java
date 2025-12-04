package objetos;

public class Producto {
	String nombre;
	double precio;
	
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
	
	public double precioconIVA() {
		return this.precio * 1.21;
	}
	
	public double incrementar_precio(int porcentaje) {
		double incremento = this.precio * porcentaje / 100;
		return this.precio += incremento;
	}
	

	public static void main(String[] args) {
		Producto producto1 = new Producto("Arroz", 1.25);
		Producto producto2 = new Producto("Patatas", 2.10);
		Producto producto3 = new Producto("Agua", 0.90);
		
		System.out.print("Precio de patatas con IVA: ");
		System.out.println(producto2.precioconIVA());
		
		System.out.println();
		
		System.out.print("Precio de arroz más 15%: ");
		System.out.println(producto1.incrementar_precio(15));
		
		System.out.print("Nuevo precio de arroz con IVA: ");
		System.out.println(producto1.precioconIVA());

		System.out.println();
		
		System.out.print("Precio neto del agua: ");
		System.out.println(producto3.getPrecio());
	}

}
