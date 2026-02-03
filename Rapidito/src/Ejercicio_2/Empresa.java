package Ejercicio_2;

public class Empresa {
	private String nombre;
	private Departamento departamento;
	
	public Empresa(String nombreEmp, Departamento departamento) {
		this.nombre = nombreEmp;
		//Departamento dpto = new Departamento(nombre, nEmpleados);
		this.departamento = departamento;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public Departamento getDepartamentoNombre() {
		return this.departamento;
	}
	
	@Override
	public String toString() {
		return this.nombre + " -> " + this.departamento.toString();
	}
}
