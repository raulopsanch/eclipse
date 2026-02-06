package Ejercicio_04;

public abstract class Empleado {
	private String nombre;
	private String dni;
	
	public Empleado(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getDni() {
		return this.dni;
	}
	
	public abstract double calcularSalario();
	
}
