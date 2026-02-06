package Ejercicio_04;

public class EmpleadoTiempoCompleto extends Empleado {
	private double salarioMensual;
	
	public EmpleadoTiempoCompleto(String nombre, String dni, double salarioMensual) {
		super(nombre, dni);
		this.salarioMensual = salarioMensual;
	}
	
	public double getSalarioMensual() {
		return this.salarioMensual;
	}
	
	public void setSalarioMensual(double salarioMensual) {
		this.salarioMensual = salarioMensual;
	}
	
	@Override
	public double calcularSalario() {
		return this.salarioMensual;
	}
}
