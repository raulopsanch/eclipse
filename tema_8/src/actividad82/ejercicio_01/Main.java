package actividad82.ejercicio_01;

public class Main {
    public static void main(String[] args) {
        Mensajes1 mens1 = () -> System.out.println("Hola");


        Mensajes2 mens2 = (String nombre) -> System.out.println("Hola, me llamo " + nombre);


        Mensajes3 mens3 = (String nombre, int edad) -> System.out.println("Hola, me llamo " + nombre +
                "\nMi edad es " + edad);


        mens1.enviarMensaje();
        mens2.enviarMensaje("Raúl");
        mens3.enviarMensaje("Raúl", 38);
    }
}
