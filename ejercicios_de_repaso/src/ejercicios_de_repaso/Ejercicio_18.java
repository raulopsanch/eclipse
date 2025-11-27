package ejercicios_de_repaso;

import java.util.Scanner;

public class Ejercicio_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce el tamaño de la matriz: ");
		int numero = entrada.nextInt();
		matriz(numero);
	}

	static void matriz(int n) {
		int h = n * n;
		
		for (int i = 1; i < n + 1; i++) {
			for (int j = 1; j < n + 1; j++) {
				System.out.print(h + "\t");
				h--;
			}
			System.out.println();
		}
	}
}
