package ejercicios_de_repaso;

import java.util.Scanner;

public class Ejercicio_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce el número de horas trabajadas: ");
		double horas = entrada.nextDouble();
		
		System.out.print("Introduce el salario por horas: ");
		double salario = entrada.nextDouble();
		
		System.out.println("Tu sueldo es de: " + calcularSueldo(horas, salario));
	}
	public static double calcularSueldo(double hora, double salario) {
		return hora * salario;
	}
}
