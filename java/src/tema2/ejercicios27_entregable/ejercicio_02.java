package tema2.ejercicios27_entregable;

public class ejercicio_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto1 = "Mensaje de la Operación 1";
		String texto2 = "Se ha producido un error";
		
		mensaje(texto1, "/ ", 29);
		mensaje(texto2, "/ ", 29);
	}

	static void mensaje(String texto, String caracter, int repeticion) {
		String separador = "";
		
		for (int i = 1; i <= repeticion; i++) {
			separador += caracter;
		}
		
		System.out.println(separador);
		System.out.println("            " + texto);
		System.out.println(separador);
		System.out.println();
	}
}
