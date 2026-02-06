package Ejercicio_02;

public class Smartphone extends Dispositivo {
	private String sistemaOperativo;
	
	public Smartphone(String marca, String modelo, String sistemaOperativo) {
		super(marca, modelo);
		this.sistemaOperativo = sistemaOperativo;
	}
	
	@Override
	public String encender() {
		if(super.getMarca().equalsIgnoreCase("Apple")) {
			return "El " + super.getModelo() + " está encendido.";
		}
		return "El Smartphone " + super.getMarca() + " " +
			super.getModelo() + " está encendido";
	}
	
}
