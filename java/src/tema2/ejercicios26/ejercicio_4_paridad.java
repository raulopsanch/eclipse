package tema2.ejercicios26;

import java.util.Scanner;

public class ejercicio_4_paridad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		int num = entrada.nextInt();
		
		boolean par = paridad(num);
		
		if (par) {
			System.out.print("El número introducido es par.");
		} else {
			System.out.print("El número introducido es impar.");
		}
	}

	static boolean paridad(int n) {
		if (n % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
