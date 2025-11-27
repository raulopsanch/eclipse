package tema2.ejercicios26;

import java.util.Scanner;

public class ejercicio_3_dividir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce el dividendo: ");
		double dividendo = entrada.nextDouble();
		
		System.out.print("Introduce el divisor: ");
		double divisor = entrada.nextDouble();
		
		double result = dividir(dividendo, divisor);
		
		System.out.print(dividendo + " ÷ " + divisor + " = " + result);
	}

	static double dividir(double a, double b) {
		if (b != 0) {
			double result = a / b;
			return result;
		} else {
			return 0;
		}
	}
}
