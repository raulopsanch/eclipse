package tema2.ejercicios23_entregable;

/*
Diseñar un programa Java que muestre en pantalla los pares del 200 al 400,
empleando un bucle do-while.
*/

public class ejercicio_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 200;
		
		do {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		} while (i < 401);
	}

}
