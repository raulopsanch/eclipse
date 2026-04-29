package actividad83.ejercicio_02;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>(
                Arrays.asList("Darana", "Alberto", "Santiago", "Carla"));

        ArrayList<Integer> numeros = new ArrayList<>(
                Arrays.asList(5, 1, 3, 4, 2));


        nombres.sort((a, b) -> a.compareTo(b));
        nombres.forEach(nombre -> System.out.print(nombre + " "));

        System.out.println();

        numeros.sort((a, b) -> a - b);
        numeros.forEach(numero -> System.out.print(numero + " "));
    }
}
