package ejercicios_de_repaso;

public class Ejercicio_24 {

	public static void main(String[] args) {
		String texto = "Hola mundo desde java usando eclipse";
		
		for(int i = 0; i < texto.length(); i++) {
			if(texto.charAt(i) != ' ') {
				System.out.print(texto.charAt(i));
			} else if (texto.charAt(i) == ' ') {
				System.out.println();
			}
		}

	}

}
