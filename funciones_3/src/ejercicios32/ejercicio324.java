package ejercicios32;

import java.util.Scanner;

public class ejercicio324 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce la cadena de texto: ");
		String cadena = entrada.nextLine();
		
		System.out.print("Total vocales: " + contarVocales(cadena));
	}
	
	public static int contarVocales(String text) {
		text = text.toLowerCase();
		String vocales = "aeiouáéíóú";
		int contarVocales = 0;
		
		for(int i = 0; i < text.length(); i++) {
			char caracter = text.charAt(i);
			for(int j = 0; j < vocales.length(); j++) {
				if(caracter == vocales.charAt(j)) {
					contarVocales++;
					break;
				}
			}
		}
		return contarVocales;
	}

}
