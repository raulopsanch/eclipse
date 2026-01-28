package Personal;

public class Personal {
	private Persona[] personas;
	private int contadorPersonas;
	
	public Personal() {
		this.personas = new Persona[10];
		this.contadorPersonas = 0;
	}
	
	public boolean InsertearPersona(Persona p) {
		if ( contadorPersonas < personas.length) {
			personas[contadorPersonas] = p;
			contadorPersonas++;
			
			return true;
		}
		return false;
	}
	
	public Persona buscarPersona(String dni) {
		for(int i = 0; i < personas.length; i++) {
			if (personas[i].equals(dni)) {
				return personas[i];
			}
		}
		return null;
	}
	
	public int getNumeroPersonas() {
		return contadorPersonas;
	}
	
	public void mostrarDatos() {
		System.out.println("=== LISTA DE PERSONAS ===");
        System.out.println("Total de personas: " + contadorPersonas);
        System.out.println("--------------------------");
        
		for(int i = 0; i < contadorPersonas; i++) {
			System.out.println((i + 1) + ".- " + personas[i]);;
		}
        System.out.println("==========================\n");
	}
	
	public Persona[] getNPrimerasPersonas(int n) {
		if ( n <= 0 || n > contadorPersonas) {
			return new Persona[0];
		}
		
		ordenarDatos();
		
		Persona[] resultado = new Persona[n];
		
		for (int i = 0; i < n; i++) {
			resultado[i] = personas[i];
		}
		return resultado;
	}
	
	public boolean cambiarPuestoTrabajo(String dni, Trabajo trabajo) {
		Persona persona = buscarPersona(dni);
		
		if (persona != null) {
			persona.set_puesto(trabajo);
			return true;
		}
		return false;
	}
	
	public void ordenarDatos() {
		for (int i = 0; i < contadorPersonas; i++) {
			for (int j = 0; j < contadorPersonas; j++) {
				if (personas[j].get_dni().compareTo(personas[j + 1].get_dni()) > 0 ) {
					Persona temp = personas[j];
                    personas[j] = personas[j + 1];
                    personas[j + 1] = temp;
				}
			}
		}
	
	}
	
	
	public static void main(String[] args) {
		
	}

}
