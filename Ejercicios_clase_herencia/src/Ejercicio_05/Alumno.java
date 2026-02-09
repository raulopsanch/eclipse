package Ejercicio_05;

public class Alumno extends Persona {
	private String especialidad;
	private int curso;
	
	public Alumno(String nombre, int edad, String especialidad, int curso) {
		super(nombre, edad);
		this.especialidad = especialidad;
		this.curso = curso;
	}
	
	public String getEspecialidad() {
		return this.especialidad;
	}
	
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	public int getCurso() {
		return this.curso;
	}
	
	public void setCurso(int curso) {
		this.curso = curso;
	}
	
	public String infoAlumno() {
		return "\nEspecialidad: " + this.especialidad + "\nCurso: " + this.curso;
	}
	
	public String datosCompletos() {
		return super.datosPersonales() + this.infoAlumno();
	}
}
