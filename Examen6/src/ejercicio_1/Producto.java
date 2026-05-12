package ejercicio_1;

public class Producto {
    private String nombre;
    private double precio;
    private int id;

    public Producto(String nombre, double precio, int id) {
        this.nombre = nombre;
        this.precio = precio;
        this.id = id;
    }

    //getters
    public String getNombre() {
        return this.nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + " | Precio: " + this.precio +
                " | Id: " + this.id;
    }
}
