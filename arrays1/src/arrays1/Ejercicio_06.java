package arrays1;

public class Ejercicio_06 {

	public static void main(String[] args) {
		int[] numeros = new int[10];
		int num = 50;
		
		for(int i = 0; i < numeros.length; i++) {
			if(i % 2 == 0) {
				System.out.print(num + " ");
			}
			
			num += 5;
		}
		
	}

}
