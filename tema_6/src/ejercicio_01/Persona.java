package ejercicio_01;

/**
 * <p>Clase abstracta encargada de crear diferentes tipos de persona, según
 * si es empleado o alumno</p>
 * @author Raúl López
 * @version 1.0
 */
public abstract class Persona {
	private String nombre;
	private String dni;
	private int edad;
	
	/**
	 * <p>Constructor que inicializa una persona</p>
	 * @param nombre
	 * @param dni
	 * @param edad
	 */
	public Persona(String nombre, String dni, int edad) {
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
	}
	
	/**
	 * <p>Método el cual nos devuelve el nombre de la persona</p>
	 * @return el nombre de la persona
	 */
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
