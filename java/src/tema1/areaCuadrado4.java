package tema1;

import java.util.Scanner;

public class areaCuadrado4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce el lado del cuadrado: ");
		double lado = entrada.nextDouble();
		
		double cuadrado = lado * lado;
		System.out.println("El área del cuadrado de lado " + lado + "cm es de " 
		+ cuadrado + "cm cuadrados.");
	}

}
