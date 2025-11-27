package tema2.ejercicios23_entregable;

/*
Diseña un programa Java que dibuje tantas filas de 10 asteriscos en
pantalla si el número está comprendido en:
1 línea de asterisco si el número es menor de 10
2 “” “” “” si es comprendido entre 10 y 20
3 “” “” “” si es comprendido entre 20 y 30
10 “” “” “” si mayor de 30
*/

import java.util.Scanner;

public class ejercicio_08 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		int num = entrada.nextInt();
		
		if (num < 10) {
			for (int i = 1; i < 21; i++) {
				System.out.print("* ");
			}
			System.out.println();
		} else if ((num >= 10) && (num < 20)) {
			for (int i = 1; i <=2; i++) {
				for (int j = 1; j < 21; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		} else if (num >= 20 && num < 30) {
			for (int i = 1; i <= 3; i++) {
				for (int j = 1; j < 21; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		} else if (num >= 30) {
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 20; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}
	}

}
