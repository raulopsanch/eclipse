package tema2.ejercicios27_entregable;

import java.util.Scanner;

public class ejercicio_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double num1, num2;
		int opcion;
		
		do {
			System.out.print("1.- Suma\n2.- Resta\n3.- Multiplicación"
					+ "\n4.- División\n5.- Salir\nIntroduce una opción: ");
			opcion = entrada.nextInt();
			
			if (opcion != 5) {
				System.out.print("Introduce el primer número: ");
				num1 = entrada.nextDouble();
				
				System.out.print("Introduce el segundo número: ");
				num2 = entrada.nextDouble();
				
				calculadora(num1, num2, opcion);
			}
						
		} while(opcion != 5);
		System.out.println("programa finalizado");
	}

	static void calculadora(double n, double m, int opcion) {
		switch (opcion) {
			case 1:
				System.out.println("El resultado de la operación es: " + (n + m));
				break;
			case 2:
				System.out.println("El resultado de la operación es: " + (n - m));
				break;
			case 3: 
				System.out.println("El resultado de la operación es: " + (n * m));
				break;
			case 4: 
				System.out.println("El resultado de la operación es: " + (n / m));
				break;
			default:
				System.out.println("Error. Introduce un número entre 1 y 4");
				break;
		}
	}
}
