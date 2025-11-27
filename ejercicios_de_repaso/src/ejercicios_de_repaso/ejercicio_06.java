package ejercicios_de_repaso;

import java.util.Scanner;

public class ejercicio_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String password;
		
		do {
			System.out.print("Introduce una contraseña: ");
			password = entrada.nextLine();
			
			if(validarContrasenha(password)) {
				System.out.println("Contraseña válida.");
				break;
			} else {
				System.out.println("Contraseña inválida.");
				System.out.println("La contraseña ha de contener el carácter '@' y una mayúscula.");
			}
		}while(true);
	}

	public static boolean validarContrasenha(String texto) {
		
		for(int i = 0; i < texto.length(); i++) {
			if(texto.charAt(i) == '@' && !texto.equals(texto.toLowerCase())) {
				return true;
				//System.out.println("Contraseña válida.");
			}		
		}
		return false;
		//System.out.println("Contraseña inválida.");
		
	}
}
