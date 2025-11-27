package tema1;

import java.util.Scanner;

public class sueldo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce la cantidad de horas trabajadas: ");
		double horas = entrada.nextDouble();
		
		double salario = horas * 10;
		System.out.println("\nPor " + horas + "trabajadas te corresponde cobrar " 
		+ salario + "€");
	}

}
