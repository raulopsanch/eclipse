package objetos;

public class Libro {
	private String titulo;
	private String autor;
	private int numPag;
	
	public Libro(String titulo, String autor, int numPag) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.numPag = numPag;
	}
	
	public String get_titulo() {
		return this.titulo;
	}
	
	public void set_titulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String get_autor() {
		return this.autor;
	}
	
	public void set_autor(String autor) {
		this.autor = autor;
	}
	
	public int get_numPag() {
		return this.numPag;
	}
	
	public void set_numPag(int numPag) {
		this.numPag = numPag;
	}
	
	public void mostrarResumenLibro() {
		System.out.println("El libro ~" + this.titulo + "~ ha sido escrito por el autor " + this.autor + " y tiene " + this.numPag + " páginas.");
	}
	
	
	public static void main(String[] args) {
		Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", 450);
		Libro libro2 = new Libro("El Señor de los anillos", "J.R.R Tolkien", 710);
		Libro libro3 = new Libro("Código Da Vinci", "Dan Brown", 350);
		
		libro1.mostrarResumenLibro();
		System.out.println("Autor del libro2: " + libro2.autor);
		System.out.println("Páginas del libro3: " + libro3.numPag);
	}
}
