package actividad72.ejercicio_01;

import java.util.*;

public class GestionPersona {
    private HashMap<Integer, Persona>personas;

    public GestionPersona(){
        this.personas = new HashMap<>();
    }


    public void insertar(int clave, String nombre, int edad) {
        personas.put(clave, new Persona(nombre, edad));
    }
}
