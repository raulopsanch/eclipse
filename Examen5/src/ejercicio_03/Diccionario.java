package ejercicio_03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;


public class Diccionario {

	public static void main(String[] args) {
		HashMap<String, String> diccionario = new HashMap<>();
		
		añadir(diccionario, "perro", "dog");
		
	}
	
	
	public static void añadir(HashMap<String, String> lista, String clave, String valor) {
		lista.put(clave, valor);
	}
	
	
	public static void Buscar(HashMap<String, String> lista, String clave) {
		
		for (String key : lista.keySet()) {
			if (key.equalsIgnoreCase(clave)) {
				String valor = lista.get(key);
				System.out.println(valor);
			}
		}
	}
	
	
	public static void eliminarPalabra(HashMap<String, String> lista, String palabra) {
		for (String key : lista.keySet()) {
			String valor = lista.get(key);
			
			if (palabra.equalsIgnoreCase(valor)) {
				lista.remove(key, valor);
			}
			
		}
	}
	

}
