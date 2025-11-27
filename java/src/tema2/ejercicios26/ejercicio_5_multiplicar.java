package tema2.ejercicios26;

import java.util.Scanner;

public class ejercicio_5_multiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce el primer número: ");
		int num1 = entrada.nextInt();
		
		System.out.print("Introduce el segundo número: ");
		int num2 = entrada.nextInt();
		
		int result = multiplicar(num1, num2);
		System.out.print("\n" + num1 + " x " + num2 +" = " + result);
	}

	static int multiplicar(int a, int b) {
		return a * b;
	}
}
