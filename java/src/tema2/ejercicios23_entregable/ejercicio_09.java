package tema2.ejercicios23_entregable;

/*
Diseña un programa Java que solicite un número al usuario y diga si es par
o impar. El programa debe dar al usuario la posibilidad de repetir el
proceso salvo que se indique 9 para salir.
(****** Pulsar 9 para salir *****)
Introduzca un numero:
 El numero es par/impar
*/

import java.util.Scanner;

public class ejercicio_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int num;
		
		do {
			System.out.print("Introduce un número (9 para salir): ");
			num = entrada.nextInt();
			
			if (num != 9) {
				if (num % 2 == 0) {
					System.out.println(num + " es par.");
				} else {
					System.out.println(num + " es impar.");
				}
			} else {
				System.out.println("Saliendo...");
			}
		} while(num != 9);
		System.out.print("\nPrograma terminado");
	}

}
