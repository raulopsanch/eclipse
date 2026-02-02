package Personal;

public class Persona {
	private String dni;
	private String nombre;
	private Trabajo puesto;
	
	public Persona(String dni, String nombre, int id, String descripcion, double salario) {
		this.dni = dni;
		this.nombre = nombre;
		Trabajo pt = new Trabajo(id, descripcion, salario);
		this.puesto = pt;
	}
	
	public String get_dni() {
		return this.dni;
	}
	
	public String get_nombre() {
		return this.nombre;
	}
	
	public Trabajo get_puesto() {
		return this.puesto;
	}
	
	public void set_puesto(Trabajo puesto) {
		this.puesto = puesto;
	}
	
	@Override
	public String toString() {
		return "\ndni: " + this.dni + "\nNombre: " + this.nombre + "\nPuesto: " + "\n\tId: " + this.puesto.get_id() + 
				"\n\tDescripción: " + this.puesto.get_descripcion() + "\n\tSalario: " + this.puesto.get_salario();
	}
	
}
