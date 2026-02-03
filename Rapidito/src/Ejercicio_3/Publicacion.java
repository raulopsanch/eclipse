package Ejercicio_3;

public class Publicacion {
	private String pais;
	private double impacto;
	
	public Publicacion(String pais, double impacto) {
		this.pais = pais;
		this.impacto = impacto;
	}
	
	public String getPais() {
		return this.pais;
	}
	
	public double getImpacto() {
		return this.impacto;
	}
	
	public String mostrar() {
		return "\t |País: " + this.pais + "\t | Impacto: " + this.impacto;
	}
	
}
