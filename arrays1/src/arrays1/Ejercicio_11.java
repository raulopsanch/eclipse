package arrays1;

import java.util.Scanner;

public class Ejercicio_11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double[] notas = new double[5];
		
		for(int i = 0; i < notas.length; i++) {
			System.out.print("Introduce tu nota: ");
			notas[i] = entrada.nextDouble();
		}
		
		System.out.println();
		System.out.println("Las notas obtenidas son: " + mostrar_array(notas));
		System.out.println("La nota media es: " + nota_media(notas));
		System.out.println("La nota más alta obtenida es: " + nota_alta(notas));
		System.out.println("La nota más baja obtenida es: " + nota_menor(notas));
	}
	
	public static String mostrar_array(double[] array) {
		String resultado = "[";
		
		for(int i = 0; i < array.length; i++) {
			resultado += array[i];
			
			if(i < array.length - 1) {
				resultado += ", ";
			}
		}
		resultado += "]";
		return resultado;
	}
	
	public static double nota_media (double[] array) {
		double nota_media = 0;
		
		for(int i = 0; i < array.length; i++) {
			nota_media += array[i];
		}
		
		return (nota_media / array.length);
	}
	
	public static double nota_alta (double[] array) {
		double alta = array[0];
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] > alta) {
				alta = array[i];
			}
		}
		
		return alta;
	}
	
	public static double nota_menor (double[] array) {
		double menor = array[0];
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] < menor) {
				menor = array[i];
			}
		}
		
		return menor;
	}

}
