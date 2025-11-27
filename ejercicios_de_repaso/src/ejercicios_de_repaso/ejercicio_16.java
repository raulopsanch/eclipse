package ejercicios_de_repaso;

public class ejercicio_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena = "¡Hola mundo 123!";
		
		System.out.println("Vocales: " + contarVocales(cadena));
		System.out.println("Consonantes: " + contarConsonantes(cadena));
		System.out.println("Otros: " + contarOtros(cadena));
		System.out.println("Números: " + contarNumeros(cadena));
	}

	public static int contarVocales(String texto) {
		texto = texto.toLowerCase();
		String vocales = "aeiouáéíóú";
		int contador = 0;
		
		for (int i = 0; i < texto.length(); i++) {
			char c = texto.charAt(i);
			for (int j = 0; j < vocales.length(); j++) {
				char v = vocales.charAt(j);
				if(c == v) {
					contador++;
				}
			}
		}
		return contador;
	}
	
	public static int contarConsonantes(String texto) {
		texto = texto.toLowerCase();
		String consonantes ="bcdfghjklmnñpqrstvwxyz";
		int contador = 0;
		
		for (int i = 0; i < texto.length(); i++) {
			char car = texto.charAt(i);
			for (int j = 0; j < consonantes.length(); j++) {
				char cons = consonantes.charAt(j);
				if(car == cons) {
					contador++;
				}
			}
		}
		return contador;
	}
	
	public static int contarOtros(String texto) {
		texto = texto.toLowerCase();
		String otros ="¿?¡!+*<>ç";
		int contador = 0;
		
		for (int i = 0; i < texto.length(); i++) {
			char c = texto.charAt(i);
			for (int j = 0; j < otros.length(); j++) {
				char o = otros.charAt(j);
				if(c == o) {
					contador++;
				}
			}
		}
		return contador;
	}
	
	public static int contarNumeros(String texto) {
		texto = texto.toLowerCase();
		String Numeros ="1234567890";
		int contador = 0;
		
		for (int i = 0; i < texto.length(); i++) {
			char c = texto.charAt(i);
			for (int j = 0; j < Numeros.length(); j++) {
				char n = Numeros.charAt(j);
				if(c == n) {
					contador++;
				}
			}
		}
		return contador;
	}
}
