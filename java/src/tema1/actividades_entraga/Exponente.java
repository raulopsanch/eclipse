package tema1.actividades_entraga;

/*
8. Diseña un programa que solicite un número entero al usuario y muestre el
valor del cuadrado, cubo y el de ese número elevado a cuatro.
*/

import java.util.Scanner;

public class Exponente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int numero, cuadrado, cubo, cuarta;
		
		System.out.print("\nIntroduce un número: ");
		numero = entrada.nextInt();
		
		cuadrado = numero * numero;
		System.out.println("\nElevado al cuadrado: " + cuadrado);
		
		cubo = numero * numero * numero;
		System.out.println("Elevado al cubo: " + cubo);
		
		cuarta = numero * numero * numero * numero;
		System.out.println("Elevado a la cuarta: " + cuarta);
	}

}
