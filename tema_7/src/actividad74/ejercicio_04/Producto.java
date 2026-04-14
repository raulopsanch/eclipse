package actividad74.ejercicio_04;

public class Producto {
    private int id;
    private String nombre;
    private String categoria;


    public Producto (String nombre, String categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
    }

    
    public int getId() {
    	return id;
    }

    public String getNombre() {
        return this.nombre;
    }


    public String getCategoria() {
        return this.categoria;
    }


    @Override
    public String toString() {
        return this.nombre + "  --  " + this.categoria;
    }
}
