package Material;

public class Revista extends Material {
	private int numeroEdicion;
	private String periodicidad;
	
	public Revista(String codigo, String titulo, int anhoPublicacion, boolean prestado,
			int numeroEdicion, String periodicidad) {
		super(codigo, titulo, anhoPublicacion, prestado);
		this.numeroEdicion = numeroEdicion;
		this.periodicidad = periodicidad;
	}
	
	public int getNumeroEdicion() {
		return this.numeroEdicion;
	}
	
	public String getPeriodicidad() {
		return this.periodicidad;
	}
	
	@Override
	public int getDiasPrestados() {
		return 7;
	}

	@Override
	public double calcularMulta(int diasRetraso) {
		return diasRetraso * 0.25;
	}
}
