package ejercicios_de_repaso;
/*
Escribe una función que:

Reciba un número límite

Genere un array con todos los números primos hasta ese límite

Use bucles anidados y condicionales para verificar si cada número es primo

Retorne el array de números primos
*/

import java.util.Scanner;

public class Ejercicio_23 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//System.out.print("Introduce un número: ");
		//int limit = entrada.nextInt();
		System.out.print("Límite 10: ");
		mostrar_array(generarPrimos(10));
		System.out.println();
		System.out.print("Límite 20: ");
		mostrar_array(generarPrimos(20));
		System.out.println();
		System.out.print("Límite 30: ");
		mostrar_array(generarPrimos(30));
		System.out.println();
		System.out.print("Límite 1: ");
		mostrar_array(generarPrimos(1));
		System.out.println();
	}
	
	public static void mostrar_array(int[] array) {
		
		for(int numero : array) {
			System.out.print(numero + " ");
		}
	}
	
	public static boolean esPrimo(int numero) {
		if(numero <= 1) {
			return false;
		}
		
		if(numero == 2) {
			return true;
		}
		
		if(numero % 2 == 0) {
			return false;
		}
		
		for(int divisor = 3; divisor <= numero / 2; divisor += 2) {
			if(numero % divisor == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static int[] generarPrimos(int limite) {
		if (limite < 2) {
			return new int[0];
		}
		
		int cantidadPrimos = 0;
		
		for (int numero = 2; numero <= limite; numero++) {
			if (esPrimo(numero)) {
				cantidadPrimos ++;
			}
		}
		
		// Creamos el array con el tamaño exacto
		int[] primos = new int[cantidadPrimos];
		int indice = 0;
		
		// Llenamos el array
		for(int numero = 2; numero <= limite; numero++) {
			if(esPrimo(numero)) {
				primos[indice] = numero;
				indice ++;
			}
		}
		return primos;
	}

}
