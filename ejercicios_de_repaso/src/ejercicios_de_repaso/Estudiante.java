package ejercicios_de_repaso;

public class Estudiante {
	String nombre;
	double nota;
	
	public Estudiante(String nombre, double nota) {
		this.nombre = nombre;
		this.nota = nota;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getNota() {
		return this.nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	
	public void aprobado() {
		if(this.nota >= 5) {
			System.out.println(this.nombre + " ha aprobado");
		} else {
			System.out.println(this.nombre + " ha suspendido");
		}
	}
	

	public static void main(String[] args) {

	}

}
