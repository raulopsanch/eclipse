package ejercicios_de_repaso;

public class ejercicio_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena = "Programando en Java con Eclipse";

		System.out.println(cadena);
		
		System.out.println("Total de palabras: " + contarPalabras(cadena));
	}

	public static int contarPalabras(String text) {
		int totalPalabras = 0;
		
		for(int i = 0; i < text.length(); i++) {
			if(text.charAt(i) == ' ') {
				totalPalabras ++;
			}
		}
		if(text.length() > 0) {
			totalPalabras++;
		}
		
		return totalPalabras;
				
	}
}
