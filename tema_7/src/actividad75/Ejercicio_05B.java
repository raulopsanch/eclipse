package actividad75;

import java.util.Iterator;
import java.util.HashMap;

public class Ejercicio_05B {
    public static void main(String[] args) {
        HashMap<String, String> nombres = new HashMap<>();

        nombres.put("12345678B", "Juan Pérez Silva");
        nombres.put("12345679C", "Amador González Ruíz");
        nombres.put("23456789D", "Ana Flezt García");
        nombres.put("98765432E", "Blanca Fernández Dolz");
        nombres.put("87654321F", "María Márrquez Domínguez");

        System.out.println("Comprobar si la persona con DNI 23456789D se encuentra en la lista.");
        System.out.println(nombres.containsKey("23456789D"));
        System.out.println();

        System.out.println("Acceder a un objeto, mostrar “Apellidos Nombre” de la clave 12345678B.");
        String nombreCompleto = nombres.get("12345678B");
        String[] partes = nombreCompleto.split(" ");
        System.out.println(partes[1] + " " + partes[2] + ", " + partes[0]);
        System.out.println();

        System.out.println("Recorrer la colección empleando un iterator");
        recorrerMap(nombres);

    }

    public static void recorrerMap(HashMap<String, String>nombres) {
        Iterator<String> it = nombres.keySet().iterator();
        while (it.hasNext()) {
            String dni = it.next();
            String nombreCompleto = nombres.get(dni);
            String[] partes = nombreCompleto.split(" ");
            System.out.print(partes[1] + " " + partes[2] + ", " + partes[0]);
            System.out.println(" con dni " + dni);
        }
    }
}
