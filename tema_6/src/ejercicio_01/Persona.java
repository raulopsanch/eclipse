package ejercicio_01;

public abstract class Persona {
	private String nombre;
	private String dni;
	private int edad;
	
	public Persona(String nombre, String dni, int edad) {
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getDni() {
		return this.dni;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public abstract void situacionPersonal();
	
	public abstract void datosPersonales();
	
}
