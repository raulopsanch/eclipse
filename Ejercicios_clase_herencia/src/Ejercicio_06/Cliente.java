package Ejercicio_06;

public class Cliente {
	private String DNI;
	private String nombre;
	private int telefono;
	
	public Cliente(String DNI, String nombre, int telefono) {
		this.DNI = DNI;
		this.nombre = nombre;
		this.telefono = telefono;
	}
	
	public String getDNI() {
		return this.DNI;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getTelefono() {
		return this.telefono;
	}
	
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
}
