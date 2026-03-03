package ejercicio_01;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Persona[] lista = new Persona[4];
		
		for (int i = 0; i < 3; i++) {
			lista[i] = solicitarAlumno();
			System.out.println();
		} 
		
		lista[3] = solicitarEmpleado();
		
		System.out.println("\nSituación personal");
		System.out.println("--------------------");
		mostrarSituacionPersonal(lista);
		
		System.out.println("\nAlumno y ciclo");
		System.out.println("----------------");
		mostrarNombreYCiclo(lista[1]);
		
		System.out.println("\nAlumnos y ciclos");
		System.out.println("----------------");
		mostrarAlumnosYCiclos(lista);
	}
	
	
	public static Alumno solicitarAlumno() {	
		Scanner entrada = new Scanner(System.in);

		System.out.println("----Solicitar alumno----");
		System.out.println("-----------------------------");

		System.out.print("Introduce tu nombre: ");
		String nombre = entrada.nextLine().toUpperCase();
			
		System.out.print("introduce tu apellido: ");
		String apllido = entrada.nextLine().toUpperCase();
			
		String completo = nombre.concat(" " + apllido);
			
		System.out.print("Introduce tu dni: ");
		String dni = entrada.nextLine();
			
		System.out.print("Introduce tu edad: ");
		int edad = Integer.parseInt(entrada.nextLine());
		
		System.out.print("Introduce el centro: ");
		String centro = entrada.nextLine();
		
		System.out.print("Introduce un ciclo: ");
		String cicloSTR = entrada.nextLine();
		Ciclos cicloEnum = Ciclos.valueOf(cicloSTR);
		
		if (cicloSTR.equals(" ") & centro.equals(" ")) {
			Alumno a = new Alumno(completo, dni, edad);
			return a;
		} else if (cicloSTR.equals(" ")) {
			Alumno a = new Alumno(completo, dni, edad, centro);
			return a;
		} else if (centro.equals( " ")) {
			Alumno a = new Alumno(completo, dni, edad, cicloEnum);
			return a;
		} else {
			Alumno a = new Alumno(completo, dni, edad, centro, cicloEnum);
			return a;
		}
		
	}
	
	
	public static Empleado solicitarEmpleado() {
		Scanner entrada = new Scanner(System.in);

		System.out.println("****Solicitar empleado****");
		System.out.println("-----------------------------");
		
		System.out.print("Introduce tu nombre y apellido: ");
		String nombre = entrada.nextLine().toUpperCase();
			
		System.out.print("Introduce tu dni: ");
		String dni = entrada.nextLine().toUpperCase();
			
		System.out.print("Introduce tu edad: ");
		int edad = Integer.parseInt(entrada.nextLine());
			
		System.out.print("Nombre de la empresa: ");
		String empresa = entrada.nextLine().toUpperCase();
					
		System.out.print("Introduce tu salario mensual: ");
		double salario = entrada.nextDouble();
			
		salario = salario * 14 * 1.18;
			
		Empleado e = new Empleado(nombre, dni, edad, empresa, salario);
		
		return e;
	}
	
	
	public static void mostrarSituacionPersonal(Persona[] array) {
		for (Persona p : array) {
			if (p instanceof Alumno) {
				Alumno a = (Alumno)p;
				a.situacionPersonal();;
			} else if (p instanceof Empleado) {
				Empleado e = (Empleado)p;
				e.situacionPersonal();
			}
			System.out.println();
		}
	}
	
	
	public static void mostrarNombreYCiclo(Persona persona) {
		if (persona instanceof Alumno) {
			Alumno a = (Alumno)persona;
			System.out.println(a.getNombre().toUpperCase() + " en el ciclo " + a.getCiclo().name().toUpperCase());			

		}
	}
	
	
	public static void mostrarAlumnosYCiclos(Persona[] lista) {
		for (Persona p : lista) {
			if (p instanceof Alumno) {
				Alumno a = (Alumno)p;
				
				String[] separarNombre = a.getNombre().split(" ");
				String nombre = separarNombre[0];
				Ciclos ciclo = a.getCiclo();
				
				if (ciclo == Ciclos.asir) {
					System.out.println(nombre.toUpperCase() + " --- " + ciclo.name().toUpperCase());
				} else {
					System.out.println(nombre.toLowerCase() + " --- " + ciclo.name().toLowerCase());
				}
			}
		}
	}

}

























