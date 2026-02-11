package Material;

public class Libro extends Material {
	private String autor;
	private int numPaginas;
	private String isbn;
	private Pagina[] paginas;
	
	public Libro(String codigo, String titulo, int anhoPublicacion, boolean prestado,
			String autor, int numPaginas, String isbn) {
		super(codigo, titulo, anhoPublicacion, prestado);
		this.autor = autor;
		this.numPaginas = numPaginas;
		this.isbn = isbn;
		this.paginas = new Pagina[this.numPaginas];
	}
	
	@Override
	public int getDiasPrestados() {
		return 21;
	}
	
	public int leerPaginas(int numero) {
		for(int i = 0; i < this.numPaginas; i++) {
			paginas.add(new Pagina[i + 1, ""]);
		}
	}

}
