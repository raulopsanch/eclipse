package arrays1;

public class Ejercicio_04 {

	public static void main(String[] args) {
		int[] numeros = new int[10];
		int number = 7;
		
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = number;
			number++;
		}
		
		int contador = 0;
		while(contador < numeros.length) {
			System.out.print(numeros[contador] + "  ");
			
			contador++;
		}
	}

}