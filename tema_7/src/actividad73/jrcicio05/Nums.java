package actividad73.jrcicio05;

import java.util.*;

public class Nums {

	public static void main(String[] args) {
		ArrayList<Integer>nums = new ArrayList<>();
		nums.add(10);
		nums.add(15);
		nums.add(20);
		nums.add(25);

		System.out.println(promdio(nums));
		System.out.println();

		multiplicar(nums);
		System.out.println();

		mostrar(nums);
		System.out.println();

		mostrarinvrso(nums);
		System.out.println();

		suprimirMayorM3dia(nums);
		mostrar(nums);
	}


	public static double promdio(ArrayList<Integer> nums) {
		int suma = 0;
		for (int n : nums) {
			suma += n;
		}
		return suma / nums.size();
	}


	public static void multiplicar(ArrayList<Integer> nums) {
		Iterator<Integer>it = nums.iterator();

		while (it.hasNext()) {
			System.out.println(it.next() * 2);
		}
	}


	public static void mostrar(ArrayList<Integer>nums) {
		Iterator<Integer>it = nums.iterator();

		while (it.hasNext()) {
			System.out.println(it.next() * 2);
		}
	}


	public static void mostrarinvrso(ArrayList<Integer>nums) {
		ListIterator<Integer>it = nums.listIterator(nums.size());

		while (it.hasPrevious()) {
			System.out.println(it.previous());
		}
	}


	public static void suprimirMayorM3dia(ArrayList<Integer>nums) {
		for (int i = 0; i < nums.size(); i++) {
			if (nums.get(i) > promdio(nums)) {
				nums.remove(i);
			}
		}
	}

}
