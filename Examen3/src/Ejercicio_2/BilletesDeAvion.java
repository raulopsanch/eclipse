package Ejercicio_2;

public class BilletesDeAvion {
	private Persona persona;
	private String destino;
	private double importe;
	
	public BilletesDeViaje(Persona persona, String destino) {
		this.persona = persona;
		this.destino = destino;
		this.importe = 20;
	}
	
	public BilletesDeViaje(Persona persona){
		this.persona = persona;
	}
	
	public Persona getPersona() {
		return this.persona;
	}
	
	public String getDestino() {
		return this.destino;
	}
	
	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	public double importe() {
		return this.importe;
	}
	
	public String comprarBillete(String destino) {
		this.setDestino(destino);
		return "Comprado billete con destino " + destino + " por " + this.persona.getNombre();
	}
	
	public String cambioDestino(String destino) {
		if (this.persona.getNombre().contentEquals(destino)) {
			return this.persona.getNombre() + " con destino " + this.destino + " ha cambiado por " + destino;
		}
		return "El destino no ha cambiado";		
	}
	
	public String intercambiarBillete(Persona persona) {
		
		return this.persona.getNombre() + " ha perdido el billete.";
	}
	
	@Override
	public String toString() {
		return this.persona.getNombre() + " con destino " + this.destino;
	}
}
