package ejercicios_de_repaso;

public class ejercicio_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto = "  Hola   mundo  ";
		
		System.out.println("Hay " + contarPalabras(texto) + " palabras.");
	}

	public static int contarPalabras(String texto) {
		int palabras = 0;
	    boolean dentroPalabra = false;

	    for (int i = 0; i < texto.length(); i++) {
	        char c = texto.charAt(i);

	        if (c != ' ') {
	            if (!dentroPalabra) {
	                palabras++;
	                dentroPalabra = true;
	            }
	        } else {
	            // Si encontramos un espacio, terminamos la palabra actual
	            dentroPalabra = false;
	        }
	    }

	    return palabras;  
	}
}
