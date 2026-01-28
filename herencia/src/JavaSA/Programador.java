package JavaSA;

public class Programador extends Empleado {
	private String lenguaje;
	
	public Programador(String nombre, double sueldo, int antiguedad, String lenguaje) {
		super(nombre, sueldo, antiguedad);
		this.lenguaje = lenguaje;
	}
	
	public String get_lenguaje() {
		return this.lenguaje;
	}
	
    @Override
	public double calcularSueldo() {
		return super.calcularSueldo() + 500 ;
	}
    
    public String infoLenguaje() {
    	return " Programador de: " + this.lenguaje; 
    }

}