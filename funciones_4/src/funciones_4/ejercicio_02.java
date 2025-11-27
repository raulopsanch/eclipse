package funciones_4;

import java.util.Scanner;

public class ejercicio_02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce el tamaño del array: ");
		int tamanho = entrada.nextInt();
		
		int[] numeros = new int[tamanho];
		
		int i = 0;
		
		do {
			System.out.print("Introduce un número: ");
			numeros[i] = entrada.nextInt();
			
			i++;
		} while(i < tamanho);
		
		System.out.println("\nLos números introducidos son: ");
		for(int j = 0; j < tamanho; j++) {
			if(j == 0) {
				System.out.print(numeros[j]);
			} else if(j == tamanho - 1) {
				System.out.print(" y " + numeros[j]);
			} else {
				System.out.print(", " + numeros[j]);
			}
			
		}
	}

}
