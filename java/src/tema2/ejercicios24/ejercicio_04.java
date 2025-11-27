package tema2.ejercicios24;

public class ejercicio_04 {

	public static void main(String[] args) {
		for (int i = 1; i < 11; i++) {
			System.out.print(i + " --> ");
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
