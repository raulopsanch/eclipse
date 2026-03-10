package trabajo_documentacion;

/**
 * <p>Clase que representa un producto disponible en el sistema de
 * comercio electrónico.
 * Cada produtco tiene un nombre y un precio asociado.</p>
 * 
 * @author Raúl López
 * @version 1.0
*/
public class Producto {
	private String nombre;
	private double precio;
	
	/**
	 * <p>Constructor por defecto de la clase Producto</p>
	 * @param nombre Nombre del producto
	 * @param precio Precio del producto
	*/
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	
	/**
	 * <p>Obtiene el nombre del producto</p>
	 * @return nombre del producto
	 */
	public String getNombreProducto() {
		return this.nombre;
	}
	
	
	/**
	 * <p>Obtiene el precio del producto</p>
	 * @return precio del producto
	 */
	public double getPrecioProducto() {
		return this.precio;
	}
	
	
	/**
	 * <p>Establece un nuevo precio para el producto</P>
	 * @param newPrecio
	 */
	public void setPrecioProducto(double newPrecio) {
		this.precio = newPrecio;
	}
	
	
	/**
	 * <p>Devuelve una representación en String del producto</p>
	 * 
	 * @return información formateada del producto
	 */
	@Override
	public String toString() {
		return "\nNombre : " + this.nombre + "\nPrecio: " + this.precio + "€";
	}
	
}
