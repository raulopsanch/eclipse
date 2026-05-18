package actividad_92.ejercicio_03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LecturaDatos {
    public static void main(String[] args) {
        BufferedReader archivo;
        File ruta = new File("C:\\Users\\raul_\\Documents\\git\\eclipse\\tema_9\\src\\actividad_92\\ejercicio_03\\holamundo.txt");
        
        try {
        	archivo =  new BufferedReader(new FileReader(ruta));
        	String linea = "";
            while((linea = archivo.readLine()) != null) {
            	System.out.println(linea);
            }
            archivo.close();
        } catch (FileNotFoundException e) {
        	System.out.println(e.getMessage());
        } catch (IOException e) {
        	System.out.println(e.getMessage());
        }
    }   
}
