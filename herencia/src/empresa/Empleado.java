package empresa;

public class Empleado {
	private String nombre;
	private double sueldo;
	private int id;
	
	public Empleado(String nombre, double sueldo, int id) {
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.id = id;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public double getSueldo() {
		return this.sueldo;
	}
	
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	public int getId() {
		return this.id;
	}
	
	@Override
	public String toString() {
		return "\nNombre: " + this.nombre + "\nId: " + this.id + 
				"\nSueldo: " + this.sueldo;
	}

}
