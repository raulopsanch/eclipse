package actividad84.ejercicio_02;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Jugador> j = new ArrayList<>();

        j.add(new Jugador(344, "Carlos", 76.5, 1.85));
        j.add(new Jugador(642, "Mario", 81.4, 1.67));
        j.add(new Jugador(254, "Lucía", 65.2, 1.78));
        j.add(new Jugador(743, "Ana", 62.5, 1.72));
        j.add(new Jugador(875, "Sofía", 56.7, 1.62));

        AlturaOrdenCreciente(j);
        System.out.println();
        nombreCreciente(j);
        System.out.println();
        pesoDecreciente(j);
        System.out.println();
        jugadorMasPesado(j);
    }


    public static void AlturaOrdenCreciente(ArrayList<Jugador>lista) {
        System.out.println("Alturas en orden creciente");
        ArrayList<Double> alturas = new ArrayList<>();
        for (Jugador j : lista ) {
            alturas.add(j.getAltura());
        }

        Collections.sort(alturas);
        alturas.forEach(a -> System.out.println(a));
    }


    public static void nombreCreciente(ArrayList<Jugador>lista) {
        System.out.println("Jugadores por nombre orden creciente");
        
        Collections.sort(lista, (l1,l2) -> (l1.getNombre().compareTo(l2.getNombre())));

        lista.forEach(c -> System.out.println(c));
    }


    public static void pesoDecreciente(ArrayList<Jugador>lista) {
        System.out.println("Jugadores por peso orden decreciente");
        ArrayList<Jugador> copia = new ArrayList<>(lista);

        copia.sort(Comparator.comparing(Jugador::getPeso).reversed());

        copia.forEach(c -> System.out.println(c));
    }


    public static void jugadorMasPesado(ArrayList<Jugador>lista) {
        System.out.println("Jugador con más peso");

        Jugador jugadorMasPesado = lista.get(0);

        for (Jugador j : lista) {
            if (j.getPeso() > jugadorMasPesado.getPeso()) {
                jugadorMasPesado = j;
            }
        }
        System.out.println(jugadorMasPesado);
    }

}
