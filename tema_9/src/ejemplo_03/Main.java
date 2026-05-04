package ejemplo_03;

public class Main {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Este bloque siempre se ejecuta");
            int num = 1;
            System.out.println("Salida " + num);
        }
    }
}
