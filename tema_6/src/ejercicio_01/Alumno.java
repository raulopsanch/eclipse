package ejercicio_01;

/**
 * <p>Enum que representa cada uno de los diferentes ciclos que se puede cursar:</p>
 * <ul>
 * 	<li>daw</li>
 * 	<li>asir</li>
 * 	<li>electricidad</li>
 * 	<li>finanzas</li>
 * 	<li>mecanizado</li>
 * </ul>
 */
enum Ciclos {
	daw, asir, electicidad, finanzas, mecanizado
}

/**
 * <p>La clase Alumno es una subclase de la clase Persona</p>
 * @author Raúl López
 * @version 1.0
 */
public class Alumno extends Persona{
	private String centro;
	private Ciclos ciclo;
	
	/**
	 * <p>Constructor que inicializa un objeto de la subclase Alumno. Tiene los
	 * siguientes parámetros:</p>
	 * <ul>
	 * 	<li>@param nombre</li>
	 * 	<li>@param dni</li>
	 *  <li>@param edad</li>
	 * 	<li>@param centro</li>
	 * 	<li>@param ciclo</li>
	 * </ul>
	 */
	public Alumno(String nombre, String dni, int edad, String centro, Ciclos ciclo) {
		super(nombre, dni, edad);
		this.centro = centro;
		this.ciclo = ciclo;
	}
	
	public Alumno(String nombre, String dni, int edad) {
		super(nombre, dni, edad);
		this.centro = "IES Suárez";
		this.ciclo = Ciclos.asir;
	}
	
	public String getCentro() {
		return this.centro;
	}
	
	public Ciclos getCiclo() {
		return this.ciclo;
	}
	
	public void setCiclo(Ciclos ciclo) {
		this.ciclo = ciclo;
	}
	
	/**
	 * <p>El método "situacionPersonal" nos imprime la información personal y académica
	 * de cada instancia de alumno:</p>
	 * <ul>
	 * 	<li>Nombre completo</li>
	 * 	<li>DNI, ocultando carácteres</li>
	 * 	<li>Centro</li>
	 * 	<li>Ciclo que estudia</li>
	 * </ul>
	 */
	@Override
	public void situacionPersonal() {
		System.out.println("La persona " + super.getNombre() + " con DNI **" + 
				super.getDni().substring(2, 5) + "**");
		System.out.println("Estudia en el centro " + this.centro.toUpperCase() + " el ciclo de " + this.ciclo.name().toUpperCase());
	}
	
	/**
	 * <p>El método "datosPersonales" nos imprime solo la información personal:</p>
	 * <ul>
	 * 	<li>Apellido, nombre</li>
	 * 	<li>DNI completo</li>
	 * 	<li>Testo: es un alumno</li>
	 */
	@Override
	public void datosPersonales() {
		String[] nombre = super.getNombre().split(" ");
		System.out.println("La persona "+ nombre[1] + ", " + nombre[0] + ", "+ super.getDni());
		System.out.println("Es un alumno");
	}
}
