package Ejercicio_2;


public class BilletesDeViaje {
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
	
	public String cambioDestino(String nuevoDestino) {
		if (this.destino != null) {
			String antiguoDestino = this.destino;
			this.destino = nuevoDestino;
			return this.persona.getNombre() + " con destino " +
					antiguoDestino + " ha cambiado por " +
					nuevoDestino;
		} else {
			return "El destino no ha cambiado";
		}
	}
	
	public Persona intercambiarBillete(Persona nuevaPersona) {
		Persona personaAntigua = this.persona;
		this.persona = nuevaPersona;
        
        System.out.println("Intercambio realizado.");
        System.out.println(personaAntigua.getNombre() + " ha perdido el billete");
        
        return personaAntigua;
	}
	
	@Override
	public String toString() {
		return this.persona.getNombre() + " con destino " + this.destino;
	}
}
