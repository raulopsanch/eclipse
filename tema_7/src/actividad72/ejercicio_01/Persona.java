package actividad72.ejercicio_01;

public class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }


    public String getNombre() {
        return this.nombre;
    }


    public void setEdad(int newEdad) {
        this.edad = newEdad;
    }


    public int getEdad() {
        return this.edad;
    }


    @Override
    public String toString() {
        return this.nombre + ", " + this.edad + " años.";
    }
}
