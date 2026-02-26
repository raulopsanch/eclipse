package Ejercicio_2;

public class Persona {
	private int id;
	private String nombre;
	
	public Persona(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int valor) {
		this.id = valor;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String valor) {
		this.nombre = valor;
	}
}
