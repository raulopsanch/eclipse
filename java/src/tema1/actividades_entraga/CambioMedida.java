package tema1.actividades_entraga;

/*
6. Diseña un programa Java que solicite una cantidad en pulgadas y la
convierta en centímetros y también en metros.
*/

import java.util.Scanner;

public class CambioMedida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double pulgadas, cms, metros;
		
		System.out.print("\nIntroduce cantidad en pulgadas: ");
		pulgadas = entrada.nextDouble();
		
		cms = pulgadas * 2.54;
		System.out.println("\n" + pulgadas + " pulgadas equivalen a " + cms + "cm");
				
		metros = pulgadas * 0.0254;
		System.out.println(pulgadas + " pulgadas equivalen a " + metros + "m");
	}

}
