package actividad74.ejercicio_04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class GestionProducto {
    private HashMap<Integer, Producto> productos;
    private int id;


    public GestionProducto() {
        this.productos = new HashMap<>();
        this.id = 101;
    }


    public void insertar(String nombre, String categoria) {
        productos.put(this.id, new Producto(nombre, categoria));
        id++;
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


    public boolean perteneceCategoria(String categoria, int id) {
        Producto p = productos.get(id);
        
    }
}
