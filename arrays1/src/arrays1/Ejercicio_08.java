package arrays1;

public class Ejercicio_08 {

	public static void main(String[] args) {
		int[] a= {1,66,15,33,2,34,65,39,15,78};
		
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.print("El número mayor del array es: ");
		System.out.print(mayor(a));
	}

	public static int mayor(int[] array) {
		int num_mayor = 0;
		
		for(int i= 0; i < array.length; i++) {
			if(array[i] > num_mayor) {
				num_mayor = array[i];
			}
		}
		
		return num_mayor;
	}
	
}
