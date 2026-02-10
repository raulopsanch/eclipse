package Ejercicio_08;

public class ProductoRefrigerado extends Producto {
	private String codOrganismo;
	
	public ProductoRefrigerado(String fechaEnvasado, String numLote, String paisOrigen, 
			String fechaCaducidad, double temperatura,
			String codOrganismo) {
		super(fechaEnvasado, numLote, paisOrigen, fechaCaducidad, temperatura);
		this.codOrganismo = codOrganismo;
	}
	
	public String getCodOrganismo() {
		return this.codOrganismo;
	}
	
	@Override
	public String toString() {
		return "Producto refrigerado:" + super.toString() + "\nCódigo sanitario: " + this.codOrganismo;
	}
}
