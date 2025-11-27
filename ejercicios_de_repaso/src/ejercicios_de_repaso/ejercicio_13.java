package ejercicios_de_repaso;

public class ejercicio_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena = "Programando en Java con Eclipse";

		System.out.println("Nº total de letras: " + contarLetras(cadena));
		System.out.println("Nº total de espacios: " + contarEspacios(cadena));
	}

	public static int contarLetras(String texto) {
		int letras = 0;
		
		for (int i = 0; i < texto.length(); i ++) {
			letras++;
			
			if(texto.charAt(i) == ' ') {
				letras --;
			}
		}
		return letras;
	}
	
	public static int contarEspacios(String texto) {
		int espacios = 0;
		
		for (int i = 0; i < texto.length(); i ++) {
			
			if(texto.charAt(i) == ' ') {
				espacios ++;
			}
		}
		return espacios;
	}
}
