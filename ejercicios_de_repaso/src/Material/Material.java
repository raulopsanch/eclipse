package Material;

public abstract class Material {
	private String codigo;
	private String titulo;
	private int anhoPublicacion;
	private boolean prestado;
	
	public Material(String codigo, String titulo, int anhoPublicacion, boolean prestado) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.anhoPublicacion = anhoPublicacion;
		this.prestado = prestado;
	}
	
	public String getCodigo() {
		return this.codigo;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public int getAnhoPublicacion() {
		return this.anhoPublicacion;
	}
	
	public boolean getPrestado() {
		return this.prestado;
	}
	
	public void setPrestado(boolean valor) {
		this.prestado = valor;
	}
	
	public abstract int getDiasPrestados();
	
	public double calcularMulta(int diasRetraso) {
		return diasRetraso * 0.50;
	}
}
