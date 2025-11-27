package tema1.actividades_entraga;

/*
2. Diseña un programa que calcule el área de un círculo. El programa pedirá
el radio y mostrará el área (pi*radio*radio).
*/

import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double radio, circulo;
		double pi = 3.1416;
		
		System.out.print("\nIntroduce el radio del círculo: ");
		radio = entrada.nextDouble();
		
		circulo = pi * (radio * radio);
		 System.out.println("\nEl área del círculo con radio " + radio + 
				 " es: " + circulo);
	}

}
