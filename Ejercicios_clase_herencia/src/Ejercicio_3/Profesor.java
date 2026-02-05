package Ejercicio_3;

public class Profesor extends Persona {
	private int idProfe;
	private String centro;
	
	public Profesor(String nombre, int edad, int idProfe, String centro) {
		super(nombre, edad);
		this.idProfe = idProfe;
		this.centro = centro;
	}
	
	public int getIdProfe() {
		return this.idProfe;
	}
	
	public String getCentro() {
		return this.centro;
	}
	
	public void setCentro(String centro) {
		this.centro = centro;
	}
	
	public String infoProfe() {
		return "\nId: " + this.idProfe + "\nCentro: " + this.centro;
	}
	
	public String datosCompletos() {
		return super.datosPersonales() + infoProfe();
	}
}
