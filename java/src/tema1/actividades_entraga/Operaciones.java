package tema1.actividades_entraga;

/*
3. Diseña un programa Java que pida tres números y escriba en pantalla, la
suma de los tres, su producto y la resta del primero más el segundo menos
el tercero.
*/

import java.util.Scanner;

public class Operaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int num1, num2, num3, resta;
		
		System.out.print("\nIntroduce el número 1: ");
		num1 = entrada.nextInt();
		
		System.out.print("\nIntroduce el número 2: ");
		num2 = entrada.nextInt();
		
		System.out.print("\nIntroduce el número 3: ");
		num3 = entrada.nextInt();
		
		System.out.print("\nLa suma de " + num1 + ", " + num2 + ", " + num3 + " es "
		+ (num1 + num2 + num3));
		
		System.out.print("\nEl producto de " + num1 + ", " + num2 + ", " + num3 + 
		" es " + (num1 * num2 * num3));
		
		resta = (num1 + num2) - num3;
		System.out.print("\nLa resta de " + num1 + ", " + num2 + ", " + num3 + " es "
		+ resta);
	}

}
