package actividad_92.ejercicio_01;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Granja {
    public static Set<String> animales = new HashSet<>();

    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        animales.add("conejos");
        animales.add("gallinas");
        animales.add("caballos");
        animales.add("ovejas");
        animales.add("vacas");


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
                    agregar();
                    break;
                case 2:
                    animales.forEach(a -> System.out.println(a));
                    break;
                case 3:
                    buscar(entrada);
                    break;
                case 4:
                    System.out.println("Hay " + animales.size() + " animales");
                    break;
                case 5:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción no válida, por favor introduzca una opción entre 1 y 5");
            }

        } while (opcion != 5);
    }


    static void agregar() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un animal: ");
        if (!animales.add(entrada.nextLine())) {
            System.out.println("El animal ya existe");
        }

    }


    public static void buscar(Scanner entrada) {
        System.out.print("Introduce un animal: ");
        String animal = entrada.nextLine();

        for (String a : animales) {
            if (a.equalsIgnoreCase(animal)) {
                System.out.println(a);
            }
        }
    }

}
