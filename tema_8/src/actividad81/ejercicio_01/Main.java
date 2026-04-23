package actividad81.ejercicio_01;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Producto p1 = new Producto("Leche", "Alimentación", 1.35);
		Producto p2 = new Producto("Corrector", "Cosmética", 2.5);
		Producto p6 = new Producto("Leche", "Animales", 5);
		Producto p7 = new Producto("Corrector", "Cosméticos", 4);
		
		
		System.out.println(p1.equals(p6));
		System.out.println(p2.equals(p7));
	}

}