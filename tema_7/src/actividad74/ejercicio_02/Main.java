package actividad74.ejercicio_02;


public class Main {

	public static void main(String[] args) {
		GestionPersonas gp = new GestionPersonas();
		
		gp.insertar(113, "Manuel Pérez", 18);
		gp.insertar(241, "Verónica Sanz", 22);
		gp.insertar(451, "Trinidad Rodríguez", 24);
		gp.insertar(144, "Rosa Márquez", 18);
		gp.insertar(101, "Raquel Ruiz", 23);
		
		
		gp.ordenar();
		

	}

}
