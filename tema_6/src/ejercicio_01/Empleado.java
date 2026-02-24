package ejercicio_01;

public class Empleado extends Persona {
	private String empresa;
	private double salario;
	
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
	
	@Override
	public void situacionPersonal() {
		System.out.println("La persona " + super.getNombre() + " con DNI **" + super.getDni().substring(2, 5) + "**");
		System.out.println("Trabaja en la empresa " + this.empresa + " con un salario de " + this.salario + "€");
	}
	
	@Override
	public void datosPersonales() {
		System.out.println("La persona " + super.getNombre() + ", " + super.getDni());
		System.out.println("Es un trabajador");
	}
}
