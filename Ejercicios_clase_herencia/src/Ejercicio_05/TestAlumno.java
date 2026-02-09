package Ejercicio_05;

public class TestAlumno {

	public static void main(String[] args) {
		Profesor profesor1 = new Profesor("Juan", 40, 2548, "Badajoz");
		Profesor profesor2 = new Profesor("Olga", 32, 5467, "Madrid");
		Profesor profesor3 = new Profesor("Raquel", 21, 9354, "Sevilla");
		Alumno alumno1 = new Alumno("Raúl", 37, "DAW", 1);
		Alumno alumno2 = new Alumno("Cristina", 36, "Inglés", 4);
		
		System.out.print("Datos personales del profesor1:");
		System.out.println(profesor1.datosPersonales());
		System.out.println();
		
		System.out.print("Datos completos del alumno1");
		System.out.println(alumno1.datosCompletos());
		System.out.println();
		
		System.out.print("Datos completos del profesor2");
		System.out.println(profesor2.datosCompletos());
		System.out.println();
		
		System.out.print("Datos profesionales del profesor1:");
		System.out.println(profesor1.infoProfesor());
		System.out.println();
		
		System.out.print("Datos completos del alumno2");
		System.out.println(alumno2.datosCompletos());
		System.out.println();
		
		System.out.print("Datos completos del profesor3:");
		System.out.println(profesor3.datosCompletos());

	}
}
