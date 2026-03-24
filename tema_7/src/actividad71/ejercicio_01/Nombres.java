package actividad71.ejercicio_01;

import java.util.ArrayList;
import java.util.Collections;

public class Nombres {

	public static void main(String[] args) {
		ArrayList<String> listaNombres = new ArrayList<>();
		
		String nombres = "Carlos, Ana, Mateo, Pedro, María, Raúl, Olivia, Matías, "
				+ "Irene, Oliver, Julia, Juan, Andrés, José, Luis, Pablo, Johana, "
				+ "David, Miguel, Carla, Alba, Estrella, Brian";
		
		llenarLista(nombres, listaNombres);
		
		
		System.out.println("- Mostrar el nº de elementos/nombres que hay en el ArrayList.");
		System.out.println(listaNombres.size());
		System.out.println();
		
		System.out.println("Mostrar el primer elemento de la lista.");
		System.out.println(listaNombres.get(0));
		System.out.println("");
		
		System.out.println("Mostrar el último elemento de la lista.");
		System.out.println(listaNombres.getLast());
		System.out.println("");
		
		System.out.println("Mostrar todos los elementos de la lista");
		for (String lN : listaNombres) {
			System.out.println(lN);
		}
		System.out.println();
		
		System.out.println("listaNombres ordenado");
		Collections.sort(listaNombres);
		
		for (String lN : listaNombres) {
			System.out.println(lN);
		}
		System.out.println(); 
		
		System.out.println("Eliminar a “Pedro” y “Olivia“ de la lista");
		listaNombres.remove("Pedro");
		listaNombres.remove("Olivia");
		
		for (String n : listaNombres) {
			System.out.println(n);
		}
		System.out.println();
		System.out.println("Mostrar los nombres que comienzan por “J” y “L”.");
		for (String n : listaNombres) {
			if (n.charAt(0) == 'J' || n.charAt(0) == 'L') {
				System.out.println(n);
			}
		}
		
	}
	
	
	public static void llenarLista(String lista, ArrayList<String> listaName) {
		String[] names = lista.split(", ");
		
		for (String n : names) {
			listaName.add(n);
		}
	}
	
	

}
