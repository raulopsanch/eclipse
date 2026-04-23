package actividad81.ejercicio_04;

import java.util.Objects;

public class Producto {
	private int id;
	private String nombre;
	private double precio;
	
	
	public Producto(int id, String nombre, double precio) {
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
	}
	
	
	public int getId() {
		return this.id;
	}
	
	
	public String getNombre() {
		return this.nombre;
	}
	
	
	public double getPrecio() {
		return this.precio;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		
		Producto other = (Producto)obj;
		return id == other.id;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public String toString() {
		return "[ " + this.id + " | " + this.nombre + " | " + this.precio + "€ ]";
	}
	
}