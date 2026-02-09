package Ejercicio_07;

public class Vehiculo {
	private String matricula;
	private String marca;
	private String modelo;
	private double tarifa;
	private boolean disponible;
	
	public Vehiculo(String matricula, String marca, String modelo, double tarifa, boolean disponible) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.tarifa = tarifa;
		this.disponible = disponible;
	}
	
	public String getMatricula() {
		return this.matricula;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public double getTarifa() {
		return this.tarifa;
	}
	
	public void setTarifa(double newTarifa) {
		this.tarifa = newTarifa;
	}
	
	public boolean getDisponible() {
		return this.disponible;
	}
	
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	
	@Override
	public String toString() {
		return "\nMatrícula: " + this.matricula + "|nMarca: " + this.marca + 
				"\nModelo: " + this.modelo + "\nTarifa: " + this.tarifa + 
				"\nDisponile: " + this.disponible;
	}
	
}
