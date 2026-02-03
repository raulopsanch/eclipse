package Ejercicio_3;

public class Articulo extends Publicacion {
	private String editado;
	private int cantidad;
	
	public Articulo(String editado, int cantidad, String pais, double impacto) {
		super(pais, impacto);
		this.editado = editado;
		this.cantidad = cantidad;
	}
	
	public String getEditado() {
		return this.editado;
	}
	
	public int getCantidad() {
		return this.cantidad;
	}
	
	@Override
	public String mostrar() {
		return "Editado en " + this.editado + ", " + this.cantidad + " artículos," + 
				" publicado en " + super.getPais() + " con impacto de " + super.getImpacto();
	}
	
	public double lectura() {
		return super.getImpacto() / cantidad * 100;
	}
}
