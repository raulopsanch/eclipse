package ejercicios_de_repaso;

import java.util.Scanner;

public class ejercicio_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int option;
		double num1, num2;
		
		do {
			System.out.println("\n1.- Sumar\n2.- Restar\n3.- Multiplicar\n4.- Dividir\n5.- Salir");
			System.out.print("Introduce una opción (Entre 1 y 5): ");
			option = entrada.nextInt();
			
			switch(option) {
				case 1:
					System.out.print("Introduce el primer número: ");
					num1 = entrada.nextDouble();
					
					System.out.print("Introduce el segundo número: ");
					num2 = entrada.nextDouble();
					
					System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
					break;
				case 2:
					System.out.print("Introduce el primer número: ");
					num1 = entrada.nextDouble();
					
					System.out.print("Introduce el segundo número: ");
					num2 = entrada.nextDouble();
					
					System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
					break;
				case 3:
					System.out.print("Introduce el primer número: ");
					num1 = entrada.nextDouble();
					
					System.out.print("Introduce el segundo número: ");
					num2 = entrada.nextDouble();
					
					System.out.println(num1 + " x " + num2 + " = " + (num1*num2));
					break;
				case 4:
					System.out.print("Introduce el primer número: ");
					num1 = entrada.nextDouble();
					
					System.out.print("Introduce el segundo número: ");
					num2 = entrada.nextDouble();
					
					System.out.println(num1 + " ÷ " + num2 + " = " + (num1/num2));
					break;
				case 5:
					System.out.println("Saliendo...");
					break;
				default:
					System.out.println("Opción incorrecta. ");
					break;
			}
		} while(option != 5);
		System.out.print("Programa terminado.");
		
	}

	public static double sumar(double i, double j) {
		return i + j;
	}
	
	public static double restar(double i, double j) {
		return i - j;
	}
	
	public static double multiplicar(double i, double j) {
		return i * j;
	}
	
	public static double dividir(double i, double j) {
		if (j == 0) {
			return 0;
		}
		return i / j;
	}
}
