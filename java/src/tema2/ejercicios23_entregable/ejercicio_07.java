package tema2.ejercicios23_entregable;

/*
Diseña un programa Java que pida un número entero al usuario y muestre
cada número desde 1 hasta el número tecleado. Es decir, si el usuario
teclea el 7, el programa imprimirá: 1, 2, 3, 4, 5, 6, 7.
*/

import java.util.Scanner;

public class ejercicio_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		int num = entrada.nextInt();
		
		int i = 1;
		while (i <= num) {
			System.out.print(i);
			
			if (i < num) {
				System.out.print(", ");
			} else if (i == num) {
				System.out.print(".");
			}

			i++;
		}
	}

}
