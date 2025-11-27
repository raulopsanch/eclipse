package funciones_3;

public class ejercicio_01_cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena = "Funciones PaRa traBaJar con caDenas de TEXTO";
		String cadena2 = "Operaciones PaRa traBaJar en Java";
		
		//System.out.println("El tamaño de la cadena es: " + cadena.length());
		//System.out.println("El carácter 12 de la cadena es: " + cadena.charAt(12));
		//System.out.println("La posición en cadena2 donde comienza la "
		//		+ "subcadena “PaRa” es: " + cadena2.indexOf("PaRa"));
		
		if (cadena.equals(cadena2)) {
			System.out.println("cadena SÍ es igual a cadena2");
		} else {
			System.out.println("cadena NO es igual a cadena2");
		}
		
		System.out.println("El tamaño de la cadena2 es: " + cadena2.length());
		System.out.println("La posición en cadena2 donde comienza la "
				+ "subcadena “PaRa” es: " + cadena2.indexOf("PaRa"));
		System.out.println("cadena en minúscula es: " + cadena.toLowerCase());
		System.out.println("cadena2 en mayúscula es: " + cadena2.toUpperCase());
		System.out.println("Entre las posiciones 11 y 24 se encuentra la subcadena: "
				+ cadena.substring(10, 24));
		System.out.println("En cadena2 la posición donde comienza Java: " 
				+ cadena2.indexOf("Java"));
		System.out.println("El resultado de reemplazar traBaJar por programar es: " 
				+ cadena.replace("traBaJar", "programar"));
		System.out.println("¿cadena contiene el texto Java? " + cadena.contains("Java"));
		System.out.println("¿cadena2 contiene el texto PaRa? " + cadena2.contains("PaRa"));
	}

}
