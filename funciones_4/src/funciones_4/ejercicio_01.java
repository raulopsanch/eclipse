package funciones_4;

import java.util.Scanner;

public class ejercicio_01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String[] colores = new String[3];
		String resultado = "";
		
		System.out.print("Introduce el primer color: ");
		colores[0] = entrada.nextLine();
		
		System.out.print("Introduce el segundo color: ");
		colores[1] = entrada.nextLine();
		
		System.out.print("Introduce el tercer color: ");
		colores[2] = entrada.nextLine();
		
		for (int i = 0; i < colores.length; i++) {
			if (i == 0) {
				resultado += colores[i];
			} else if (i == colores.length - 1) {
				resultado += " y " + colores[i];
			} else {
				resultado += ", " + colores[i];
			}
		}
		System.out.println("\nLos colores elegidos son:");
		System.out.println(resultado);
	}

}
