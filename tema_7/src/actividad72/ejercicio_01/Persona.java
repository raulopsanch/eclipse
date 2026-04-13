package actividad72.ejercicio_01;

import java.util.*;

public class Persona {
    private int clave;
    private String nombre;
    private int edad;


    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }


    public String getNombre() {
        return this.nombre;
    }


    public int getEdad() {
        return this.edad;
    }
    
    
    public void setEdad(int edad) {
        this.edad = edad;
    }


    @Override
    public String toString() {
        return this.nombre + ", " + this.edad + " años.";
    }

}
