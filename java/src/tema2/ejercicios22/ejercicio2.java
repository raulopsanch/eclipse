package tema2.ejercicios22;


// Diseña un programa Java que solicite un numero e indique si es par o impar.

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		int numero = entrada.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println(numero + " es par");
		} else {
			System.out.println(numero + " es impar");
		}
	}

}
