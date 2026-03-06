package Ejercicio_02;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public class UsoDeFunciones {

	public static void main(String[] args) {
		double numero = 13;		
		
		System.out.println("****Raíz cuadrada de 13****");
		System.out.println("---------------------------");
		System.out.println("Raíz cuadrada de " + numero + "= " + Math.sqrt(numero));
				
		System.out.println("\n****13 elevado a 3****");
		System.out.println("------------------------");
		System.out.println("13^3= " + Math.pow(numero, 3));
				
		System.out.println("\n****Número aleatorio menor a 1000****");
		System.out.println("----------------------------------------");
		Random r = new Random();

		int num = r.nextInt(1000);
		System.out.println(num);
		
		
		String texto = "Programación en Java";

		
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
		
		
		System.out.println("\n****Reemplazar texto****");
		System.out.println("----------------------------------------------------");
		texto = reemplazarTexto(texto);
		System.out.println(texto);
		
		
		System.out.println("\n****Mostrar la segunda plabra****");
		System.out.println("-----------------------------------");
		System.out.println(mostrarSegundaPalabra(texto));
				
		System.out.println("\n****Fecha será dentro de 29 días****");
		System.out.println("--------------------------------------");
		System.out.println(LocalDate.now().plusDays(29));
		
		
		System.out.println("\n****Días transcurridos desde el 31-12-2015****");
		System.out.println("------------------------------------------------");
		
		LocalDate fechaObjetivo = LocalDate.of(2015, 12, 31);
		LocalDate fechaActual = LocalDate.now();
		
		long diasPasados = ChronoUnit.DAYS.between(fechaObjetivo, fechaActual);
		
		System.out.println("Fecha objetivo: " + fechaObjetivo);
		System.out.println("Fecha actual: " + fechaActual);
		System.out.println("Días transcurridos: " + diasPasados + " días");
		
		
		System.out.println("\n****Días transcurridos desde el 17-05-2020****");
		System.out.println("------------------------------------------------");
		
		fechaObjetivo = LocalDate.of(2020, 05, 17);
		fechaActual = LocalDate.now();
		
		diasPasados = ChronoUnit.DAYS.between(fechaObjetivo, fechaActual);
		
		System.out.println("Fecha objetivo: " + fechaObjetivo);
		System.out.println("Fecha actual: " + fechaActual);
		System.out.println("Días transcurridos: " + diasPasados + " días");
		
	}
	
	
	public static String añadirTexto(String texto) {
		if (texto.length() < 13) {
			return texto;
		}
		return texto.substring(0, 13) + "orientada a objetos" + texto.substring(12);		
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
	
	
	public static String reemplazarTexto(String texto) {
		String nuevo_texto = añadirTexto(texto);
		
		 if (nuevo_texto.contains("Programación orientada a objetos")) {
		        String nuevoTexto = nuevo_texto.replace("Programación orientada a objetos", "POO");
		        return nuevoTexto;
		    } else { 
		        return "error: texto no encontrado";
		    }
	}

}
