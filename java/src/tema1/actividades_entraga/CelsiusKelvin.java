package tema1.actividades_entraga;

/*
1. Diseña un programa Java que transforme una temperatura dada en
centígrados a kelvin
*/

import java.util.Scanner;

public class CelsiusKelvin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double celsius, kelvin;
		
		System.out.print("\nIntroduce la temperatura en grados celsius: ");
		celsius = entrada.nextDouble();
		 
		 kelvin = celsius + 273.15;
		 System.out.println("\n" + celsius + " grados celsius equivalen a " + kelvin + 
		"grados kelvin");
	}

}
