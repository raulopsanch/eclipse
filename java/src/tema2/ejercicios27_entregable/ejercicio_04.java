package tema2.ejercicios27_entregable;

import java.util.Scanner;

public class ejercicio_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce el primer número: ");
		int num1 = entrada.nextInt();
		
		System.out.print("Introduce el segundo número: ");
		int num2 = entrada.nextInt();
		
		System.out.print(numeroDivisible(num1, num2));
	}

	static boolean numeroDivisible(int j, int k) {
		if (j % k == 0) {
			return true;
		} else {
			return false;
		}
	}
}
