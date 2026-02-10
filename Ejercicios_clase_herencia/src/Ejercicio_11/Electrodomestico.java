package Ejercicio_11;

public class Electrodomestico {
	private String tipo;
	private String marca;
	private double potencia;
	
	public Electrodomestico(String tipo, String marca, double potencia) {
		this.tipo = tipo;
		this.marca = marca;
		this.potencia = potencia;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public double getPotencia() {
		return this.potencia;
	}
	
	@Override
	public String toString() {
		return "\nTipo: " + this.tipo +
				"\nMarca: " + this.marca +
				"\nPotencia: " + this.potencia + "kw/h";
	}
	
	public double getConsumo(int horas) {
		return this.potencia * horas;
	}
	
	public double getCosteConsumo(int horas, double costeHora) {
		double consumoTotal = this.getConsumo(horas);
		return consumoTotal * costeHora;
	}
}
