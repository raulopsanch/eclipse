package tema2.ejercicios21;

/*
Diseña un programa Java que transforme una temperatura dada en centígrados
a kelvin y muestre el resultado cuando los centígrados sean superiores a 35. 
*/

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce una temperatura (en centígrados): ");
		double centigrados = entrada.nextDouble();
		
		if (centigrados >= 35) {
			double kelvin = centigrados + 273.15;
			System.out.println("\n" + centigrados + "º centígrados equivalen a "
					+ kelvin + "º kelvin.");
		} else {
			System.out.println("\nError. Introduce como mínimo 35º.");
		}
		
	}

}
