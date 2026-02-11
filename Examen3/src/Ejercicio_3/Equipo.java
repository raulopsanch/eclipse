package Ejercicio_3;

public class Equipo {
	private String nombre;
	private int edad;
	
	public Equipo(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public void setEdad(int valor) {
		this.edad = valor;
	}
	
	@Override
	public String toString() {
		return "Jugador " + this.nombre + " edad " + this.edad;
	}

}
