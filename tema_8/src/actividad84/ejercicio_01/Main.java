package actividad84.ejercicio_01;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Set<Alumno> alumnos = new HashSet<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Alumno #" + (i + 1));
            System.out.print("Introduce el nombre completo: ");
            String nombre = entrada.nextLine();

            System.out.print("Introduce tu edad: ");
            int edad = Integer.parseInt(entrada.nextLine());

            alumnos.add(new Alumno(nombre, edad));
        }

        System.out.println();
        System.out.println("HashSet de alumnos");
        System.out.println("-------------------");
        //Mostrar Set alumnos
        mostrar(alumnos);


        System.out.println();
        System.out.println("Buscar alumno");
        System.out.println("-------------");
        //Buscar alumno
        buscarAlumno(alumnos, entrada);
    }


    public static void mostrar(Set<Alumno> alumnos) {
        alumnos.forEach(a -> System.out.println(a.toString()));
    }


    public static boolean buscarAlumno(Set<Alumno> alumnos, Scanner scanner) {
        System.out.println("Introduce el nombre: ");
        String nombre = scanner.nextLine();

        for (Alumno a : alumnos) {
            return a.getNombre().equalsIgnoreCase(nombre);
        }
        return false;
    }

    public static void eliminarAlumno(Set<Alumno> alumnos, Scanner scanner) {
        System.out.println("Introduce el nombre: ");
        String nombre = scanner.nextLine();

        for (Alumno a : alumnos) {
            if (a.getNombre().equalsIgnoreCase(nombre)) {
                alumnos.remove(nombre);
                System.out.println("Alumno eliminado");
                break;
            } else {
                System.out.println("Alumno no encontrado");
                break;
            }
        }
    }
}
