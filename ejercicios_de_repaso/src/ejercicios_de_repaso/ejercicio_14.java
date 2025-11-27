package ejercicios_de_repaso;

import java.util.Scanner;

public class ejercicio_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String correo;
		
		do {
			System.out.print("Introduce una dirección de correo-e válida (de google): ");
			correo = entrada.nextLine();
			
			if (!comprobarCorreo(correo)) {
				System.out.println("Correo inválido.");
			}
		} while(!comprobarCorreo(correo));
		
		System.out.println("Correo registrado");
			
	}

	public static boolean comprobarCorreo(String texto) {
		if (!texto.contains("@gmail.com")) {
			return false;
		}
		return true;
	}
}
