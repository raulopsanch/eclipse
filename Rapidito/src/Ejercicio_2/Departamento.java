package Ejercicio_2;

public class Departamento {
	private String nombre;
	private int nEmpleados;
	
	public Departamento (String nombre, int nEmpleados) {
		this.nombre = nombre;
		this.nEmpleados = nEmpleados;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getNEmpleados() {
		return this.nEmpleados;
	}
	
	public void setNEmpleados(int nEmpleados) {
		this.nEmpleados = nEmpleados;
	}
	
	@Override
	public String toString() {
		return this.nombre + " con " + this.nEmpleados + " empleados";
	}
}
