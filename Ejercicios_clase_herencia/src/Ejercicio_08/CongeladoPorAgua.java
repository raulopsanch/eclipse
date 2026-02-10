package Ejercicio_08;

public class CongeladoPorAgua extends ProductoCongelado {
	public CongeladoPorAgua(String fechaEnvasado, String numLote, String paisOrigen, 
			String fechaCaducidad, double temperatura) {
		super(fechaEnvasado, numLote, paisOrigen, 
				fechaCaducidad, temperatura);
	}
	
	@Override
	public String toString() {
		return "Congelado por agua:" + super.toString();
	}
}
