package Ejercicio_05;

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
	
	public void setIdProfe(int idProfe) {
		this.idProfe = idProfe;
	}
	
	public String getCento() {
		return this.centro;
	}
	
	public void setCentro(String centro) {
		this.centro = centro;
	}
	
	public String infoProfesor() {
		return "\nId_profesor: " + this.idProfe + "\nCentro: " + this.centro;
	}
	
	public String datosCompletos() {
		return super.datosPersonales() + this.infoProfesor();
	}
}
