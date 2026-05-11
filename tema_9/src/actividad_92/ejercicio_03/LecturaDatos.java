package actividad_92.ejercicio_03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LecturaDatos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce la ruta del archivo: ");
        String ruta = entrada.nextLine();

        leerArchivo(ruta);
    }


    public static void leerArchivo(String nombreArchivo) {
        BufferedReader archivo;

        try {
            archivo = new BufferedReader(new InputStreamReader(System.in));
            String linea = "";

            while ((linea = archivo.readLine()) != null) {
                System.out.println(archivo);
            }
            archivo.close();
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no funciona");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }

    }
}
