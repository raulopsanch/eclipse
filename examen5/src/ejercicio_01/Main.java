package ejercicio_01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		HashMap<Integer, Producto> productos = new HashMap<>();
		int id = 101;
		
		rellenarDatos(productos, id++, "Lavadora", 275, "proveedor1");

	}
	
	
	public static void rellenarDatos(Map<Integer, Producto> lista, int id, String nombre, double precio, String proveedor) {
		
		lista.put(id, new Producto(nombre, precio, proveedor));
	}
	
	
	public static void mostrarDetalles(Map<Integer, Producto> lista) {
		Iterator<Integer> it = lista.keySet().iterator();
		
		while(it.hasNext()) {
			int clave = it.next();
			Producto valor = lista.get(clave);
			
			System.out.println("Clave: " + clave + valor.toString());
		}
	}
	
	
	public static int insertaProducto(Map<Integer, Producto> lista,int id, Producto p) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce el nombre del prducto: ");
		String nombre = entrada.nextLine();
		
		System.out.print("Introduce el proveedor del prducto: ");
		String proveedor = entrada.nextLine();
		
		System.out.print("Introduce el precio del prducto: ");
		double precio = entrada.nextDouble();
		
		lista.put(id, new Producto(nombre, precio, proveedor));
		
		return id;
	}
	
	
	public static String buscarProveedor(Map<Integer, Producto> lista) {
		Producto proveedor = lista.get(101);
				
		for (int clave : lista.keySet()) {
			Producto valor = lista.get(clave);
			
			if (valor.getPrecio() > proveedor.getPrecio()) {
				proveedor = valor;
			}
		}
		
		return proveedor.getNombre();
	}

}
