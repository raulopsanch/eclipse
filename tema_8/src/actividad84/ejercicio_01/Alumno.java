package actividad84.ejercicio_01;

import java.util.Objects;

public class Alumno {
    private String nombre;
    private int edad;


    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }


    //getters
    public String getNombre() {
        return this.nombre;
    }


    public int getEdad() {
        return this.edad;
    }


    //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }


    @Override
    public String toString() {
        return this.nombre + ", " + this.edad + " años.";
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null ||  obj.getClass() != this.getClass()) {
            return false;
        }

        Alumno other = (Alumno) obj;
        return nombre.equals(other.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
