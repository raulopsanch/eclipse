package actividad74.ejercicio_03;

public class Main {

	public static void main(String[] args) {
		GestionCiudades gc = new GestionCiudades();

		String datos ="Madrid;París;Berlin;Roma;Londres;Barcelona;" +
				"Sevilla;Malaga;Dublin;Sídney" +
				";Melbourne;Auckland;Wellington;Tokio;" +
				"Pekin;Seúl;Bangkok;Dubái";


		gc.addCadena(datos);


		gc.ordenar(false);


		gc.mostrar();
	}

}
