package Ejercicio_3;

public class Main {

	public static void main(String[] args) {
		Publicacion[] publicaciones = new Publicacion[4];
		
		publicaciones[0] = new Libro(524, 7500, "Francia", 25);
		publicaciones[1] = new Articulo("España", 5, "Francia", 45);
		publicaciones[2] = new Libro(240, 1500, "España", 52);
		publicaciones[3] = new Articulo("Italia", 22, "España", 15);
		
		for (int i = 0; i < publicaciones.length; i++) { 
			if (publicaciones[i] instanceof Libro) {
				Libro l = (Libro)publicaciones[i];
				System.out.println("L" + (i+1) + "->" + l.mostrar());
				System.out.println("Tiene una recaudacición de" + l.recaudacion() + "€");
			} else if ( publicaciones[i] instanceof Articulo) {
				Articulo a = (Articulo)publicaciones[i];
				System.out.println("A" + (i+1) + "->" + a.mostrar());
				System.out.println("Un porcentaje de lectura de " + a.lectura() + "%");
			}
			System.out.println();
		}

	}

}
