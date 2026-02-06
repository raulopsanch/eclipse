package Ejercicio_01;

public class Main {

	public static void main(String[] args) {
		Persona persona1 = new Estudiante("Raúl", 37, "DAW");
		Persona persona2 = new Estudiante("Cristina", "Filología inglesa");
		
		System.out.println(persona1.toString());

		System.out.println();
		
		System.out.println(persona2.toString());

	}

}
