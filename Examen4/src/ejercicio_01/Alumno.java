package ejercicio_01;

public class Alumno extends Persona {
	private String estudios;
	private String curso;
	
	public Alumno(String nombre, String dni, int edad, String estudios, String curso) {
		super(nombre, dni, edad);
		this.estudios = estudios;
		this.curso = curso;
	}
	
	
	public String getEstudios() {
		return this.estudios;
	}
	
	
	public void setEstudios(String estudios) {
		this.estudios = estudios;
	}
	
	
	public String getCurso() {
		return this.curso;
	}
	
	public void setcurso(String curso) {
		this.curso = curso;
	}
	
	
	@Override
	public String profesion() {
		int separacion = super.getNombre().indexOf(" ");
		
		String nombre = super.getNombre().substring(0, separacion);
		String apellido = super.getNombre().substring(separacion + 1);
		
		return apellido.toUpperCase() + " " + nombre.toUpperCase() + ", con DNI ******" + super.getDni().substring(6) +
				"\nEstudia " + this.estudios + " y se encuentra en el curso " + this.curso ;
	}
	
	
	@Override
	public void datosPersonales() {
		System.out.println(super.getNombre() + " " + super.getDni() +
				"\nEs un estudiante");
	}
}
