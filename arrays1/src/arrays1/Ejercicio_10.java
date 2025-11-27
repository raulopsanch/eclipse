package arrays1;

public class Ejercicio_10 {

	public static void main(String[] args) {
		int[] a= {1,66,15,33,2,34,65,39,15,78};

		System.out.println("Array normal:");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("Array invertido:");
		for(int j = a.length - 1; j >= 0; j--) {
			System.out.print(a[j] + " ");
		}
	}

}
