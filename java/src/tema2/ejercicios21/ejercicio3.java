package tema2.ejercicios21;

/*
Diseña un programa Java que calcule y muestre el perímetro de un rectángulo.
El programa debe solicitar la medida de los lados del rectángulo y realizar
el cálculo si los lados son mayores a 2. 
*/

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double b, h, p;
		
		System.out.print("Base de rectángulo: ");
		b = entrada.nextDouble();
		
		System.out.print("Altura de rectángulo: ");
		h = entrada.nextDouble();
		
		if ((b > 2) && (h > 2)) {
			p = 2 * (b + h);
			System.out.println("\nRectángulo:\nBase: " + b + "cm.\nAltura: " + h + "cm");
			System.out.println("Perímetro: " + p + "cm cuadrados.");
		} else {
			System.out.println("\nError. Introduce un número mayor a 2.");
		}
	}

}
