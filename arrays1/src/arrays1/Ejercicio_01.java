package arrays1;

public class Ejercicio_01 {

	public static void main(String[] args) {
		String[] cadena = {"es", "hola", "Juan", "adiós", "tonto"};
		
		// mostrar las posiciones 2 y 3 del array
		System.out.println(cadena[1] + " " + cadena[2]);
		
		// mostrar las posiciones 3, 1 y 5 del array
		System.out.println(cadena[2] + " " + cadena[0] + " " + cadena[4]);

		// mostrar las posiciones 4 y 1
		System.out.println(cadena[3] + " " + cadena[0]);
	}
}