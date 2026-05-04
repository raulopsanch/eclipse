package actividad_91.ejercicio_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] nums = {45,56,22,1,8};

        System.out.print("Introduce un número: ");
        int num = entrada.nextInt();

        try {
            System.out.println("El resultado es. " nums[0]/num);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: índice fuera del array");
        }
    }
}
