package Ejercicio_1;

public class Main1 {
	public static void main(String[] args) {
		Bicicleta[] bicicletas = new Bicicleta[2];
		
		bicicletas[0] = new Bicicleta("usado", "verde", 7);
		bicicletas[1] = new Bicicleta("nuevo", "rojo", 5);
		
		for (Bicicleta b : bicicletas) {
			System.out.println(b.queSoy());
			System.out.println();
		}

	}

}
