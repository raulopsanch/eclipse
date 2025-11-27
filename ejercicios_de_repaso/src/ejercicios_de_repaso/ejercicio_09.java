package ejercicios_de_repaso;

import java.util.Scanner;

public class ejercicio_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce una frase: ");
		String frase = entrada.nextLine();
		
		System.out.print("Introduce una palabra: ");
		String palabra = entrada.nextLine();
		
		mostrarPalabra(frase, palabra);
	}

	public static void mostrarPalabra(String texto, String palabra) {
		if(texto.toLowerCase().contains(palabra.toLowerCase())) {
			int pos = texto.toLowerCase().indexOf(palabra.toLowerCase());
			System.out.println("La palabra " + palabra + " está en la posición: " + pos);
		} else {
			System.out.println("La palabra " + palabra + " no está en la frase.");
		}
		
	}
}
