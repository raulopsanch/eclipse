package Ejercicio_11;

public class Lavadora extends Electrodomestico {
	private double precio;
	private boolean aguaCaliente;
	
	public Lavadora(String marca, double potencia) {
		super("Lavadora", marca, potencia);
		this.precio = 0.0;
		this.aguaCaliente = false;
	}
	
	public Lavadora(String marca, double potencia,
			double precio, boolean aguaCaliente) {
		super("Lavadora", marca, potencia);
		this.precio = precio;
		this.aguaCaliente = aguaCaliente;
	}
	
	public double getPrecio() {
		return this.precio;
	}
	
	public void setPrecio(double newPrecio) {
		this.precio = newPrecio;
	}
	
	public boolean getAguaCaliente() {
		return this.aguaCaliente;
	}
	
	public void setAguaCaliente(boolean valor) {
		this.aguaCaliente = valor;
	}
	
	@Override
	public String toString() {
		return super.toString() +
				"\nAgua caliente: " + this.aguaCaliente +
				"\nPrecio: " + this.precio + "€";
	}
	
	@Override
	public double getConsumo(int horas) {
		if (!this.aguaCaliente) {
			return horas - super.getPotencia();
		} else {
			return horas * (super.getPotencia() + super.getPotencia() * 0.20);
		}
	}
	
}
