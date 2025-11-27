package tema1;

import java.util.Scanner;

public class saludo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce tu nombre: ");
		String name = entrada.nextLine();
		
		System.out.println("Buenas tardes " + name);
	}

}
