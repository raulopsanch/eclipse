package actividad74.ejercicio_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import actividad74.ejercicio_01.Persona;

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
	
	
	public void ordenar() {
		ArrayList<Map.Entry<Integer, Persona>> list =
				new ArrayList<Map.Entry<Integer, Persona>> (personas.entrySet());
		
		Collections.sort(list, new Comparator<Map.Entry<Integer, Persona>> () {
			public int compare(Map.Entry<Integer, Persona> o1,
					           Map.Entry<Integer, Persona> o2)
			{
				return (o1.getKey()).compareTo(o2.getKey());
			}
		});
		
		for (Map.Entry<Integer, Persona> p : list) {
			System.out.println(p.getKey() + "->" + p.getValue().getNombre() + ", " +
					p.getValue().getEdad() + " años.");
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
