package ejercicios32;

public class ejercicio322 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena = "Programando en Java con Eclipse";
		
		System.out.println(cambiarLetras(cadena));
		System.out.println("contar o's: " + contarLetras(cadena));
	}

	public static String cambiarLetras(String text) {
		text = text.replace("a", "x");
		return text;
	}
	
	public static int contarLetras(String text) {
		int contar = 0;
		
		for (int i = 0; i < text.length() - 1; i++) {
			if(text.charAt(i) == 'o' || text.charAt(i) == 'O') {
				contar++;
			}
		}
		return contar;
	}
}
