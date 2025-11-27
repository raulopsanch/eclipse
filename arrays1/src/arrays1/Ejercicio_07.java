package arrays1;

import java.util.Scanner;

public class Ejercicio_07 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce el tamaño del array: ");
		int tamanho = entrada.nextInt();
		
		int[] numeros = new int[tamanho];
		
		System.out.print("El contenido del array es: ");
		mostrar_array(numeros);
	}
	
	public static void mostrar_array(int[] array) {
		int num = 3;
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(num + " ");
			num += 2;
		}
	}
}