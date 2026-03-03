package ejercicio_60;

enum TipoDeInstalacion {
	ABIERTO, TECHADO;
}

public class Polideportivo implements InstalacionDeportiva, Edificio{
	private String nombre;
	private int largo;
	private int ancho;
	private TipoDeInstalacion tipo;
	
	public Polideportivo() {
		this.nombre = null;
		this.largo = 0;
		this.ancho = 0;
		this.tipo = null;
	}
	
	
	public Polideportivo(String nombre, int largo, int ancho, TipoDeInstalacion tipo) {
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
	
	public TipoDeInstalacion getTipo() {
		return this.tipo;
	}
	
	
	@Override
	public enum getTipoDeInstalacion() {
		return TipoDeInstalacion;
	}
	
	
	@Override
	public double getSuperficieEdificio() {
		return this.largo * this.ancho;
	}
	
}
