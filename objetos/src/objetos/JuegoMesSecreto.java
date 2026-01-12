package objetos;

import java.util.Scanner;
import java.util.Random;

public class JuegoMesSecreto {

	public static void main(String[] args) {
		String[] meses = new String[] {"Enero", "Febrero", "Marzo", "Abril",
				"Mayo", "Junio", "Julio", "Agosto",
				"Septiembre", "Octubre", "Noviembre", "Diciembre"};
		
		Random random = new Random();
		int indiceAleatorio = random.nextInt(meses.length);
		String mesSecreto = meses[indiceAleatorio];
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduce un mes: ");
		String mes = entrada.nextLine();
		
		int opcion = 0;
		while(opcion <= 5) {
			if (mes.equalsIgnoreCase(mesSecreto)) {
				System.out.print("¡HAS ACERTADO!");
				break;
			} else {
				System.out.println("Intentalo de nuevo. ");
				System.out.print("Introduce un mes: ");
				mes = entrada.nextLine();
			}
			
			opcion++;
			
			if(opcion == 5) {
				System.out.print("Se han agotado los intentos. ");
				System.out.println("El mes secreto es " + mesSecreto);
				break;
			}
			
		}
		
		System.out.print("¡GRACIAS POR JUGAR!");
	}

}