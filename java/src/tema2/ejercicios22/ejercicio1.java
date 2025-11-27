package tema2.ejercicios22;

/*
Diseña un programa Java que solicite dos números, a y b, 
y comprueba cual es el mayor o si son iguales y lo indique por pantalla. 
*/

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce el primer número: ");
		int num1 = entrada.nextInt();
		
		System.out.print("Introduce el segundo número: ");
		int num2 = entrada.nextInt();
		
		if (num1 > num2) {
			System.out.println(num1 + " es mayor que " + num2);
		} else if (num2 > num1) {
			System.out.println(num2 + " es mayor que " + num1);
		} else {
			System.out.println("Ambon números son iguales");
		}
	}

}
