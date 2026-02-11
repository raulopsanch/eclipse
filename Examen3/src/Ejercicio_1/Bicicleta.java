package Ejercicio_1;

public class Bicicleta extends Vehiculo {
private int marchas;
	
	public Bicicleta(String tipo, String color, int marchas) {
		super(tipo, color);
		this.marchas = marchas;
	}
	
	public int getMarchas() {
		return this.marchas;
	}
	
	@Override
	public String queSoy() {
		return super.queSoy() + "\nConcretamente una bici con " + this.marchas + " marchas";
	}

}
