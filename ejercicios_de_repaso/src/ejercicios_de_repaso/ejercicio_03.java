package ejercicios_de_repaso;

import java.util.Scanner;

public class ejercicio_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce un texto: ");
		String text = entrada.nextLine();
		
		System.out.print("Introduce la letra a buscar: ");
		char letra = entrada.next().charAt(0);
		
		System.out.print("En la palabra " + text + " hay un total de " + contarLetra(text, letra) + 
				" " + letra);
	}

	public static int contarLetra(String texto, char letra) {
		int totalLetra = 0;
		
		for(int i = 0; i < texto.length(); i++) {
			if(letra == texto.charAt(i)) {
				totalLetra ++;
			}
		}
		
		return totalLetra;
	}
}
