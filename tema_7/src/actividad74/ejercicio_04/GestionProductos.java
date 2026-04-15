package actividad74.ejercicio_04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class GestionProductos {
    private HashMap<Integer, Producto> productos;
    private int siguienteId;


    public GestionProductos() {
        this.productos = new HashMap<>();
        this.siguienteId = 101;
    }


    public boolean perteneceCategoria(String categoria, Producto producto) {
        return producto.getCategoria().equalsIgnoreCase(categoria);
        
    }
    
    
    public void productosCategoria(String categoria) {
    	boolean encontrado = false;
    	
    	for (Producto p : productos.values()) {
    		if (this.perteneceCategoria(categoria, p)) {
    			System.out.println(p.toString());
    			encontrado = true;
    		}
    	}
    	if (!encontrado) {
			System.out.println("No se encontraron productos en la categoría "
					+ categoria);
		}
    }
}
