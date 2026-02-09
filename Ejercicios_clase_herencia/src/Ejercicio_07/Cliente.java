package Ejercicio_07;

public class Cliente {
	private String dni;
	private String nombre;
	private String apellidos;
	private String telefono;
	
	public Cliente(String dni, String nombre, String apellidos, String telefono) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
	}
	
	public String getDni() {
		return this.dni;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellidos() {
		return this.apellidos;
	}
	
	public String getTelefono() {
		return this.telefono;
	}
	
	public String getNombreCompleto() {
		return this.nombre + " " + this.apellidos;
	}
	
	@Override
	public String toString() {
		return "\nNombre: " + this.nombre + "\nApellidos: " + this.apellidos +
				"\nTeléfono: " + this.telefono;
	}
	
}
