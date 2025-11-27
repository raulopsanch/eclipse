package tema2.ejercicios27_entregable;

import java.util.Scanner;

public class ejercicio_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce un número entre 1 y 7: ");
		int num = entrada.nextInt();
		
		diasSemana(num);
	}

	static void diasSemana(int n) {
		switch(n) {
			case 1:
				System.out.println("Lunes");
				break;
			case 2:
				System.out.println("Martes");
				break;
			case 3:
				System.out.println("Miércoles");
				break;
			case 4:
				System.out.println("Jueves");
				break;
			case 5:
				System.out.println("Viernes");
				break;
			case 6:
				System.out.println("Sábado");
				break;
			case 7:
				System.out.println("Domingo");
				break;
			default:
				System.out.println("Opción inválida. Introduce un número entre 1 y 7");
				break;
		}
		
	}
}
