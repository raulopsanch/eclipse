package ejercicios_de_repaso;

import java.util.Scanner;

public class ejercicio_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int option;
		
		do {
			System.out.print("\n1.- Convertir a mayúsculas.\n2.- Convertir a minúsculas."
					+ "\n3.- Reemplazar espacios por guiones.\n4.- Mostrar los primeros cinco carácteres."
					+ "\n5.- Salir\nIntroduce una opción: ");
			option = entrada.nextInt();
			
			mostrarMenu(option);
		}while(option != 5);
		System.out.println("Programa terminado.");
	}

	public static void mostrarMenu(int opcion) {
		switch(opcion) {
		case 1:
			System.out.println("Convertir a mayúsculas.");
			break;
		case 2:
			System.out.println("Convertir a minúsculas.");
			break;
		case 3:
			System.out.println("Reemplazar espacios por guiones.");
			break;
		case 4:
			System.out.println("Mostrar los primeros cinco carácteres.");
			break;
		case 5:
			System.out.println("Saliendo...");
			break;
		default:
			System.out.println("Introduce un número entre 1 y 5.");
			break;
		}
	}
}
