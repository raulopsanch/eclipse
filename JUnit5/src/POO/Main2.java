package POO;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introducir un nombre:");
		String nombre = entrada.nextLine();
		
		System.out.println("Ocupación Estudia/Ocupado: ");
		String estado = entrada.nextLine();
		
		System.out.println("Introducir edad:");
		int edad = entrada.nextInt();
		
		System.out.println(nombre + " tiene " + edad + " años y es "
		+ ocupacion(edad,estado));
	}
	
	public static boolean MayordeEdad(int edad) {
		return edad >=18;
	}
		
	public static String ocupacion(int edad,String situacion) {
		String retorno = "Desempleado";
		if (edad < 18 && situacion == "Estudia") retorno = "Menor";
		if (edad >= 18 && situacion == "Estudia") retorno = "Estudiante";
		if (edad >= 18 && situacion == "Ocupado") retorno = "Trabajador";
		return retorno;
	}
	
	public static double calcularHipotenusa(double ladoA, double ladoB) {
		return Math.sqrt(Math.pow(ladoA, 2) + Math.pow(ladoB, 2));
	}
}
