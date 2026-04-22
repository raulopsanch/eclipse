package ejercicio_02;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<GestionEventos> eventos = new ArrayList<>();

		eventos.add(new GestionEventos("opera", LocalDate.of(2025,11,25), 850));
		
		mostrarEventos(eventos);
	}
	
	
	public static void mostrarEventos(ArrayList<GestionEventos> lista) {
		LocalDate hoy = LocalDate.now();
		for (GestionEventos gv : lista) {
			if (gv.getFecha().isAfter(hoy)) {
				System.out.println(gv.toString());
			}
		}
	}
	
	
	public static int mostrarAforo(ArrayList<GestionEventos> lista, String evento) {
		
		
		for (GestionEventos gv : lista) {
			if (gv.getNombre().equalsIgnoreCase(evento)) {
				System.out.println(gv.toString());
			}
		}
		return 0;
	}
	
	
	public static int suma(ArrayList<GestionEventos> lista) {
		int suma = 0;
		
		for (GestionEventos gv : lista) {
			if (gv.getAforo() > 1500) {
				suma += gv.getAforo();
			}
		}
		
		return suma;
	}
	
	
	public static void cambiarFecha(ArrayList<GestionEventos> lista, String nombre, LocalDate fecha) {
		LocalDate hoy = LocalDate.now();
		
		
		for (GestionEventos gv : lista) {
			if (gv.getNombre().equalsIgnoreCase(nombre) & gv.getFecha().isBefore(hoy)) {
				gv.setFecha(fecha);
			}
		}
	}

}
