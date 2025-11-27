package tema2.ejercicios21;

/*
Diseña un programa Java que solicite una cantidad en metros y
convierta en centímetros si es mayor a 5 metros. 
*/

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce un número (en metros): ");
		double metros = entrada.nextDouble();
		
		if (metros >= 5) {
			double centimetros = metros * 100;
			System.out.println("\n" + metros + "m eqivalen a " + centimetros + "cm.");
		} else {
			System.out.println("\nError. Introduce un número mayor o igual a 5.");
		}
		
	}

}
