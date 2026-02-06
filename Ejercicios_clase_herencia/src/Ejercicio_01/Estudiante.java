package Ejercicio_01;

public class Estudiante extends Persona {
	private String legajo;
	
	public Estudiante(String nombre, int edad, String legajo) {
		super(nombre, edad);
		this.legajo = legajo;
	}
	
	public Estudiante(String nombre, String legajo) {
		super(nombre);
		this.legajo = legajo;
	}
	
	public String getLegajo() {
		return this.legajo;
	}
	
	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}
	
	@Override
	public String toString() {
		if (super.getEdad() == 0) {
			return "\nNombre: " + super.getNombre() + 
					"\nLegajo: " + this.legajo;
		}
		return "\nNombre: " + super.getNombre() + "\nEdad: " + super.getEdad() +
				"\nLegajo: " + this.legajo;
	}
	
}
