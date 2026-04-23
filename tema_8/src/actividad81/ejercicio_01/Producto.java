package actividad81.ejercicio_01;

import java.util.Objects;

public class Producto {
    private String nombre;
    private String categoria;
    private double precio;


    public Producto(String nombre, String categoria, double precio) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
    }



    public String getNombre() {
        return nombre;
    }


    public String getCategoria() {
        return categoria;
    }


    public double getPrecio() {
        return precio;
    }


    @Override
   	public boolean equals(Object obj) {
   		if (this == obj) {
   			return true;
   		}
   		if (obj == null) {
   			return false;
   		}
   		if (getClass() != obj.getClass()) {
   			return false;
   		}
   		
   		Producto other = (Producto)obj;
   		return categoria == other.categoria && nombre == other.nombre;
   	}
    
    
    @Override
	public int hashCode() {
		return Objects.hash(categoria, nombre);
	}
    
}
