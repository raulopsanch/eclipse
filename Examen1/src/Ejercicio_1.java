import java.util.Scanner;

public class Ejercicio_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		Scanner entrada1 = new Scanner(System.in);
		
		System.out.print("Introduzca las horas trabajdas: ");
		double horas = entrada.nextDouble();
		
		System.out.print("Introduzca el sueldo por horas: ");
		double sueldo = entrada1.nextDouble();
		
		
		double salario = calcularSueldo(horas, sueldo);
		System.out.print("Sueldo a cobrar por " + horas + " trabajadas: " + salario);
	}
	
	public static double calcularSueldo(double hora, double sueldo) {
		return hora * sueldo;
	}
}
