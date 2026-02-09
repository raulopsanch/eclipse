package Ejercicio_09;

public class Persona {
	private String nombre;
	private String apellidos;
	
	public Persona(String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellidos() {
		return this.apellidos;
	}
	
	@Override
	public String toString() {
		return this.getApellidos() + ", " + this.getNombre();
	}
}
