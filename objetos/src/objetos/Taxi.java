package objetos;

public class Taxi {
	String matricula;
	String distrito; // sur, norte, etc
	String tipoMotor; // diésel, gasolina, eco
	
	// Creo el constructor normal con todos los atributos
	public Taxi(String matricula, String distrito, String tipoMotor) {
		this.matricula = matricula;
		this.distrito = distrito;
		this.tipoMotor = tipoMotor;
	}
	
	// Creo el constructor con tipoMotor por defecto
	public Taxi(String matricula, String distrito) {
		this.matricula = matricula;
		this.distrito = distrito;
		this.tipoMotor = "eco";
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
