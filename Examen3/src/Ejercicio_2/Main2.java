package Ejercicio_2;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Persona persona1 = new Persona(345, "Alberto");
		Persona persona2 = new Persona(235, "Ana");
		Persona persona3 = new Persona(128, "Marta");
		
		BilletesDeViaje[] billetes = new BilletesDeViaje[3];
		
		billetes[0] = new BilletesDeViaje(persona1, "Madrid");
		billetes[1] = new BilletesDeViaje(persona2);
		billetes[2] = new BilletesDeViaje(persona3, "Barcelona");
		
		System.out.println(billetes[1].cambioDestino("Sevilla"));
		
		System.out.println(billetes[1].comprarBillete("Sevilla"));
		
		System.out.println();
		
		billetes[0].intercambiarBillete(persona1);
		
		System.out.println();
		
		mostrarArray(billetes);
		
		
	}

	public static void mostrarArray(BilletesDeViaje[] billetes) {
		for (int i = 0; i < billetes.length; i++) {
			System.out.println(billetes[i].toString());
			System.out.println();
		}
	}

}
