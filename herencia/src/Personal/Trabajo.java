package Personal;

public class Trabajo {
	private int id;
	private String descripicion;
	private double salario;
	
	public Trabajo(int id, String descripcion, double salario) {
		this.id = id;
		this.descripicion = descripcion;
		this.salario = salario;
	}
	
	public int get_id() {
		return this.id;
	}
	
	public String get_descripcion() {
		return this.descripicion;
	}
	
	public double get_salario() {
		return this.salario;
	}
	
	@Override
	public String toString() {
		return "id: " + this.id + "\nDescripción: " + this.descripicion + 
				"\nSalario: " + this.salario;
	}
	
}
