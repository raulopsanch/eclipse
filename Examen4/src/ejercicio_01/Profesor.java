package ejercicio_01;

enum Asignatura {
	matemáticas, inglés, lenguaje, historia, física;
}

public class Profesor extends Persona {
	private String centro;
	private Asignatura asignatura;
	
	
	public Profesor(String nombre, String dni, int edad, String centro, Asignatura asignatura) {
		super(nombre, dni, edad);
		this.centro = centro;
		this.asignatura = asignatura;
	}
	
	
	public String getCentro() {
		return this.centro;				
	}
	
	public void setCentro(String centro) {
		this.centro = centro;
	}
	
	
	public Asignatura getAsignatura() {
		return this.asignatura;
	}
	
	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}
	
	
	@Override
	public String profesion() {
		int separacion = super.getNombre().indexOf(" ");
		
		return "El profesor " + super.getNombre().substring(0, separacion) + super.getNombre().substring(separacion + 1) +
				" con DNI ******" + super.getDni().substring(6) + "\nTrabaja en el centro " + this.centro + 
				" e imparte " + this.asignatura;
	}
	
	public void datosPersonales() {
		System.out.println(super.getNombre() + " con DNI " + super.getDni() +
				"\nEs un profesor");
	}
	
}
