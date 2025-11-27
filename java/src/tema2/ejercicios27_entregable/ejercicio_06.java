package tema2.ejercicios27_entregable;

import java.util.Scanner;

public class ejercicio_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce el primer número: ");
		double num1 = entrada.nextDouble();
		
		System.out.print("Introduce el segundo número: ");
		double num2 = entrada.nextDouble();
		
		System.out.print("El resultado de la división es: " + dividir(num1, num2));
	}

	static double dividir (double n, double m) {
		return n / m;
	}
}
