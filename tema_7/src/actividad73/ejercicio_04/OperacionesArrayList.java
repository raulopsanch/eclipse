package actividad73.ejercicio_04;

import actividad73.ejercicio_03.GestionArrayList;

import java.util.*;

public class OperacionesArrayList {
    private GestionArrayList gestion;


    public OperacionesArrayList(GestionArrayList gestion) {
        this.gestion = gestion;
    }


    public boolean buscarNumero(int numeroBuscado) {
        Iterator<Integer> iterator = this.gestion.getNumeros().iterator();
        int posicion = 0;

        while (iterator.hasNext()) {
            int numero = iterator.next();

            if (numero == numeroBuscado) {
                System.out.println("El número " + numeroBuscado + " está en la posición " + posicion);
                return true;
            }
            posicion++;
        }
        System.out.println("El número " + numeroBuscado + " no está en la lista");
        return false;
    }


    public void ordenarAscendente() {
        Collections.sort(this.gestion.getNumeros());
        System.out.println("Lista ordenada de forma ascendente");
    }


    public int contarElementos() {
        Iterator<Integer> iterator = gestion.getNumeros().iterator();
        int contador = 0;

        while (iterator.hasNext()) {
            iterator.next();
            contador++;
        }
        return contador;
    }


    public void ordenarDescendente() {
        Collections.sort(this.gestion.getNumeros(), Collections.reverseOrder());
        System.out.println("Lista ordenada de forma descendente");
    }


    public void mostrarLista() {
        Iterator<Integer> it = this.gestion.getNumeros().iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        GestionArrayList gestion = new GestionArrayList();

        gestion.llenado(10);
        System.out.println("LISTA ORIGINAL");
        System.out.println("--------------");
        gestion.mostrarContenido();
        System.out.println();

        OperacionesArrayList operaciones = new OperacionesArrayList(gestion);

        System.out.println("=== BUSCAR NÚMERO ===");
        operaciones.buscarNumero(45);
        System.out.println();

        System.out.println("\n=== ORDENAMIENTO ASCENDENTE ===");
        operaciones.ordenarAscendente();
        operaciones.mostrarLista();
        System.out.println();

        System.out.println("\n=== CONTEO DE ELEMENTOS ===");
        System.out.println("Número de elementos: " + operaciones.contarElementos());
        System.out.println();

        System.out.println("\n=== ORDENAMIENTO DESCENDENTE ===");
        operaciones.ordenarDescendente();--------------------------------------------------------------------------------------
        operaciones.mostrarLista();
        System.out.println();
    }
}
