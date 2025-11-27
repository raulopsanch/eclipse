package tema1;

import java.util.Scanner;

public class areaRectangulo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce la base del rectángulo: ");
		double base = entrada.nextDouble();
		
		System.out.print("Introduce la altura del rectángulo: ");
		double altura = entrada.nextDouble();
		
		double rectangulo = base * altura;
		
		System.out.println("Rectángulo:\nbase: " + base + "cm\naltura: " + altura + "cm");
		System.out.println("Área del rectángulo: " + rectangulo + "cm cuadrados");
	}

}
