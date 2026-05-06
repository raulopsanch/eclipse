package actividad_91.ejercicio_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] nums = {45,56,22,1,8};

        System.out.print("Introduce un número: ");
        int num = entrada.nextInt();
        int resultadoObligado = 1;

        try {
            int resultado = nums[5]/num;
            resultadoObligado = resultado;
        }
        catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: índice fuera del array");
        }
        finally {
            System.out.println("El resultado es: " + resultadoObligado);
        }
    }
}
