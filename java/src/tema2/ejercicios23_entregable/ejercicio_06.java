package tema2.ejercicios23_entregable;

/*
Diseña un programa Java que pida un número entero comprendido entre 1
y 20, y que calcule la tabla de multiplicar de ese número. Si no está
comprendido entre 1 y 20 mostrar un mensaje de error.
*/

import java.util.Scanner;

public class ejercicio_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce un número (entre 1 y 20): ");
		int num = entrada.nextInt();
		
		if ((num < 1) || (num > 20)) {
			System.out.print("\nError. Introduce un número entre 1 y 20.");
		} else {
			for (int i = 0; i < 11; i++) {
				System.out.println(num + " x " + i + " = " + (i * num));
			}
		}
	}

}
