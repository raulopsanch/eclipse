package ejemplo_02;

public class Main {

	public static void main(String[] args) {
		int[] numeros = {1,34,23,9};
		
		try {
			System.out.println("La posición 5 es: " + numeros[4]);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
