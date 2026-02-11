
public class Ejercicio_4 {
	public static void main(String[] args) {
		matriz(7, 7);
	}

	public static void matriz(int num1, int num2) {
		for(int i = num1 ; i > 0; i--) {
			
			for(int j = num2; j > 0; j--) {
				System.out.print(j + "\t");
				
				
			}
			System.out.println();
		}
	}
}
