package tema2.ejercicios23_entregable;

/*
Solicitar dos enteros al usuario y mostrar en pantalla si son pares o
impares (individualmente). El programa dará al usuario la posibilidad de
repetir con otros dos números.
*/

import java.util.Scanner;

public class ejercicio_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int num1, num2, opcion;
		
		do {
			System.out.print("Introduce el primer número: ");
			num1 = entrada.nextInt();
			
			System.out.print("Introduce el segundo número: ");
			num2 = entrada.nextInt();
			
			if (num1 % 2 == 0) {
				System.out.println(num1 + " es par");
			} else {
				System.out.println(num1 + " es impar.");
			}
			
			if (num2 % 2 == 0) {
				System.out.println(num2 + " es par");
			} else {
				System.out.println(num2 + " es impar.");
			}
			
			System.out.println("\n¿Deseas verificar otros dos números?");
			System.out.println("1.- Sí\n2.- No (Salir)");
			System.out.print("Seleccione una opción: ");
			opcion = entrada.nextInt();
		} while (opcion == 1);
		
		System.out.print("\nPrograma terminado");		
	}

}
