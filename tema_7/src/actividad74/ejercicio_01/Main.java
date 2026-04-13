package actividad74.ejercicio_01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		GestionPersonas gp = new GestionPersonas();
		Scanner entrada = new Scanner(System.in);
		
		gp.insertar(113, "Manuel Pérez", 18);
		gp.insertar(241, "Verónica Sanz", 22);
		gp.insertar(451, "Trinidad Rodríguez", 24);
		gp.insertar(144, "Rosa Márquez", 18);
		gp.insertar(101, "Raquel Ruiz", 23);
		
		int opcion;
		do {
			System.out.println("1.- Mostrar todos.");
			System.out.println("2.- Buscar.");
			System.out.println("3.- Eliminar.");
			System.out.println("4.- Salir.");
			System.out.print("Elige una opción entre 1 y 4: ");
			opcion = entrada.nextInt();
			
			switch (opcion) {
				case 1:
					gp.mostrarTodos();
					break;
				case 2:
					gp.buscar();
					break;
				case 3:
					gp.eliminar();
					break;
				case 4:
					System.out.println("Saliendo...");
					break;
				default:
					System.out.println("Opción no válida.");
			}
		} while (opcion != 4);
		

	}

}
