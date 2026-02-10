package Ejercicio_08;

public class ProductoFresco extends Producto {
	public ProductoFresco(String fechaEnvasado, String numLote, String paisOrigen, String fechaCaducidad) {
		super(fechaEnvasado, numLote, paisOrigen, fechaCaducidad);
	}
	
	@Override
	public String toString() {
		return "Producto fresco:" + super.toString();
	}
}
