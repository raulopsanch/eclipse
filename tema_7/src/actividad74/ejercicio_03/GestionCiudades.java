package actividad74.ejercicio_03;

import java.util.*;

public class GestionCiudades {
    ArrayList<String> ciudades;

    public GestionCiudades() {
        this.ciudades = new ArrayList<>();
    }


    public void addCadena(String texto) {
        String[] partes = texto.split(";");

        for (String p : partes) {
            ciudades.add(p);
        }
    }


    public String buscar(String texto) {
        if (ciudades.contains(texto)) {
            return "La ciudad " + texto + " se encuentra en la lista";
        }
        return "La ciudad " + texto + " no se encuentra en la lista";
    }


    public void mostrar() {

        for (String ciudad : ciudades) {
            System.out.println(ciudad);
        }
    }


    public void ordenar(boolean ascendente) {
        if (ascendente) {
            Collections.sort(ciudades);
        } else {
            Collections.sort(ciudades, Collections.reverseOrder());
        }
    }
    
    
    public ArrayList<String> ciudadesPorPatron(String patron) {
    	ArrayList<String> result = new ArrayList<>();
    	
    	for (String ciudad : ciudades) {
    		if (ciudad.toLowerCase().contains(patron)) {
    			result.add(ciudad);
    		}
    	}
    	
    	return result;
    }
}
