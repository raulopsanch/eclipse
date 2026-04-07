package actividad73.ejercicio05;

import java.util.*;

public class Nums {

	public static void main(String[] args) {
		ArrayList<Integer>nums = new ArrayList<>();
		nums.add(10);
		nums.add(15);
		nums.add(20);
		nums.add(25);

		System.out.println(promedio(nums));
		System.out.println();

		multiplicar(nums);
		System.out.println();

		System.out.println();
		mostrar(nums);
		System.out.println();

		System.out.println();
		mostrarInverso(nums);
		System.out.println();

		System.out.println();
		suprimirMayorMedia(nums);
		mostrar(nums);
	}


	public static double promedio(ArrayList<Integer> nums) {
		double suma = 0;
		for (int n : nums) {
			suma += n;
		}
		return suma / nums.size();
	}


	public static void multiplicar(ArrayList<Integer> nums) {
		Iterator<Integer>it = nums.iterator();

		while (it.hasNext()) {
			System.out.print(it.next() * 2 + " ");
		}
	}


	public static void mostrar(ArrayList<Integer>nums) {
		Iterator<Integer>it = nums.iterator();

		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}


	public static void mostrarInverso(ArrayList<Integer>nums) {
		ListIterator<Integer>it = nums.listIterator(nums.size());

		while (it.hasPrevious()) {
			System.out.print(it.previous() + " ");
		}
	}


	public static void suprimirMayorMedia(ArrayList<Integer>nums) {
		double mdia = promedio(nums);
		for (int i = nums.size() -1; i >= 0; i--) {
			if (nums.get(i) > mdia) {
				nums.remove(i);
			}
		}
	}

}
