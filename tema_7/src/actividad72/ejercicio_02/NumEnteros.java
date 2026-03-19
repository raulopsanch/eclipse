package actividad72.ejercicio_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class NumEnteros {

	public static void main(String[] args) {
		ArrayList<Integer> listNumeros = new ArrayList<>();
		
		llenarLista(listNumeros);
		
		System.out.println("Mostrar todos los números");
		Collections.sort(listNumeros);
		mostrarLista(listNumeros);
		
		System.out.println("Mostrar la media de los números almacenados");
		System.out.println(mediaNumeros(listNumeros));
		System.out.println();
		
		
		System.out.println("Mostrar el número mayor y menor de la lista");
		System.out.println("Mayor: " + numeroMayor(listNumeros));
		System.out.println("Menor: " + numeroMenor(listNumeros));
		System.out.println();
		
		System.out.println("Borrar los 5 números mayores");
		BorrarNumerosMayores(listNumeros);
		mostrarLista(listNumeros);
		
		

	}
	
	
	public static void mostrarLista(ArrayList<Integer> lista) {
		for (int n : lista) {
			System.out.println(n);
		}
	}
	
	
	public static void llenarLista(ArrayList<Integer> lista) {
		Random random = new Random();
		
		for (int i = 0; i < 25; i++) {
			lista.add(random.nextInt(100));
		}
	}
	
	
	public static double mediaNumeros(ArrayList<Integer> lista) {
		int sum = 0;
		
		for (int n : lista) {
			sum += n;
		}
		return sum / lista.size();
	}
	
	
	public static int numeroMayor(ArrayList<Integer> lista) {
		int numMayor = lista.get(0);
		
		for (int n : lista) {
			if (n > numMayor) {
				numMayor = n;
			}
		}
		return numMayor;
	}
	
	
	public static int numeroMenor(ArrayList<Integer> lista) {
		int numMenor = lista.get(0);
		
		for (int n : lista) {
			if (n < numMenor) {
				numMenor = n;
			}
		}
		return numMenor;
	}
	
	
	public static void BorrarNumerosMayores(ArrayList<Integer> lista) {
		Collections.sort(lista);
				
		for (int i = 0; i < 5; i++) {
			lista.remove(lista.size() - 1);
		}
				
	}
	
}
