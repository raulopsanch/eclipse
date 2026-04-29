package actividad83.ejercicio_03;

public class Producto {
    private int id;
    private String nombre;
    private double precio;


    public Producto (int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }


    public int getId() {
        return this.id;
    }


    public String getNombre() {
        return this.nombre;
    }


    public double getPrecio() {
        return this.precio;
    }


    @Override
    public String toString() {
        return this.id + " -> " + this.nombre + ": " + this.precio + "€";
    }
}
