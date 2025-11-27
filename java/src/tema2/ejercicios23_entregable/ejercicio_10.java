package tema2.ejercicios23_entregable;

/*
Diseña un programa Java que muestre en pantalla los enteros entre 1 y 20
y en la misma línea el cubo de cada número.
*/

public class ejercicio_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Numero \tCubo");
		System.out.println("---------------");
		for (int i = 1; i < 21; i++) {
			int cubo = i * i * i;
			
			System.out.println(i + "\t" + cubo);
		}
	}

}
