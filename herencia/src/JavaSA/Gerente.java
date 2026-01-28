package JavaSA;

public class Gerente extends Empleado {
	private String departamento;
	
	public Gerente(String nombre, double sueldo, int antiguedad, String departamento) {
		super(nombre, sueldo, antiguedad);
		this.departamento = departamento;
	}
	
	public String get_departameto() {
		return this.departamento;
	}
	
    @Override
	public double calcularSueldo() {
		return super.calcularSueldo() + 1000;
		
	}
    
    public String infoDepartamento() {
    	return " Trabaja en el departamento " + this.departamento; 
    }
	
}