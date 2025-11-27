package objetos;

public class Estudiante {
	private String nombre;
	private double nota;
	
	public Estudiante(String nombre, double nota) {
		super();
		this.nombre = nombre;
		this.nota = nota;
	}
	
	public String get_nombre() {
		return this.nombre;
	}
	
	public double get_nota() {
		return this.nota;
	}
	
	public void set_nota(double nota) {
		this.nota = nota;
	}
	
	
	public static void main(String[] args) {
		Estudiante estudiante1 = new Estudiante("Manuel", 0);
		Estudiante estudiante2 = new Estudiante("Carlos", 0);
		Estudiante estudiante3 = new Estudiante("Ana", 0);
		
		// cambiamos notas de estudiante2 y estudiante3
		estudiante2.nota = 7.5;
		estudiante3.nota = 9.2;
		
		// Mostramos la nota de los 3 alumnos
		System.out.println("Estudiante\tNota");
		System.out.println(estudiante1.nombre + "\t\t" + estudiante1.nota);
		System.out.println(estudiante2.nombre + "\t\t" + estudiante2.nota);
		System.out.println(estudiante3.nombre + "\t\t" + estudiante3.nota);
	}

}
