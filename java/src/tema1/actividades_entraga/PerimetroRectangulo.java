package tema1.actividades_entraga;

/*
4. Diseña un programa Java que calcule y muestre el perímetro de un
rectángulo. El programa debe solicitar la medida de los lados del
rectángulo
*/

import java.util.Scanner;

public class PerimetroRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Base del rectángulo: ");
		double b = entrada.nextDouble();
		
		System.out.print("Altura del rectángulo: ");
		double h = entrada.nextDouble();
		
		double perimetro = 2 * (b+h);
		System.out.println("\nRectángulo:\nBase: " + b + "cm.\nAltura: " + h + "cm");
		System.out.println("Perímetro: " + perimetro + "cm cuadrados.");
	}

}
