package objetos;

public class Empleado {
	String id;
	String nombre;
	String apellidos;
	int salarioMensual;
	
	public Empleado(String id, String nombre, String apellidos, int salarioMensual) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.salarioMensual = salarioMensual;
	}
	
	public String getId() {
		return this.id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellidos() {
		return this.apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public int getSalarioMensual() {
		return this.salarioMensual;
	}
	
	public void setSalarioMensual(int salarioMensual) {
		this.salarioMensual = salarioMensual;
	}
	
	public String getNombreCompleto() {
		return this.apellidos + ", " + this.nombre;
	}
	
	public int getSalarioAnual() {
		return this.salarioMensual * 12;
	}
	
	public void incremetaSalario(int porcentaje) {
		int incremento = this.salarioMensual * porcentaje / 100;
		this.salarioMensual += incremento;
	}
	

	public static void main(String[] args) {
		Empleado empleado1 = new Empleado("2456", "Manuel", "Pardo Sanz", 1650);
		Empleado empleado2 = new Empleado("4523", "Raquel", "Ruiz López", 1710);
		
		System.out.println("Nombre completo \t\t Salario anual");
		System.out.println(empleado1.getNombreCompleto() + " \t " + empleado1.getSalarioAnual());
		System.out.println(empleado2.getNombreCompleto() + " \t " + empleado2.getSalarioAnual());
		
		empleado1.incremetaSalario(10);
		empleado2.incremetaSalario(8);
		
		System.out.println("\n\t****Tras incremento****");
		System.out.println("Nombre completo \t\t Salario anual");
		System.out.println(empleado1.getNombreCompleto() + " \t " + empleado1.getSalarioAnual());
		System.out.println(empleado2.getNombreCompleto() + " \t " + empleado2.getSalarioAnual());
	}

}