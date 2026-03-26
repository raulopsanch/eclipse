package actividad73.ejercicio_03;

import java.util.*;

public class GestionArrayList {
    private ArrayList<Integer> numeros;

    public GestionArrayList() {
        this.numeros = new ArrayList<>();
    }


    public void llenado(int llenar) {
        Random random = new Random();

        for (int i = 0; i < llenar; i++) {
            numeros.add(random.nextInt(100));
        }
    }


    public void mostrarContenido() {
        Iterator<Integer> it = this.numeros.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }


    public int sumarContenido() {
        Iterator<Integer> it = this.numeros.iterator();
        int suma = 0;

        while(it.hasNext()) {
            suma += it.next();
        }
        return suma;
    }


    public void borrarImpares() {
        Iterator<Integer> it = this.numeros.iterator();

        while(it.hasNext()) {
            int numero = it.next();
            if (numero % 2 != 0) {
                it.remove();
            }
        }
    }


    public static void main(String[] args) {
        GestionArrayList gestion = new GestionArrayList();

        gestion.llenado(10);

        gestion.mostrarContenido();
    }

}
