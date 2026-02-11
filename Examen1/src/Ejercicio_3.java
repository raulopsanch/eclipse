import java.util.Scanner;

public class Ejercicio_3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce una cadena de texto: ");
		String cadena = entrada.nextLine();
		
		mostrarPalabras(cadena);
	}

	public static void mostrarPalabras(String texto) {
		String palabras = "";
		
		for (int i = 0; i < texto.length(); i++) {
			if (texto.charAt(i) == ' ') {
				palabras += texto.charAt(i);
				System.out.println(palabras);
			}
			
		}
	}
	
}
