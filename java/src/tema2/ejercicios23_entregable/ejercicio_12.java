package tema2.ejercicios23_entregable;

/*
Diseña un programa Java que muestre en pantalla los números enteros
entre 5 y 25, su cuadrado y su cubo. Recuerda que para usar la potencia se
utiliza Math.pow (base, exponente).
*/

public class ejercicio_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Numero \tCuadrado \tCubo");
		System.out.println("------------------------------");
		for (int i = 5; i < 26; i++) {
			double cuadrado = Math.pow(i, 2);
			double cubo = Math.pow(i, 3);
			
			System.out.println(i + "\t" + cuadrado + "\t\t" + cubo);
		}
	}

}
