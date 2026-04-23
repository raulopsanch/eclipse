package actividad81.ejercicio_04;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Set<Producto> productos = new HashSet<>();
		
		productos.add(new Producto(2, "server", 820.45));
		productos.add(new Producto(1, "SAI", 1200));
		productos.add(new Producto(3, "cable fibra", 12));
		productos.add(new Producto(4, "cable", 15));
		productos.add(new Producto(3, "cable", 15));
		productos.add(new Producto(5, "conector", 18));
		productos.add(new Producto(1, "server", 1500));
		
		
		System.out.println("==== SET DE PRODUCTOS ====");
		mostrarSet(productos);
		
		System.out.println();
		System.out.println("Hay " + productos.size() + " elementos en el Set");
		
		System.out.println();
		System.out.println("==== Intentar eliminar laptop ====");
		eliminarLaptop(productos);
		
		System.out.println();
		System.out.println("==== SET DE PRODUCTOS DESPUÉS DE BORRAR LAPTOP====");
		mostrarSet(productos);
		
		

	}
	
	public static void mostrarSet(Set<Producto> setList) {
		for (Producto p : setList) {
			System.out.println(p.toString());
		}
	}
	
	
	public static boolean eliminarLaptop(Set<Producto> setList) {
		boolean encontrado = false;
		
		for (Producto p : setList) {
			if (p.getNombre().equalsIgnoreCase("laptop")) {
				setList.remove(p);
				System.out.println("Laptop ha sido borrada");
				encontrado = true;
				return encontrado;
			}
		}
		System.out.println("No se ha encontrado laptop en el Set");
		return encontrado;
	}

}
