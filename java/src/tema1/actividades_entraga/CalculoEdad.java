package tema1.actividades_entraga;

/*
5. Diseña un programa en Java que pida el año de nacimiento de una persona
y su nombre y escriba un mensaje del tipo: Paco tienes 24 años.
¿es necesario declarar 2 funciones Scanner?
*/

import java.util.Scanner;
import java.time.LocalDate;

public class CalculoEdad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		LocalDate fechaActual = LocalDate.now();
		int anhoActual = fechaActual.getYear();
		
		System.out.print("\nIntroduce tu nombre: ");
		String nombre = entrada.nextLine();
		
		System.out.print("Introduce tu año de nacimiento: ");
		int anhoNacimiento = entrada.nextInt();
		
		int edad = anhoActual - anhoNacimiento;
		System.out.println("\n" + nombre + "tienes " + edad + " años.");
	}

}
