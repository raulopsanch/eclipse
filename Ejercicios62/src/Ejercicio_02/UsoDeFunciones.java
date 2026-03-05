package Ejercicio_02;

import java.util.Random;

public class UsoDeFunciones {

	public static void main(String[] args) {
		double numero = 13;
		String texto = "Programación en Java";
		
		// Raíz cuadrada del número
		System.out.println("****Raíz cuadrada de 13****");
		System.out.println("---------------------------");
		System.out.println("Raíz cuadrada de " + numero + "= " + Math.sqrt(numero));
		
		// Potencia 3 de número
		System.out.println("\n****13 elevado a 3****");
		System.out.println("------------------------");
		System.out.println("13^3= " + Math.pow(numero, 3));
		
		// Número aleatorio menor a 1000
		System.out.println("\n****Número aleatorio menor a 1000****");
		System.out.println("----------------------------------------");
		Random r = new Random();

		int num = r.nextInt(1000);
		System.out.println(numero);
		
		System.out.println("\n****Añadir texto****");
		System.out.println("-----------------------");
		System.out.println(añadirTexto(texto));

		
		System.out.println("\n****Mostrar la segunda plabra****");
		System.out.println("-----------------------------------");
		System.out.println(mostrarSegundaPalabra(texto));
		
		System.out.println("\n****Texto separado con guión****");
		System.out.println("-----------------------------------");
		mostrarTextoGuion(texto);
		
		System.out.println("\n****Mostrar cada palabra en diferentes líneas****");
		System.out.println("----------------------------------------------------");
		palabraPorLinea(texto);
	}
	
	
	public static String añadirTexto(String texto) {		
		String nuevo_texto = texto.substring(0, 13) + "orienetada a objetos" + texto.substring(12);
		
		return nuevo_texto;
	}
	
	
	public static String mostrarSegundaPalabra(String texto) {
		String nuevo_texto = añadirTexto(texto);
		String[] lista = nuevo_texto.split(" ");
		String palabra = lista[1];
		
		return palabra;
	}
	
	
	public static void mostrarTextoGuion(String texto) {
		String nuevo_texto = añadirTexto(texto);
		
		System.out.println(nuevo_texto.replace(" ", "-"));
	}
	
	
	public static void palabraPorLinea(String texto) {
		String nuevo_texto = añadirTexto(texto);
		String[] palabras = nuevo_texto.split(" ");
		
		for (String palabra : palabras) {
			System.out.println(palabra);
		}
	}

}
