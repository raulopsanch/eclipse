package ejercicio_01;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Persona[] personas = new Persona[4];
		
		
		personas[0] = solicitarAlumno();
		personas[0].situacionPersonal();
		System.out.println();
		personas[1] = solicitarEmpleado();
		personas[1].situacionPersonal();
		
	}
	
	
	public static Alumno solicitarAlumno() {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce tu nombre: ");
		String nombre = entrada.nextLine().toUpperCase();
			
		System.out.print("introduce tu apellido: ");
		String apllido = entrada.nextLine().toUpperCase();
			
		String completo = nombre.concat(" " + apllido);
			
		System.out.print("Introduce tu dni: ");
		String dni = entrada.nextLine();
			
		System.out.print("Introduce tu edad: ");
		int edad = entrada.nextInt();
		
		Alumno a = new Alumno(completo, dni, edad);
		
		return a;
	}
	
	
	public static Empleado solicitarEmpleado() {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce tu nombre y apellido: ");
		String nombre = entrada.nextLine().toUpperCase();
			
		System.out.print("Introduce tu dni: ");
		String dni = entrada.nextLine().toUpperCase();
			
		System.out.print("Introduce tu edad: ");
		int edad = entrada.nextInt();
			
		System.out.print("Nombre de la empresa: ");
		String empresa = entrada.nextLine().toUpperCase();
		
			
		System.out.print("Introduce tu salario mensual: ");
		double salario = entrada.nextDouble();
			
		salario = salario * 14 * 1.18;
			
		Empleado e = new Empleado(nombre, dni, edad, empresa, salarioNeto);
		
		return e;
	}
	
	
	public static void mostrarAlumnos(Persona[] array) {
		
	}

}
