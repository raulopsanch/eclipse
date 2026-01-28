package ejercicios32;

import java.util.Scanner;

public class ejercicio321 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce la primera letra: ");
		char letra1 = entrada.next().charAt(0);
		
		System.out.print("Introduce la segunda letra: ");
		char letra2 = entrada.next().charAt(0);
		
		System.out.print("Introduce la tercera letra: ");
		char letra3 = entrada.next().charAt(0);
		
		System.out.print("Introduce la cuarta letra: ");
		char letra4 = entrada.next().charAt(0);
		
		System.out.println(formarPalabra(letra1, letra2, letra3, letra4));
	}

	public static String formarPalabra(char a, char b, char c, char d) {
		String palabra = "" + a + b + c + d;
		return palabra;
	}
}
