package Ejercicio_09;

public class Alumno extends Persona {
	private String cuatrimestre;
	
	public Alumno(String nombre, String apellidos, String cuatrimestre) {
		super(nombre, apellidos);
		this.cuatrimestre = cuatrimestre;
	}
	
	public String getCuatrimestre() {
		return this.cuatrimestre;
	}
	
	public void setCuatrimestre(String cuatrimestre) {
		this.cuatrimestre = cuatrimestre;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Semester: " + this.getCuatrimestre();
	}
}
