package actividad84.ejercicio_02;

public class Jugador {
    private int id;
    private String nombre;
    private double peso;
    private double altura;


    public  Jugador(int id, String nombre, double peso, double altura) {
        this.id = id;
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
    }


    //getters
    public int getId() {
        return this.id;
    }


    public String getNombre() {
        return this.nombre;
    }


    public double getPeso() {
        return this.peso;
    }


    public double getAltura() {
        return this.altura;
    }


    @Override
    public String toString() {
        return this.nombre + ", " + this.peso + "Kg, "  + this.altura + "m.";
    }
}
