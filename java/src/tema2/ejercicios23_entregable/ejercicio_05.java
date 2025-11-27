package tema2.ejercicios23_entregable;

/*
Empleando la estructura for, diseñar un programa Java que muestre en
pantalla los impares del 333 al 999.
*/

public class ejercicio_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 333; i < 1000; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
	}

}
