package tema2.ejercicios22;

/*
Realizar un programa que pida la siguiente información: hora y color del 
indicador (rojo, amarillo, verde);
- Si hora es mayor de 22 horas y color verde  Indicar “Alarma conectada”.
- Si hora es mayor a 22 horas y color amarillo  Indicar “Alarma con problemas”.
- Si hora es mayor a 22 horas y color rojo  Indicar “Alarma desactivada”.
- Si hora es menor a 22 horas  Indicar “No es necesario activar la alarma”. 
*/

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		
		System.out.print("Introduce la hora: ");
		double hora = entrada.nextDouble();
		
		System.out.print("Introduce un color (rojo, amarillo o verde): ");
		String color = entrada2.nextLine().toLowerCase();
		
		if ((hora > 22) && (color.equals("verde"))) {
			System.out.println("Alarma conectada.");
		} else if ((hora > 22) && (color.equals("amarillo"))) {
			System.out.println("Alarma con problemas.");
		} else if ((hora > 22) && (color.equals("rojo"))) {
			System.out.println("Alarma desactivada."); 
		} else if ((hora < 22) && (color.equals(""))) {
			System.out.println("No es necesario activar la alarma.");
		}
	}
}
