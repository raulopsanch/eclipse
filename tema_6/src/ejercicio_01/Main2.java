package ejercicio_01;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Persona[] lista = new Persona[2];
		
		
		lista[0] = solicitarAlumno();
		lista[0].situacionPersonal();
		System.out.println("\n");
		lista[1] = solicitarEmpleado();
		lista[1].situacionPersonal();
		
		System.out.println("\n++++Lista++++");
		mostrarDatosPersonales(lista);
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
				e.situacionPersonal();;
			}
			System.out.println();
		}
	}

}
