package arrays1;

public class Ejercicio_09 {

	public static void main(String[] args) {
		int[] a= {1,66,15,33,2,34,65,39,15,78};

		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		for(int j = 0; j < a.length; j++) {
			if(j % 2 == 1) {
				a[j] *= -1;
			}
			System.out.print(a[j] + " ");
		}
	}

}
