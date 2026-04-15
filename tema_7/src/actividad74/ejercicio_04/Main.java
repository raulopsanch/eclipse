package actividad74.ejercicio_04;

import java.util.HashMap;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		HashMap<Integer, Producto> lista = new HashMap<>();
		int siguienteId = 101;
		
		insertar(lista, siguienteId, "Leche", "Alimentación");
		
		mostrar(lista);
		
		productosCategoria(lista, "alimentación");
		
		
	}
	
	
	public static void insertar(HashMap<Integer, Producto>lista, int id, String nombre, String categoria) {
		lista.put(id, new Producto(id, nombre, categoria));
	}
	
	
	public static void mostrar(HashMap<Integer, Producto>lista) {
        System.out.println("===LISTA DE PRODUCTOS===");

        Iterator<Map.Entry<Integer, Producto>> it = lista.entrySet().iterator();
        
        while (it.hasNext()) {
        	Map.Entry<Integer, Producto> entrada = it.next();
        	int id = entrada.getKey();
        	Producto p = entrada.getValue();
        	
        	System.out.println(p.toString());
        }
	}
	
	
	public static boolean perteneceCategoria(Producto producto, String categoria) {
		return producto.getCategoria().equalsIgnoreCase(categoria);
	}
	
	
	public static void productosCategoria(HashMap<Integer, Producto>lista, String categoria) {
		boolean encontrado = false;
		
		for (Producto p : lista.values()) {
			if (perteneceCategoria(p, categoria)) {
				System.out.println(p.getId());
				encontrado = true;
			}
		}
		if (!encontrado) {
			System.out.println("No se encontraron productos en la categoría "
					+ categoria);
		}
	}

}
