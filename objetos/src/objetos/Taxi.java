package objetos;

public class Taxi {
	String matricula;
	String distrito; // norte, sur, este, oeste...
	String tipoMotor; // diése, gasolina, epc
	
	public Taxi(String matricula, String distrito, String tipoMotor) {
		this.matricula = matricula;
		this.distrito = distrito;
		this.tipoMotor = tipoMotor;
	}
	
	// Constructor con tipoMotor por defecto eco.
	public Taxi(String matricula, String distrito) {
		this.matricula = matricula;
		this.distrito = distrito;
		this.tipoMotor = "eco";
	}
	
	public String getMatricula() {
		return this.matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getDistrito() {
		return this.distrito;
	}
	
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	
	public String getTipoMotor() {
		return this.tipoMotor;
	}
	
	public void setTipoMotor(String tipoMotor) {
		this.tipoMotor = tipoMotor;
	}
	
	// Método para ver la información del taxi
	public String informacionTaxi() {
		return "\nMatrícula: " + this.matricula +
				"\nDistrito: " + this.distrito +
				"\nTipo de motor: " + this.tipoMotor;
	}
	
	// Método para comprobar los distritos de los taxis
	public boolean mismoDistrito(Taxi otroTaxi) {
		return this.distrito.equalsIgnoreCase(otroTaxi.getDistrito());
	}
	

	public static void main(String[] args) {
		Taxi taxi1 = new Taxi("1234ABC", "norte", "diésel");
		Taxi taxi2 = new Taxi("5678DEF", "sur", "gasolina");
		Taxi taxi3 = new Taxi("9012GHI", "NORTE");
		
		System.out.println("Información taxi1: " + taxi1.informacionTaxi());
		System.out.println("\nInformación taxi2: " + taxi2.informacionTaxi());
		System.out.println("\nInformación taxi3: " + taxi3.informacionTaxi());

		
		System.out.println("\n\t====COMPROBAR DISTRITOS====");
		System.out.print("¿taxi1 y taxi2 operan en el mismo distrito? ");
		System.out.println(taxi1.mismoDistrito(taxi2));
		System.out.print("¿taxi1 y taxi3 operan en el mismo distrito? ");
		System.out.println(taxi1.mismoDistrito(taxi3));
	}
}
