package objetos;

import java.util.Scanner;

public class Gestion_Taxis {

	public static void main(String[] args) {
		Taxi[] taxis = new Taxi[5];
		
		

	}
	
	public static void llenarArray(Taxi[] array) {
		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {
			System.out.print("Introduce la matrícula del taxi" + (i+1) + ": ");
			String matricula = entrada.nextLine();
			
			System.out.print("Introduce el distrito: ");
			String distrito = entrada.nextLine();
			{}
			array[i] = new Taxi(matricula, distrito);
		}
	}
	
	public static void mostrarArray(Taxi[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Taxi"+(i+1) + "\t" + arr[i].getMatricula() + 
					"\t" + arr[i].getDistrito());
		}
	}
	
	public static void buscarTaxi(Taxi[] arr) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce un distrito: ");
		String distrito = entrada.nextLine();
		
		boolean encontrado = false;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getDistrito().equalsIgnoreCase(distrito)) {
                System.out.println("Taxi encontrado: " + arr[i].getMatricula());
                encontrado = true;
                break;
            }
        }
        
        if (!encontrado) {
            System.out.println("No se encontró ningún taxi en ese distrito.");
        }
		
		
	}

}