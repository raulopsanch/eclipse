package ejercicio_01;

public class Main {

	public static void main(String[] args) {
		Persona[] personas = new Persona[4];
		
		personas[0] = new Profesor("Jose Carrasco", "1234568B", 45, "IES Suárez de Figueroa", Asignatura.matemáticas);
		personas[1] = new Alumno("Cristina Sanz", "1234567A", 18, "DAW", "2º");
		personas[2] = new Alumno("Raul Vazquez", "9876546B", 19, "DAW", "1º");
		personas[3] = new Profesor("Miguel Pérez", "3456789C", 32, "IES Cristo del Rosario", Asignatura.física);
		
		
		for (Persona p : personas) {
			if (p instanceof Profesor) {
				Profesor pro = (Profesor)p;
				System.out.println(p.profesion());
				System.out.println();
			} else {
				Alumno a = (Alumno)p;
				System.out.println(a.profesion());
				System.out.println();
			}
		}	
		
		
		System.out.println("Datos personales profesor1");
		personas[0].datosPersonales();
		
		System.out.println("Datos personales del alumno1");
		personas[1].datosPersonales();
		
	}

}
