package actividad_92.ejercicio_01;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Granja {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        Set<String> animales = new HashSet<>();
        animales.add("conejos");
        animales.add("gallinas");
        animales.add("caballos");
        animales.add("ovejas");
        animales.add("vacas");

        int opcion;

        do {
            System.out.println("1.- Agregar animal");
            System.out.println("2.- Mostrar todos");
            System.out.println("3.- Buscar animal");
            System.out.println("4.- Mostrar cantidad de animales");
            System.out.println("5.- Salir");
            System.out.println();
            System.out.print("Intrdduce una opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1:
                    agregarAnimal(entrada, animales);
                    break;
                case 2:
                    mostrarAnimales(animales);
                    break;
                case 3:
                    buscarAnimal(entrada, animales);
                    break;
                case 4:
                    mostrarCantidadAnimales(animales);
                    break;
                case 5:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción no válida, por favor introduzca una opción entre 1 y 5");
            }

        } while (opcion != 5);

    }


    public static void agregarAnimal(Scanner entrada, Set<String> animales) {
        System.out.print("Introduce un animal: ");
        String animal = entrada.nextLine().trim().toLowerCase();

        if (animales.contains(animal)) {
            System.out.println("Este animal ya existe en la granja");
        } else {
            animales.add(animal);
            System.out.println("Animal agreado correctamente a la granja");
        }
    }


    public static void mostrarAnimales(Set<String> animales) {
        animales.forEach(a -> System.out.println(a));
    }


    public static void buscarAnimal(Scanner entrada, Set<String> animales) {
        System.out.print("Introduce un animal: ");
        String animal = entrada.nextLine();

        for (String a : animales) {
            if (a.equalsIgnoreCase(animal)) {
                System.out.println(a);
            }
        }
    }


    public static void mostrarCantidadAnimales(Set<String> animales) {
        System.out.println("Hay " + animales.size() + " animales");
    }
}
