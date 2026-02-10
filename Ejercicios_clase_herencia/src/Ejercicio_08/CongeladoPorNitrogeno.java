package Ejercicio_08;

public class CongeladoPorNitrogeno extends ProductoCongelado{
	public CongeladoPorNitrogeno(String fechaEnvasado, String numLote, String paisOrigen, 
			String fechaCaducidad, double temperatura) {
		super(fechaEnvasado, numLote, paisOrigen, 
				fechaCaducidad, temperatura);
	}
	
	@Override
	public String toString() {
		return "Congelado por nitrógeno:" + super.toString();
	}
}
