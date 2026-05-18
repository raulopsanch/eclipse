package actividad_92.ejercicio_04;

import java.io.FileWriter;
import java.io.IOException;

public class EscribirDatos {

	public static void main(String[] args) {
		String cadena = "Creando archivo de texto con java";
		
		FileWriter fw;
		
		try {
			fw = new FileWriter("C:\\Users\\raul_\\Documents\\git\\eclipse\\tema_9\\src\\actividad_92\\ejercicio_04\\salida.txt");
			
			for (char caracter : cadena.toCharArray()) {
				fw.write(caracter);
			}
			fw.close();
			
			System.out.println("Archivo creado");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
