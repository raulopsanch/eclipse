package actividad81.ejercicio_02;

import java.util.*;

public class Email {

	public static void main(String[] args) {
		HashSet<String> emails = new HashSet<>();
		
		
		emails.add("raul@gmail.com");
		emails.add("sdf@sdf.com");
		emails.add("prog@sdf.com");
		emails.add("bbdd@sdf.com");
		emails.add("ldm@sdf.com");


		mostrar(emails);
		System.out.println();
		

		ordenar(emails);
		
	}
	
	
	public static void mostrar(Set<String> emails) {
		for (String email : emails) {
			System.out.println(email);
		}
	}
	
	
	public static void ordenar(Set<String> lista) {
		ArrayList<String> listaEmails = new ArrayList<>(lista);
		Collections.sort(listaEmails);
		
		for (String email : listaEmails) {
			System.out.println(email);
		}
	}

}
