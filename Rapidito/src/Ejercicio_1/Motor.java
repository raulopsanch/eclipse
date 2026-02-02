package Ejercicio_1;

public class Motor {
	private int cilindrada;
	private String tipo;
	
	public Motor(int cilindrada, String tipo) {
		this.cilindrada = cilindrada;
		this.tipo = tipo;
	}
	
	public int getCilindrada() {
		return this.cilindrada;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	@Override
	public String toString() {
		return this.cilindrada + ", " + this.tipo;
	}
}
