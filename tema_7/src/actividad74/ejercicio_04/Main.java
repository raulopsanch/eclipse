package actividad74.ejercicio_04;

public class Main {

	public static void main(String[] args) {
		GestionProductos gp = new GestionProductos();
		
		gp.insertar("Leche", "Alimentación");
		gp.insertar("Manzana", "Alimentación");
		gp.insertar("Galletas", "Alimentación");
		gp.insertar("Agua", "Alimentación");
		gp.insertar("Pan", "Alimentación");
		gp.insertar("Corrector", "Cosméticos");
		gp.insertar("Gel de Baño", "Cosméticos");
		gp.insertar("Toallitas", "Cosméticos");
		gp.insertar("Agua", "Alimentación");
		gp.insertar("Lavavajillas", "Hogar");
		gp.insertar("Detergente", "Hogar");

		
		gp.mostrar();
		System.out.println();
		
		
		gp.productosCategoria("Alimentación");
	}

}
