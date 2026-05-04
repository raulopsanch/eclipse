package ejemplo_01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int total = 500;
		
		System.out.print("Introduce número para dividir: ");
		int num = entrada.nextInt();
		
		try {
			System.out.println("El resultado es: " + (total/num));
		}
		catch (Exception e) {
			System.out.println("No se puede dividir por 0");
		}

	}

}
