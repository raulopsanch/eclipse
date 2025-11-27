package tema2.ejercicios27_entregable;

import java.util.Scanner;

public class ejercicio_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		int num = entrada.nextInt();
		
		int result = calcularFactorial(num);
		System.out.print("El factorial de " + num + " es: " + result);
	}

	static int calcularFactorial(int n) {
		int resultado = 1;
		
		for (int i = 1; i <= n; i++) {
			resultado *= i;
		}
		
		return resultado;
	}
}
