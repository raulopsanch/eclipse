package empresa;

public class Jefe extends Empleado{
	private double incentivo;
	private String departamento;
	
	public Jefe(String nombre, double sueldo, int id, double incentivo,
			String departamento) {
		super(nombre, sueldo, id);
		this.incentivo = incentivo;
		this.departamento = departamento;
	}
	
	public double getIncentivo() {
		return this.incentivo;
	}
	
	public String getDepartamento() {
		return this.departamento;
	}
	
	public void establecerIncentivo(double incentivo) {
        this.incentivo = incentivo;
    }
	
	public double salario() {
		return super.getSueldo() + this.incentivo;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nJefe del Dpt: " + this.departamento + 
				"\nIncentivo: " + this.incentivo;
	}

}
