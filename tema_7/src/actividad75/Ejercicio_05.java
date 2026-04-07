package actividad75;

import java.util.*;

import java.util.HashMap;

public class Ejercicio_05 {
    public static void main(String[] args) {
        Map <Integer, String> pruebas = new HashMap<>();

        pruebas.put(24, "Folio A4");
        pruebas.put(22, "Cuaderno A4");
        pruebas.put(11, "Corrector");
        pruebas.put(18, "Grapas");
        pruebas.put(16, "Tijeras");
        pruebas.put(4, "Bolígrafo Azul");
        pruebas.put(7, "Bolígrafo Negro");
        pruebas.put(8, "Lápiz");


        System.out.println("Obtener un valor por su clave (18)");
        System.out.println(pruebas.get(18));
        System.out.println();

        System.out.println("Comprobar si el código 5 se encuentra en la colección.");
        System.out.println(pruebas.containsKey(5));
        System.out.println();

        
    }
}
