package ejercicios_de_repaso;

import java.util.Scanner;

public class ejercicio_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce una palabra: ");
		String palabra = entrada.nextLine();
		
		System.out.print("Introduce una palabra: ");
		String palabra1 = entrada.nextLine();
		
		verificarPalindromo(palabra);
		verificarPalindromo(palabra1);
	}

	public static void verificarPalindromo(String texto) {
		String palindromo = "";
		
		for(int i = texto.length() - 1; i >= 0; i--) {
			palindromo += texto.charAt(i);
		}
		
		if(palindromo.equalsIgnoreCase(texto)) {
			System.out.println(texto + " --> " + palindromo + " SÍ es palíndromo.");
		} else {
			System.out.println(texto + " --> " + palindromo + " NO es palíndromo.");
		}
	}
}
