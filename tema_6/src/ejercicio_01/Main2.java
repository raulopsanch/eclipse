package ejercicio_01;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Persona[] personas = new Persona[4];
		
		

	}
	
	
	public static void solicitarAlumno(Persona[] array) {
		Scanner entrada = new Scanner(System.in);
		
		for(int i = 0; i < array.length; i++) {
			System.out.print("Introduce tu nombre: ");
			String nombre = entrada.nextLine().toUpperCase();
			
			System.out.print("introduce tu apellido: ");
			String apllido = entrada.nextLine().toUpperCase();
			
			String nombreCompleto = nombre.concat(apllido);
			
			System.out.print("Introduce tu dni: ");
			String dni = entrada.nextLine();
			
			System.out.print("Introduce tu edad: ");
			int edad = entrada.nextInt();
			
			array[i] = new Alumno(nombreCompleto, dni, edad, "IES Suárez", Ciclos.asir);
		}
		
	}
	
	
	public static void solicitarEmpleado(Persona[] array) {
		Scanner entrada = new Scanner(System.in);
		
		for(int i = 0; i < array.length; i++) {
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
			
			double salarioAnual = salario * 14;
			
			double salarioNeto = salarioAnual - (salarioAnual * 0.18);
			
			array[i] = new Empleado(nombre, dni, edad, empresa, salarioNeto);
		}
	}
	
	
	public static void mostrarAlumnos(Persona[] array) {
		
		}
	}

}
