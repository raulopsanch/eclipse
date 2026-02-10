package Ejercicio_08;

public class Producto {
	private String fechaCaducidad;
	private String numLote;
	private String paisOrigen;
	private String fechaEnvasado;
	private double temperatura;
	
	public Producto(String fechaEnvasado, String numLote, String paisOrigen, 
			String fechaCaducidad, double temperatura) {
		this.fechaEnvasado = fechaEnvasado;
		this.numLote = numLote;
		this.paisOrigen = paisOrigen;
		this.fechaCaducidad = fechaCaducidad;
		this.temperatura = temperatura;
	}
	
	public Producto(String fechaEnvasado, String numLote, String paisOrigen, 
			String fechaCaducidad) {
		this.fechaEnvasado = fechaEnvasado;
		this.numLote = numLote;
		this.paisOrigen = paisOrigen;
		this.fechaCaducidad = fechaCaducidad;
	}
	
	public String getFechaEnvasado() {
		return this.fechaEnvasado;
	}
	
	public String getnumLote() {
		return this.numLote;
	}
	
	public String getPaisOrigen() {
		return this.paisOrigen;
	}
	
	public String getFechaCaducidad() {
		return this.fechaCaducidad;
	}
	
	public double getTemperatura() {
		return this.temperatura;
	}
	
	@Override
	public String toString() {
		return "\nNúmero de lote: " + this.numLote +
				"\nFecha de envase: " + this.fechaEnvasado +
				"\nPaís de origen: " + this.paisOrigen +
				"\nTemperatura de mantenimiento: " + this.temperatura+"º" +
				"\nFecha de caducidad: " + this.fechaCaducidad;
	}
}
