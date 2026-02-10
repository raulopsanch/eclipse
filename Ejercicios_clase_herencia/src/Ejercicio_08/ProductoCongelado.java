package Ejercicio_08;

public class ProductoCongelado extends Producto {
	public ProductoCongelado(String fechaEnvasado, String numLote, String paisOrigen, 
			String fechaCaducidad, double temperatura) {
		super(fechaEnvasado, numLote, paisOrigen, 
				fechaCaducidad, temperatura);
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
