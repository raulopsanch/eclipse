package ejercicios32;

public class ejercicio323 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena = "Programando en Java con Eclipse";
		
		System.out.println("Total letras: " + contarLetras(cadena));
		
		System.out.println("Total palabras: " + contarPalabras(cadena));
		
		System.out.println("Total a's: " + contarLetrasA(cadena));
		
		System.out.println("Texto invertido: " + invertirTexto(cadena));
	}
	
	public static int contarLetras(String text) {
		text = text.replace(" ", "");
		return text.length();
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
	
	public static int contarLetrasA(String text) {
		int contar = 0;
		
		for(int i = 0; i < text.length(); i++) {
			if(text.charAt(i) == 'a' || text.charAt(i) == 'A') {
				contar++;
			}
		}
		return contar;
	}

	public static String invertirTexto(String text) {
		String textoInvertido = "";
		
		for(int i = text.length() - 1; i >= 0; i--) {
			textoInvertido += text.charAt(i);
		}
		return textoInvertido;
	}
}
