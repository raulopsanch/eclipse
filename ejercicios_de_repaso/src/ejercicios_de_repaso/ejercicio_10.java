package ejercicios_de_repaso;

import java.util.Scanner;

public class ejercicio_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String palabra1, palabra2;
		
		do {
			System.out.print("Introduce la primera palabra: ");
			palabra1 = entrada.nextLine();
			
			System.out.print("Introduce la primera palabra: ");
			palabra2 = entrada.nextLine();
			
			if(!compararPalabras(palabra1, palabra2)) {
				System.out.println("Las dos palabras son diferentes.");
			}
		} while(!compararPalabras(palabra1, palabra2));
		System.out.println("Las dos palabras son iguales.");
		System.out.print("\nPrograma terminado.");
	}

	public static boolean compararPalabras(String palabra1, String palabra2) {
		if(!palabra1.equalsIgnoreCase(palabra2)) {
			return false;
		}
		return true;
	}
}
