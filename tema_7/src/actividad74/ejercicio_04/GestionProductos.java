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

    
    public HashMap<Integer, Producto> getProductos() {
    	return this.productos;
    }
    

    public void insertar(String nombre, String categoria) {
        productos.put(this.siguienteId, new Producto(nombre, categoria));
        this.siguienteId++;
    }


    public void mostrar() {
        System.out.println("===LISTA DE PRODUCTOS===");

        Iterator<Map.Entry<Integer, Producto>> it = this.productos.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<Integer, Producto> entry = it.next();
            int id = entry.getKey();
            Producto p = entry.getValue();
            System.out.println("ID: " + id + " | " + p.toString());
        }
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
