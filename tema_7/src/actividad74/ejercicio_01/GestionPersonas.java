package actividad74.ejercicio_01;

import java.util.*;

public class GestionPersonas {
	private Map<Integer, Persona> personas;
	
	
	public GestionPersonas() {
		this.personas = new HashMap<>();
	}
	
	
	public void insertar(int clave, String nombre, int edad) {
		personas.put(clave, new Persona(nombre, edad));
	}
	
	
	public void mostrarTodos() {
		for (Map.Entry<Integer, Persona> entrada : personas.entrySet()) {
			System.out.println("Clave: " + entrada.getKey() + "->" +
					entrada.getValue());
		}
	}
	
	
	public int solicitarClave() {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce una clave: ");
		int clave = entrada.nextInt();
		
		return clave;
	}
	
	
	public void buscar() {
		int clave = solicitarClave();
		Persona p = personas.get(clave);
		
		if (p != null) {
			System.out.println("Persona encontrada: " + p);
		} else {
			System.out.println("No existe ninguna persona con clave " + clave);
		}
	}
	
	
	public void eliminar() {
		int clave = solicitarClave();
		
		if (personas.remove(clave) != null) {
			System.out.println("Persona con clave " + clave + " eliminada");
		} else {
			System.out.println("No existe ninguna persona con clave " + clave);
		}
	}

}
