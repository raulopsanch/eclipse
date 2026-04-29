package actividad83.ejercicio_03;

import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();

        productos.add(new Producto(125, "portátil", 600));
        productos.add(new Producto(95, "Xiaomi 15 pro", 500));
        productos.add(new Producto(115, "Ipad 16", 945));


        System.out.println("Productos originales");
        mostrar(productos);

        System.out.println();
        System.out.println("Productos ordenados por id");
        // Ordenar por id
        productos.sort((a, b) -> Integer.compare(a.getId(), b.getId()));
        mostrar(productos);


        System.out.println();
        System.out.println("Productos ordenados por precio");
        // Ordenar por precio
        productos.sort((a, b) -> Double.compare(a.getPrecio(), b.getPrecio()));
        mostrar(productos);

    }


    public static void mostrar(ArrayList<Producto> productos) {
        productos.forEach(p -> System.out.println(p));
    }
}
