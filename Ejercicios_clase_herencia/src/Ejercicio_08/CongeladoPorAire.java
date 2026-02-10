package Ejercicio_08;

public class CongeladoPorAire extends ProductoCongelado {
	public CongeladoPorAire(String fechaEnvasado, String numLote, String paisOrigen, 
			String fechaCaducidad, double temperatura) {
		super(fechaEnvasado, numLote, paisOrigen, 
				fechaCaducidad, temperatura);
	}
	
	@Override
	public String toString() {
		return "Congelado por aire:" + super.toString();
	}
}
