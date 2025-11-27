package tema2.ejercicios23_entregable;

/*
Empleando la estructura de bucle for, realizar un programa que imprima
por pantalla todos los números pares existentes entre el 1 y el número 25.
*/

public class ejercicio_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 25; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

}
