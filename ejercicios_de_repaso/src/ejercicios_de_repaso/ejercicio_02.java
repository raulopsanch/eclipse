package ejercicios_de_repaso;

import java.util.Scanner;

public class ejercicio_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce una palabra: ");
		String palabra = entrada.nextLine();
		
		System.out.print(palabra + " --> " + invertirPalabra(palabra));
	}

	public static String invertirPalabra(String texto) {
		String textoInvertido = "";
		
		for(int i = texto.length() - 1; i >= 0; i--) {
			textoInvertido += texto.charAt(i);
		}
		
		return textoInvertido;
	}
}
