import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce tu nombre: ");
		String name = entrada.nextLine();
		
		System.out.print("Introduce la primera nota: ");
		double nota1 = entrada.nextDouble();
		
		System.out.print("Introduce la segunda nota: ");
		double nota2 = entrada.nextDouble();
		
		System.out.print("Introduce la tercera nota: ");
		double nota3 = entrada.nextDouble();
		
		if(estaSuspenso(nota1, nota2, nota3)) {
			System.out.println("El alumno " + name + " está suspenso.");
		} else {
			System.out.println(name + " ha obtenido una nota media de " + calcularMedia(nota1, nota2, nota3));
		}

	}
	
	public static boolean estaSuspenso(double nota1, double nota2, double nota3) {
		if (nota1 < 5 || nota2 < 5 || nota3 < 5) {
			return true;
		}
		return false;
	}
	
	public static double calcularMedia(double nota1, double nota2, double nota3) {
		double media = (nota1 + nota2 + nota3) / 3;
		
		return media;
	}


}
