package ejercicios_de_repaso;

public class ejercicio_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Total vocales: "+ contarVocales("SUPERcalifragilistico"));
	}

	public static int contarVocales(String texto) {
		texto = texto.toLowerCase();
		String vocales = "aeioráéíóú";
		int contador = 0;
		
		for(int i = 0; i < texto.length() - 1; i++) {
			char caracter = texto.charAt(i);
			
			for(int j = 0; j < vocales.length() - 1; j++) {
				if(caracter == vocales.charAt(j)) {
					contador ++;
					
				}
			}
		}
		return contador;
	}
}
