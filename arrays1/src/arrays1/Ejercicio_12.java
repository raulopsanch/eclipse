package arrays1;

import java.util.Random;
import java.util.Arrays;

public class Ejercicio_12 {

	public static void main(String[] args) {
		Random objetoAleatorio = new Random();
		int[] numbers = new int[20];
		int[] numerosOrdenados = new int[numbers.length];
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = objetoAleatorio.nextInt(100);
		}
		
		System.out.print("Contenido del array: ");
		mostrar_array(numbers);
		System.out.println();
		System.out.println("El número menor es: " + num_menor(numbers));
		System.out.println("El número mayor es: " + num_mayor(numbers));
		numerosOrdenados = ordenar_array(numbers);
		System.out.print("Array ordenado: ");
		mostrar_array(numerosOrdenados);
	}

	public static void mostrar_array(int[] array) {
		
		for(int numero : array) {
			System.out.print(numero + " ");
		}
	}
	
	public static int num_menor (int[] array) {
		int menor = array[0];
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] < menor) {
				menor = array[i];
			}
		}
		
		return menor;
	}
	
	public static int num_mayor (int[] array) {
		int mayor = array[0];
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] > mayor) {
				mayor = array[i];
			}
		}
		
		return mayor;
	}
	
	public static int[] ordenar_array(int[] array) {
		int[] ordenado = array.clone();
		/*for(int i = 0; i < array.length - 1; i++) {
			for(int j = 0; j < array.length - 1 - i; j++) {
				if(array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array; */
		Arrays.sort(ordenado);
		return ordenado;
	}
}