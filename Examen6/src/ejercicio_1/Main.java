package ejercicio_1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static Set<Producto> productos = new HashSet<>();
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int i = 0;
        do {
            agregar();
            i++;
        } while (i < 6);

        System.out.println();
        seleccionar();
        System.out.println();
        eliminar();
    }

    public static void agregar() {
        int i = 0;
        System.out.print("Introduce nombre: ");
        String name = input.nextLine();
        //input.nextLine();

        System.out.print("Introduce precio: ");
        double precio = input.nextDouble();
        //input.nextLine();

        System.out.print("Introduce id: ");
        int id = input.nextInt();

        Producto p = new Producto(name, precio, id);

        productos.add(p);
    }


    public static void seleccionar() {
        System.out.println("Introduce un precio: ");
        double precio = input.nextDouble();

        System.out.println("“--- PRODUCTOS CON PRECIOS MAYOR A " + precio  + "---”");
        for (Producto p : productos) {
            if (p.getPrecio() > precio) {
                System.out.println(p.toString());
            }
        }
    }


    public static void eliminar() {
        System.out.println("Introduce un Id: ");
        int id = input.nextInt();

        for (Producto p : productos) {
            if (p.getId() == id) {
                System.out.println("Producto: " + p.getNombre() + " € " + p.getPrecio() + " eliminado");
                productos.remove(p);
            }
        }
    }
}
