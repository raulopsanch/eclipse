package tema2.ejercicios22;

/*
Diseña un programa Java que solicite una nota del 0 al 10 y la califique de la 
siguiente forma: 
 “Suspenso” si es menor que 5 
 "Aprobado" si es menor que 6 
 "Bien" si es 6 o 7 
 "Notable" si es 8 o 9 
 "Sobresaliente" si es 10 
*/

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce una nota: ");
		double nota = entrada.nextDouble();
		
		if ((nota < 0) || (nota > 10)) {
			System.out.println("Error. Introduce una nota válida.");
		} else if (nota < 5) {
			System.out.println("Suspenso.");
		} else if (nota < 6) {
			System.out.println("Suficiente.");
		} else if ((nota >= 6) && (nota < 8)) {
			System.out.println("Bien.");
		} else if ((nota >= 8) && (nota < 10)) {
			System.out.println("Notable.");
		} else if (nota == 10){
			System.out.println("Sobresaliente.");
		}
	}

}
