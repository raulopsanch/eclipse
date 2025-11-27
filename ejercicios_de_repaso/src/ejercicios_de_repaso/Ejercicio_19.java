package ejercicios_de_repaso;

import java.util.Scanner;

public class Ejercicio_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce una frase: ");
		String cadena = entrada.nextLine();
		
		devolverPalabras(cadena);
	}

	public static void devolverPalabras(String texto) {
		
		for (int i = 0; i < texto.length(); i++) {
			if(texto.charAt(i) != ' ') {
				System.out.print(texto.charAt(i));
			} else {
				System.out.println();
			}
		}
	}
}
