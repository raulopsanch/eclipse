package actividad84.ejercicio_01;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Set<Alumno> alumnos = new HashSet<>();


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
