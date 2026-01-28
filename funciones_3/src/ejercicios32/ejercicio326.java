package ejercicios32;

import java.util.Scanner;

public class ejercicio326 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce una palabra: ");
		String palabra = entrada.nextLine();
		
		System.out.print("Introduce una palabra: ");
		String palabra2 = entrada.nextLine();
		
		System.out.println(palabra + " --> " + palindromo(palabra));
		System.out.println(palabra2 + " --> " + palindromo(palabra2));
	}

	public static String palindromo(String text) {
		String textoInvertido = "";
		
		for(int i = text.length() - 1; i >= 0; i--) {
			textoInvertido += text.charAt(i);
		}
		
		if(text.equalsIgnoreCase(textoInvertido)) {
			return textoInvertido + " SÍ es un palíndromo";
		} else {
			return textoInvertido + " NO es un palíndromo";
		}
	}
}
