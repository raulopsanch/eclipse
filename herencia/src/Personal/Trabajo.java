package Personal;

public class Trabajo {
	private int id;
	private String descripcion;
	private double salario;
	
	public Trabajo(int id, String descripcion, double salario) {
		this.id = id;
		this.descripcion = descripcion;
		this.salario = salario;
	}
	
	public int get_id() {
		return this.id;
	}
	
	public String get_descripcion() {
		return this.descripcion;
	}
	
	public double get_salario() {
		return this.salario;
	}
	
	@Override
	public String toString() {
		return "id: " + this.id + "\nDescripción: " + this.descripcion + "\nSalario: " + this.salario;
	}
	
}
