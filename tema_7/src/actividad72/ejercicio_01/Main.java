package actividad72.ejercicio_01;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>();

        personas.add(new Persona("Juan", 25));
        personas.add(new Persona("Ana", 30));
        personas.add(new Persona("Carlos", 40));
        personas.add(new Persona("Laura", 20));

        System.out.println("Mostrar los datos de la segunda persona");
        System.out.println(personas.get(1).toString());
        System.out.println();

        System.out.println("Mostrar el ultimo elemento de la lista");
        System.out.println(personas.get(personas.size() - 1).toString());
        System.out.println();

        System.out.println("Eliminar a Ana de la lista de personas");
        for (int i = 0; i < personas.size(); i++) {
            if(personas.get(i).getNombre() == "Ana") {
                personas.remove(i);
            }
        }
        System.out.println();

        System.out.println("Insertar a Diego de 26 años en la posición 3 de la lista");
        personas.add(2, new Persona("Diego", 26));
        System.out.println();

        System.out.println("Cambiar la edad de Laura a 21");
        personas.get(personas.size() - 1).setEdad(21);
        System.out.println();

        System.out.println("¿Se encuentra una persona llamada Carlos en la lista?");
        

    }
}
