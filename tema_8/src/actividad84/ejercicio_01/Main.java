package actividad84.ejercicio_01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Set<Alumno> alumnos = new HashSet<>();

        
        int i = 0;
        while (i < 5) {
        	System.out.println("Alumno #" + (i + 1));
            System.out.print("Introduce el nombre completo: ");
            String nombre = entrada.nextLine();

            System.out.print("Introduce tu edad: ");
            int edad = Integer.parseInt(entrada.nextLine());

            if(alumnos.add(new Alumno(nombre, edad))) {
            	i++;
            } else {
            	System.out.println("Error: El nombre '" + nombre + "' ya existe. Intenta con otro nombre.");
            }
            
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
        System.out.print(buscarAlumno(alumnos, entrada));
        
        System.out.println();
        System.out.println("Eliminar alumno");
        System.out.println("---------------");
        //Eliminar alumno
        eliminarAlumno(alumnos, entrada);
    }


    public static void mostrar(Set<Alumno> alumnos) {
        alumnos.forEach(a -> System.out.println(a.toString()));
    }


    public static boolean buscarAlumno(Set<Alumno> alumnos, Scanner scanner) {
        System.out.print("Introduce el nombre: ");
        String nombre = scanner.nextLine();

        for (Alumno a : alumnos) {
            if (a.getNombre().equalsIgnoreCase(nombre)) {
            	return true;
            }
        }
        return false;
    }

    public static void eliminarAlumno(Set<Alumno> alumnos, Scanner scanner) {
        System.out.print("Introduce el nombre: ");
        String nombre = scanner.nextLine();

        boolean eliminado = alumnos.removeIf(a -> a.getNombre().equalsIgnoreCase(nombre));
        
        if (eliminado) {
        	System.out.print("Alumno eliminado correctamente");
        } else {
        	System.out.print("Alumno no encontrado");
        }
    }
}
