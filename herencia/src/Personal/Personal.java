package Personal;

public class Personal {
	
	public static int InsertarPersona(Persona p, Persona[] personas, int contadorActual) {
		if ( contadorActual < personas.length) {
			personas[contadorActual] = p;
			contadorActual++;
			
			System.out.println("Persona agregada a la posición " + contadorActual);
			
			return contadorActual;
		}
		System.out.print("Lista llena. No se puede agregar más personas");
		
		return contadorActual;
	}
	
	public static Persona buscarPersona(String dni, Persona[] personas, int contador) {
		for(int i = 0; i < contador; i++) {
			if (personas[i].get_dni().equalsIgnoreCase(dni)) {
				return personas[i];
			}
		}
		return null;
	}
	
	public static int getNumeroPersonas(int contador) {
		return contador;
	}
	
	public static void mostrarDatos(Persona[] personas, int contador) {
		System.out.println("\n=== LISTA DE PERSONAS ===");
        System.out.println("--------------------------");
        
		for(int i = 0; i < contador; i++) {
			System.out.println((i + 1) + ".- " + personas[i]);
			System.out.println("---------------------------");
		}
        System.out.println("==========================\n");
	}
	
	public static void getNPrimerasPersonas(Persona[] personas, int n, int contador) {
		if ( n <= 0 || n > contador) {
			System.out.println(personas[0]);
		}
		
		Personal.ordenarDatos(personas, contador);
		
		Persona[] resultado = new Persona[n];
		
        System.out.println("------Lista de los " + n + " primeros---------");

		for (int i = 0; i < n; i++) {
			resultado[i] = personas[i];
			System.out.println((i + 1) + ".- " + resultado[i]);
	        System.out.println("--------------------------");
		}
		
	}
	
	public static boolean cambiarPuestoTrabajo(String dni, Trabajo trabajo, Persona[] personas,
			int contador) {
		Persona persona = Personal.buscarPersona(dni, personas, contador);
		
		if (persona != null) {
			persona.set_puesto(trabajo);
			System.out.println("Pueseto actualizado para " + persona.get_nombre());
			return true;
		}
		System.out.println("No se encontró del DNI: " + dni);
		return false;
	}
	
	public static void ordenarDatos(Persona[] personas, int contador) {
		for (int i = 0; i < contador - 1; i++) {
			for (int j = 0; j < contador - 1 - i; j++) {
				if (personas[i] != null && personas[j + 1] != null) {
					if (personas[j].get_dni().compareTo(personas[j + 1].get_dni()) > 0) {
						Persona temp = personas[j];
	                    personas[j] = personas[j + 1];
	                    personas[j + 1] = temp;
					}
				}
				
			}
		}
	}
	
	
	public static void main(String[] args) {
		Persona[] personas = new Persona[5];
		int nuevoContador = 0;
		
		Persona p1 = new Persona("80061025A", "Antonio", 1, "Desarrollador", 1500.75);
		Persona p2 = new Persona("80061025A", "Antonio", 1, "RRHH", 1500.75);
	    Persona p3 = new Persona("12345678B", "María", 2, "Desarrollador", 2000.50);
	    Persona p4 = new Persona("87654321C", "Carlos", 3, "Analista", 1800.00);
		
		nuevoContador = Personal.InsertarPersona(p1, personas, nuevoContador);
		nuevoContador = Personal.InsertarPersona(p2, personas, nuevoContador);
		nuevoContador = Personal.InsertarPersona(p3, personas, nuevoContador);
		nuevoContador = Personal.InsertarPersona(p4, personas, nuevoContador);
		
		System.out.println("\n"+ Personal.buscarPersona("80061025A", personas, nuevoContador));
		System.out.println("=====================================");
		
		System.out.println("\nTotal de personas: 0" + Personal.getNumeroPersonas(nuevoContador));
		
		Personal.mostrarDatos(personas, nuevoContador);
		
		System.out.println("******************************");
		Personal.getNPrimerasPersonas(personas, 2, nuevoContador);
		
		System.out.println("\n*******Cambiamos de pueseto********");
		Trabajo trabajo1 = new Trabajo(3, "Analista", 1800);
		Personal.cambiarPuestoTrabajo("80061025A", trabajo1, personas, nuevoContador);
		System.out.println("\n"+ Personal.buscarPersona("80061025A", personas, nuevoContador));
	}

}
