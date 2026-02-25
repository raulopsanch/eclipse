package ejercicio_01;

public class Main {

	public static void main(String[] args) {
		Persona[] personas = new Persona[5];
		
		personas[0] = new Empleado("Juan Márquez", "5678AAA", 35, "Seur", 2500);
		personas[1] = new Empleado("María Garlen", "5678BBB", 27, "Amazon", 1850);
		personas[2] = new Alumno("Esther Muras", "1234AAA", 17, "IES Suárez de Figueroa", Ciclos.daw);
		personas[3] = new Alumno("Raúl Pérez", "1234BBB", 19, "IES Cristro del Rosario", Ciclos.mecanizado);
		personas[4] = new Alumno("Raquel Blazquez", "1234CCC", 16, "IES Albarejas", Ciclos.finanzas);
		
		System.out.println("Situación personal");
		System.out.println("**************************");
		System.out.println();

		for (Persona p : personas) {
			if (p instanceof Empleado) {
				Empleado e = (Empleado)p;
				e.situacionPersonal();;
			} else if (p instanceof Alumno) {
				Alumno a = (Alumno)p;
				a.situacionPersonal();;
			}
			System.out.println();
		}
		
		System.out.println("Datos personales");
		System.out.println("===================");

		System.out.println();
		personas[0].datosPersonales();
		
		System.out.println();
		personas[2].datosPersonales();

	}

}
