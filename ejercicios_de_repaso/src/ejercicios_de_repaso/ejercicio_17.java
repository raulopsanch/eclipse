package ejercicios_de_repaso;

public class ejercicio_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena = "Eres muy tonto";
		
		System.out.println(cadena);
		System.out.println(censor(cadena));
	}

	static String censor(String texto) {
		String censura = "tonto";
		
		if(texto.contains(censura)) {
			texto = texto.replace(censura, "*****");
		}
		
		return texto;
	}
}
