package tema2.ejercicios21;

import java.util.Scanner;

/*
Diseña un programa en Java que pida el año de nacimiento de una persona
y su nombre y escriba un mensaje indicando si eres mayor de edad o no,
es decir si tiene 18 o mas años:  Rubén es mayor de edad, tiene 20 años,
o por el contrario, Rubén es menor de edad, tiene 17 años. 
*/

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada1 = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		
		System.out.print("Introduce tu nombre: ");
		String nombre = entrada1.nextLine();

		System.out.print("Introduce tu edad: ");
		int edad = entrada2.nextInt();
		
		if (edad >= 18) {
			System.out.print("\n" + nombre + " es mayor de edad, tiene " + edad +
					" años.");
		} else {
			System.out.print("\n" + nombre + " es menor de edad, tiene " + edad +
					" años.");
		}
	}

}
