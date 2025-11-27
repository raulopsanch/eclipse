package arrays1;

import java.util.Scanner;

public class Ejercicio_02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] numeros = new int[8];
		
		int i = 0;
		while(i < numeros.length) {
			System.out.print("Introduce el número de la posición " + i +": ");
			numeros[i] = entrada.nextInt();
			
			i++;
		}
		
		System.out.print("\nEl contenido es: ");
		for(int j = 0; j < numeros.length; j++) {
			System.out.print(numeros[j] + "  ");
		}

	}

}