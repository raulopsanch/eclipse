package JavaSA;

public class Empleado {
	private String nombre;
	private double sueldo;
	private int antiguedad;
	
	public Empleado(String nombre, double sueldo, int antiguedad) {
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.antiguedad = antiguedad;
	}
	
	public String get_nombre() {
		return this.nombre;
	}
	
	public double get_sueldo() {
		return this.sueldo;
	}
	
	public void set_sueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	public int get_antiguedad() {
		return this.antiguedad;
	}
	
	public void set_antiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	
	public void antiguedadMas() {
		this.set_antiguedad(this.antiguedad + 1);
	} 
	
	public double calcularSueldo() {
		return this.get_sueldo() + (1000 * this.get_antiguedad());
	}
	
	public String infoEmpleado() {
		return "Nombre: " + this.nombre + " Sueldo: " + this.calcularSueldo() +
				" Angigüedad: " + this.antiguedad;
	}

}