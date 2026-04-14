package actividad74.ejercicio_03;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		GestionCiudades gc = new GestionCiudades();

		String datos ="Madrid;París;Berlin;Roma;Londres;Barcelona;Sevilla;"
				+ "Malaga;Dublin;Sídney;Melbourne;Auckland;Wellington;Tokio;"
				+ "Pekin;Seúl;Bangkok;Dubái";


		gc.addCadena(datos);


		gc.ordenar(false);


		gc.mostrar();
		System.out.println();
		
		
		System.out.println(gc.buscar("Madrid"));	
		System.out.println();
		
		
		gc.mostrarListaPatron("in");
	}

}
