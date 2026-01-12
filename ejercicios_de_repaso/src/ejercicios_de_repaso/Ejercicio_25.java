package ejercicios_de_repaso;

public class Ejercicio_25 {

	public static void main(String[] args) {
		crearMatriz(7);
	}
	
	public static void crearMatriz(int numero) {
		int matriz = numero * numero;
		
		for(int i = 0; i < numero; i++) {
			for(int j = 0; j < numero; j++) {
				System.out.print(matriz + "\t");
				matriz --;
			}
			System.out.println();
		}
	}

}
