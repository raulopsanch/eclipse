package actividad81.ejercicio_03;

import java.util.*;

public class Numero {

	public static void main(String[] args) {
		ArrayList<Integer> listaNumeros = 
				new ArrayList<>(Arrays.asList(10, 34, 24, 2, 10, 4, 
						45, 67, 43, 34, 18, 10)
				);

		Set<Integer> numerosSet = new HashSet<>(listaNumeros);
		
		System.out.println("Tamaño del ArrayList: " + listaNumeros.size());
		System.out.println("Tamaño del HashSet: " + numerosSet.size());
		
		
		System.out.println();
		System.out.println("Contenido del ArrayList: " + listaNumeros);
		System.out.println("Contenido del HashSet: " + numerosSet);
		
	}

}
