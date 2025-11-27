package tema2.ejercicios27_entregable;

import java.util.Scanner;

public class ejercicio_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce el primer número: ");
		double num1 = entrada.nextDouble();
		
		System.out.print("Introduce el segundo número: ");
		double num2 = entrada.nextDouble();
		
		System.out.print("1.- Suma\n2.- Resta\n3.- Multiplicación"
				+ "\n4.- División\nIntroduce una opción: ");
		int opcion = entrada.nextInt();
		
		calculadora(num1, num2, opcion);
	}

	static void calculadora(double n, double m, int opcion) {
		switch (opcion) {
		case 1:
			System.out.print("El resultado de la operación es: " + (n + m));
			break;
		case 2:
			System.out.print("El resultado de la operación es: " + (n - m));
			break;
		case 3: 
			System.out.print("El resultado de la operación es: " + (n * m));
			break;
		case 4: 
			System.out.print("El resultado de la operación es: " + (n / m));
			break;
		default:
			System.out.print("Error. Introduce un número entre 1 y 4");
			break;
		}
	} 
}
