package tema2.ejercicios26;

import java.util.Scanner;

public class ejercicio_6_area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		double num = entrada.nextDouble();
		
		double result = calcularArea(num);
		System.out.print("El área de un cuadrado de lado" +
		num + " es: " + result);
	}

	static double calcularArea(double n) {
		return n * n;
	}
}
