package Ejercicio_3;

public class Libro extends Publicacion {
	private int paginas;
	private int cantidad;
	
	public Libro(int paginas, int cantidad, String pais, double impacto) {
		super(pais, impacto);
		this.paginas = paginas;
		this.cantidad = cantidad;
	}
	
	public int getPaginas() {
		return this.paginas;
	}
	
	public int getCantidad() {
		return this.cantidad;
	}
	
	@Override
	public String mostrar() {
		return "Páginas " + this.paginas + ", cantidad ventas " + this.cantidad + " unidades, país " + 
				super.getPais() + " con impacto de " + super.getImpacto();
	}
	
	public double recaudacion() {
		return this.cantidad * super.getImpacto();
	}
	
}
