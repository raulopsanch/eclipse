package ejercicios_de_repaso;
/*
Crea una función que reciba un array de calificaciones (números del 0 al 10) y:

Calcule el promedio

Encuentre la calificación más alta y más baja

Cuente cuántas calificaciones son aprobatorias (≥6)

Retorne un objeto con esta información
*/

import java.util.Random;

public class Ejercicio_22 {

	public static void main(String[] args) {
		Random objetoAleatorio = new Random();
		double[] notas = {3.45, 10.0, 7.89, 1.23, 8.91, 10.0, 4.56, 2.34, 9.87, 5.67, 0.12, 10.0, 6.78, 3.21, 8.76};
		
		for(int i = 0; i < notas.length; i++) {
			double num = objetoAleatorio.nextDouble(0, 10.0);
		}
		
		System.out.println("Notas: " + mostrarArray(notas));
		System.out.println("Nota más alta: " + notaAlta(notas));
		System.out.println("Nota más baja: " + notaBaja(notas));
		System.out.println("Total de notas: " + totalNotas(notas));
		System.out.println("La nota media es: " + promedio(notas));
	}
	public static String mostrarArray(double[] array) {
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
	
	public static double notaAlta(double[] array) {
		double notaMayor = array[0];
		
		for(int i = 0; i < array.length; i ++) {
			if (array[i] > notaMayor) {
				notaMayor = array[i];
			}
		}
		
		return notaMayor;
	}
	
	public static double notaBaja(double[] array) {
		double notaMenor = array[0];
		
		for(int i = 0; i < array.length; i ++) {
			if (array[i] < notaMenor) {
				notaMenor = array[i];
			}
		}
		
		return notaMenor;
	}
	
	public static int totalNotas(double[] array) {
		int contador = 0;
		
		for(int i = 0; i < array.length; i++) {
			contador++;
		}
		
		return contador;
	}
	
	public static double promedio(double[] array) {
		double notaMedia = 0;
		
		for(int i = 0; i < array.length; i++) {
			notaMedia += array[i];
		}
		
		double promedio = Math.round((notaMedia / array.length) * 100.0) / 100.0 ;
		return promedio;
	}
}
