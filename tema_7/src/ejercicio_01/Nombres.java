package ejercicio_01;

import java.util.ArrayList;

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
		
		System.out.println("listaNombres ordenado");
		listaNombres.sort(null);
	}
	
	
	public static void llenarLista(String lista, ArrayList<String> listaName) {
		String[] names = lista.split(", ");
		
		for (String n : names) {
			listaName.add(n);
		}
	}
	
	public static void ordenarLista(ArrayList<String> lista) {
		
	}

}
