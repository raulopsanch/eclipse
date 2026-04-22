package ejercicio_02;

import java.time.LocalDate;

public class GestionEventos {
	private String nombre;
	private LocalDate fecha;
	private int aforo;
	
	
	public GestionEventos(String nombre, LocalDate fecha, int aforo) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.aforo = aforo;
	}
	
	
	public String getNombre() {
		return this.nombre;
	}
	
	
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	
	public int getAforo() {
		return this.aforo;
	}
	
	
	@Override
	public String toString() {
		return this.nombre + " | " + this.fecha + " | " + this.aforo;
	}
}
