package tema1.actividades_entraga;


/*
7. Diseña un programa Java que pida tres números de tipo double y calcule la
media aritmética de los mismos.
*/

import java.util.Scanner;

public class MediaAritmetica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce el primer número: ");
		double num1 = entrada.nextDouble();
		
		System.out.print("Introduce el segundo número: ");
		double num2 = entrada.nextDouble();
		
		System.out.print("Introduce el tercer número: ");
		double num3 = entrada.nextDouble();
		
		double media = (num1 + num2 + num3) / 3;
		System.out.println("Número: " + num1 + ", " + num2 + ", " + num3);
		System.out.println("Media: " + media);
	}

}
