package arrays1;

public class Ejercicio_05 {

	public static void main(String[] args) {
		int[] a= {1, 66, 15, 33, 2, 34, 65, 39, 15, 78};

		int num =a[0];
		a[0] = a[a.length - 1];
		a[a.length - 1] = num;
		
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
	}

}
