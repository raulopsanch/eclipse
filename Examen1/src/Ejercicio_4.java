import java.util.Scanner;

public class Ejercicio_4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

        System.out.print("Introducir el tamaño de la matriz: ");
        int n = entrada.nextInt();
        
        matriz(n,n);
	}

	public static void matriz(int filas, int columnas) {
		int matriz = filas * columnas;
		
		for(int i = 0; i < filas; i++) {
            for(int j = 0; j < columnas; j++) {
                System.out.print(matriz + "\t");
                matriz--;
            }
            System.out.println();
        }
	}
}
