package Ejercicio_02;

public class Dispositivo {
	private String marca;
	private String modelo;
	
	public Dispositivo(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String encender() {
		return "El dispositivo está encendido";
	}
	
}
