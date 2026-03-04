package ejercicio_60;

enum Tipos {
	ABIERTO, TECHADO;
}

public class Polideportivo implements InstalacionDeportiva, Edificio{
	private String nombre;
	private int largo;
	private int ancho;
	private Tipos tipo;
	
	public Polideportivo() {
		this.nombre = null;
		this.largo = 0;
		this.ancho = 0;
		this.tipo = null;
	}
	
	
	public Polideportivo(String nombre, int largo, int ancho, Tipos tipo) {
		this.nombre = nombre;
		this.largo = largo;
		this.ancho = ancho;
		this.tipo = tipo;
	}
	
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getLargo() {
		return this.largo;
	}
	
	public int getAncho() {
		return this.ancho;
	}
	
	
	@Override
	public Tipos getTipoDeInstalacion() {
		return this.tipo;
	}
	
	
	@Override
	public double getSuperficieEdificio() {
		return this.largo * this.ancho;
	}
	
	@Override
	public String toString() {
		return "\nNombre: " + this.nombre + "\nLargo: " + this.largo + " m" +
				"\nAncho: " + this.ancho + " m\nTipo: " + this.tipo;
	}
	
}
