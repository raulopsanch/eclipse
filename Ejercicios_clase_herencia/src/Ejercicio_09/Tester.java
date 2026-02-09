package Ejercicio_09;

public class Tester {

	public static void main(String[] args) {
		Alumno alumno1 = new Alumno("Pepe", "García Pérez", "Q1B");
		Profesor profesor1 = new Profesor("Manuel", "Guerrero", "D6-212");
		
		System.out.print(alumno1.toString());
		System.out.println();
		System.out.print(profesor1.toString());
	}

}
