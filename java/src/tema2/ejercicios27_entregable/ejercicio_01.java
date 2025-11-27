package tema2.ejercicios27_entregable;

import java.util.Scanner;

public class ejercicio_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce el primer número: ");
		int num1 = entrada.nextInt();
		
		System.out.print("Introduce el segundo número: ");
		int num2 = entrada.nextInt();
		
		System.out.print(num1 + " - " + num2 + "= " + restar(num1, num2));
	}

	static int restar(int j, int k) {
		return j - k;
	}
}
