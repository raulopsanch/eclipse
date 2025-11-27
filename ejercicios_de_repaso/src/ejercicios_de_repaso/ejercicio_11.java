package ejercicios_de_repaso;

public class ejercicio_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena = "Programando en Java con Eclipse";
		
		System.out.println("Número total de letras: " + contarLetras(cadena));
	}

	public static int contarLetras(String texto) {
		int contador = 0;
		
		for (int i = 0; i < texto.length(); i++) {
			contador ++;
			if (texto.charAt(i) == ' ') {
				contador --;
			}
		}
		
		return contador;
	}
}
