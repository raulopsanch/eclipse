package ejercicio_01;

enum Ciclos {
	daw, asir, electicidad, finanzas, mecanizado
}

public class Alumno extends Persona{
	private String centro;
	private Ciclos ciclo;
	
	public Alumno(String nombre, String dni, int edad, String centro, Ciclos ciclo) {
		super(nombre, dni, edad);
		this.centro = centro;
		this.ciclo = ciclo;
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
	
	@Override
	public void situacionPersonal() {
		System.out.println("La persona " + super.getNombre() + " con DNI **" + 
				super.getDni().substring(2, 5) + "**");
		System.out.println("Estudia en el centro " + this.centro.toUpperCase() + " el ciclo de " + this.ciclo.name().toUpperCase());
	}
	
	@Override
	public void datosPersonales() {
		String[] nombre = super.getNombre().split(" ");
		System.out.println("La persona "+ nombre[1] + ", " + nombre[0] + ", "+ super.getDni());
		System.out.println("Es un alumno");
	}
}
