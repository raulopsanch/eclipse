package Ejercicio_3;

public class testProfesor {

	public static void main(String[] args) {
		Profesor profesor1 = new Profesor("Juan", 40, 2548, "Badajoz");
		Profesor profesor2 = new Profesor("Olga", 32, 5467, "Madrid");
		Profesor profesor3 = new Profesor("Raquel", 27, 9354, "Sevilla");
		
		
		System.out.println("Datos pesonales del profesor1: " + profesor1.datosPersonales());
		System.out.println();
		System.out.println("Datos completos del profesor2: " + profesor2.datosCompletos());
		System.out.println();
		System.out.println("Información del profesor1: " + profesor1.infoProfe());
		System.out.println();
		System.out.println("Datos completos del profesor3: " + profesor3.datosCompletos());

	}

}
