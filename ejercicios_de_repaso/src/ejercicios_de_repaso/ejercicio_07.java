package ejercicios_de_repaso;

import java.util.Scanner;

public class ejercicio_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce una frase: ");
		String cadena = entrada.nextLine();
		
		System.out.println("Número total de vocales: " + contarVocales(cadena));
	}

	public static int contarVocales(String texto) {
		texto = texto.toLowerCase();
		String vocales = "aeiouáéíóú";
		int contador = 0;
		
		for(int i = 0; i < texto.length(); i++) {
			for(int j = 0; j < vocales.length(); j++) {
				if(texto.charAt(i) == vocales.charAt(j)) {
					contador++;
				}
			}
		}
		return contador;
	}
}
