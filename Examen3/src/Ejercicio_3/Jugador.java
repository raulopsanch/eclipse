package Ejercicio_3;

public class Jugador extends Equipo {
private String posicion;
	
	public Jugador(String nombre, int edad, String posicion) {
		super(nombre, edad);
		this.posicion = posicion;
	}
	
	public String getPosicion() {
		return this.posicion;
	}
	
	public void setPosicion(String valor) {
		this.posicion = valor;
	}
	
	public String infoJugador() {
		return super.toString() + "\n----Posición " + this.posicion + " ----";
	}

}
