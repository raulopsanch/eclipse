package Ejercicio_09;

public class Profesor extends Persona {
	private String despacho;
	
	public Profesor(String nombre, String apellidos, String despacho) {
		super(nombre, apellidos);
		this.despacho = despacho;
	}
	
	public String getDespacho() {
		return this.despacho;
	}
	
	public void setDespacho(String despacho) {
		this.despacho = despacho;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Office: " + this.getDespacho();
	}
}
