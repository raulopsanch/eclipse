package arrays1;

import java.util.Scanner;

public class Ejercicio_13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Introduzca un número de 8 dígitos: ");
		int digit = entrada.nextInt();
		
		char letra = asignar_letra(digit);
		System.out.println("\nEl dni es: " + digit + "-" + letra);

	}

	public static char asignar_letra(int numero) {
		char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
				'S', 'Q', 'V', 'H', 'L', 'C', 'k', 'E'};
		
		return letras[numero % 23];
	}
}
