package ejercicio_01;

/**
 * <p>Subclase de la superclase Persona</p>
 * @author Raúl López
 * @version 1.0
 */
public class Empleado extends Persona {
	private String empresa;
	private double salario;
	
	/**
	 * <p>Contructor que inicializa un objeto de la subclase Empleado</p>
	 * <ul>
	 * 	<li>@param nombre</li>
	 * 	<li>@param dni</li>
	 * 	<li>@param edad</li>
	 * 	<li>@param empresa</li>
	 * 	<li>@param salario</li>
	 * </ul>
	 */
	public Empleado(String nombre, String dni, int edad, String empresa, double salario) {
		super(nombre, dni, edad);
		this.empresa = empresa;
		this.salario = salario;
	}
	
	public String getEmpresa() {
		return this.empresa;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	/**
	 * <p>El método "situacionPersonal" nos imprime la información personal y profesional
	 * de cada instancia de empleado::</p>
	 * <ul>
	 * 	<li>Nombre completo</li>
	 * 	<li>DNI, ocultando carácteres</li>
	 * 	<li>Nombre de la empresa</li>
	 * 	<li>salario que cobra</li>
	 * </ul>
	 */
	@Override
	public void situacionPersonal() {
		System.out.println("La persona " + super.getNombre() + " con DNI **" + super.getDni().substring(2, 5) + "**");
		System.out.println("Trabaja en la empresa " + this.empresa + " con un salario de " + this.salario + "€");
	}
	
	/**
	 * <p>El método "datosPersonales" nos imprime solo la información personal:</p>
	 * <ul>
	 * 	<li>Nombre completo</li>
	 * 	<li>DNI completo</li>
	 * 	<li>Testo: es un empleado</li>
	 */
	@Override
	public void datosPersonales() {
		System.out.println("La persona " + super.getNombre() + ", " + super.getDni());
		System.out.println("Es un trabajador");
	}
}
