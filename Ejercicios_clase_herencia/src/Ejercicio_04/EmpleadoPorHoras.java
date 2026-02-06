package Ejercicio_04;

public class EmpleadoPorHoras extends Empleado {
	private double horasTrabajadas;
	private double valorHora;
	
	public EmpleadoPorHoras(String nombre, String dni, double horasTrabajadas, double valorHora) {
		super(nombre, dni);
		this.horasTrabajadas = horasTrabajadas;
		this.valorHora = valorHora;
	}
	
	public double getHorasTrabajadas() {
		return this.horasTrabajadas;
	}
	
	public void setHorasTrabajadas(double horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	
	public double getValorHora() {
		return this.valorHora;
	}
	
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	@Override
	public double calcularSalario() {
		return this.valorHora * this.horasTrabajadas;
	}
}
