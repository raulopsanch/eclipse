package ejercicios_de_repaso;

import java.util.Random;

public class Ejercicio_21 {

	public static void main(String[] args) {
		Random objetoAleatorio = new Random();
		int[] numbers = new int[20];
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = objetoAleatorio.nextInt(100);
		}
		
		System.out.println("Contenido del array: ");
		mostrar_array(numbers);

	}
	
	public static void mostrar_array(int[] array) {
		System.out.print("[");
		
		for(int i = 0; i < array.length; i++) {
			if (i < array.length - 1) {
				System.out.print(array[i] + "-");
			} else {
				System.out.print(array[i] + "]");
			}
		}
	}

}
