package Ejercicio_3;

public class Entrenador extends Equipo {
	private int victorias;
	private int derrotas;
	
	public Entrenador(String nombre, int edad, int victorias, int derrotas) {
		super(nombre, edad);
		this.victorias = victorias;
		this.derrotas = derrotas;
	}
	
	public int getVictorias() {
		return this.victorias;
	}
	
	public void setVictorias(int valor) {
		this.victorias = valor;
	}
	
	public int getDerrotas() {
		return this.derrotas;
	}
	
	public void setDerrotas(int valor) {
		this.derrotas = valor;
	}
	
	public boolean comprobarEntrenador() {
		return this.victorias > this.derrotas;
	}
	
	public String infoEntrenador() {
		return "El entrenador es " + super.getNombre() +
				"\nCuenta con " + this.derrotas + " derrotas y " + this.victorias + " victorias.";
	}

}
