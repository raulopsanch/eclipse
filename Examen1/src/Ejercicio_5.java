import java.util.Scanner;

public class Ejercicio_5 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opcion;
		
		System.out.print("Introduce una cadena de texto: ");
		String cadena = entrada.nextLine();
		
		do {
			
			System.out.print("\n1.- Mostrar tamaño de la cadena.\n2.- Mostrar cadena a partir de la posición 5."
					+ "\n3.- Invertir cadena.\n4.- Salir\nIntroduce una opción: ");
			opcion = entrada.nextInt();
			
			switch(opcion) {
			case 1:
				System.out.println("Tamaño: " + mostrarTamanho(cadena));
				break;
			case 2:
				System.out.println("Mostrar cadena desde la posición 5: " + mostrarCadena(cadena));
				break;
			case 3:
				System.out.println("Texto invertido: " + invertirCadena(cadena));
				break;
			case 4:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Opción invállida.");
				break;
			}
			
		} while(opcion != 4);
		
	}
	
	public static int mostrarTamanho(String texto) {
		return texto.length();
	}
	
	public static String mostrarCadena(String texto) {
		return texto.substring(5);
	}
	
	public static String invertirCadena(String texto) {
		String textoInvertido = "";
		
		for(int i = texto.length() - 1; i >= 0; i--) {
			textoInvertido += texto.charAt(i);
		}
		
		return textoInvertido;
	}
	
}
